package stepdefinition;

import backendmethods.New_Devices;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import static backendmethods.New_Devices.deviceResponse;
import java.io.IOException;

public class Stepdefs {

       New_Devices newDevice = new New_Devices();

        public Stepdefs() throws IOException {
        }

        @Given("I successfully have the correct endpoint and the correct request body")
        public void iSuccessfullyHaveTheCorrectEndpointAndTheCorrectRequestBody() {

                System.out.println("I got the correct request URL and Body");
        }

        @When("Use the add new device API to be able to add the new device successfully")
        public void useTheAddNewDeviceAPIToBeAbleToAddTheNewDeviceSuccessfully() throws IOException {

                newDevice.add_NewDevice();
        }

        @And("Validate the added new device details from the response id, name, createdAt, year, price")
        public void validateTheAddedNewDeviceDetailsFromTheResponseIdNameCreatedAtYearPrice() {

                Assert.assertEquals("Apple Max Pro 1TB", deviceResponse.path("name").toString());
                Assert.assertEquals("2023", deviceResponse.path("data.year").toString());
                Assert.assertEquals("7999.99", deviceResponse.path("data.price").toString());
        }

        @And("Validate id and createdAt should not be null")
        public void validateIdAndCreatedAtShouldNotBeNull() {

                Assert.assertNotNull(deviceResponse.path("id").toString());
                Assert.assertNotNull(deviceResponse.path("createdAt").toString());
        }

        @Then("The new device should be added successfully")
        public void theNewDeviceShouldBeAddedSuccessfully() {

                Assert.assertEquals(200, deviceResponse.statusCode());
        }
}



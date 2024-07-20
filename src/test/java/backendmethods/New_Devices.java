package backendmethods;

import io.restassured.response.Response;
import readeroperations.ReadingExcel;
import java.io.*;
import static io.restassured.RestAssured.given;

public class New_Devices {


    public New_Devices() throws IOException {
    }
    public static Response deviceResponse;
    ReadingExcel excelReader = new ReadingExcel();
    public String dev_Environment = excelReader.getDataFromExcel(1, 1);
    public static String env_BaseUrl;

    String endPoint;

    {
        env_BaseUrl = dev_Environment;
    }


    public void add_NewDevice () throws IOException {


        endPoint = "objects";
        String requestURL = env_BaseUrl + endPoint;
        System.out.println(requestURL);
        File file = new File("./json-templates/devices/NewDevice-Body.json");

        //Create the POST Request
         deviceResponse = given()
                .header("Content-Type", "application/json")
                .body(file)
                .when()
                .post(requestURL);

        // Print response
        System.out.println("The Response Code Is: " + deviceResponse.getStatusCode());
        System.out.println("The Response Body Is: " + deviceResponse.getBody().asPrettyString());
    }
    }

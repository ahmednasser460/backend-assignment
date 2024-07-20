package readeroperations;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReadingJSONFile {

    public String ReadingFile(String jsonPath) throws IOException {

        // Get the JSON file
        File file = new File(jsonPath);

        // Get the JSON string from the file
        String jsonString = new String(Files.readAllBytes(file.toPath()));
        return jsonString;
    }
}


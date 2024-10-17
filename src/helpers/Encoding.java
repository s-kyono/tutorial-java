package helpers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Encoding {
    public static void printEncodingFile() {
        System.out.println(System.getProperty("file.encoding"));
    }

    public static void writeFile(String filename, String content, String encoding) throws IOException {
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filename), encoding)) {
            writer.write(content);
        }
    }

    public static String readFile(String filename, String encoding) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), encoding))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}

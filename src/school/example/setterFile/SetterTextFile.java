package school.example.setterFile;

import java.io.*;
import java.nio.file.Path;

public class SetterTextFile {
    public static void PutDataFile(Path fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(String.valueOf(fileName)))) {
            String text = "Привет мир!";
            bw.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

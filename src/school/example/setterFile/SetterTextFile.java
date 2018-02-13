package school.example.setterFile;

import school.example.publicVariable.PublicVariable;

import java.io.*;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

public class SetterTextFile {
    public static void PutDataFile(List <String> spData) {
        Path fileName = PublicVariable.PATHFILEDATA;
        System.out.println(fileName);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(String.valueOf(fileName)))) {
         for (Iterator <String> iter = spData.iterator(); iter.hasNext();) {
             bw.write(iter.next());
         }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

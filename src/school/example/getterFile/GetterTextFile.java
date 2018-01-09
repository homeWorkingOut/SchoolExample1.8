package school.example.getterFile;

import java.io.*;
import java.nio.file.Path;

public class GetterTextFile {
    public static void GetDataFile (Path fileName){
        try(BufferedReader br = new BufferedReader(new FileReader(String.valueOf(fileName))))
        {
            //чтение построчно
            String s;
            while((s=br.readLine())!=null){

                System.out.println(s);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}

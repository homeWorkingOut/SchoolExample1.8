package school.example;

import school.example.getterFile.GetterTextFile;
import school.example.setterFile.SetterTextFile;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String myJarPath = Main.class.getProtectionDomain().getCodeSource().getLocation().getPath();
//        String dirPath = new File(myJarPath).getParent();
//        System.out.println(dirPath);
//        Path pt = Paths.get (dirPath, "test.txt");
//        System.out.println(pt);
//        SetterTextFile.PutDataFile(pt);
//        GetterTextFile.GetDataFile(pt);
   System.out.println("Введите номер оперции: \n1 ввод данных, \n2 вывод данных по школе, \n3 правка оценок в журнале");

    }
}

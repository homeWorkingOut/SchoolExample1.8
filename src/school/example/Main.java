package school.example;

import school.example.getterFile.GetterTextFile;
import school.example.setterFile.SetterTextFile;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Введите номер оперции: \n1 ввод данных, \n2 вывод данных по школе, \n3 правка оценок в журнале");
        num = in.nextInt();
        System.out.println(num);
        String str;
        switch (num) {
            case 1:
                inputData();
                break;
            case 2:
                str = "output";
                break;
            case 3:
                str = "marks";
                break;
        }
    }

    private static void inputData() {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Введите номер оперции: \n1 номер школы, \n2 учитель\n3 ученик\n4 предмет");
        num = in.nextInt();
        System.out.println(num);
        String str1;
        switch (num) {
            case 1:
                str1 = "output";
                break;
            case 2:
                str1 = "output";
                break;
            case 3:
                str1 = "marks";
                break;
            case 4:
                str1 = "subject";
                break;
        }

    }
}

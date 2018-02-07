package school.example;

import school.example.getterFile.GetterTextFile;
import school.example.persons.GreatSchoolBoy;
import school.example.persons.GreatTeacher;
import school.example.persons.MakePerson;
import school.example.persons.Person;
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
        Boolean flag = true;
        while (flag) {
        System.out.println("Введите номер операции: \n1 ввод данных, \n2 вывод данных по школе, \n3 правка оценок в журнале, \n4 выход");
            num = in.nextInt();
//            System.out.println(num);
              switch (num) {
                case 1:
                    inputDate();
                    break;
                case 2:
                    outputDate();
                    break;
                case 3:
                    correctedMarks();
                    break;
                default:
                    flag = false;
                    break;
            }
        }
    }

    private static void inputDate() {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("ВВОД ДАННЫХ:");
        System.out.println("Введите номер операции: \n1 Создать новый класс\n2 Создать предметы");
        num = in.nextInt();
//        System.out.println(num);
        String str1;
        switch (num) {
            case 1:
                makeSchollClas ();
                break;
            case 2:
                str1 = "marks";
                break;
            default:
                break;

        }

    }

    private static void makeSchollClas() {
        Scanner in = new Scanner(System.in);
        System.out.println("Номер класса:");
        int numClass = in.nextInt();
        System.out.println("Литера класса:");
        String letterClass = in.next();
        System.out.println("Классный руководитель");
        Person teacher = inputPerson("Teacher");

        System.out.println("Ученик");
        boolean flag = true;
        while (flag) {
            inputPerson("SchoolBoy");
            System.out.println("Продолжить: (Y/N) ");
            String answer = in.next();
            if (answer == "N")
            {
                flag = false;
            }
        }
    }

    private static Person inputPerson(String role) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Фамилию: ");
        String surname = in.next();
        System.out.println("Введите Имя:");
        String name = in.next();
        System.out.println("Введите Отчество:");
        String patronymic = in.next();

        MakePerson make = GetMakePerson (role);
        Person people = make.GreatPerson();
        people.setName(name);
        people.setPatronymic(surname);
        people.setSurname(patronymic);
        people.ShowPerson();
        return  people;
    }


    private static void outputDate() {
        System.out.println("OutputDate");
    }

    private static void correctedMarks() {
        System.out.println("correctedMarks");

    }

    public static MakePerson GetMakePerson(String make) {
        if (make.equals("Teacher")) {
            return new GreatTeacher();
        } else if (make.equals("SchoolBoy")) {
            return new GreatSchoolBoy();
        }
        throw new RuntimeException("Not " + make);
    }

//    public static MakeSubject  GetMakeSubject (String  make) {
//        if (make.equals("Предмет")){
//            return new SubjectMake();}
//        throw new RuntimeException("Not " + make);
//    }
}

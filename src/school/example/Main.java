package school.example;

import school.example.persons.GreatSchoolBoy;
import school.example.persons.GreatTeacher;
import school.example.persons.MakePerson;
import school.example.persons.Person;
import school.example.school.ClassNumberLetter;
import school.example.school.SchoolClass;
import school.example.setterFile.PutSchoolDataFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public SchoolClass schoolClass;
        public static void main(String[] args) {
        // write your code here
//        String myJarPath = Main.class.getProtectionDomain().getCodeSource().getLocation().getPath();
//        String dirPath = new File(myJarPath).getParent();
//        System.out.println(dirPath);
//        Path pt = Paths.get (dirPath, "test.txt");
//        System.out.println(pt);
//        SetterTextFile.PutDataFile(pt);
//        GetterTextFile.GetDataFile(pt);
       List <SchoolClass> school = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int num;
        Boolean flag = true;
        while (flag) {
        System.out.println("Введите номер операции: \n1 ввод данных, \n2 вывод данных по школе, \n3 правка оценок в журнале, \n4 выход");
            num = in.nextInt();
              switch (num) {
                case 1:
                    school.addAll(inputDate());
                    break;
                case 2:
                    outputDate(school);
                    break;
                case 3:
                    correctedMarks();
                    break;
                default:
                    flag = false;
                    putDataFile(school);
                    break;
            }
        }
    }

    private static void putDataFile(List <SchoolClass> school) {
        putDataFiles(school);
    }

    private static  List <SchoolClass> inputDate() {
            // список классов
        List <SchoolClass> school = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("ВВОД ДАННЫХ:");
        System.out.println("Введите номер операции: \n1 Создать новый класс\n2 Создать предметы");
        num = in.nextInt();
        String str1;
        switch (num) {
            case 1:
                school.add(makeSchollClas ());
                break;
            case 2:
                str1 = "marks";
                break;
            default:
                break;
        }
        return school;
    }

    private static SchoolClass makeSchollClas() {
        Scanner in = new Scanner(System.in);
        System.out.println("Номер класса:");
        int numClass = in.nextInt();
        System.out.println("Литера класса:");
        String letterClass = in.next();
        ClassNumberLetter id = new ClassNumberLetter (numClass, letterClass);
        System.out.println("Классный руководитель");
        Person teacher = inputPerson("Teacher");
        System.out.println("Ученик");
        boolean flag = true;
        List<Person> schoolBoys = new ArrayList<>();
        while (flag) {
            Person child = inputPerson("SchoolBoy");
            schoolBoys.add(child);
            System.out.println("Продолжить: (Y/N)");
            String answer = in.next();
            System.out.println(answer);
            if (answer.equals("N"))
            {
                flag = false;
            }
        }
        SchoolClass schoolClass = new SchoolClass(id, teacher, schoolBoys);
        return schoolClass;
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


    private static void outputDate(List <SchoolClass> school) {
        System.out.println("OutputDate");
        for (int i = 0; i< school.size(); i++) {
            SchoolClass classS = school.get(i);
            classS.SchoolClassShow();
        }
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

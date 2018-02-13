package school.example.setterFile;

import school.example.persons.Person;
import school.example.school.SchoolClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PutSchoolDataFile {
    public static void PutDataFiles (List<SchoolClass> school) {
        List<String> spData = new ArrayList<>();
        for (int i = 0; i< school.size(); i++) {
            SchoolClass classS = school.get(i);
            System.out.println(classS.getId().getClassNumber());
            spData.add(String.valueOf(classS.getId().getClassNumber())  + "\n");
            System.out.println(classS.getId().getClassLetter()  + "\n");
            spData.add(classS.getId().getClassLetter());
            System.out.println(classS.getTeacherClass().getName());
            System.out.println(classS.getTeacherClass().getPatronymic());
            System.out.println(classS.getTeacherClass().getSurname());
            spData.add(classS.getTeacherClass().getName() + "\t" + classS.getTeacherClass().getPatronymic() + "\t" + classS.getTeacherClass().getSurname() + "\n");

            List<Person> ListSchoolBoy = classS.getListSchoolBoy();
            for (Iterator<Person> iter = ListSchoolBoy.iterator(); iter.hasNext(); ) {
                Person child = iter.next();
                System.out.println("Ученик " + child.getName() + " " + child.getSurname());
                spData.add(child.getName() + "\t" + child.getPatronymic() + "\t" + child.getSurname() + "\n");
            }

        }
        SetterTextFile.PutDataFile(spData);
    }

}

package school.example.setterFile;

import school.example.persons.Person;
import school.example.school.SchoolClass;

import java.util.Iterator;
import java.util.List;

public class PutSchoolDataFile {
    private List<SchoolClass> school;

    static void PutDataFiles (List<SchoolClass> school){
        for (int i = 0; i< school.size(); i++){
            SchoolClass classS = school.get(i);
            System.out.println(classS.getId().getClassNumber());
            System.out.println(classS.getId().getClassLetter());
            System.out.println(classS.getTeacherClass().getName());
            System.out.println(classS.getTeacherClass().getPatronymic());
            System.out.println(classS.getTeacherClass().getSurname());
            List<Person> ListSchoolBoy = classS.getListSchoolBoy();

            for (Iterator<Person> iter = ListSchoolBoy.iterator(); iter.hasNext(); ) {
                Person child = iter.next();
                System.out.println("Ученик " + child.getName() + " " + child.getSurname());
            }
        }

    }

}

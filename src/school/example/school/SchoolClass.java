package school.example.school;

import school.example.journal.Journal;
import school.example.journal.Mark;
import school.example.persons.Person;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SchoolClass {
    private Person teacherClass;
    private List<Person> ListSchoolBoy;
    private List<Journal> spisokJournal;

    public SchoolClass(Person teacherClass, List<Person> listSchoolBoy, List<Journal> spisokJournal) {
        this.teacherClass = teacherClass;
        ListSchoolBoy = listSchoolBoy;
        this.spisokJournal = spisokJournal;
    }

    public void SchoolClassShow () {
        System.out.println("Классный руководитель " + teacherClass.getName() + " " + teacherClass.getPatronymic() + " " + teacherClass.getSurname());
        for (Iterator<Person> iter = ListSchoolBoy.iterator(); iter.hasNext(); ) {
            Person child = iter.next();
            System.out.println("Ученик " + child.getName() + " " + child.getSurname());
        }

        for (Iterator<Journal> iter = spisokJournal.iterator(); iter.hasNext(); ) {
            Journal jor = iter.next();
            System.out.println(jor.getSubject());
            List<Person> spClass = jor.getSpisokSchoolBoy();
            Map<String, List<Mark>> spMark = jor.getSpisokSchoolBoyMark();

            for (int i = 0; i < ListSchoolBoy.size(); i++) {
                Person child = spClass.get(i);
                System.out.println(child.getName() + child.getSurname());
                List<Mark> spMarkChild = spMark.get(String.valueOf(i));
                for (int j = 0; j < spMarkChild.size(); j++) {
                    Mark mark = spMarkChild.get(j);
                    System.out.println(mark.getDataMark() + " " + mark.getMark());
                }
            }
        }
    }
}

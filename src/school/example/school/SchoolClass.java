package school.example.school;

import school.example.journal.Journal;
import school.example.journal.Mark;
import school.example.persons.Person;
import school.example.school.ClassNumberLetter;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SchoolClass {
    private ClassNumberLetter id;
    private Person teacherClass;
    private List<Person> ListSchoolBoy;
    private List<Journal> spisokJournal;

    public SchoolClass(ClassNumberLetter id,Person teacherClass, List<Person> listSchoolBoy) {
        this.id = id;
        this.teacherClass = teacherClass;
        ListSchoolBoy = listSchoolBoy;
        this.spisokJournal = spisokJournal;
    }

    public ClassNumberLetter getId() {
        return id;
    }

    public void setId(ClassNumberLetter id) {
        this.id = id;
    }

    public Person getTeacherClass() {
        return teacherClass;
    }

    public void setTeacherClass(Person teacherClass) {
        this.teacherClass = teacherClass;
    }

    public List<Person> getListSchoolBoy() {
        return ListSchoolBoy;
    }

    public void setListSchoolBoy(List<Person> listSchoolBoy) {
        ListSchoolBoy = listSchoolBoy;
    }

    public List<Journal> getSpisokJournal() {
        return spisokJournal;
    }

    public void setSpisokJournal(List<Journal> spisokJournal) {
        this.spisokJournal = spisokJournal;
    }

    public void SchoolClassShow () {
        System.out.println("Класс " + id.getClassNumber() + " " + id.getClassLetter());
        System.out.println("Классный руководитель " + teacherClass.getName() + " " + teacherClass.getPatronymic() + " " + teacherClass.getSurname());
        for (Iterator<Person> iter = ListSchoolBoy.iterator(); iter.hasNext(); ) {
            Person child = iter.next();
            System.out.println("Ученик " + child.getName() + " " + child.getSurname());
        }

    }


//    public void SchoolClassShow () {
//        System.out.println("Классный руководитель " + teacherClass.getName() + " " + teacherClass.getPatronymic() + " " + teacherClass.getSurname());
//        for (Iterator<Person> iter = ListSchoolBoy.iterator(); iter.hasNext(); ) {
//            Person child = iter.next();
//            System.out.println("Ученик " + child.getName() + " " + child.getSurname());
//        }
//
//        for (Iterator<Journal> iter = spisokJournal.iterator(); iter.hasNext(); ) {
//            Journal jor = iter.next();
//            System.out.println(jor.getSubject());
//            List<Person> spClass = jor.getSpisokSchoolBoy();
//            Map<String, List<Mark>> spMark = jor.getSpisokSchoolBoyMark();
//
//            for (int i = 0; i < ListSchoolBoy.size(); i++) {
//                Person child = spClass.get(i);
//                System.out.println(child.getName() + child.getSurname());
//                List<Mark> spMarkChild = spMark.get(String.valueOf(i));
//                for (int j = 0; j < spMarkChild.size(); j++) {
//                    Mark mark = spMarkChild.get(j);
//                    System.out.println(mark.getDataMark() + " " + mark.getMark());
//                }
//            }
//        }
//    }

}

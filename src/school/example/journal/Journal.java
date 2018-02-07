package school.example.journal;

import school.example.persons.Person;

import java.util.List;
import java.util.Map;

public class Journal {
    private String subject;
    private List<Person> spisokSchoolBoy;
    private Map <String , List <Mark>> spisokSchoolBoyMark;

    public Journal(String subject, List<Person> spisokSchoolBoy, Map<String, List <Mark>> spisokSchoolBoyMark) {
        this.subject = subject;
        this.spisokSchoolBoy = spisokSchoolBoy;
        this.spisokSchoolBoyMark = spisokSchoolBoyMark;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Person> getSpisokSchoolBoy() {
        return spisokSchoolBoy;
    }

    public void setSpisokSchoolBoy(List<Person> spisokSchoolBoy) {
        this.spisokSchoolBoy = spisokSchoolBoy;
    }

    public Map<String, List <Mark>> getSpisokSchoolBoyMark() {
        return spisokSchoolBoyMark;
    }

    public void setSpisokSchoolBoyMark(Map<String, List <Mark>> spisokSchoolBoyMark) {
        this.spisokSchoolBoyMark = spisokSchoolBoyMark;
    }
}

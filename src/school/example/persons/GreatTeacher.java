package school.example.persons;

public class GreatTeacher implements MakePerson {
    public Person GreatPerson() {
        return new Teacher();
    }
}

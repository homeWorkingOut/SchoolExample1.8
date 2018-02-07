package school.example.subjects;

public class SubjectMake implements MakeSubject {
    @Override
    public Subject MakeSubjectName() {
        return new SubjectName();
    }
}

package school.example.subjects;

public class SubjectName implements Subject {
    private String nameSubjects;
    private String name;
    private String surname;
    private String patronymic;

    @Override
    public String getNameSubjects() {
        return nameSubjects;
    }

    @Override
    public void setNameSubjects(String nameSubjects) {
        this.nameSubjects = nameSubjects;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}

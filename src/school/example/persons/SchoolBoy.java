package school.example.persons;

public class SchoolBoy implements Person {
    private String name;
    private String surname;
    private String patronymic;

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
    public void ShowPerson() {
        System.out.println("SchoolBoy" + " " + name + " " + surname);

    }
}

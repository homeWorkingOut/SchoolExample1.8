package school.example.school;

public class ClassNumberLetter {
    private int classNumber;
    private String classLetter;

    public ClassNumberLetter(int classNumber, String classLetter) {
        this.classNumber = classNumber;
        this.classLetter = classLetter;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getClassLetter() {
        return classLetter;
    }

    public void setClassLetter(String classLetter) {
        this.classLetter = classLetter;
    }
}

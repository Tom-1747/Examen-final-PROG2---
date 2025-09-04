package hei.school;

public class Tutor extends User {
    private final String descriptionOfTheStudent;

    public Tutor(int id, String name, String birthDate, String email, String telephone, String descriptionOfTheStudent) {
        super(id, name, birthDate, email, telephone);
        this.descriptionOfTheStudent = descriptionOfTheStudent;
    }

    public String getDescriptionOfTheStudent() {
        return descriptionOfTheStudent;
    }
}

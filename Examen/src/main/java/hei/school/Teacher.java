package hei.school;

public class Teacher extends User {
    private final Skills skill;

    public Teacher(int id, String name, String birthDate, String email, String telephone, Skills skill) {
        super(id, name, birthDate, email, telephone);
        this.skill = skill;
    }

    public Skills getSkill() {
        return skill;
    }
}

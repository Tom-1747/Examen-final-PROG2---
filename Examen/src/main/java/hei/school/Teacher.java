package hei.school;

public class Teacher extends User {
    public enum Skills {
        FRONT_END, BACK_END, FULLSTACK,
        NETWORK_ADMIN, DATA_SCIENTIST
    }
    private final Skills skill;

    public Teacher(int id, String name, String birthDate, String email, String telephone, Skills skill) {
        super(id, name, birthDate, email, telephone);
        this.skill = skill;
    }

    public Skills getSkill() {
        return skill;
    }
}

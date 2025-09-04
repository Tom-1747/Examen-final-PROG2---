package hei.school;

public class Skills {
    public enum skills {
        FRONT_END, BACK_END, FULLSTACK,
        NETWORK_ADMIN, DATA_SCIENTIST
    }

    private final skills skills;

    public Skills(skills skills) {
        this.skills = skills;
    }

    public skills getSkills() {
        return skills;
    }
}

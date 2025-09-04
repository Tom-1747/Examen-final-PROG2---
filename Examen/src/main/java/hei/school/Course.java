package hei.school;

public class Course {
    private final int id_cours;
    public enum Label {
        PROG1, PROG2, SYS1, SYS2, WEB1,
        WEB2, MGT1, LV1, THEORIE1, THEORIE2
    }
    private final Label label;
    private final int credits;
    private final Teacher teacher;

    public Course(int id_cours, Label label, int credits, Teacher teacher) {
        this.id_cours = id_cours;
        this.label = label;
        this.credits = credits;
        this.teacher = teacher;
    }

    public int getId_cours() {
        return id_cours;
    }

    public Label getLabel() {
        return label;
    }

    public int getCredits() {
        return credits;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}

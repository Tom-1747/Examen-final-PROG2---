package hei.school;

import java.time.Instant;

public class Student extends User {
    private final Notes notes;

    public enum Group {
        K1, K2, K3, K4, K5
    };
    private final Group group;
    private final Tutor tutor;

    public Student(int id, String name, String birthDate, String email, String telephone, Notes notes, Group group, Tutor tutor) {
        super(id, name, birthDate, email, telephone);
        this.notes = notes;
        this.group = group;
        this.tutor = tutor;
    }

    public Group getGroup() {
        return group;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public Notes getNotes() {
        return notes;
    }

    public double getExamGrade (Examen examen, Student student, Instant t) {
        return notes.getInitialValues() + notes.getNotes().getCoefficient();
    }
}

package hei.school;

import java.util.Date;

public class Examen {
    private final int id;
    private final String title;
    private final Course exam_course;
    private final Date exam_date;
    private final float coefficient;

    public Examen(int id, String title, Course exam_course, Date exam_date, float coefficient) {
        this.id = id;
        this.title = title;
        this.exam_course = exam_course;
        this.exam_date = exam_date;
        this.coefficient = coefficient;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Course getExam_course() {
        return exam_course;
    }

    public Date getExam_date() {
        return exam_date;
    }

    public float getCoefficient() {
        return coefficient;
    }
}

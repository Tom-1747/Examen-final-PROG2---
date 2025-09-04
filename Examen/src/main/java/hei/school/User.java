package hei.school;

public class User {
    private final int id;
    private final String name;
    private final String birthDate;
    private final String email;
    private final String telephone;

    public User(int id, String name, String birthDate, String email, String telephone) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }
}

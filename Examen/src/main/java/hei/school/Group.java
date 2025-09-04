package hei.school;

public class Group {
    public enum group {
        K1, K2, K3, K4, K5
    }
    private final group group;

    public Group(group group) {
        this.group = group;
    }

    public group getGroup() {
        return group;
    }
}

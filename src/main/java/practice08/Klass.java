package practice08;

public class Klass {
    public int number;
    public String displayName;

    public Student leader;

    public Klass(int number) {
        this.number = number;
        this.displayName = "Class " + number;
    }

    public void assignLeader(Student stu) {
        this.leader = stu;
    }
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }
}

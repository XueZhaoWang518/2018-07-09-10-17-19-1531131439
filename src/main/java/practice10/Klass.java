package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    public int number;
    public String displayName;
    public List<Student> studentList = new ArrayList<>();
    public Student leader;

    public Klass(int number) {
        this.number = number;
        this.displayName = "Class " + number;
    }

    public boolean isInKlass(Student student) {
        if(studentList.contains(student)){
            return true;
        }
        return false;
    }

    public void assignLeader(Student stu) {
        if (this.studentList.contains(stu)) {
            this.leader = stu;
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public void appendMember(Student stu) {
        if (stu != null) {
            this.studentList.add(stu);
        }
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

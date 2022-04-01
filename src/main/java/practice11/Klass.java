package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    public int number;
    public String displayName;
    public List<Student> studentList = new ArrayList<>();
    public Student leader;
    public Teacher teacher;

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
            if(this.getTeacher()!=null){
                System.out.println("I am "+this.getTeacher().getName()+". I know "+stu.getName()+" become Leader of Class "+this.getNumber()+".");
            }
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public void appendMember(Student stu) {
        if (stu != null) {
            this.studentList.add(stu);
            if(this.getTeacher()!=null)
            {
                System.out.println("I am "+this.getTeacher().getName()+". I know "+stu.getName()+" has joined Class "+this.getNumber()+".");
            }

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}

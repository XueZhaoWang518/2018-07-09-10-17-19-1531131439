package practice09;
import java.util.ArrayList;
import java.util.List;


public class Student extends Person {
    public Klass klass;
//    public int klass;

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Student(int age, String name, int id, Klass klass) {
        super(age, name, id);
        this.klass = klass;
    }

    @Override
    public String introduce() {
//        super.introduce();
        String line = "";
        if (this.klass.getLeader()!=null && this.klass.getLeader().getId() == this.getId()) {
            line = super.introduce() + " I am a Student. I am Leader of Class " + this.getKlass().getNumber() + ".";
        } else {
            line = super.introduce()+" I am a Student. I am at Class "+this.getKlass().getNumber()+".";
        }
        return line;
    }

    public Klass getKlass() {
        return klass;
    }
}

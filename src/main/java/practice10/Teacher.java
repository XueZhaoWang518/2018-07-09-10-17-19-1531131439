package practice10;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    public List<Klass> klasses = new ArrayList<>();

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(int age, String name, int id, List<Klass> klasses) {
        super(age, name, id);
        this.klasses = klasses;
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : this.getClasses()) {
            if (klass.isInKlass(student)) {
                return true;
            }
        }
        return false;
    }
    public List<Klass> getClasses() {
        return klasses;
    }

    public void setKlasses(List<Klass> klasses) {
        this.klasses = klasses;
    }

    public Teacher(int age, String name, int id) {
        super(age, name, id);
    }

    public String introduce() {
        String line = "";
        int size = this.getClasses().size();
        if (size != 0){
            line = super.introduce() + " I am a Teacher. I teach Class ";
            for (int i = 0; i < size; i++) {
                line += this.getClasses().get(i).getNumber();
                if (i != (size - 1)) {
                    line += ", ";
                }
            }
            line += ".";
        } else {
            line = super.introduce() + " I am a Teacher. I teach No Class.";
        }

        return line;
    }

    public String introduceWith(Student student) {
        String res;
        if (this.getClasses().contains(student.getKlass())) {
            res = super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        else{
            res = super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
        return res;
    }

}

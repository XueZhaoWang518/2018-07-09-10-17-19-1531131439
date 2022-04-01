package practice07;

public class Teacher extends Person {
    public Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce() {
        String line = "";
        if (this.getKlass() != null) {
            line = super.introduce() + " I am a Teacher. I teach Class " + this.getKlass().getNumber() + ".";
        } else {
            line = super.introduce() + " I am a Teacher. I teach No Class.";
        }

        return line;
    }

    public String introduceWith(Student student) {
        String res;
        if (student.getKlass() == this.getKlass()) {
            res = super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        else{
            res = super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
        return res;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}

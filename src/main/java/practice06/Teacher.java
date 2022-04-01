package practice06;

public class Teacher extends Person {
    public int klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce() {
        String line = "";
        if (this.getKlass() != 0) {
            line = super.introduce() + " I am a Teacher. I teach Class " + this.getKlass() + ".";
        } else {
            line = super.introduce() + " I am a Teacher. I teach No Class.";
        }

        return line;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}

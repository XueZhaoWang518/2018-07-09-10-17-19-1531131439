package practice06;


public class Student extends Person {
    public int klass;

    public Student(int klass) {
        this.klass = klass;
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
//        super.introduce();
        String line = super.introduce()+" I am a Student. I am at Class "+this.getKlass()+".";
        return line;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}

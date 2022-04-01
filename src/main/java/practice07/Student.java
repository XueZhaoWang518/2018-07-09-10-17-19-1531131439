package practice07;


public class Student extends Person {
    public Klass klass;

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }


    @Override
    public String introduce() {
//        super.introduce();
        String line = super.introduce()+" I am a Student. I am at Class "+this.getKlass().getNumber()+".";
        return line;
    }

    public Klass getKlass() {
        return klass;
    }
}

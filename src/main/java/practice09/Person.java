package practice09;

public class Person {
    public String name;
    public int age;
    public int id;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public boolean isEqualTo(Person person2) {
        if (this.getId() == person2.getId()) {
            return true;
        }
        return false;
    }

    public String introduce(){
        String line = "My name is " + this.getName() + ". I am " + this.getAge() + " years old.";
        return line;
    }

    /*  public String basicIntroduce() {
          String line = "My name is " + this.getName() + ". I am " + this.getAge() + " years old.";
          return line;
      }*/
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

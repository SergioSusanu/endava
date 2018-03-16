package Student;

public class Student {
    private String name="";
    private int age=0;

    public void setData(String name, int age){
        setName(name);
        setAge(age);

    }

    private void setName(String name){
        if (name !=null) this.name = name;
    }

    private void setAge(int age){
        if (age > 0 && age <150 ) this.age = age;
    }

    public int getAge() {
        return age;
    }
}

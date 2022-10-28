package lesson3;

public class User {


    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public User(String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo (){
        System.out.println("User name: " + name + " Position: " + position + " email: " + email + " phone: " +
                phone + " salary: " + salary + " age: " + age);
    }

    public int getAge(){
        return age;
    }
}

package lesson4;

public abstract class Animal {
    private static int count;
    protected String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Name is setted: " + name );
        Animal.count++;
        System.out.println("now count is: " + count);
    }

    public abstract void swim(int b);

    public abstract void run(int a);
}

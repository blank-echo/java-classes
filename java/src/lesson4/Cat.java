package lesson4;

public class Cat extends Animal {
    private static int count;

    public Cat(String name) {
        super(name);
        Cat.count++;
        System.out.println("Total cats: " + Cat.count);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void swim(int b) {
        System.out.println(this.name + " doesn't swim, since cats can't swim.");
    }

    @Override
    public void run(int a) {
        if (a <= 200 && a > 0) {
            System.out.println(this.name + " ran " + a + " meters.");
        } else {
            System.out.println("Cats don's run that much.");
        }
    }
}
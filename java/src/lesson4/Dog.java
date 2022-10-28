package lesson4;

public class Dog extends Animal {
    private static int count;

    public Dog(String name) {
        super(name);
        Dog.count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void swim(int b) {
        if (b > 0 && b <= 10) {
            System.out.println(name + " swim " + b + " meters.");
        } else {
            System.out.println("Dogs can't swim further than 10 meters.");
        }
    }

    @Override
    public void run(int a) {
        if (a <= 500 && a > 0) {
            System.out.println(name + " ran " + a + " meters.");
        } else System.out.println("Dogs don't run that much.");
    }
}

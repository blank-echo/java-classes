package lesson4;

public class Cat extends Animal {
    private int catCounter;

    public Cat (String name) {
        this.name = name;
        catCounter = catCounter + 1;
    }

    @Override
    void swim (int b){
        b = 0;
        System.out.println(this.name + " swim " + b + " meters, since cats can't swim.");
    }
    void run (int a) {
        if (a <= 200 && a > 0) {
            System.out.println(this.name + " ran " + a + " meters.");
        } else System.out.println("Cats don's run that much.");
    }
    public int totalCats() {
        return catCounter;
    }
}
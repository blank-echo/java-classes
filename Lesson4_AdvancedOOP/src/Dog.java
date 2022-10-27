public class Dog extends Animal {
    private int dogCounter;

    public Dog (String name) {
        this.name = name;
        dogCounter++;
    }
    void swim (int b){
        if (b > 0 && b <= 10) {
            System.out.println(this.name + " swim " + b + " meters.");
        } else System.out.println("Dogs can't swim further than 10 meters.");
    }
    void run (int a) {
        if (a <= 500 && a > 0) {
            System.out.println(this.name + " ran " + a + " meters.");
        } else System.out.println("Dogs don't run that much.");
    }
}

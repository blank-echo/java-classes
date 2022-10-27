public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Kesha Da Parrot");
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat ("Murzoid");
        Cat cat3 = new Cat ("Lucifer");
        Dog dog1 = new Dog ("Arthas");
        Dog dog2 = new Dog ("Woofer");

        animal.run(50);
        cat1.swim(5);
        cat2.run(190);
        cat1.run(250);
        cat3.swim(3);
        dog1.run(300);
        dog2.swim(15);
        dog1.swim(7);

        System.out.println("Total cats: " + cat2.totalCats());
    }
}

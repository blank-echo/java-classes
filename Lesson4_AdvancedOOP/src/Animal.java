public class Animal {
    private int animalCounter;
    String name;
    public Animal(){
    animalCounter = animalCounter++;
    }
    public Animal (String name) {
        this.name = name;
        animalCounter = animalCounter++;
    }
    void run (int a) {
        System.out.println(this.name + " ran " + a + " meters.");
    }
    void swim (int b) {
        System.out.println(this.name + " swim " + b + " meters.");
    }
}

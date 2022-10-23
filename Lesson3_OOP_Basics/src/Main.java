import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        User Vasya = new User("Vasya", "Director", "vasya_boss@ru.ru", "9161234567",
                100000, 50);
        Vasya.getInfo();

        User[] userArray = new User[5];
        userArray[0] = new User("Tanya", "Secretary", "tanya@mail.com", "123-45-56",
                50000, 25);
        userArray[1] = new User("Alex", "Developer", "Alex@mail.com", "123-45-57",
                50000, 35);
        userArray[2] = new User("Egor", "Cleaner", "Egor@mail.com", "123-45-58",
                50000, 45);
        userArray[3] = new User("Katya", "Finance", "Katya@mail.com", "123-45-59",
                50000, 41);
        userArray[4] = new User("Sergei", "HR", "Sergei@mail.com", "123-45-60",
                50000, 55);

        for(int a = 0; a < userArray.length; a++) {
            if (userArray[a].getAge() > 40) {
                System.out.println(userArray[a].getAge());
            }
        }
    }
}

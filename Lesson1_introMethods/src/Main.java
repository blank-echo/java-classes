public class Main {
    public static void main(String[] args) {
        //Создать переменные всех пройденных типов данных и инициализировать их значения
        byte b1 = 127;
        short s1 = 31767;
        int i1 = 15;
        long l1 = 918333L;
        float f1 = 23.14f;
        double d1 = 117.514;
        boolean bool1 = true;

        formula1(23.14f, 46.11f, 19.19f, 89.11f);
        System.out.println("Formula1 result is " + formula1(23.14f, 46.11f, 19.19f, 89.11f));

        sumIsInRange(3, 16);

        isPositive(-9);
        if (isPositive(-9) == true){
            System.out.println("It is higher than 0. Number is positive.");
        }
        else System.out.println("It is lower than 0. Number is negative.");

        helloName("Joseph");

        isLeapYear(2022);
        if (isLeapYear(2022) == true) {
            System.out.println("It's leap year.");
        }
        else System.out.println("It's not a leap year.");
    }

    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    public static float formula1(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно)
    public static boolean sumIsInRange(int a, int b) {
        if (a + b > 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    public static boolean isPositive(int a) {
        if (a >= 0) {
            return true;
        }
        return false;
    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void helloName(String a) {
        System.out.println("Hello, " + a + "!");
    }

    //Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    public static boolean isLeapYear(int year) {
        if ((year %400 ==0 && year % 100 !=0) && (year % 4 ==0)){
            return true;
        }
        return false;
    }
}
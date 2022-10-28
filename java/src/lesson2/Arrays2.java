package lesson2;

public class Arrays2 {
    public static void main(String[] args) {
        //Задать пустой целочисленный массив размером 8.
        //С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.

        int[] array2 = new int[8];
        int x = 0;
        int y = 0;

        for (x = 0, y = 0; x < 8; x++, y = y + 3){
            array2[x] = y;
            System.out.println("array2[" + x + "] = " + y);
        }

    }
}

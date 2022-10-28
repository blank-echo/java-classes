package lesson2;

public class Arrays7 {
    public static void main(String[] args) {
        //Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        //или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
        //Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.

        int[] array7 = new int[4];
        array7[0] = 1;
        array7[1] = 2;
        array7[2] = 3;
        array7[3] = 4;

        int n = 2;
        moveDatShit(array7, n);
    }

    private static int[] moveDatShit(int[] moveArray, int steps){
//        int arr1 = moveArray[0];
//        int arr2 = moveArray[1];
//        int arr3 = moveArray[2];
//        int arr4 = moveArray[3];

        for (int a = 0; a < moveArray.length; a++){
            int x = moveArray.length - a;
            int y = steps - x;
            moveArray[a] = moveArray[0 + Math.abs(y)];
            System.out.println(moveArray[a]);
        }
        return moveArray;
    }
}

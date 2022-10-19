public class Arrays5 {
    public static void main(String[] args) {
        //Задать одномерный массив и найти в нем минимальный и максимальный элементы

        int[] array5 = new int[7];
        array5[0] = 21;
        array5[1] = 9;
        array5[2] = 16;
        array5[3] = -11;
        array5[4] = -6;
        array5[5] = 11;
        array5[6] = -2;

        int arrayMin = array5[0];
        int arrayMax = array5[0];

        for (int a = 1; a < array5.length; a++){
            int value = array5[a];
            if (value <= array5[a - 1] && value <= arrayMin){
                arrayMin = value;
            }
        }
        for (int a = 1; a < array5.length; a++){
            int value = array5[a];
            if (value > array5[a - 1] && value >= arrayMax){
                arrayMax = value;
            }
        }
        System.out.println("Minimal array element is: " + arrayMin);
        System.out.println("Maximal array element is: " + arrayMax);
    }
}
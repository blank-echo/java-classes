public class Arrays {
    public static void main(String[] args) {
        //Задать целочисленный массив, состоящий из 0 и 1.
        //C помощью цикла и условия заменить 0 на 1, 1 на 0.

        int[] array = new int[10];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        array[3] = 0;
        array[4] = 1;
        array[5] = 0;
        array[6] = 0;
        array[7] = 1;
        array[8] = 0;
        array[9] = 1;

        for (int i = 0; i <= 9; i++) {
            int arrValue = array[i];
            switch (arrValue) {
                case 0:
                    arrValue = 1;
                    break;
                case 1:
                    arrValue = 0;
                    break;
            }
            System.out.println("array1[" + i + "] = " + arrValue);
        }
    }
}

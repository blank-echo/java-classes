package lesson2;

public class Arrays6 {
    public static void main(String[] args) {
        //Написать метод, в который передается не пустой одномерный целочисленный массив,
        //метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.

        int[] array6 = new int[12];
        array6[0] = 5;
        array6[1] = 2;
        array6[2] = 1;
        array6[3] = 2;
        array6[4] = 2;
        array6[5] = 1;
        array6[6] = 2;
        array6[7] = 4;
        array6[8] = 2;
        array6[9] = 1;
        array6[10] = 1;
        array6[11] = 1;

        System.out.println(equalSides(array6));
    }

    private static boolean equalSides (int[] importedArray) {
        //left side
        int sum = importedArray[0] + importedArray[1];
        int sum2 = importedArray[0] + importedArray[1] + importedArray[2];
        int sum3 = importedArray[0] + importedArray[1] + importedArray[2] + importedArray[3];
        int sum4 = importedArray[0] + importedArray[1] + importedArray[2] + importedArray[3] + importedArray[4];
        int sum5 = importedArray[0] + importedArray[1] + importedArray[2] + importedArray[3] + importedArray[4] +
                importedArray[5];
        int sum6 = importedArray[0] + importedArray[1] + importedArray[2] + importedArray[3] + importedArray[4] +
                importedArray[5] + importedArray[6];
        int sum7 = importedArray[0] + importedArray[1] + importedArray[2] + importedArray[3] + importedArray[4] +
                importedArray[5] + importedArray[6] + importedArray[7];
        int sum8 = importedArray[0] + importedArray[1] + importedArray[2] + importedArray[3] + importedArray[4] +
                importedArray[5] + importedArray[6] + importedArray[7] + importedArray[8];
        int sum9 = importedArray[0] + importedArray[1] + importedArray[2] + importedArray[3] + importedArray[4] +
                importedArray[5] + importedArray[6] + importedArray[7] + importedArray[8] + importedArray[9];
        int sum10 = importedArray[0] + importedArray[1] + importedArray[2] + importedArray[3] + importedArray[4] +
                importedArray[5] + importedArray[6] + importedArray[7] + importedArray[8] + importedArray[9] +
                importedArray[10];

        //right side
        int sum2_1 = importedArray[11] + importedArray[10];
        int sum2_2 = importedArray[11] + importedArray[10] + importedArray[9];
        int sum2_3 = importedArray[11] + importedArray[10] + importedArray[9] + importedArray[8];
        int sum2_4 = importedArray[11] + importedArray[10] + importedArray[9] + importedArray[8] +
                importedArray[7];
        int sum2_5 = importedArray[11] + importedArray[10] + importedArray[9] + importedArray[8] +
                importedArray[7] + importedArray[6];
        int sum2_6 = importedArray[11] + importedArray[10] + importedArray[9] + importedArray[8] +
                importedArray[7] + importedArray[6] + importedArray[5];
        int sum2_7 = importedArray[11] + importedArray[10] + importedArray[9] + importedArray[8] +
                importedArray[7] + importedArray[6] + importedArray[5] + importedArray[4];
        int sum2_8 = importedArray[11] + importedArray[10] + importedArray[9] + importedArray[8] +
                importedArray[7] + importedArray[6] + importedArray[5] + importedArray[4] + importedArray[3];
        int sum2_9 = importedArray[11] + importedArray[10] + importedArray[9] + importedArray[8] +
                importedArray[7] + importedArray[6] + importedArray[5] + importedArray[4] + importedArray[3] +
                importedArray[2];
        int sum2_10 = importedArray[11] + importedArray[10] + importedArray[9] + importedArray[8] +
                importedArray[7] + importedArray[6] + importedArray[5] + importedArray[4] + importedArray[3] +
                importedArray[2] + importedArray[1];

        if (importedArray[0] == sum2_10) {
            return true;
        }else if (sum == sum2_9) {
            return true;
        }else if (sum2 == sum2_8) {
            return true;
        }else if (sum3 == sum2_7) {
            return true;
        }else if (sum4 == sum2_6) {
            return true;
        }else if (sum5 == sum2_5) {
            return true;
        }else if (sum6 == sum2_4) {
            return true;
        }else if (sum7 == sum2_3) {
            return true;
        }else if (sum8 == sum2_2) {
            return true;
        }else if (sum9 == sum2_1) {
            return true;
        }else if (sum10 == importedArray[11]) {
            return true;
        }else return false;
    }
}

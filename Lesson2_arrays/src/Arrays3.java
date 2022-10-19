public class Arrays3 {
    public static void main(String[] args) {
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2

        int[] array3 = new int [12];
        array3[0] = 1;
        array3[1] = 5;
        array3[2] = 3;
        array3[3] = 2;
        array3[4] = 11;
        array3[5] = 4;
        array3[6] = 5;
        array3[7] = 2;
        array3[8] = 4;
        array3[9] = 8;
        array3[10] = 9;
        array3[11] = 1;

//        for (int a : array3){
//            if (a <6){
//                a = a * 2;
//                System.out.println(a + " ");
//            }
//        }

        for (int x = 0; x < 12; x++){
            if (array3[x] < 6){
                array3[x] = array3[x] * 2;
            }
        }
        for (int b = 0; b < 12; b++){
            System.out.println("array3[" + b + "] = " + array3[b]);
        }

    }
}

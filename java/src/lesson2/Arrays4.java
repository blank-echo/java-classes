package lesson2;

public class Arrays4 {
    public static void main(String[] args) {
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        //и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        //если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        //индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

        int[][] array4 = new int[6][6];
        int filler = 1;

        for(int a = 0; a < array4.length; a++){
            for(int b =0; b < array4.length; b++){
                if(a == b){
                    array4[a][b] = filler;
                    System.out.print("array4[" + a + "][" + b + "] = " + array4[a][b]);
                }
            }
            System.out.println();
        }
        for(int a = 0; a < array4.length; a++) {
            for (int b = 5; b > 0; b--) {
                if (a + b == 5) {
                    array4[a][b] = filler;
                    System.out.print("array4[" + a + "][" + b + "] = " + array4[a][b]);
                }
            }
            System.out.println();
        }
    }
}

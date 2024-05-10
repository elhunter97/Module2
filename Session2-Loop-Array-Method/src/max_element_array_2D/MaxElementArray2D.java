package max_element_array_2D;

public class MaxElementArray2D {
    public static void main(String[] args) {
        int[][] arr = {
                {11, 983, 787, 714, 1375, 967, 1087},
                {983, 1045, 214, 1102, 1763, 1723, 1842},
                {787, 214, 1945, 888, 1549, 1548, 1627},
                {714, 1102, 888, 186, 661, 781, 810},
                {1375, 1763, 1549, 661, 1056, 1426, 1187},
        };
        int max = arr[0][0];
        int x  = 0;
        int y = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Max in array 2D: "+max+" at row: "+x+" col: "+y);
    }
}

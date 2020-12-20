import org.junit.Test;

public class Main {

    int[][] array = new int[7][5];

    @Test
    public void gradina() {
        System.out.println(solve());
    }

    int solve() {
        int max = 0;
        initArray();

        for (int i = 0; i < 7; i++) {
            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (array[i][j] == 0) {
                    count++;
                }
            }
            if (count > max) max = count;
        }
        return max;
    }

    public void initArray() {
        array[0][0] = 1;
        array[0][1] = 1;
        array[0][2] = 0;
        array[0][3] = 0;
        array[0][4] = 0;

        array[1][0] = 0;
        array[1][1] = 0;
        array[1][2] = 1;
        array[1][3] = 1;
        array[1][4] = 1;

        array[2][0] = 0;
        array[2][1] = 1;
        array[2][2] = 1;
        array[2][3] = 0;
        array[2][4] = 1;

        array[3][0] = 0;
        array[3][1] = 0;
        array[3][2] = 1;
        array[3][3] = 0;
        array[3][4] = 0;

        array[4][0] = 1;
        array[4][1] = 0;
        array[4][2] = 1;
        array[4][3] = 1;
        array[4][4] = 0;

        array[5][0] = 0;
        array[5][1] = 0;
        array[5][2] = 1;
        array[5][3] = 1;
        array[5][4] = 0;

        array[6][0] = 1;
        array[6][1] = 0;
        array[6][2] = 0;
        array[6][3] = 0;
        array[6][4] = 1;
    }
}

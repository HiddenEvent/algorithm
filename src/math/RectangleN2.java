package math;

public class RectangleN2 {
    public static void main(String[] args) {
        /* 문제
        입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는
        숫자 사각형을 출력하시오
        4

        정답:
           1  2  3  4
           8  7  6  5
           9  10 11 12
           16 15 14 13
        */
        int n = 4;
        /* 1. 기본 처리 */
        for (int x = 0; x < n; x++) {

            for (int y = 0; y < n; y++) {
                if(x % 2 == 0){
                    System.out.printf("%4d", (x * n) + y + 1 );
                } else {
                    System.out.printf("%4d", (x * n ) + n - y );
                }
            }
            System.out.println();
        }

        /*
            2. 2차원 배열로 처리
        int num[][] = new int[n][n];


        for (int i = 0; i < n; i++) {
            if ( i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    num[i][j] = i * n + j + 1;
                }
            } else {
                for (int j = n-1 ; j >= 0; j--) {
                    num[i][j] = i * n + n - j;
                }
            }
        }


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.printf("%4d", num[i][j]);
            }
            System.out.println();
        }
        */
    }
}

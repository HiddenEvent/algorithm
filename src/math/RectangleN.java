package math;

public class RectangleN {
    public static void main(String[] args) {
        /* 문제
        입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는
        숫자 사각형을 출력하시오
        4

        정답:
        1 2 3 4
        5 6 7 8
        9 10 11 12
        13 14 15 16
        */
        int n = 4;
        int count = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                count += 1;
                System.out.print(count+" ");
            }
            System.out.println();
        }


    }
}

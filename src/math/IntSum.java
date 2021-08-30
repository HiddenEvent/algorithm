package math;

public class IntSum {
    public static void main(String[] args) {
        /*
        입력된 수의 각 자릿수 합을 구하시오
        1242
        정답: 9
        */
        int input = 1242;
        int accSum = 0;
        /* 1. 타입 변환으로 푸는 방법 */
//        String numString = String.valueOf(input);
//        for (int i = 0; i < numString.length() ; i++) {
//            accSum += Integer.parseInt(String.valueOf(numString.charAt(i)));
//        }
//        System.out.println(accSum);
        
        /* 2. 나누는 방법 */
        while (input > 0 ){
            accSum = accSum + (input % 10);
            input = input / 10;
        }
        System.out.println(accSum);
    }
}

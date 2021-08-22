package math;

/* 소수 판별 */
// 소수 = {1과 자기자신을 제외하고 나누어 떨어지는 수가 없는 것
// 특징 : 자기 숫자의 절반 (/2) 한값 이상의 경우 나누어 떨어지는 수가 없다.
public class Decimal {
    public static void main(String[] args) {
        int num = 18;

        boolean isPrimeNumber = true;

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        if(isPrimeNumber) {
            System.out.println(num + " 은 소수입나다.");
        }
        else {
            System.out.println(num + "은 소수가 아닙니다.");
        }
    }
}

package string;

public class Ascii {
    public static void main(String[] args) {
        String input = "hellowWorlD";
        char[] arr = input.toCharArray(); /*char 배열 변환*/
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] + 'A'-'a');
            }
            else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] - ('A'-'a'));
            }
        }
        System.out.println(arr);

    }
}

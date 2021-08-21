import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

public class MaxNum {
    public static void main(String[] args) {
        int[] inputNum = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2};
        System.out.println(Arrays.stream(inputNum).max().orElseGet(() -> 0));
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i : inputNum) {
            int count = Optional.ofNullable(hashMap.get(i)).orElseGet(() -> 0);
            hashMap.put(i, ++count);
        }
        System.out.println(hashMap.entrySet().stream().map());
    }
}

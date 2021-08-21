package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionExam {
    public static void main(String[] args) {

        int inNum = 19;
        /* 초기값 생성 */
        List<Integer> binArr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /* for each 문*/
        for (int bin : binArr){
            System.out.println(bin);
        }
        binArr.forEach(integer ->
                System.out.print(integer)
        );
        System.out.println();
        /* List 거꾸로 바꾸기*/
        Collections.reverse(binArr);

        /* List max값 가져오기 */
        int max = Collections.max(binArr);

        /* 정렬 하기*/
        Collections.sort(binArr); // asc 정렬
        binArr.sort(Comparator.naturalOrder()); // asc 정렬
        System.out.println(binArr.toString());
        binArr.sort(Comparator.reverseOrder()); // desc 정렬
        System.out.println(binArr.toString());
    }
}

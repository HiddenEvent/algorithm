package decoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Binary {
    public static void main(String[] args) {
        int inNum = 19;
        ArrayList<Integer> binArr = new ArrayList<>();

        int mok = inNum;
        while (mok > 0) {
            binArr.add(mok % 2) ;
            mok /= 2;

        }
        Collections.reverse(binArr);
        binArr.forEach(integer ->
                        System.out.print(integer)
                );


    }
}

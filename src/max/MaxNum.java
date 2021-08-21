package max;

import java.util.*;
import java.util.Map.Entry;

public class MaxNum {
    public static void main(String[] args) {
        int[] inputNum = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2};

        Map<Integer, Integer> numCountMap = new HashMap<Integer, Integer>();
        for (int key : inputNum) {
            int targetCount = Optional.ofNullable(numCountMap.get(inputNum[key])).orElse(0);
            numCountMap.put(key, ++targetCount);
        }

        Entry<Integer, Integer> maxEntry = null;

        for (Entry<Integer, Integer> entry : numCountMap.entrySet()) {
            if(maxEntry == null || maxEntry.getValue() < entry.getValue()){
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry.getKey());
        System.out.println(maxEntry.getValue());

    }
}





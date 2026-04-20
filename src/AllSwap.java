import java.util.HashMap;
import java.util.Map;

public class AllSwap {
    public static void main(String[] args){
        String[] array = {"ab", "ac"};
        Map<String, Integer> allSwap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {

            String key = array[i].substring(0, 1);

            if (allSwap.containsKey(key)) {

                int index = allSwap.get(key);

                String temp = array[i];
                array[i] = array[index];
                array[index] = temp;

                allSwap.remove(key);

            } else {
                allSwap.put(key, i);
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}



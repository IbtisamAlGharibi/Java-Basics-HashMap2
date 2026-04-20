import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    public static void main(String[] args){

        String[] array = {"ab", "ac"};

        Map<String, Integer> firstSwap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {

            String key = array[i].substring(0, 1);

            if (firstSwap.containsKey(key)) {

                int index = firstSwap.get(key);

                if (index != -1) {
                    String temp = array[i];
                    array[i] = array[index];
                    array[index] = temp;

                    firstSwap.put(key, -1);
                }

            } else {
                firstSwap.put(key, i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
    }
}

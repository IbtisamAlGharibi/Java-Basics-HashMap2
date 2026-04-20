import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public static void main(String[] args){
        String[] array = {"a", "b", "a", "c", "a", "d", "a"};
        Map<String, Integer> wordAppend = new HashMap<>();

        String result = "";
        for (int i = 0; i < array.length; i++) {

            String key = array[i];

            if (wordAppend.containsKey(key)) {
                wordAppend.put(key, wordAppend.get(key) + 1);
            } else {
                wordAppend.put(key, 1);
            }

            if (wordAppend.get(key) >= 2 ) {
                result = result + key;
            }
        }

        System.out.println(result);

    }
}
import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static void main(String[] args){

        String[] array = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> wordMultiple = new HashMap<>();


        for (int i = 0; i < array.length; i++) {

            String key = array[i];

            if (wordMultiple.containsKey(key)) {
                wordMultiple.put(key, true);
            } else {
                wordMultiple.put(key, false);
            }
        }
        System.out.println(wordMultiple);

    }
}

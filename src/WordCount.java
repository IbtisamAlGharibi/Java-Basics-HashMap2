import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args){
        String[] array = {"a", "b", "a", "c", "b"};
        Map<String,Integer > wordCount = new HashMap<>();

        for (int i =0; i< array.length;i++){

            String key = array[i];

            if (wordCount.containsKey(key)){
                wordCount.put(key,wordCount.get(key)+1);
            }else {
                wordCount.put(key,1);

            }
        }
        System.out.println(wordCount);
    }




}

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    public static void main(String[] args){

        String[] array={"this", "and", "that", "and"};
        Map<String,Integer> wordLen = new HashMap<>();

        for (String arr : array){
            wordLen.put(arr,arr.length());
        }
    }
}

import java.util.HashMap;
import java.util.Map;

public class Word0 {
    public static void main(String[] args){
        String[] array={"a","b","c","d"};
        Map<String,Integer> word0 = new HashMap<>();
        for (String arr: array){
            word0.put(arr,0);
        }
        System.out.println(word0);


    }
}

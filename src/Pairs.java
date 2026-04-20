import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static void main(String[] args){
        String[] array = {"code", "bug"};

        Map<String,Integer> pairs = new HashMap<>();

        for (String arr : array){
            String first = arr.substring(0,1);
            String last = arr.substring(arr.length()-1);


        }
    }
}

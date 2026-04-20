import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public static void main(String[] args){

        String[] array = {"salt", "tea", "soda", "toast"};
        Map<String,String > firstChar = new HashMap<>();

        for (int i =0; i< array.length;i++){

            String arr = array[i];
            String key = arr.substring(0,1);

            if (firstChar.containsKey(key)){
                firstChar.put(key, firstChar.get(key) + arr);
            }else {

                firstChar.put(key, arr);
            }

        }
        System.out.println(firstChar);



    }

}


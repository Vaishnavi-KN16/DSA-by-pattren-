import java.util.*;
 public class hashmap{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("USA", 200);
        hm.put("UK", 300);
        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("USA"));
        System.out.println(hm.containsValue(300));
        hm.remove("UK");
        System.out.println(hm);
    }
 }

  
import java.util.*;
public class mapExample {

    public static void main(String[] args) {

        Map<String, String> states1 = new HashMap();
        states1.put("MH", "Maharastra");
        states1.put("KA", "Karnataka");
        states1.put("TS", "Telengana");
        states1.put("TN", "TamilNadu");
        System.out.println(states1);
        states1.putIfAbsent("TN", "Tamilnadu");
        System.out.println(states1);
        Map<String, String> states2 = new HashMap();
        states2.put("DL", "Delhi");
        states2.put("KL", "Kerala");
        states2.put("WB", "WestBengal");
        states2.put("OR", "Orrisa");
        states1.putAll(states2);
        System.out.println(states1);
        states1.remove("OR", "Orrisa");
        System.out.println(states1);

        System.out.println("The keys are: " + states1.keySet());
        System.out.println("The values are: " + states1.values());
        if (states1.containsKey("KA"))
            System.out.println("KA is available...");
        else
            System.out.println("Not available");
        if (states1.containsValue("Telengana"))
            System.out.println("Telengana is available...");
        else
            System.out.println("Not available");
        System.out.println("The value for given key Ts is :" + states1.get("TS"));
        System.out.println(states1.size());
    }
}
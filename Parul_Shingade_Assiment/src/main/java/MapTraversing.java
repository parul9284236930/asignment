import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTraversing {

    public static void main(String[] args) {

        Map<String,String> states1 = new HashMap();
        states1.put("MH", "Maharastra");
        states1.put("KA", "Karnataka");
        states1.put("TS", "Telengana");
        states1.put("TN", "TamilNadu");
        System.out.println(states1);
        Set<Map.Entry<String, String>> entries = states1.entrySet();
        Iterator itr = entries.iterator();
        while(itr.hasNext()) {
            Map.Entry<String,String> temp = (Entry<String, String>) itr.next();
            System.out.println(temp.getKey()+"-->"+temp.getValue());
        }

    }

}
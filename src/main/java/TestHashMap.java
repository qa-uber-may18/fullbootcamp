import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hMap = new HashMap<String, String>();
        hMap.put("LastName", "Ovchar");
        hMap.put("FirstName", "Alla");
        hMap.put("MiddleName", "G");
        hMap.put("HairColor", "Black");

        String s = hMap.get("LastName");
        System.out.println(s);
    }
}

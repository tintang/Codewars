package conversion;

import java.util.LinkedHashMap;

public class Conversion {

    //Not my solution, just for understanding
    private static LinkedHashMap<Integer, String> mapping;

    static {
        mapping = new LinkedHashMap<>();
        mapping.put(1000, "M");
        mapping.put(900, "CM");
        mapping.put(500, "D");
        mapping.put(400, "CD");
        mapping.put(100, "C");
        mapping.put(90, "XC");
        mapping.put(50, "L");
        mapping.put(40, "XL");
        mapping.put(10, "X");
        mapping.put(9, "IX");
        mapping.put(5, "V");
        mapping.put(4, "IV");
        mapping.put(1, "I");
    }

    public String solution(int input) {
        var stringBuilder = new StringBuilder();
        for (var entrySet : mapping.entrySet()) {
            while (input >= entrySet.getKey()) {
                stringBuilder.append(entrySet.getValue());
                input -= entrySet.getKey();
            }
        }
        return stringBuilder.toString();
    }
}

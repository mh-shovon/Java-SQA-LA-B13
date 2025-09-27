package Class_And_Practice.Class_08.Generic;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "John");
        map.put("age", 29);
        map.put("isEmployed", true);
        map.put("salary", 60000);

        //Full value print
        System.out.println("Map Contents: " + map);

        //Single value print
        System.out.println("Name: " + map.get("name"));
        System.out.println("Age: " + map.get("age"));
        System.out.println("isEmployed: " + map.get("isEmployed"));
        System.out.println("salary: " + map.get("salary"));
    }
}

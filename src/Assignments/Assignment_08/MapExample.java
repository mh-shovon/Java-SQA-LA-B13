package Assignments.Assignment_08;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Mehedi");
        employeeMap.put(102, "Hasan");
        employeeMap.put(103, "Shovon");
        employeeMap.put(102, "Rahim"); // key 102 updated

        System.out.println("Employee Map (Map Example):");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }
    }
}
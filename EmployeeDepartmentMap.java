import java.util.*;

public class EmployeeDepartmentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1001, "HR");
        employeeMap.put(1002, "Finance");
        employeeMap.put(1003, "Engineering");

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Department: " + entry.getValue());
        }
    }
}

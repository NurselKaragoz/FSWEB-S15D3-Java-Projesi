import com.workintech.employee.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employee = new LinkedList<>();
        employee.add(new Employee(12345,"ali ","yazar"));
        employee.add(new Employee(12345,"ali ","yazar"));
        employee.add(new Employee(1234,"veli ","bozar"));
        employee.add(new Employee(12,"ayse ","cizer"));
        employee.add(new Employee(1,"fatma","tartar"));
        LinkedList<Employee> tekrarData= new LinkedList<>();
        Map<Integer,Employee> tekData= new HashMap<>();
        Iterator<Employee> iterator= employee.iterator();
        while (iterator.hasNext()){
            Employee employee1= iterator.next();
            if(employee1== null){
                System.out.println("Boş data");

        }
             else if (tekData.containsKey(employee1.getId())) {
                 tekrarData.add(employee1);
            }
             else {
                 tekData.put(employee1.getId(),employee1);
            }
            {

            }
        }

        System.out.println(tekrarData);
        System.out.println(tekData);



    }




}
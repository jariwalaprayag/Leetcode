/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int value = 0;
        if(employees == null)
            return value;
        
        Queue<Employee> emp = new LinkedList<>();
        HashMap<Integer, Integer> ids = new HashMap<>();
        
        for(int i = 0; i < employees.size(); i++){
            ids.put(employees.get(i).id, i);
        }
        
        emp.add(employees.get(ids.get(id)));
        while(!emp.isEmpty()){
            Employee e = new Employee();
            e = emp.remove();
            value += e.importance;
            for(int i = 0; i < e.subordinates.size(); i++){
                emp.add(employees.get(ids.get(e.subordinates.get(i))));
            }
        }
        return value;
    }
}
package service;

import entity.Employee;
import lombok.Data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ManagedBean(name = "EJB_LAB", eager = true )
@ViewScoped
@Data
public class service implements Serializable {
    private static final long serialVersionUID = 1L;

    private Employee newEmployee= new Employee();

    private static final List<Employee> employees
            = new ArrayList<>(Arrays.asList(
            Employee.builder().name("ivanov").department("Marketing").address("11").wage(500).build(),
            Employee.builder().name("petrov").department("Marketing").address("10").wage(300).build(),
            Employee.builder().name("mishin").department("Smith").address("12").wage(200).build(),
            Employee.builder().name("vasin").department("Programmer").address("14").wage(400).build(),
            Employee.builder().name("sidorov").department("Professor").address("13").wage(500).build()
    ));

    public void addEmployee() {
        employees.add(newEmployee);
        newEmployee = new Employee();
    }

    public void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees(){
        return employees;
    }
}

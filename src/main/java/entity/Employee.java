package entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
    private String name;
    private String department;
    private String address;
    private double wage;
    private boolean canEdit;

    @Builder
    public Employee (String name, String department,String address,double wage){
        this.name = name;
        this.department = department;
        this.address = address;
        this.wage = wage;
        canEdit = false;
    }
}

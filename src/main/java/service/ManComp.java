package service;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "ManComp", eager = true )
@RequestScoped
@Data
@NoArgsConstructor
public class ManComp {
    private String input;
    private String output;

    public void submit() {
        output = "You Are Welcome!!!"+input;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author yury
 */
@Named(value = "authenticationView")
@RequestScoped
public class AuthenticationView implements Serializable {
    
    private String username;
    
    private String password;
    
    public AuthenticationView() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void authenticate() {
        System.out.println(username);
        System.out.println(password);
    }

}

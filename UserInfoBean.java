/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ch.bbbaden.la_133_9915_intro;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author nutze
 */
@Named(value = "userInfoBean")
@SessionScoped
public class UserInfoBean implements Serializable {
    /**
     * Creates a new instance of Session
     */
    public UserInfoBean() {
    }
    
    private String vorname;
    private String nachname;

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }
    
    
}

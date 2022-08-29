/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.la_133_9915_intro;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author A
 */
@Named(value = "helloManagedBean")
@ApplicationScoped
public class HelloManagedBean {

    /**
     * Creates a new instance of HelloManagedBean
     */
    public HelloManagedBean() {
    }

    private String eingabe;

    public String getEingabe() {
        return eingabe;
    }

    public void setEingabe(String eingabe) {
        this.eingabe = eingabe;
    }

}

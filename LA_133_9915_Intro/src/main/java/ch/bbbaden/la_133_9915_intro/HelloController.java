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
 * @author A.F.
 */
@Named(value = "helloController")
@ApplicationScoped
public class HelloController {

    /**
     * Creates a new instance of HelloController
     */
    public HelloController() {
    }

    public String weiterleitung() {
        return "post.xhtml";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.jsf;

import br.ejb.EjbOlaMundo;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author default
 */
@Named(value = "jsfOi")
@RequestScoped
public class JsfOi {

    @EJB
    private EjbOlaMundo ejbOlaMundo;

    /**
     * Creates a new instance of JsfOi
     */
    public JsfOi() {
    }
    
    public String getOi(){
        return ejbOlaMundo.getOi();
    }
}

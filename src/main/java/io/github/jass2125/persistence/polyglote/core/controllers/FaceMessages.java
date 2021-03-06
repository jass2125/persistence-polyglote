/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.persistence.polyglote.core.controllers;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Inject;

/**
 *
 * @author <a href="mailto:jair_anderson_bs@hotmail.com">Anderson Souza</a>
 * @since Sep 29, 2017 5:09:27 PM
 */
@RequestScoped
public class FaceMessages implements Serializable {

    @Inject
    @RequestScoped
    private FacesContext context;
    private Flash flash;

    public void addMessage(String id, String message) {
        setKeepMessagesToTrue();
        context.addMessage(id, new FacesMessage(FacesMessage.SEVERITY_INFO, null, message));
    }

    public void setKeepMessagesToTrue() {
        create();
        flash.setKeepMessages(true);
    }

    public void create() {
        flash = context.getExternalContext().getFlash();
    }

}

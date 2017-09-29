/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.persistence.polyglote.core.produces;

import java.io.Serializable;
import java.util.Map;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

/**
 *
 * @author <a href="mailto:jair_anderson_bs@hotmail.com">Anderson Souza</a>
 * @author 16/09/2017 16:35:04
 */
public class FacesSessionProduces implements Serializable {

    @Produces
    private Map<String, Object> session = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();

}

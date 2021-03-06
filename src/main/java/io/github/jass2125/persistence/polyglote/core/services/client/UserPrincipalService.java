/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.persistence.polyglote.core.services.client;

import io.github.jass2125.persistence.polyglote.core.entity.UserPrincipal;

/**
 *
 * @author <a href="mailto:jair_anderson_bs@hotmail.com">Anderson Souza</a>
 * @author 13/09/2017 20:22:48
 */
public interface UserPrincipalService {

    public UserPrincipal searchUserByEmailAndPassword(UserPrincipal userPrincipal);

    public UserPrincipal update(UserPrincipal userPrincipal);

    public UserPrincipal save(UserPrincipal newUser);
}

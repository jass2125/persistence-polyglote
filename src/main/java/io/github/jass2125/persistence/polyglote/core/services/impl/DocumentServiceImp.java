/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.persistence.polyglote.core.services.impl;

import io.github.jass2125.persistence.polyglote.core.entity.Document;
import io.github.jass2125.persistence.polyglote.core.dao.client.DocumentDao;
import io.github.jass2125.persistence.polyglote.core.services.client.DocumentService;
import javax.inject.Inject;

/**
 *
 * @author <a href="mailto:jair_anderson_bs@hotmail.com">Anderson Souza</a>
 * @author 18/09/2017 21:33:55
 */
public class DocumentServiceImp implements DocumentService {

    @Inject
    private DocumentDao documentDao;

    @Override
    public void save(Document document) {
        documentDao.save(document);
    }

}

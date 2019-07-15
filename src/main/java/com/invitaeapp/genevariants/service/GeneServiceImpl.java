package com.invitaeapp.genevariants.service;

import com.invitaeapp.genevariants.dao.GeneDAO;
import com.invitaeapp.genevariants.model.GeneModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneServiceImpl implements GeneService{

    @Autowired
    GeneDAO geneDAO;

    //constructor injection
    GeneServiceImpl(GeneDAO geneDAO){
        this.geneDAO = geneDAO;
    }

    @Override
    public List<GeneModel> getGeneVariants(String geneName) {
        return geneDAO.getGeneVariants(geneName);
    }

    @Override
    public List<String> getGeneAutoSuggestions(String geneToken) {
        return geneDAO.getGeneAutoSuggestions(geneToken);
    }
}

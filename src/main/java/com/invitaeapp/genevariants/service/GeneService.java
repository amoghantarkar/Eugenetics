package com.invitaeapp.genevariants.service;

import com.invitaeapp.genevariants.model.GeneModel;

import java.util.List;

public interface GeneService {

    List<GeneModel> getGeneVariants(String geneName);
    List<String> getGeneAutoSuggestions(String geneToken);

}

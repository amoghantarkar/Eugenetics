package com.invitaeapp.genevariants.dao;

import com.invitaeapp.genevariants.model.GeneModel;

import java.util.List;

public interface GeneDAO {


     List<GeneModel> getGeneVariants(String geneName);
     List<String> getGeneAutoSuggestions(String geneToken);

}

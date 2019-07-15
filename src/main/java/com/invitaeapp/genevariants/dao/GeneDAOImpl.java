package com.invitaeapp.genevariants.dao;

import com.invitaeapp.genevariants.model.GeneModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class GeneDAOImpl implements GeneDAO {
    @Override
    public List<GeneModel> getGeneVariants(String geneName) {
        List<GeneModel> geneModels = new ArrayList<>();

        String test = "CDKL5\tNM_003159.2:c.-162-?_99+?del\t\tNM_003159.2:c.-162-?_99+?del\t\tNM_003159.2\t\tPathogenic\tPathogenic\tClinVar\t2014-03-13\t2017-09-14\thttps://www.ncbi.nlm.nih.gov/clinvar/RCV000170005\t";
        String[] values = test.split("\t");
        GeneModel geneModel = new GeneModel();
        geneModel.setGeneName(values[0]);
        geneModel.setNucleotideChange(values[1]);
        geneModels.add(geneModel);

        return geneModels;
    }

    @Override
    public List<String> getGeneAutoSuggestions(String geneToken) {
        return new ArrayList<String>(Arrays.asList("CDKL5", "A2M"));

    }
}

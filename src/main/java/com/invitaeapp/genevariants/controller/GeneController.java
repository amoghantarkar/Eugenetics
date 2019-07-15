package com.invitaeapp.genevariants.controller;

import com.invitaeapp.genevariants.dto.GeneDTO;
import com.invitaeapp.genevariants.model.GeneModel;
import com.invitaeapp.genevariants.service.GeneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("gene")
public class GeneController {
    /**
     * 2 rest endpoints
     * 1. GET request - param: gene name, return a list of gene variants with its properties from the given datasource
     * 2. GET request - param: enter 1/2 letters of gene, return the list of all matching genes in the form of list as
     * part of auto suggestion drop down to select from
     */
    @Autowired
    GeneService geneService;

    @RequestMapping(value = "/variants", method = RequestMethod.GET)
    public List<GeneDTO> getGeneVariants(@RequestParam(value = "geneName", required = true) String geneName) {
        List<GeneModel> geneModels = geneService.getGeneVariants(geneName);
        //converting GeneModel to DTO List.
        return GeneDTO.convertGeneModelToDTO(geneModels);
    }

    @RequestMapping(value = "/autosuggest", method = RequestMethod.GET)
    public List<String> getGeneAutoSuggestions(@RequestParam(value = "geneToken", required = true) String geneToken) {
        return geneService.getGeneAutoSuggestions(geneToken);
    }


}

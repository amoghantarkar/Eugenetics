package com.invitaeapp.genevariants;

import com.invitaeapp.genevariants.dao.GeneDAO;
import com.invitaeapp.genevariants.model.GeneModel;
import com.invitaeapp.genevariants.service.GeneService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
public class GeneDAOTest {


    @Autowired
    GeneDAO geneDAO;

    @Autowired
    GeneService SUT;

    @Before


    @Test
    // methodName_scenariotest_return
    public void getGeneVariants_oneGeneVariant_returnsString(){
        List<GeneModel> geneModelList = SUT.getGeneVariants("CDL");

    }



}

//
//DAO - Database connection.
//Model -  POJO
//Service - call DAO send to controller
//Controller - sends to DTO methods
//
//DTO - Object Model

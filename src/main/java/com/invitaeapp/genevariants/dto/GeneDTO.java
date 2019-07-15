package com.invitaeapp.genevariants.dto;

import com.invitaeapp.genevariants.model.GeneModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GeneDTO {
    private long id;
    private String geneName;
    private String nucleotideChange;
    private String proteinChange;
    private String otherMappings;
    private String alias;
    private String transcripts;
    private String region;
    private String reportedClassification;
    private String inferredClassification;
    private String source;
    private Date lastEvaluated;
    private Date lastUpdated;
    private String url;
    private String submitterComment;
    private String assembly;
    private int chr;
    private long genomicStart;
    private long genomicStop;
    private String ref;
    private String alt;
    private String accession;
    private String reportedRef;
    private String reportedAlt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGeneName() {
        return geneName;
    }

    public void setGeneName(String geneName) {
        this.geneName = geneName;
    }

    public String getNucleotideChange() {
        return nucleotideChange;
    }

    public void setNucleotideChange(String nucleotideChange) {
        this.nucleotideChange = nucleotideChange;
    }

    public String getProteinChange() {
        return proteinChange;
    }

    public void setProteinChange(String proteinChange) {
        this.proteinChange = proteinChange;
    }

    public String getOtherMappings() {
        return otherMappings;
    }

    public void setOtherMappings(String otherMappings) {
        this.otherMappings = otherMappings;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTranscripts() {
        return transcripts;
    }

    public void setTranscripts(String transcripts) {
        this.transcripts = transcripts;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getReportedClassification() {
        return reportedClassification;
    }

    public void setReportedClassification(String reportedClassification) {
        this.reportedClassification = reportedClassification;
    }

    public String getInferredClassification() {
        return inferredClassification;
    }

    public void setInferredClassification(String inferredClassification) {
        this.inferredClassification = inferredClassification;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getLastEvaluated() {
        return lastEvaluated;
    }

    public void setLastEvaluated(Date lastEvaluated) {
        this.lastEvaluated = lastEvaluated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSubmitterComment() {
        return submitterComment;
    }

    public void setSubmitterComment(String submitterComment) {
        this.submitterComment = submitterComment;
    }

    public String getAssembly() {
        return assembly;
    }

    public void setAssembly(String assembly) {
        this.assembly = assembly;
    }

    public int getChr() {
        return chr;
    }

    public void setChr(int chr) {
        this.chr = chr;
    }

    public long getGenomicStart() {
        return genomicStart;
    }

    public void setGenomicStart(long genomicStart) {
        this.genomicStart = genomicStart;
    }

    public long getGenomicStop() {
        return genomicStop;
    }

    public void setGenomicStop(long genomicStop) {
        this.genomicStop = genomicStop;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public String getReportedRef() {
        return reportedRef;
    }

    public void setReportedRef(String reportedRef) {
        this.reportedRef = reportedRef;
    }

    public String getReportedAlt() {
        return reportedAlt;
    }

    public void setReportedAlt(String reportedAlt) {
        this.reportedAlt = reportedAlt;
    }

    public static List<GeneDTO> convertGeneModelToDTO(List<GeneModel> geneModelList){
        List<GeneDTO> geneDTOS = new ArrayList<>();
        for(GeneModel geneModel: geneModelList){
            geneDTOS.add(createGeneDTO(geneModel));
        }
        return geneDTOS;
    }

    private static GeneDTO createGeneDTO (GeneModel geneModel) {
        GeneDTO geneDTO = new GeneDTO();

        geneDTO.setId(geneModel.getId());
        geneDTO.setGeneName(geneModel.getGeneName());
        geneDTO.setNucleotideChange(geneModel.getNucleotideChange());
        geneDTO.setProteinChange(geneModel.getProteinChange());
        geneDTO.setOtherMappings(geneModel.getOtherMappings());
        geneDTO.setAlias(geneModel.getAlias());
        geneDTO.setTranscripts(geneModel.getTranscripts());
        geneDTO.setRegion(geneModel.getRegion());
        geneDTO.setReportedClassification(geneModel.getReportedClassification());
        geneDTO.setInferredClassification(geneModel.getInferredClassification());
        geneDTO.setSource(geneModel.getSource());
        geneDTO.setLastEvaluated(geneModel.getLastEvaluated());
        geneDTO.setLastUpdated(geneModel.getLastUpdated());
        geneDTO.setUrl(geneModel.getUrl());
        geneDTO.setSubmitterComment(geneModel.getSubmitterComment());
        geneDTO.setAssembly(geneModel.getAssembly());
        geneDTO.setChr(geneModel.getChr());
        geneDTO.setGenomicStart(geneModel.getGenomicStart());
        geneDTO.setGenomicStop(geneModel.getGenomicStop());
        geneDTO.setRef(geneModel.getRef());
        geneDTO.setAlt(geneModel.getAlt());
        geneDTO.setAccession(geneModel.getAccession());
        geneDTO.setReportedRef(geneModel.getReportedRef());
        geneDTO.setReportedAlt(geneModel.getReportedAlt());


        return geneDTO;
    }











}

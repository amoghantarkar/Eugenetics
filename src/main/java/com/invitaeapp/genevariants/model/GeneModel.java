package com.invitaeapp.genevariants.model;

import java.util.Date;
import java.util.Objects;

public class GeneModel {
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

    @Override
    public String toString() {
        return "GeneModel{" +
                "id=" + id +
                ", geneName='" + geneName + '\'' +
                ", nucleotideChange='" + nucleotideChange + '\'' +
                ", proteinChange='" + proteinChange + '\'' +
                ", otherMappings='" + otherMappings + '\'' +
                ", alias='" + alias + '\'' +
                ", transcripts='" + transcripts + '\'' +
                ", region='" + region + '\'' +
                ", reportedClassification='" + reportedClassification + '\'' +
                ", inferredClassification='" + inferredClassification + '\'' +
                ", source='" + source + '\'' +
                ", lastEvaluated='" + lastEvaluated + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", url='" + url + '\'' +
                ", submitterComment='" + submitterComment + '\'' +
                ", assembly='" + assembly + '\'' +
                ", chr='" + chr + '\'' +
                ", genomicStart='" + genomicStart + '\'' +
                ", genomicStop='" + genomicStop + '\'' +
                ", ref='" + ref + '\'' +
                ", alt='" + alt + '\'' +
                ", accession='" + accession + '\'' +
                ", reportedRef='" + reportedRef + '\'' +
                ", reportedAlt='" + reportedAlt + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneModel geneModel = (GeneModel) o;
        return id == geneModel.id &&
                Objects.equals(geneName, geneModel.geneName) &&
                Objects.equals(nucleotideChange, geneModel.nucleotideChange) &&
                Objects.equals(proteinChange, geneModel.proteinChange) &&
                Objects.equals(otherMappings, geneModel.otherMappings) &&
                Objects.equals(alias, geneModel.alias) &&
                Objects.equals(transcripts, geneModel.transcripts) &&
                Objects.equals(region, geneModel.region) &&
                Objects.equals(reportedClassification, geneModel.reportedClassification) &&
                Objects.equals(inferredClassification, geneModel.inferredClassification) &&
                Objects.equals(source, geneModel.source) &&
                Objects.equals(lastEvaluated, geneModel.lastEvaluated) &&
                Objects.equals(lastUpdated, geneModel.lastUpdated) &&
                Objects.equals(url, geneModel.url) &&
                Objects.equals(submitterComment, geneModel.submitterComment) &&
                Objects.equals(assembly, geneModel.assembly) &&
                Objects.equals(chr, geneModel.chr) &&
                Objects.equals(genomicStart, geneModel.genomicStart) &&
                Objects.equals(genomicStop, geneModel.genomicStop) &&
                Objects.equals(ref, geneModel.ref) &&
                Objects.equals(alt, geneModel.alt) &&
                Objects.equals(accession, geneModel.accession) &&
                Objects.equals(reportedRef, geneModel.reportedRef) &&
                Objects.equals(reportedAlt, geneModel.reportedAlt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, geneName, nucleotideChange, proteinChange, otherMappings, alias, transcripts, region, reportedClassification, inferredClassification, source, lastEvaluated, lastUpdated, url, submitterComment, assembly, chr, genomicStart, genomicStop, ref, alt, accession, reportedRef, reportedAlt);
    }
}
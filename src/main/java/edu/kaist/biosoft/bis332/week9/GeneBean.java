package edu.kaist.biosoft.bis332.week9;

/**
 * Created by Junseok Park on 2017-04-24.
 */
public class GeneBean {
    private String gene_id;
    private String gene_symbol;
    private String gene_synonyms;

    public String getGene_id() {
        return gene_id;
    }

    public void setGene_id(String gene_id) {
        this.gene_id = gene_id;
    }

    public String getGene_symbol() {
        return gene_symbol;
    }

    public void setGene_symbol(String gene_symbol) {
        this.gene_symbol = gene_symbol;
    }

    public String getGene_synonyms() {
        return gene_synonyms;
    }

    public void setGene_synonyms(String gene_synonyms) {
        this.gene_synonyms = gene_synonyms;
    }
}

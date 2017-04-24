package edu.kaist.biosoft.bis332.week9;

import java.sql.*;
import java.util.ArrayList;


public class GeneDataBean {
    // TODO code application logic here
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    String sql = "";
    String IP_ADDRESS="biostar.kaist.ac.kr";
    String PORT="5432";
    String DB_NAME="u"; // Student Number
    String ID="u"; //Student Number
    String Passwd="bisl";  //Password


    public GeneDataBean() throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://" + IP_ADDRESS + ":" + PORT + "/" + DB_NAME, ID, Passwd);
            sql = "select geneid, symbol, synonyms from gene_info limit 100";
            stmt = conn.createStatement();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList getGeneList() throws SQLException {
        ArrayList geneList = new ArrayList();
        rs = stmt.executeQuery(sql);

        while(rs.next()) {
            GeneBean gene = new GeneBean();
            gene.setGene_id(rs.getString("geneid"));
            gene.setGene_symbol(rs.getString("symbol"));
            gene.setGene_synonyms(rs.getString("synonyms"));
            geneList.add(gene);
        }

        rs.close();
        return geneList;
    }

    protected void finalize() {
        try {
            stmt.close();
            conn.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

}

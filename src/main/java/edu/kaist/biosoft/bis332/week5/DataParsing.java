package edu.kaist.biosoft.bis332.week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DataParsing {
    public static void main(String[] args)throws Exception {
        String str;
        String inName= "dataFiles/Homo_sapiens.gene.txt";
        String outName="gene.txt";
        BufferedReader ptrRead = new BufferedReader(new FileReader(inName));
        BufferedWriter ptrWrite= new BufferedWriter(new FileWriter(outName, false));

        while((str=ptrRead.readLine()) != null ){
            String[] values=str.split("\t");
            if (values.length>2){
                System.out.println(values[1]+"\t"+values[2]+"\t"+values[4]+"\t"+values[8]+"\t"+values[6]+"\t"+values[7]);              ptrWrite.write(values[1]+"\t"+values[2]+"\t"+values[4]+"\t"+values[8]+"\t"+values[6]+"\t"+values[7]+"\n");
            }
        }
        ptrRead.close();
        ptrWrite.flush();
        ptrWrite.close();
    }
}

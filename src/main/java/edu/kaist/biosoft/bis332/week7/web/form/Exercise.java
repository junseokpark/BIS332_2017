package edu.kaist.biosoft.bis332.week7.web.form;

/**
 * Created by Junseok Park on 2017-04-11.
 */
public class Exercise {

    private String firstNo;
    private String secondNo;
    private String sum;

    public long getSum() {
        return Integer.parseInt(firstNo)+Integer.parseInt(secondNo);
    }

    public String getFirstNo() {
        return firstNo;
    }

    public void setFirstNo(String firstNo){
        this.firstNo = firstNo;
    }

    public String getSecondNo(){
        return secondNo;
    }

    public void setSecondNo(String secondNo){
        this.secondNo = secondNo;
    }

}

package edu.kaist.biosoft.bis332.week7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/**
 *
 * @author user
 */
public class JDBC_ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        String IP_ADDRESS="biostar.kaist.ac.kr";
        String PORT="5432";
        String DB_NAME="u"; // Student Number
        String ID="u"; //Student Number
        String Passwd="";  //Password

        try{
            Class.forName("org.postgresql.Driver");
            conn= DriverManager.getConnection("jdbc:postgresql://"+IP_ADDRESS+":"+PORT+"/"+DB_NAME,ID,Passwd);
            stmt=conn.createStatement();

            //------------------practice 1(query)---------------------

            String sql="select sno, name, dep, grade, pid from student";
            rs=stmt.executeQuery(sql);
            while (rs.next()){
                String student_number=rs.getString("sno");
                String student_name=rs.getString("name");
                String student_pid=rs.getString("pid");

                System.out.print("student_number = "+student_number+"\n");
                System.out.print("student_name = "+student_name+"\n");
                System.out.print("student_pid = "+student_pid+"\n");
            }

            System.out.println("--------------------------------");

            //------------------practice 2(insert)---------------------
            /*
            String sql1="insert into student values('00000006','Ryu','105',2,1)";
            stmt.executeUpdate(sql1);
            System.out.println("data were succesfully inserted");
            String sql1_2="select sno, name, dep, grade, pid from student";
            rs=stmt.executeQuery(sql1_2);
            while (rs.next()){
                String student_number=rs.getString("sno");
                String student_name=rs.getString("name");
                String student_pid=rs.getString("pid");

                System.out.print("student_number = "+student_number+"\n");
                System.out.print("student_name = "+student_name+"\n");
                System.out.print("student_pid = "+student_pid+"\n");
            }

            System.out.println("--------------------------------");
            */
            //------------------exerecise (delete)---------------------
            /*
            String sql2="delete from student where sno='00000006'";
            stmt.executeUpdate(sql2);

            String sql2_2="select sno, name, dep, grade, pid from student";
            rs=stmt.executeQuery(sql2_2);
            while (rs.next()){
                String student_number=rs.getString("sno");
                String student_name=rs.getString("name");
                String student_pid=rs.getString("pid");

                System.out.print("student_number = "+student_number+"\n");
                System.out.print("student_name = "+student_name+"\n");
                System.out.print("student_pid = "+student_pid+"\n");
            }

            System.out.println("--------------------------------");
            */
            //------------------practice 3(join)---------------------
            /*
            String sql3="select professor.name as prof_name, student.dep, student.sno, student.name as stud_name " +
                    "from student join professor on student.pid=professor.pid where professor.name='C'";

            System.out.println("prof\tdep\tpid\tname");
            rs=stmt.executeQuery(sql3);
            while (rs.next()){
                String prof_name=rs.getString("prof_name");
                String student_dep=rs.getString("dep");
                String student_pid=rs.getString("sno");
                String student_name=rs.getString("stud_name");

                System.out.println(prof_name+"\t"+student_dep+"\t"+student_pid+"\t"+student_name);
            }
            */
            //-------------------------------------------------------
            rs.close();
            stmt.close();

        }

        catch (SQLException e){
            System.err.println(e.getMessage());
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        finally{
            if (conn!=null)
                conn.close();
        }
    }
}

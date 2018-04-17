package sample;


import com.sun.rowset.internal.InsertRow;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Random;

public class Problem {
    String Statement;
    String FlightID;
    int Time;
    String to;


    Problem()
    {
    }

    Problem(String Statement, String FlightID)
    {
        this.Statement=Statement;
        this.FlightID=FlightID;
    }


    protected void generateProblem(Airport Ap)
    {
        Random rand = new Random();
        int n = rand.nextInt(Ap.AIR.size()) + 0;

        Airlines A1=Ap.AIR.get(n);

        int n1=rand.nextInt(A1.flt.size());
        Flight F1=A1.flt.get(n1);
        FlightID=F1.FlightID;
        to=F1.to;

        DBconnect objt=new DBconnect();

        //System.out.print(FlightID);

        int n2=rand.nextInt(2)+0;

        if(n2==0){
           Statement="Your flight " + FlightID + " to " +to+ " is Cancelled. Sorry for the inconvenience caused." ;

            String query="insert into problem(FlightId,Statement)" + "values(?,?)";
            try {
                PreparedStatement preparedStmt = objt.con.prepareStatement(query);
                preparedStmt.setString(1, FlightID);
                preparedStmt.setString(2, Statement);
                preparedStmt.execute();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        else{
            Time=rand.nextInt(5)+1;
            Statement="Your flight " + FlightID + "to "+to+" is Delayed by " +Time + " hours. Sorry for the inconvenience caused";

            String query="insert into problem(FlightId,Statement)" + "values(?,?)";
            try {
                PreparedStatement preparedStmt = objt.con.prepareStatement(query);
                preparedStmt.setString(1, FlightID);
                preparedStmt.setString(2, Statement);
                preparedStmt.execute();
            }catch (Exception e){
                e.printStackTrace();
            }

        }


    }

    protected void resolveProblem(String FID, String Stmnt)
    //protected void resolveProblem()
    {
        System.out.println(FID+Stmnt);
        this.Statement=Stmnt;
        this.FlightID=FID;
        System.out.println(FlightID);
        ArrayList<String> EmailIDs  = new ArrayList<>();
        DBconnect obj=new DBconnect();
        EmailIDs=obj.getData(FlightID,"Email ID");
       // EmailIDs.add("akash.dholaria@sitpune.edu.in");


        System.out.println(FlightID);
       System.out.println(EmailIDs.get(0));
        JavaMail objMail=new JavaMail();
        objMail.sendMail(Statement,EmailIDs);
    }

//    protected void login(String userName, String password)
//    {
//        ArrayList<String> Usernames = new ArrayList<>();
//        ArrayList<String> Passwords = new ArrayList<>();
//        DBconnect obj=new DBconnect();
//
//        Usernames=obj.getData("users","Username");
//        Passwords=obj.getData("users","Password");
//
//
//
//        int flag=1;
//        int flag1=1;
//
//
//        for (String usrname : Usernames)
//        {
//            if(userName.equals(usrname))
//            {
//                flag=0;
//                break;
//            }
//
//        }
//        if(flag==0)
//        {
//            for(String pass:Passwords)
//            {
//                if(password.equals(pass))
//                {
//                    flag1=0;
//                    break;
//                }
//            }
//        }
//        if(flag==0 && flag1==0) {
//            Airport objAir=new Airport();
//            objAir.initializeData();
//            generateProblem(objAir);
//
//
//        }
//    }


}

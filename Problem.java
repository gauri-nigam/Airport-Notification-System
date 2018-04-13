package sample;


import java.util.ArrayList;
import java.util.Random;

public class Problem {
    String Statement;
    String FlightID;
    int Time;


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

        //System.out.print(FlightID);

        int n2=rand.nextInt(2)+0;

        if(n2==0){
           Statement="Flight " + FlightID + " is Cancelled. Sorry for the inconvenience caused." ;
        }
        else{
            Time=rand.nextInt(5)+1;
            Statement="Flight " + FlightID + " is Delayed by " +Time + " hours. Sorry for the inconvenience caused";
        }


    }

    protected void resolveProblem(String FID, String Stmnt)
    {

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

}

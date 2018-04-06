package sample;


import java.util.Random;

public class Problem {
    String Statement;
    String FlightID;
    int Time;


    Problem()
    {
        Statement=null;
        FlightID=null;
    }


    protected void generateProblem(Airport Ap)
    {
        Random rand = new Random();
        int n = rand.nextInt(Ap.AIR.size()) + 0;

        Airlines A1=Ap.AIR.get(n);

        int n1=rand.nextInt(A1.flt.size());
       // System.out.println(n1);
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

}

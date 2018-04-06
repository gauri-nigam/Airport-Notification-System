package sample;


import java.util.ArrayList;

public class Airport {
    ArrayList<Airlines> AIR =new ArrayList<Airlines>(3);
    public void initializeData() {

        Airlines IND,JET,VIS;
        IND=new Airlines();
        IND.AirlineID=1;
        JET=new Airlines();
        JET.AirlineID=2;
        VIS=new Airlines();
        VIS.AirlineID=3;
        IND.flt.add(new Flight("6E-102"));
        IND.flt.add(new Flight("6E-356"));
        JET.flt.add(new Flight("JT-222"));
        JET.flt.add(new Flight("JT-999"));
        VIS.flt.add(new Flight("VI-870"));
        VIS.flt.add(new Flight("VI-402"));
        AIR.add(IND);
        AIR.add(JET);
        AIR.add(VIS);
    }

}

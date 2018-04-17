package sample;

public class Flight {
    String FlightID;
    String time;
    String to;

    Flight()
    {
        FlightID="";
    }

    Flight(String FLightID, String to)
    {
        this.FlightID=FLightID;
        this.to=to;
    }
}

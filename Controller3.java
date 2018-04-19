package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller3 implements Initializable {
    public TextArea NotifyFlight;
    public TextArea NotifyText;
    public Button BtnManualNotify;
    public Button BtnBack;
    public Button BtnSignOut;
    public Label LabelManual;
    public Label labelSuccess;
    String Fid;
    String FlightMsg;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void manualResolve(ActionEvent actionEvent) throws Exception {

        Fid=NotifyFlight.getText();
        FlightMsg=NotifyText.getText();
        int flag=0;

        System.out.println(Fid);
        ArrayList<String> allFlights = new ArrayList<>();
        DBconnect obj=new DBconnect();

        allFlights=obj.getData("Airlines","FlightId");

        for(String FT:allFlights)
        {

            if (Fid.equals(FT)) {

                Problem p2 = new Problem(FlightMsg, Fid);
                p2.resolveProblem(Fid, FlightMsg);

                labelSuccess.setText("Successfully Notified");
                flag = 1;
                break;

            }

        }

        try {
            if(flag==0)
            {
                throw new Exception();
            }

        }
        catch(Exception e)
        {

            NotifyFlight.setText("");
           LabelManual.setText("Invalid Flight.Please ReEnter!!");


        }




    }


    public void SignOut(ActionEvent actionEvent)throws Exception {

        Parent root3= FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene1=new Scene(root3, 600, 600);

        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(scene1);
        window.show();

    }

    public void OnBack(ActionEvent actionEvent) throws Exception{
        Parent root5 = null;
        try
        {
            root5=FXMLLoader.load(getClass().getResource("sample2.fxml"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        Scene scene3 = new Scene(root5, 600, 600);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(scene3);
        window.show();
    }
}

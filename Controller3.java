package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller3 implements Initializable {
    public TextArea NotifyFlight;
    public TextArea NotifyText;
    public Button BtnManualNotify;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void manualResolve(ActionEvent actionEvent) {
        String Fid;
        String FlightMsg;
        Fid=NotifyFlight.getText();
        FlightMsg=NotifyText.getText();
        Problem p2=new Problem(FlightMsg,Fid);
        p2.resolveProblem(Fid,FlightMsg);
    }
}

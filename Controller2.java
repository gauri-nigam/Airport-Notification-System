package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller2 implements Initializable {

    public TableView<Flight> flightTable;
    Problem p1=new Problem();
    String flightID, statement;
    ObservableList<Flight> data=null;
    private TableColumn<Flight,String> flightIDColumn;
    private TableColumn<Flight,String> timeColumn;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Airport objAir=new Airport();
        objAir.initializeData();
        Problem p1=new Problem();
        p1.generateProblem(objAir);
        System.out.println(p1.FlightID);
        genProb(p1.FlightID, p1.Statement);
        data=FXCollections.observableArrayList();

        for(Airlines air: objAir.AIR)
        {
            for(Flight flght: air.flt)
            {
                data.add(flght);
            }
        }

//        flightIDColumn.setCellValueFactory(new PropertyValueFactory<>("flightID"));
   //     timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));


//        flightTable.setItems(data);
//        flightTable.getColumns().addAll(flightIDColumn, timeColumn);


    }
    
    public  void genProb(String fid, String msg) {
        flightID=fid;
        statement=msg;
        System.out.println(flightID);
        System.out.println(statement);

    }

    public void ResolveNow(ActionEvent actionEvent) {
        System.out.println(flightID);
        p1.resolveProblem(flightID,statement);
    }
    public void ProblemPage(ActionEvent actionEvent)throws Exception{

        Parent root4 = null;
        try
        {
            root4=FXMLLoader.load(getClass().getResource("sample3.fxml"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        Scene scene3 = new Scene(root4, 600, 600);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(scene3);
        window.show();
    }

    public void SignOut(ActionEvent actionEvent)throws Exception{


        Parent root3= FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene1=new Scene(root3, 300, 300);

        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(scene1);
        window.show();
    }

}


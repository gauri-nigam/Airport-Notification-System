package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application
{
    Stage apnaStage;
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene1=new Scene(root, 500, 500);
//        apnaStage=primaryStage;
        primaryStage.setTitle("Airport Notification System");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
//    public void sceneBanao(String sceneSort)
//    {
//        Parent root1= null;
//        try {
//            root1 = FXMLLoader.load(getClass().getResource(sceneSort));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Scene sorted= new Scene(root1, 400, 400);
//        apnaStage.setScene(sorted);
//        apnaStage.show();
//    }


    public static void main(String[] args) {

        launch(args);

//        JavaMail objMail=new JavaMail();
//


//
//        objMail.sendMail(p1.Statement,emailS);
//
//       // System.out.println(p1.Statement);
//
//

    }
}

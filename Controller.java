package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    public Button BtnLogin;
    public TextField UserID;
    public PasswordField PassField;
    public Label LblDispMsg;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //code to initialize usernames and passwords arraylist from the database

    }

    public void userLogin(ActionEvent actionEvent)throws Exception {
        ArrayList<String> Usernames = new ArrayList<>();
        ArrayList<String> Passwords = new ArrayList<>();
        Usernames.add("akash");
        Passwords.add("akash");

        int flag=1;
        int flag1=1;
        String userName = UserID.getText();
        String password = PassField.getText();

        for (String usrname : Usernames)
        {
            if(userName.equals(usrname))
            {
                flag=0;
                break;
            }

        }
        if(flag==0)
        {
            for(String pass:Passwords)
            {
                if(password.equals(pass))
                {
                    flag1=0;
                    break;
                }
            }
        }
        if(flag==0 && flag1==0) {
            LblDispMsg.setText("Logged in successfully");

            Parent root1= FXMLLoader.load(getClass().getResource("sample2.fxml"));
            Scene scene2=new Scene(root1, 400, 400);

            Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

            window.setScene(scene2);
            window.show();

        }

        else//if the login is unsuccessful
        {
            LblDispMsg.setText("Unsuccessful");//prob: output if rest else code is commented out
//            Parent root2= FXMLLoader.load(getClass().getResource("sample.fxml"));
//            Scene scene1=new Scene(root2, 400, 400);
//
//            Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
//
//            window.setScene(scene1);
//            window.show();

        }

    }

    public void SignOut(ActionEvent actionEvent)throws Exception{


        Parent root3= FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene1=new Scene(root3, 400, 400);

        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(scene1);
        window.show();
    }

    public void ProblemPage(ActionEvent actionEvent)throws Exception{

        Parent root4 = FXMLLoader.load(getClass().getResource("sample3.fxml"));
        Scene scene3 = new Scene(root4, 400, 400);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(scene3);
        window.show();
    }
}
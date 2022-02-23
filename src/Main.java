

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("From start method: " +Thread.currentThread().getName());


        Parent root = FXMLLoader.load(getClass().getResource("View/Home.fxml"));
        primaryStage.setTitle("Attendance Automation");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main (String [] args){


        launch(args);
    }
}

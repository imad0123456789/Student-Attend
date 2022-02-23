package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class StudentChikinController {

    @FXML
    private Button attendBtt;
    @FXML
    private Button ScheduleButt;


    public void clickAttend(ActionEvent actionEvent) {

        Stage stage = (Stage) attendBtt.getScene().getWindow();
        stage.close();
    }


    public void GoToSchedule(ActionEvent actionEvent) {


        Stage stage = (Stage) ScheduleButt.getScene().getWindow();
        stage.close();
    }
}

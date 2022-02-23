package Controller;

import BE.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMainController implements Initializable {

    @FXML
    private TableColumn<Student, Integer> Absence;

    @FXML
    private TableColumn<Student, Integer> Id;

    @FXML
    private TableColumn<Student, String> Name;

    @FXML
    private TableView<Student> StudentTableView;

    @FXML
    private javafx.scene.chart.ScatterChart<String, Number> ScatterChart;



    private final ObservableList<Student> data = FXCollections.observableArrayList(
            new Student(02, "Imad Shehadeh", 100),
            new Student(03, "Tawfik Azza", 50),
            new Student(04, "Adam Lörincz", 30),
            new Student(05, "Ján Nahalka", 20),
            new Student(06, "Christian Charles Hesberg", 10),
            new Student(07, "Basam Dawi", 25),
            new Student(28, "Mustafa Ahmad Alwaro", 22),
            new Student(30, "Amin Aouina", 23),
            new Student(10, "Filip Kobialka", 50),
            new Student(11, "Mikkel Bie", 40),
            new Student(12, " Daniel Gislason", 12),
            new Student(13, "Marcelo Hani ", 15)

    );


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Id.setCellValueFactory(new PropertyValueFactory<>("id"));
        Name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        Absence.setCellValueFactory(new PropertyValueFactory<>("Attend"));
        StudentTableView.setItems(data);

    }


    public void drawChart(ActionEvent actionEvent) {
        Axis<String> xAxis = ScatterChart.getXAxis();
        xAxis.setLabel("Name");

        Axis<Number> yAxis = ScatterChart.getYAxis();
        yAxis.setLabel("% Absence");

        XYChart.Series <String , Number> series = new XYChart.Series();
        series.setName("% Absence of Students in May");
        series.getData().add(new XYChart.Data<>("Imad Shehadeh", 100 ));
        series.getData().add(new XYChart.Data<>("Tawfik Azza", 50 ));
        series.getData().add(new XYChart.Data<>("Adam Lörincz", 30));
        series.getData().add(new XYChart.Data<>("Ján Nahalka", 20 ));
        series.getData().add(new XYChart.Data<>("Basam Dawi", 25 ));
        series.getData().add(new XYChart.Data<>("Amin Aouina", 23 ));
        series.getData().add(new XYChart.Data<>("Filip Kobialka", 50 ));
        series.getData().add(new XYChart.Data<>(" Daniel Gislason", 12));
        series.getData().add(new XYChart.Data<>("Marcelo Hani ", 15 ));



        ScatterChart.getData().add(series);
    }

}









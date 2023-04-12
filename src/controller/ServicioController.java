package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ServicioController {

	Object ob;
	public ServicioController(Object ob) {
		this.ob = ob;
	}

    @FXML
    private TextField Service_Adress_Text;

    @FXML
    private TextField Value_ActMonth_Text;

    @FXML
    private DatePicker Date_Installation;

    @FXML
    private TextField Service_State_Text;

    @FXML
    private TextField Value_LastMoth_Text;

    @FXML
    private TextField Service_Code_Text;

    @FXML
    private TextField Measurer_Text;

    @FXML
    private Button Inactivate_Service_Button;

    @FXML
    private DatePicker Date_Fact;

    @FXML
    private Button Update_Button;

    @FXML
    private Button Delete_Button;

    @FXML
    void Delete_Service(ActionEvent event) {

    }

    @FXML
    void Inactivate_Service(ActionEvent event) {

    }

    @FXML
    void Update_Info(ActionEvent event) {

    }

}

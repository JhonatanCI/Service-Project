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
    public TextField Service_Adress_Text;

    @FXML
    public TextField Value_ActMonth_Text;

    @FXML
    public DatePicker Date_Installation;

    @FXML
    public TextField Service_State_Text;

    @FXML
    public TextField Value_LastMoth_Text;

    @FXML
    public TextField Service_Code_Text;

    @FXML
    public TextField Measurer_Text;

    @FXML
    public Button Inactivate_Service_Button;

    @FXML
    public DatePicker Date_Fact;

    @FXML
    public Button Update_Button;

    @FXML
    public Button Delete_Button;

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

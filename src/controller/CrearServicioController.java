package controller;

import java.io.IOException;
import java.time.LocalDate;

import Applicacation.Main;
import Model.Cliente;
import Model.Empresa;
import Model.Servicio;
import Model.ServicioFactory;
import Model.ServiciosEnum;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class CrearServicioController {
	
	private Empresa empresa;
	
	public CrearServicioController(Empresa empresa) {
		this.empresa=empresa;
		
	}
	
	public void setTables() {
		tipo_ServicioChoicebox.getItems().addAll(tipos);
		tipo_ServicioChoicebox.setOnAction(this::getTipo);
		tipo_ContratoChoicebox.getItems().addAll(tipos2);
	}
	
    @FXML
    public TextField Service_Adress_Text;

    @FXML
    public TextField Value_ActMonth_Text;

    @FXML
    public Button Return_Button;

    @FXML
    public Button Create_Button;

    @FXML
    public DatePicker Date_Installation;

    @FXML
    public TextField Value_LastMoth_Text;

    @FXML
    public TextField Service_Code_Text;

    @FXML
    public TextField Measurer_Text;

    @FXML
    public DatePicker Date_Fact;
    
    @FXML
    public ChoiceBox<String> tipo_ServicioChoicebox;
    
    @FXML
    public ChoiceBox<String> tipo_ContratoChoicebox;
    
    @FXML
    public TextField minL_Text;
    
    @FXML
    public TextField MinI_Text;
    
    @FXML
    public TextField megas_Text;
    
    @FXML
    public TextField cod_Contrato_Text;
    
    public String codContrato;
    public String dirInsta;
    public LocalDate fechaInsta;
    public LocalDate fechaFact;
    public String codMedidor;
    public int megasInc;
    public int minL;
    public int minI;
    
    
    private String[] tipos= {"TELEFONIA","INTERNET","AGUA","GAS","ENERGIA"};
    private String[] tipos2= {"LIMITADO","ILIMITADO","PREPAGO"};

    private ServiciosEnum tipoDeServicio;
    @FXML
    void Return_Service(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/StartMenu.fxml"));
		loader.setController(new StartMenuController());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
        back();
    }

    void assign() {
    	codContrato=cod_Contrato_Text.getText();
    	dirInsta=Service_Adress_Text.getText();
    	fechaInsta=Date_Installation.getValue();
    	fechaFact=Date_Fact.getValue();
    	codMedidor=Measurer_Text.getText();
    	if(megas_Text.getText().equalsIgnoreCase("")) {
    		megasInc=-1;
    	}else {
    		megasInc=Integer.parseInt(megas_Text.getText());;
    	}
    	if(minL_Text.getText().equalsIgnoreCase("")) {
    		minL=-1;
    	}else {
    		minL=Integer.parseInt(minL_Text.getText());;
    	}
    	
    	if(MinI_Text.getText().equalsIgnoreCase("")) {
    		minI=-1;
    	}else {
    		minI=Integer.parseInt(MinI_Text.getText());;
    	}
    	
    }
    
    @FXML
    void Create_Info(ActionEvent event) {
        assign();
        ServicioFactory servicioFactory = new ServicioFactory();
        servicioFactory.setController(this);
        Servicio servicio= servicioFactory.obtenerServicio(tipoDeServicio);
        
        Empresa.addServClient(cod_Contrato_Text.getText(), servicio);
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    alert.setHeaderText(null);
	    alert.setTitle("Servicio creado");
	    alert.setContentText("El servicio se ha creado exitosamente");
	    alert.showAndWait();
	    
	    close();
    }
    @FXML
    public void getTipo(ActionEvent event) {
    	String tipoServ = tipo_ServicioChoicebox.getValue();
    	if(tipoServ.equalsIgnoreCase("Agua")||tipoServ.equalsIgnoreCase("Gas")||tipoServ.equalsIgnoreCase("Energia")) {
    		Measurer_Text.setEditable(true);
    		tipo_ContratoChoicebox.setDisable(true);
    		minL_Text.setEditable(false);
    		MinI_Text.setEditable(false);
    		megas_Text.setEditable(false);
    		
    		if(tipoServ.equalsIgnoreCase("Agua")) {
    			tipoDeServicio=ServiciosEnum.AGUA;
    		}
    		if(tipoServ.equalsIgnoreCase("Gas")) {
    			tipoDeServicio=ServiciosEnum.GAS;
    		}
    		if(tipoServ.equalsIgnoreCase("Energia")) {
    			tipoDeServicio=ServiciosEnum.ENERGIA;
    		}
    		
    	}else if(tipoServ.equalsIgnoreCase("telefonia")) {
    		Measurer_Text.setEditable(false);
    		tipo_ContratoChoicebox.setDisable(false);
    		minL_Text.setEditable(true);
    		MinI_Text.setEditable(true);
    		megas_Text.setEditable(false);
    		tipoDeServicio=ServiciosEnum.TELEFONIA;
    	}else if(tipoServ.equalsIgnoreCase("Internet")) {
    		Measurer_Text.setEditable(false);
    		tipo_ContratoChoicebox.setDisable(false);
    		minL_Text.setEditable(false);
    		MinI_Text.setEditable(false);
    		megas_Text.setEditable(true);
    		tipoDeServicio=ServiciosEnum.INTERNET;
    	}
    }
    private void back() throws IOException{
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/StartMenu.fxml"));
		loader.setController(new StartMenuController());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
        close();
    }
    
    private void close(){
        Stage stage = (Stage) Return_Button.getScene().getWindow();
        stage.close();
    }
}

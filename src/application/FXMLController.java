package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {

	@FXML
	private Label label1;
	
	@FXML
	private void hardlebButton1 (ActionEvent event) {
		System.out.println("click no botao!");
		label1.setText("1");
	}
	@FXML
	private Label label2;
	
	@FXML
	private void hardlebButton2 (ActionEvent event) {
		System.out.println("click no botao!");
		label2.setText("2");
		}
	@FXML
	private Label label3;
	
	@FXML
	private void hardlabButton3 (ActionEvent event) {
		System.out.println("click no botao!");
		label3.setText("3");
	}
	@FXML
	private Label label4;
	
	@FXML
	private void hardlabButton4 (ActionEvent event) {
		System.out.println("click no botao!");
		label4.setText("4");
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
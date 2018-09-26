package controllers;

import models.ModelMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Azaelmglw
 */

public class ControllerMain implements Initializable {
    
    private final ModelMain model_main;
    
    public ControllerMain(ModelMain model_main){
        this.model_main = model_main;
    }
         
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    @FXML
    private TextField value_1_tfield;
    
    @FXML
    private TextField value_2_tfield;
    
    @FXML
    private Label result_lbl;
    
    @FXML
    private void Add(ActionEvent event) {
        SetValues();
        model_main.Add();
        result_lbl.setText(model_main.getResult());
    }
    
    @FXML
    private void Sustract(ActionEvent event) {
        SetValues();
        model_main.Sustract();
        result_lbl.setText(model_main.getResult());
    }
    
    @FXML
    private void Divide(ActionEvent event) {
        SetValues();
        model_main.Divide();
        result_lbl.setText(model_main.getResult());
    }
    
    @FXML
    private void Multiply(ActionEvent event) {
        SetValues();
        model_main.Multiply();
        result_lbl.setText(model_main.getResult());
    }
    
    @FXML
    private void Module(ActionEvent event) {
        SetValues();
        model_main.Module();
        result_lbl.setText(model_main.getResult());
    }
    
    @FXML
    private void ClearInputFields(ActionEvent event) {
        value_1_tfield.setText("");
        value_2_tfield.setText("");
        result_lbl.setText("...");
    }
    
    
    private void SetValues(){
        model_main.setValue_1(value_1_tfield.getText());
        model_main.setValue_2(value_2_tfield.getText());
    }
}
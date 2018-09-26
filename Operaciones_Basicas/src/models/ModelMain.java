package models;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 *
 * @author Azaelmglw
 */

public class ModelMain {
    /*  Parents array list position:
    [0] -> main    |
    */
    
    /*  User input array list position:
    [0] -> value_1   |   [1] -> value_2
    */
    
    /*  Application output array list position:
    [0] -> result  |
    */
    
    private final Stage primaryStage;
    private List<Parent> parents = new ArrayList<>(5);
    private List<String> user_input = new ArrayList<>(5);
    private List<String> app_output = new ArrayList<>(5);
    
    public ModelMain(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    
    public void Add(){
        setResult("Result = " + (Float.parseFloat(getValue_1()) + Float.parseFloat(getValue_2())));
    }
    
    public void Sustract(){
        setResult("Result = " + (Float.parseFloat(getValue_1()) - Float.parseFloat(getValue_2())));
    }
    
    public void Divide(){
        setResult("Result = " + Float.parseFloat(getValue_1()) / Float.parseFloat(getValue_2()));
    }
    
    public void Multiply(){
        setResult("Result = " + Float.parseFloat(getValue_1()) * Float.parseFloat(getValue_2()));
    }
    
    public void Module(){
        setResult("Result = " + Float.parseFloat(getValue_1()) % Float.parseFloat(getValue_2()));
    }
    
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public Parent getParent(int parent_position) {
        return parents.get(parent_position);
    }

    public void setParent(int parent_position, Parent parent) {
        this.parents.add(parent_position, parent);
    }    
    
    public String getValue_1(){
        return user_input.get(0);
    }
    
    public void setValue_1(String value_1){
        user_input.add(0, value_1);
    }
    
    public String getValue_2(){
        return user_input.get(1);
    }
    
    public void setValue_2(String value_2){
        user_input.add(1, value_2);
    }
    
    public String getResult(){
        return app_output.get(0);
    }
    
    public void setResult(String result){
        app_output.add(0, result);
    }
}
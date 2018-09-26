package extras;

/**
 *
 * @author Azaelmglw
 */

public class DataValidation {
    
    public int String2Int(String string){
        int int_value = 0;
        try{
            Integer.parseInt(string);
        }
        catch(NumberFormatException e){
            int_value = Integer.MAX_VALUE;
            //JOptionPane.showMessageDialog(null, "Error while trying to convert value to integer : " + e);
        }
        return int_value;
    }
    
    public float String2Float(String string){
        float float_value = 0;
        try{
            Float.parseFloat(string);
        }
        catch(NumberFormatException e){
            float_value = Float.MAX_VALUE;
            //JOptionPane.showMessageDialog(null, "Error while trying to convert value to float : " + e);
        }
        return float_value;
    }
    
    public double String2Double(String string){
        double double_value = 0;
        try{
            Double.parseDouble(string);
        }
        catch(NumberFormatException e){
            double_value = Double.MAX_VALUE;
            //JOptionPane.showMessageDialog(null, "Error while trying to convert value to double : " + e);
        }
        return double_value;
    }
}
package momentOfInertia;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    public TextField txtMass;
    public TextField txtLoad;
    public TextField txtAxle;
    public TextField txtNOne;
    public TextField txtNTwo;
    public TextField txtSec;
    public TextField txtResultMoment;
    public TextField txtResultAngular;

    public Button btnCalcMoment;
    public Button btnRefresh;


    public void calculateResult(){

        double mass = Double.parseDouble(txtMass.getText());
        double heightOfLoad = Double.parseDouble(txtLoad.getText());
        double radiusOfAxle = Double.parseDouble(txtAxle.getText());
        double valueOfN1 = Double.parseDouble(txtNOne.getText());
        double valueOfN2 = Double.parseDouble(txtNTwo.getText());
        double time = Double.parseDouble(txtSec.getText());
        double gravityValue = 9.8;

        double angularVelocity = ((4 * 3.1416 * valueOfN2) / time);
        double momentOfInertia = ((2 * mass * gravityValue * heightOfLoad) - (mass * Math.pow(radiusOfAxle, 2) * Math.pow(angularVelocity, 2))) / (Math.pow(angularVelocity, 2) * (1 + (valueOfN1 / valueOfN2)));

        txtResultAngular.setText(Double.toString(angularVelocity));
        txtResultMoment.setText(Double.toString(momentOfInertia));
    }


    public void refresh() {

        txtMass.setText("");
        txtLoad.setText("");
        txtAxle.setText("");
        txtNOne.setText("");
        txtNTwo.setText("");
        txtSec.setText("");
        txtResultMoment.setText("");
        txtResultAngular.setText("");

    }

}

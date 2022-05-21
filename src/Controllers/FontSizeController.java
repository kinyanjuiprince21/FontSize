package Controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;


import java.net.URL;
import java.util.ResourceBundle;

public class FontSizeController implements Initializable {


    public Label lblFontSize;
    public Slider sldSlider;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//      setting the initial value of the slider when loaded
        sldSlider.setValue(40);
//        listening to any value change of the slider
        sldSlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//                setting the changing value of the slider to adjust font size of text
                lblFontSize.setFont(Font.font((Double) newValue));
            }
        });
    }
}

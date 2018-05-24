package edu.cnm.deepdive.temperature;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

  @FXML
  public TextField fahrenheitInput;

  @FXML
  private TextField celsiusInput;

  @FXML
  private void convertToFahrenheit(ActionEvent actionEvent) {
    String rawCelsius = celsiusInput.getText().trim();
    double celsius = (rawCelsius.isEmpty()) ? 0 : Double.parseDouble(rawCelsius);
    double fahrenheit = celsius * 9 / 5 + 32;
    fahrenheitInput.setText(String.format("%,.2f", fahrenheit));
  }

  @FXML
  public void convertToCelsius(ActionEvent actionEvent) {
    String rawFahrenheit = fahrenheitInput.getText().trim();
    double fahrenheit = (rawFahrenheit.isEmpty()) ? 0 : Double.parseDouble(rawFahrenheit);
    double celsius = (fahrenheit - 32) * 5 / 9;
    celsiusInput.setText(String.format("%,.2f", celsius));
  }
}

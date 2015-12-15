package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        double celsius, fahrenheit, kelvin;
        celsius = Double.parseDouble(JOptionPane.showInputDialog("Qual a Temperatura em Celcius?"));
        kelvin = celsius + 273;
        fahrenheit = 9 * celsius / 5 + 32;
        JOptionPane.showMessageDialog(null, "Kelvin: " + kelvin + "  ---   Fahrenheit: " + fahrenheit);

        // --------- TAMS ---------
        //Scanner entrada = new Scanner(System.in);
        double temp, f, k;
        String entrada;

        entrada = JOptionPane.showInputDialog("Informe a temperatura em Celsius");

        temp = Double.parseDouble(entrada);

        f = temp * 1.8 + 32;
        k = temp + 273.15;
        JOptionPane.showMessageDialog(null, "Kelvin: " + k + "  ---   Fahrenheit: " + f);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

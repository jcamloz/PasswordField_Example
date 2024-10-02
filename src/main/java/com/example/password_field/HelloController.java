package com.example.password_field;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import jdk.jfr.Event;

public class HelloController {
    //CARET DETERMINA LA POSICIÓN DE LA LETRA QUE VA A INTRODUCIR EL USUARIO
    int caretPosition = 0;
    @FXML
    private PasswordField key;
    @FXML
    private Button submit;
    @FXML
    private Label texto;
    @FXML
    private Label welcomeText;

    @FXML
    //DICE QUÉ CLAVE SE HA INTRODUCIDO
    protected void onSubmitClick() {
        welcomeText.setText("SU CLAVE NUEVA SERÁ: " + key.getText());
    }

    @FXML
    public void keyTyped() {
        if(key.getText().length()>12) {
            caretPosition = key.getCaretPosition(); //ASIGNO EL CARET ACTUAL
            key.setText(key.getText().substring(0, 12)); //REEMPLAZO EL TEXTO PARA QUE NO SE EXTIENDA MÁS DE 12 CARACTERES
            key.positionCaret(caretPosition);   //LE ASIGNO SU CARET ANTIGUO (SI NO SE HACE ESTO, COMENZARÁ A ESCRIBIR DESDE EL INICIO)
        }

    }
}

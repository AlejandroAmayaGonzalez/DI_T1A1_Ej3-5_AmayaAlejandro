package ieslosmontecillos.di_t1a1_ej35_amayaalejandro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Constenedor
        Pane root = new Pane();

        //Componentes
        Text text = new Text(20, 20,"A");

        //Creamos la escena y añadimos el evento
        Scene scene = new Scene(root, 320, 240);
        scene.setOnKeyPressed(event -> {
            KeyCode tecla = event.getCode();

            //Si la tecla es un numero o letra se imprime la tecla
            if (tecla.isDigitKey() || tecla.isLetterKey()) {
                text.setText(tecla.toString());
            }else{
                //Si es alguna flecha se mueve por el cuadro text el caracter
                if (event.getCode() == KeyCode.UP) {
                    text.setY(text.getY() - 10);
                }else if (event.getCode() == KeyCode.DOWN) {
                    text.setY(text.getY() + 10);
                }else if (event.getCode() == KeyCode.LEFT) {
                    text.setX(text.getX() - 10);
                }else if (event.getCode() == KeyCode.RIGHT) {
                    text.setX(text.getX() + 10);
                }
            }
        });

        root.getChildren().add(text);

        stage.setTitle("KeyEvent");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
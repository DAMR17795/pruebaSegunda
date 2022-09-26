package com.example.pruebasegunda;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        /*//StackPane root = new StackPane();

        //Caja Vertical
        VBox root = new VBox();
        root.setSpacing(10);
        //root.getChildren().add(btn);
        root.setAlignment(Pos.CENTER);

        //Caja Horizontal 1
        HBox caja1 = new HBox();
        Label nombre = new Label("Nombre:");
        TextField nombre2 = new TextField();
        //root.getChildren().add(vertical);
        //vertical.getChildren().add(caja1);
        caja1.setSpacing(30);
        caja1.setAlignment(Pos.CENTER);
        caja1.getChildren().addAll(nombre, nombre2);

        //Caja horizontal 2
        HBox caja2 = new HBox();
        TextField edad2 = new TextField();
        Label edad = new Label("Edad:");
        caja2.setSpacing(45);
        caja2.setAlignment(Pos.CENTER);
        caja2.getChildren().addAll(edad,edad2);

        //Caja Horizontal 3
        HBox caja3 = new HBox();
        Button btnAceptar = new Button("Aceptar");
        Button btnCancelar = new Button("Cancelar");
        caja3.getChildren().addAll(btnAceptar, btnCancelar);
        caja3.setAlignment(Pos.CENTER);
        caja3.setSpacing(10);

        root.getChildren().addAll(caja1, caja2, caja3);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Nombre y Edad");
        primaryStage.setScene(scene);
        primaryStage.show();
        btnCancelar.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                nombre2.setText(null);
                edad2.setText(null);
            }
        });

        btnAceptar.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                StackPane resultado = new StackPane();
                Scene escena = new Scene(resultado, 200, 100);
                primaryStage.setScene(escena);
                primaryStage.show();
                HBox caja4 = new HBox();
                Label label = new Label("Tu nombre es : " + nombre2.getText() + " y tu edad es: " + edad2.getText());
                caja4.getChildren().add(label);
                caja4.setAlignment(Pos.CENTER);
            }
        });*/

        //Hiolassdfasdfasdfasdfasdf

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Bienvenido");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Nombrae: ");
        grid.add(userName, 0,1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label userAge = new Label("Edad: ");
        grid.add(userAge, 0, 2);

        TextField userTextFieldAge = new TextField();
        grid.add(userTextFieldAge, 1, 2);

        Button btnAceptar = new Button("Aceptar");
        Button btnCancelar = new Button("Cancelar");
        grid.add(btnAceptar, 0, 3);
        grid.add(btnCancelar, 1, 3);
        grid.setHalignment(btnAceptar, HPos.LEFT);
        grid.setHalignment(btnCancelar, HPos.RIGHT);



        primaryStage.setTitle("Nombre y Edad");
        primaryStage.setScene(scene);
        primaryStage.show();




    }
    public static void main(String[] args) {
        launch(args);
    }
}
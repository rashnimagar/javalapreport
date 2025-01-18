package com.example.demojavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.CubicCurve;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class DrawCubicCurve extends Application{
    @Override
    public void start(Stage primaryStage){
        //create a pane
        Pane pane = new Pane();
        //create a cubic curve
        CubicCurve cubiccurve = new CubicCurve();
        cubiccurve.setStartX(100);
        cubiccurve.setStartY(150);
        cubiccurve.setControlX1(400);
        cubiccurve.setControlY1(40);
        cubiccurve.setControlX2(175);
        cubiccurve.setControlY2(250);
        cubiccurve.setEndX(500);
        cubiccurve.setEndY(150);
        cubiccurve.setFill(Color.GREEN);
        cubiccurve.setStroke(Color.BLACK);

        //add Cubic Curve in pane
        pane.getChildren().add(cubiccurve);

        //create a scene and set the pane in it
        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setTitle("Draw Cubic Curve");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}

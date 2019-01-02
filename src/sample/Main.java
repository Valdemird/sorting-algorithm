package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.model.SortingManager;

public class Main extends Application {


    public void  printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        int[] numeros = new int[]{4,3,2,5,6,7,1,2,3,4};
        printArray(numeros);
        SortingManager.insertionSort(numeros);
        printArray(numeros);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("pathFinding");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

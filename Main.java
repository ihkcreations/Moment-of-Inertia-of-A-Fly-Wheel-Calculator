package momentOfInertia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("interfaceDesign.fxml"));
        primaryStage.setTitle("Moment Of Inertia Calculator");

        //icon of the program
        Image icon = new Image(getClass().getResourceAsStream("/app_logo.png"));
        primaryStage.getIcons().add(icon);
        //


        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

package cab;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = FXMLLoader.load(
                getClass().getResource("/cab/Main.fxml"));

        //        Pane root = new VBox();
        // Pane, VBox etc...

 //       Button btn = new Button("Hello");
//        Label lbl = new Label("It is JavaFX!");
 //       TextField txt = new TextField();

 //       lbl.textProperty().bind(
 //              Bindings.concat("Hello, ", txt.textProperty(), "!"));


 //       btn.setOnAction(e -> {
 //           lbl.setText("Hello, " + txt.getText() + "!");
 //       });

 //       root.getChildren().addAll(btn, lbl, txt);
 //       root.getChildren().addAll(lbl, txt);

        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Bulls and Cows");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FontSize extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("views/FontSize.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Changing Font Size");
        stage.setFullScreen(true);
        stage.show();
    }
}

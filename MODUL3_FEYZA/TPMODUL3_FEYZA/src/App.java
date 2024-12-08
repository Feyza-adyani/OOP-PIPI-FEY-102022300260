import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load file Login.fxml
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Login.fxml"));
        Scene scene = new Scene(loader.load());

        // Atur judul dan tampilkan
        primaryStage.setScene(scene);
        primaryStage.setTitle("Zeppeli's Listening Bar - Login");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

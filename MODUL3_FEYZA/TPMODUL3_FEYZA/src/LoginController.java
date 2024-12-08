import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    void handleLogin(ActionEvent event) {
        // Ambil input dari username dan password
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Periksa apakah username dan password yang dimasukkan sesuai
        if ("feyzaadyani".equals(username) && "102022300260".equals(password)) {
            try {
                // Setelah login berhasil, muat halaman Inventory.fxml
                Stage stage = (Stage) usernameField.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/Inventory.fxml"));
                stage.setScene(new Scene(loader.load()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // Jika login gagal, tampilkan pesan error
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText(null);
            alert.setContentText("Username atau Password salah!");
            alert.showAndWait();
        }
    }
}

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryController {

    @FXML
    private TableView<Album> albumTable;
    @FXML
    private TableColumn<Album, String> colAlbumName;
    @FXML
    private TableColumn<Album, String> colArtist;
    @FXML
    private TableColumn<Album, Integer> colTotal;
    @FXML
    private TableColumn<Album, Integer> colAvailable;
    @FXML
    private TextField tfAlbumName;
    @FXML
    private TextField tfArtist;
    @FXML
    private TextField tfTotal;
    @FXML
    private TextField tfAvailable;

    private ObservableList<Album> albumList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colAlbumName.setCellValueFactory(new PropertyValueFactory<>("albumName"));
        colArtist.setCellValueFactory(new PropertyValueFactory<>("artist"));
        colTotal.setCellValueFactory(new PropertyValueFactory<>("total"));
        colAvailable.setCellValueFactory(new PropertyValueFactory<>("available"));

        // Menambahkan album contoh
        albumList.add(new Album("Perayaan Patah Hati", "For Revenge", 10, 5));
        albumTable.setItems(albumList);
    }

    // Menangani tombol "Tambah"
    @FXML
    void handleAdd() {
        try {
            String albumName = tfAlbumName.getText();
            String artist = tfArtist.getText();
            int total = Integer.parseInt(tfTotal.getText());
            int available = Integer.parseInt(tfAvailable.getText());

            Album album = new Album(albumName, artist, total, available);
            albumList.add(album);
        } catch (NumberFormatException e) {
            showAlert("Error", "Data tidak valid.");
        }
    }

    // Menangani tombol "Hapus"
    @FXML
    void handleDelete() {
        Album selected = albumTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            albumList.remove(selected);
        }
    }

    // Menangani tombol "Update"
    @FXML
    void handleUpdate() {
        Album selected = albumTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setAlbumName(tfAlbumName.getText());
            selected.setArtist(tfArtist.getText());
        }
    }

    // Menangani tombol "Rent Selected"
    @FXML
    void handleRent() {
        Album selected = albumTable.getSelectionModel().getSelectedItem();
        if (selected != null && selected.getAvailable() > 0) {
            selected.setAvailable(selected.getAvailable() - 1);
        }
    }

    // Menampilkan alert
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

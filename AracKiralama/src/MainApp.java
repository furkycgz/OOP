import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.List;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Araçları yükle (dosyadan okuma işlemi burada yapılacak)
        AracYönetici.araclariYukle();  // Bu metod, araçları listeye ekler

        // AracManager'dan aracları alıyoruz
        List<Arac> genelListe = AracYönetici.araclariGetir(); // Bu metod, aracları döndürmeli

        // GUI Layout
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));

        // Başlık
        Label titleLabel = new Label("Araç Kiralama Sistemi");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        root.setTop(titleLabel);
        BorderPane.setAlignment(titleLabel, javafx.geometry.Pos.CENTER);

        // Araç Listesi: ListView
        ListView<Arac> aracListView = new ListView<>();
        aracListView.getItems().addAll(genelListe); // aracları ListView'e ekliyoruz
        root.setLeft(aracListView);
        aracListView.setPrefWidth(300);

        // Seçilen Aracın Detayları
        VBox centerBox = new VBox(10);
        centerBox.setPadding(new Insets(10));

        Label secilenAracLabel = new Label("Seçilen Araç:");
        TextField gunSayisiField = new TextField();
        gunSayisiField.setPromptText("Gün sayısını giriniz");
        Button hesaplaButton = new Button("Hesapla");
        Label sonucLabel = new Label();

        centerBox.getChildren().addAll(secilenAracLabel, gunSayisiField, hesaplaButton, sonucLabel);
        root.setCenter(centerBox);

        // Araç Seçildiğinde Detayları Göster
        aracListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                secilenAracLabel.setText("Seçilen Araç: " + newValue);
            }
        });

        // Hesapla Butonunun Aksiyonu
        hesaplaButton.setOnAction(e -> {
            Arac secilenArac = aracListView.getSelectionModel().getSelectedItem();
            if (secilenArac != null) {
                try {
                    int gunSayisi = Integer.parseInt(gunSayisiField.getText());
                    int toplamFiyat = secilenArac.getUcret() * gunSayisi;
                    sonucLabel.setText(secilenArac.getPlaka() + " için toplam ücret: " + toplamFiyat + " TL");
                } catch (NumberFormatException ex) {
                    sonucLabel.setText("Lütfen geçerli bir gün sayısı giriniz.");
                }
            } else {
                sonucLabel.setText("Bir araç seçiniz.");
            }
        });

        // Sahne ve Stage Ayarları
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Araç Kiralama Sistemi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

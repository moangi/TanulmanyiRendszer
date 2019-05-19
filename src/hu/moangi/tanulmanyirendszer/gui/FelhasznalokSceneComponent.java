package hu.moangi.tanulmanyirendszer.gui;

import hu.moangi.tanulmanyirendszer.model.Felhasznalo;
import hu.moangi.tanulmanyirendszer.service.FelhasznaloService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class FelhasznalokSceneComponent {
	
	private FelhasznaloService felhasznaloService;
	private TableView<Felhasznalo> table = new TableView<>();

	public FelhasznalokSceneComponent(FelhasznaloService felhasznaloService) {
		this.felhasznaloService = felhasznaloService;
	}
	
	public Scene buildScene() {
		Scene scene = new Scene(new Group());
		final Label label = new Label("Address Book");
        label.setFont(new Font("Arial", 20));
 
        table.setEditable(true);
 
        TableColumn<Felhasznalo, Long> idCol = new TableColumn<>("ID");
        idCol.setCellValueFactory( new PropertyValueFactory<Felhasznalo, Long>("id"));
        TableColumn<Felhasznalo, String> nevCol = new TableColumn<>("Név");
        nevCol.setCellValueFactory(new PropertyValueFactory<>("felhasznalonev"));
        
        ObservableList<Felhasznalo> data = FXCollections.observableArrayList(felhasznaloService.mindenFelhasznalo()); 
        table.setItems(data);
        table.getColumns().addAll(idCol, nevCol);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        
        return scene;
	}

}

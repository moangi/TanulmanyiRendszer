package hu.moangi.tanulmanyirendszer;

import hu.moangi.tanulmanyirendszer.gui.FelhasznalokSceneComponent;
import hu.moangi.tanulmanyirendszer.service.FelhasznaloService;
import hu.moangi.tanulmanyirendszer.service.MemoriaFelhasznaloService;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	private FelhasznaloService felhasznaloService = new MemoriaFelhasznaloService();
	private FelhasznalokSceneComponent felhasznalokScenefactory = new FelhasznalokSceneComponent(felhasznaloService);
	
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        
        stage.setTitle("Table View Sample");
        stage.setWidth(300);
        stage.setHeight(500);       
 
        stage.setScene(felhasznalokScenefactory.buildScene());
        stage.show();
    }

}

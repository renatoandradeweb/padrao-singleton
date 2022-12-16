/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.renatoandrade.myapp.App;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import model.Config;

/**
 *
 * @author joaoh
 */
public class RelatoriosScene extends AbstractScene {

    private final Config config = Config.getInstance();

    public RelatoriosScene(App app) {
        super(app);

        var label = new Label("Formato Relatórios: "+config.getFormatRelatorios());
        var btnVoltar = new Button("Voltar");

        setRoot(new TilePane(label, btnVoltar));

        btnVoltar.setOnAction(event -> app.setScene(new MainScene(app)));
    }

}

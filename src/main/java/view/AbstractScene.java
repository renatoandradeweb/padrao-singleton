/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.renatoandrade.myapp.App;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;

/**
 *
 * @author joaoh
 */
public abstract class AbstractScene extends Scene{

    private final App app;
    
    public AbstractScene(App app){

        super(new TilePane(), 640, 480);
        
        this.app = app;
    }
    
    public App getApp(){
        return app;
    }     
}

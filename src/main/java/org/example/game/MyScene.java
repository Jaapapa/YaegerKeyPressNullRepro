package org.example.game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;

public class MyScene extends DynamicScene {

    private Main game;
    public MyScene(Main main) {
        this.game = main;
    }

    @Override
    public void setupScene() {

    }

    @Override
    public void setupEntities() {
        addEntity(new TextEntity(new Coordinate2D(5,5), "Please press an arrow key repeatedly."));
        addEntity(new TextEntity(new Coordinate2D(5,20), "Every 5 seconds, the Scene refreshes and might cause a NPE."));

        addEntity(new MyActor(game));
    }
}

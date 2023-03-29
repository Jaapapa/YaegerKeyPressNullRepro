package org.example.game;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class Main extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setSize(new Size(500, 500));
    }

    @Override
    public void setupScenes() {
        addScene(0, new MyScene(this));
        addScene(1, new MyScene(this));
    }
}
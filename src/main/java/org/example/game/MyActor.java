package org.example.game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.Timer;
import com.github.hanyaeger.api.TimerContainer;
import com.github.hanyaeger.api.entities.impl.DynamicRectangleEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.util.Set;

public class MyActor extends DynamicRectangleEntity implements KeyListener, TimerContainer {
    protected MyActor(Main game) {
        super(new Coordinate2D(20,50), new Size(10,10));
        setFill(Color.AQUAMARINE);
        this.game = game;
    }

    private Main game;

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {

    }

    @Override
    public void setupTimers() {
        addTimer(new Timer(5000) {
            @Override
            public void onAnimationUpdate(long timestamp) {
                remove();
                MyActor.this.remove();
                game.setActiveScene(1);
            }
        });
    }
}

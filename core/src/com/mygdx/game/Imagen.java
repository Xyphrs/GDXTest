package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Imagen {
    int x;
    int velocidadNormal = 5;
    int velocidadLenta = 1;
    int velocidad = velocidadNormal;
    int ancho = 50;
    Texture img;

    Imagen() {
        img = new Texture("badlogic.jpg");
    }

    public void update() {
        x += velocidad;

        if (x > Gdx.graphics.getWidth() - ancho || x < 0) {
            velocidad *= -1;
        }
    }

    public void render(SpriteBatch batch) {
        batch.draw(img, x, 0, ancho, 50);
    }

    public void dispose() {
        img.dispose();
    }
}

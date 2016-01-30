package com.cultstoppers;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
/**
 * Created by Leon on 1/29/2016.
 */
public class Player extends Entitity{
    int speed=10;
    public void move(){
        if(Gdx.input.isKeyPressed(Input.Keys.W)){
            x=speed;
        }
    }

}

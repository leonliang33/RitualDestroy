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
    int health1=100;
    public static void PlayerStats(){
    }

    public void move(){
        if(Gdx.input.isKeyPressed(Input.Keys.W)){
            y=speed;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            x=speed;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.S)){
            y=speed;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.D)){
            x=speed;
        }
    }

}

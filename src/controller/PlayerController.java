package controller;

import input.Keyboard;

import java.awt.event.KeyEvent;

public class PlayerController implements Controller {

    private Keyboard input;

    public PlayerController(Keyboard input) {
        this.input = input;
    }

    @Override
    public boolean isRequestingLEFT() {
        return input.isPressed(KeyEvent.VK_LEFT);
    }

    @Override
    public boolean isRequestingRIGHT() {
        return input.isPressed(KeyEvent.VK_RIGHT);
    }

    @Override
    public boolean isRequestingUP() {
        return input.isPressed(KeyEvent.VK_UP);
    }

    @Override
    public boolean isRequestingDOWN() {
        return input.isPressed(KeyEvent.VK_DOWN);
    }
}

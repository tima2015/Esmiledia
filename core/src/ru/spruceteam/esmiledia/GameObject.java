package ru.spruceteam.esmiledia;

public abstract class GameObject{

    private char goc;

    protected GameObject(char goc){
        this.goc = goc;
    }

    public char getGoc() {
        return goc;
    }
}

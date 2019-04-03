package Modele;

enum Direction{Haut, Bas, Gauche, Droite};


public abstract class Entity implements Runnable{

    protected Direction currentDirection;
    boolean vivant;

    @Override
    public void run(){}

    protected abstract void realiserAction();


    //Mutateurs & Accesseurs
    public void setCurrentDirection(Direction d){ currentDirection = d;}
    public void setVivant(boolean b){vivant = b;}

    public Direction getCurrentDirection(){return currentDirection;}
    public boolean getVivant(){return vivant;}
}

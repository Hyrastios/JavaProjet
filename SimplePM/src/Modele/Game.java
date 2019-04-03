package Modele;
import javafx.beans.Observable;

public class Game /*extends Observable*/ {

    Entity tabEntites[];
    Cell plateau[][];

    public void initialiser(){
        java.lang.String stringplateau =
                "*###################*" +
                "*#********#********#*" +
                "*#*##*###*#*###*##*#*" +
                "*#*****************#*" +
                "*#*##*#*#####*#*##*#*" +
                "*#****#***#***#****#*" +
                "*####*###*#*###*####*" +
                "****#*#*******#*#****" +
                "#####*#*#####*#*#####" +
                "********#***#********" +
                "#####*#*#####*#*#####" +
                "****#*#*******#*#****" +
                "*####*#*#####*#*####*" +
                "*#********#********#*" +
                "*#*##*###*#*###*##*#*" +
                "*#**#***********#**#*" +
                "*##*#*#*#####*#*#*##*" +
                "*#****#***#***#****#*" +
                "*#*######*#*######*#*" +
                "*#*****************#*" +
                "*###################*";
        tabEntites[0] = new Pac_Man();
        for(int i=1; i<5; i++)
            tabEntites[i] = new Ghost();
        for(int i=0; i<21; i++){
            for(int j=0; j<21; j++){
                if(stringplateau.charAt(21*i+j) == '#')
                    plateau[i][j] = new Mur();
                else plateau[i][j] = new Couloir();
            }
        }

    }

    public boolean finPartie(){
        if(tabEntites)
        return true;
    }

    public void deplacer(Entity E, Direction D){

    }
}

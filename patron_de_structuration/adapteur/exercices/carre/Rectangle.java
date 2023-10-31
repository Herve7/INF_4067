package patron_de_structuration.adapteur.exercices.carre;

public class Rectangle {

    private float l;
    private float L;

    public Rectangle(float longueur,float largeur){
        this.L = longueur;
        this.l = largeur;
    }

    public void perimetre(){

        float p = (l+L)*2;
        System.out.println("Le périmètre de ce rectangle est de:" + p + "mètres");
    }

    public void aire(){

        float aire = L*l;
        System.out.println("la surface de ce rectangle est de:" + aire +"mètres^2");
    }
    
}

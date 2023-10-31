package patron_de_structuration.adapteur.exercices.carre;

public class AdaptCarre implements InterfaceRectangle{

    private float cote;

    public AdaptCarre(float cote){

        this.cote = cote;
    }

    @Override
    public void perimetre() {
        float p = cote*4;
        System.out.println("le périmètre de ce carré est de:" + p + " mètres");

    }

    @Override
    public void aire() {
        float aire = cote*cote;
        System.out.println("Le périmètre de ce carre est:" + aire + " mètres²");
    }
    
}

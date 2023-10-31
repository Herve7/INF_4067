package patron_de_structuration.adapteur.exercices.carre;

public class Client {

    public static void main(String[] args){

        InterfaceRectangle carre = new AdaptCarre(3);
        
            

        System.out.println("\n");
        carre.perimetre();
        System.out.println("\n");
        carre.aire();
        System.out.println("\n");   
    }
    
}

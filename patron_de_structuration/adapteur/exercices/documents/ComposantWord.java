package patron_de_structuration.adapteur.exercices.documents;

public class ComposantWord {

    public void wordFixeContenu(){

        System.out.println("voici le contenu d'un document word");
    }

    public void wordPrepareAffichage(){
        System.out.println("préparation de l'affichage du document word");
    }

    public void wordRafraichir(){
        System.out.println("rafraichissement du document word");
    }

    public void wordTerminerAffichage(){
        System.out.println("fin de l'affichage du document word");
    }

    public void wordEnvoieImprimente(){
        System.out.println("imprimer le document word");
    }
    
}

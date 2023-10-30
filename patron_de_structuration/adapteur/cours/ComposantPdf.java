package patron_de_structuration.adapteur.cours;

public class ComposantPdf {
    
    public void pdfFixeContenu(){

        System.out.println("voici le contenu d'un document pdf");
    }

    public void pdfPrepareAffichage(){
        System.out.println("préparation de l'affichage du document pdf");
    }

    public void pdfRafraichir(){
        System.out.println("rafraichissement du document pdf");
    }

    public void pdfTerminerAffichage(){
        System.out.println("fin de l'affichage du document pdf");
    }

    public void pdfEnvoieImprimente(){
        System.out.println("imprimer le document pdf");
    }
}

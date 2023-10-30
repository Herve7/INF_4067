package patron_de_structuration.adapteur.exercices.documents;

public class Client {

    public static void main(String[] args){

        System.out.println("\n");
        DocumentHtml DocHtml= new DocumentHtml();
        DocHtml.setContenu();
        DocHtml.dessiner();
        DocHtml.imprimer();

        System.out.println("\n");
        ComposantPdf comp = new ComposantPdf();
        DocumentPdf pdf = new DocumentPdf(comp);
        pdf.dessiner();
        pdf.imprimer();
        pdf.setContenu();
        System.out.println("\n");

        ComposantWord w = new ComposantWord();
        DocumentWord doc = new DocumentWord(w);
        doc.dessiner();
        doc.imprimer();
        doc.setContenu();
        System.out.println("\n");
    }
    
}

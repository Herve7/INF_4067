package patron_de_structuration.adapteur.cours.documents;

public class DocumentPdf implements Document{

    private ComposantPdf composantPdf;

    public DocumentPdf(ComposantPdf composantPdf){
        this.composantPdf = composantPdf;
    }

    @Override
    public void setContenu() {
        composantPdf.pdfFixeContenu();
    }

    @Override
    public void imprimer() {
       composantPdf.pdfEnvoieImprimente();
    }

    @Override
    public void dessiner() {
        composantPdf.pdfPrepareAffichage();
    }
    
}

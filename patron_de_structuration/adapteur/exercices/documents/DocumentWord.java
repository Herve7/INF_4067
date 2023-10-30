package patron_de_structuration.adapteur.exercices.documents;

public class DocumentWord implements Document{

    private ComposantWord word;

    public DocumentWord(ComposantWord word){
        this.word = word;
    }

    @Override
    public void setContenu() {
        word.wordFixeContenu();
    }

    @Override
    public void imprimer() {
        word.wordEnvoieImprimente();
    }

    @Override
    public void dessiner() {
        word.wordPrepareAffichage();
    }
    
}

package patron_de_structuration.adapteur.cours;

public class DocumentHtml implements Document{

    @Override
    public void setContenu() {
        System.out.println("Modifier le contenu du document Html");
    }

    @Override
    public void imprimer() {
       System.out.println("imprimer le document Html");
    }

    @Override
    public void dessiner() {
       System.out.println("dessiner le document Html");
    }
    
}

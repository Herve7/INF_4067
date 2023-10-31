public class Fichier implements Element{


    private String nom;
    private String type;

    public Fichier(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    @Override
    public void decrire() {
        System.out.println("Nom : " + nom + ", Type : " + type);
    }

    
    @Override
    public void ajouter(Element element) {
        System.out.println("ajout d'un nouvel element au fichier");
    }

    @Override
    public void supprimer(Element element) {
        System.out.println("Supprimer un element du fichier");
    }

    @Override
    public Element getElement(int index) {
        System.out.println("Retourner une partie de l'element");
        return null;
    }
    
}

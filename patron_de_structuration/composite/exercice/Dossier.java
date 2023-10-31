import java.util.ArrayList;
import java.util.List;

public class Dossier implements Element{

    private String nom;
    private String type;
    private List<Element> elements;

    public Dossier(String nom) {
        this.nom = nom;
        this.type = "Dossier";
        this.elements = new ArrayList<>();
    }

    @Override
    public void decrire() {
        System.out.println("Nom : " + nom + ", Type : " + type);
        System.out.println("Contenu du dossier :");
        for (Element element : elements) {
            element.decrire();
        }
    }

    @Override
    public void ajouter(Element element) {
        elements.add(element);
    }

    @Override
    public void supprimer(Element element) {
        elements.remove(element);
    }

    @Override
    public Element getElement(int index) {
        return elements.get(index);
    }
    
}

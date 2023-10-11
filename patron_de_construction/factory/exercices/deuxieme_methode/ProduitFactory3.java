package patron_de_construction.factory.exercices.deuxieme_methode;

public class ProduitFactory3 extends ProduitFactory{
    
    protected ProduitA createProduitA() {
        return new ProduitA3();
    }
}

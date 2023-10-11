package patron_de_construction.factory.cours.deuxieme_methode;

public class ProduitFactory2 extends ProduitFactory{
    
    protected ProduitA createProduitA() {
        
        return new ProduitA2();
    }
}

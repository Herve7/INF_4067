package patron_de_construction.factory.exercices.deuxieme_methode;


public class ProduitFactory1 extends ProduitFactory{

    
    protected ProduitA createProduitA() {
        
        return new ProduitA1();
    }
    
}
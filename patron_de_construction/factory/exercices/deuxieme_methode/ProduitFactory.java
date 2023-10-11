package patron_de_construction.factory.exercices.deuxieme_methode;

public abstract class ProduitFactory {
    
    public ProduitA getProduitA(){
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
}

package patron_de_construction.factory.cours.deuxieme_methode;

public abstract class ProduitFactory {
    
    public ProduitA getProduitA(){
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
}

package patron_de_construction.abstract_factory.cours;

public class ProduitFactory1 implements FabriqueAbstraite{

    @Override
    public ProduitA getProduitA() {
        
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB() {
        
        return new ProduitB1();
    }
    
}
package patron_de_construction.abstract_factory.cours;

public class Client {
    
    public static void main (String[] args){
        ProduitFactory1 produitFactory1 = new ProduitFactory1();
        ProduitFactory2 produitFactory2 = new ProduitFactory2();
        
        ProduitA produitA = null;
        ProduitB produitB = null;
        
        System.out.println("\n");
        System.out.println("Utilisation de la premiere fabrique");
        produitA = produitFactory1.getProduitA();
        produitB = produitFactory1.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("\n");
        System.out.println("Utilisation de la seconde fabrique");
        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
        System.out.println("\n");
}

}

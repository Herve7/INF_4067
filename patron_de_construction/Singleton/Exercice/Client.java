package patron_de_construction.Singleton.Exercice;


public class Client {
    
    public static void main(String[] args) {
        
        System.out.println("\n");
        int som = Arithmetique.getInstance().somme(2, 5);
        System.out.printf("la somme est %d",som);
        System.out.println("\n");
        Arithmetique a1 = Arithmetique.getInstance(8, 3);
        a1.affiche();
        Arithmetique a2 = Arithmetique.getInstance(5, 9);
        a2.affiche();
        System.out.println("\n");
        
        Arithmetique a3 = Arithmetique.getInstance("sonfa");
        a3.affiche1();
    }
}

package patron_de_construction.Singleton.Cours;

public class Client {
    
    public static void main(String[] args) {
       
        System.out.println("\n");
        int som = Singleton.getInstance().somme(2, 5);
        System.out.printf("la somme est %d",som);
        System.out.println("\n");
        Singleton s1 = Singleton.getInstance(8, 3);
        s1.affiche();
        Singleton s2 = Singleton.getInstance(5, 9);
        s2.affiche();
        System.out.println("\n");
    }
}

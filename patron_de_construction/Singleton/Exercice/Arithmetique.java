package patron_de_construction.Singleton.Exercice;

public class Arithmetique {
    
    private static Arithmetique instance = null;
    
    private int x;
    private int y;
    private String nom = "sonfack";
    
    private Arithmetique(){
    
        super();
    }
    
    private Arithmetique(int x,int y){
    
        this.x = x;
        this.y = y;
    }
    
    private Arithmetique(String name){
        
       this.nom = name;
    }
    
    public static Arithmetique getInstance(){
    
        if(instance == null){
            instance = new Arithmetique();
        }
        
        return instance;
    }
    
    
    public static Arithmetique getInstance(int x, int y){
        if (instance == null)
            {
                instance = new Arithmetique(x, y);
            }
        return instance;
        }
    
    
    public static Arithmetique getInstance(String name){
        if (instance == null)
            {
                instance = new Arithmetique(name);
            }
        return instance;
        }
    
    
    public int somme(int x, int y){
    
        return x+y;
    }
    
    public float moyenne(int x,int y){
    
        return somme(x,y)/2;
    }
    
    public int soustraction(int x, int y){
    
    return x-y;
    }
    
    public int multiplication(int x,int y){
    
        return x*y;
    }
    
    
    
    public void affiche(){
        System.out.println("\nJe suis une instance de arithmetique mes valeurs sont : x = " + this.x + " et y = " + this.y);
    }
    
    public void affiche1(){
        System.out.println("\nJe suis une instance de arithmetique mon nom est :  " + this.nom);
    }
    
    @Override
public Object clone() throws CloneNotSupportedException {
    
    throw new CloneNotSupportedException();
}
}

package patron_de_construction.builder.cours;

public class Client {
    
   
    public static void main(String[] args){

        MonteurPizza monteurPizzaReine = new MonteurPizzaReine();
        MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();
        Directeur directeur = new Directeur();

        Pizza douce = directeur.construirePizza(monteurPizzaReine);
        Pizza piquante = directeur.construirePizza(monteurPizzaPiquante);

        System.out.println("\n");
        System.out.println("Pizza douce(pate:" + douce.getPate() + " ,sauce:" + douce.getSauce() + ", garniture:" + douce.getGarniture()+")");
        System.out.println("\n");
        System.out.println("Pizza piquante(pate:" + piquante.getPate() + " ,sauce:" + piquante.getSauce() + ", garniture:" + piquante.getGarniture()+")");
        System.out.println("\n");

    }


}

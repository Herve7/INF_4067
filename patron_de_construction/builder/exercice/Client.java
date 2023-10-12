package patron_de_construction.builder.exercice;

public class Client {
    
   
    public static void main(String[] args){

        MonteurPizzaReine monteurPizzaReine = new MonteurPizzaReine();
        MonteurPizzaPiquante monteurPizzaPiquante = new MonteurPizzaPiquante();
        MonteurPizzaLocale monteurPizzaLocale = new MonteurPizzaLocale();
        Directeur directeur = new Directeur();

        Pizza douce = directeur.construirePizzaReine(monteurPizzaReine);
        Pizza piquante = directeur.construirePizzaPiquante(monteurPizzaPiquante);
        Pizza locale = directeur.construirePizzaLocale(monteurPizzaLocale);

        System.out.println("\n");
        System.out.println("Pizza douce(pate:" + douce.getPate() + " ,sauce:" + douce.getSauce() + ", garniture:" + douce.getGarniture()+")");
        System.out.println("\n");
        System.out.println("Pizza piquante(pate:" + piquante.getPate() + " ,sauce:" + piquante.getSauce() + ", garniture:" + piquante.getGarniture()+")");
        System.out.println("\n");
        System.out.println("Pizza locale(pate:" + locale.getPate() + " ,sauce:" + locale.getSauce() + ", garniture:" + locale.getGarniture()+")");
        System.out.println("\n");

    }


}

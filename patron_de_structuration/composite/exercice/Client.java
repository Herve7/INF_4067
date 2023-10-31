public class Client {
    
    public static void main(String[] args){

        Element fichier1 = new Fichier("Fichier1", "txt");
        Element fichier2 = new Fichier("Fichier2", "pdf");
        Element dossier1 = new Dossier("Dossier1");
        Element dossier2 = new Dossier("Dossier2");

        dossier1.ajouter(fichier1);
        dossier2.ajouter(fichier2);

        Element dossierPrincipal = new Dossier("DossierPrincipal");
        dossierPrincipal.ajouter(dossier1);
        dossierPrincipal.ajouter(dossier2);

        dossierPrincipal.decrire();
    }
}

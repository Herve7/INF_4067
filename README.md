# INF_4067
                                PATRON DE CONSTRUCTION
                                
Lorsque nous dévellepons des applications,nous avons une interaction entre les différentes classes de ladite application.
La communication entre 2 classes se fait par instantiation de la classe appelée dans la classe appellante a l'aide de l'opérateurn "new()".cet opérateur a une grande faiblesse car il crée un fort couplage entre les 2 classes.
  Pour résoudre ce problème,nous avons des PATRONS DE CONSTRUCTION qui permettent de rendrent la création d'objet plus facile dans notre code.Ils permettent d'abstraire la création des objets et ainsi de réduire le fort couplage qui se trouve entre nos différentes classes avec l'utilisation de l'opérateur "new()".
  Les plus connus sont:
  =>La fabrique
  =>La fabrique abstraite
  =>Le singleton
  =>Le builder

                                                              
                                                              
                                                              I- LA FABRIQUE

                                                              
                                          1)Role                        
      La fabrique est un patron de construction qui permet de déléguer la création des objets a une autre classe qui ne va pas l'utiliser.En gros nous avons un Client qui demande a une fabrique de lui fabriquer un objet.
      Elle est utilisée lorsque le type de l'objet qu'on veut n'est connu qu'a l'exécution.Le client lui ne connais pas ce qui se passe pour que l'objet soit crée;Il demande juste l'objet et l'utilise lorsqu'on le lui donne.


                                          2)Participants
        Dans le pattron de construction fabrique nous avons plusieurs participants:
    ->Le client:Qui va juste demander un objet et le récupérer déjà tout fait et l'utiliser ni vu ni connu
    ->Le produit:Qui est une interface qui aura des sous classes à instantier
    ->Le Produit concret:Qui hérite du produit et qui sera instantier dans la fabrique
    ->La fabrique:Qui défini la méthode de création de l'objet

                                          3)Principe
        L'idée de la fabrique est de déléguer la création de l'objet a quelqu'un qui sait le faire et de récupérer l'objet créé et l'utiliser simplement sans se demander comment il a été créé.
        Le client va demander à la fabrique un objet(car elle sait le faire) ce dernier va utiliser le produit concret pour instancier un objet de type Produit et le retourner au client.

                                          4)Implémentation
    La fabrique s'implémente de 2 méthodes différentes

                    a)Premiere méthode(la méthode factory)
    Ici on a une fabrique contraite qui contient la méthode de création de l'objet.La fabrique crée une instance du produit.
    Le produit concret lui il hérite du produit abstrait ainsi que toutes ses méthodes.Le client lui utilise le produit Abstrait et la fabrique pour avoir le Produit demandé.

                    b)deuxieme méthode
    Ici on a une fabrique abstraite qui aura des classes filles qui vont se charger de la création de chaque type de produit.Donc une fabrique spécifique pour un type de produit spécifique.


                                                          II- LA FABRIQUE ABSTRAITE

                                              1)Role
      Le role de la fabrique abstraite est de fabriquer des objets regroupés en famille sans avoir a connaitre leur classe concrete.C'est à dire que nous aurons une fabrique qui est spétialisé dans la fabrication d'une et une seule famille d'objet sans regarder si c'est la bonne classe ou pas;Ladite fabrique regarde uniquement si tu es de la famille dont elle a la charge;Si oui elle te fabrique si non elle passe.

                                              2)Participants
      ->Le client:Qui va demander un produit et le récupérer plus tard pour l'utiliser
      ->La fabrique abstraite:Qui est une classe abstraite
      ->2 fabriques concretes:Qui vont hériter de la fabrique abstraite
      ->2 produits abstraits:Qui seront les types d'objets finaux
      ->4 produits concrets:qui héritent des produits abstraits

    3)Principe
L'idée de la fabrique abstraite est de séparer la fabrication des objets en familles.C'est a dire que nous avons une fabrique concrète qui est spécialisée uniquement dans la fabrication d'une et une seule famille d'objets.

    4) Implémentation 
    
les fabriques concrètes héritent de l'unique fabrique abstraite.Ces fabriques concrètes vont se concentrer sur une et une seule famille d'objets.
   dans un cas où nous avons 


   III Le singleton 

  1) Rôle
Son role est de s'assurer que tout au long de l'exécution de notre programme,une classe ne dispose que d'une et une seule instance.

2) Participants
   Une seule classe:Celle dont on ne veut qu'une seule instance durant toute l'exécution de notre programme

   3)Principe
Eviter qu'il y'ai plus d'une instance de la classe durant l'exécution du programme.
     
  4) Implémentation
Pour permettre cela nous devons :
 ->Mettre le constructeur en   'private'
 ->définir une méthode qui crée une instance de la classe si elle n'existe pas encore sinon renvoie l'instance qui existe déjà 
 ->Définir un attribut de classe pour stocker l'instance en cours


 IV- Le Monteur

                         1) Rôle
Son rôle est de construire des objets complexes par assemblage des parties de plusieurs autres objets.

                        2)participants

-MonteurAbstrait : précise une classe abstraite (ou une interface)  pour la création de partie d’un objet Produit
-MonteurConcret : construit et assemble des parties du produit par implémentation des méthodes du MonteurAbstrait
-Directeur : construit un objet en utilisant l’interface du Monteur
-Produit : représente l’objet complexe en cours de construction

                      3)implémentation
Le client crée l’objet Directeur en lui passant une instance du MonteurConcret
Le Directeur utilise le Monteur chaque fois qu’une partie du produit doit être construite.
Le Monteur gère les requêtes du Directeur et le Produit en parties
Le client récupère le Produit auprès du Monteur
  
      



                                          PATRON DE STRUCTURATION

                              I-l'adapteur
                      1)Role
          Son objectif est de faire communiquer 2 classes existantes dont les interfaces sont completements differentes

                      2)participants
          -client:programme qui agit avec les classes repondants a son interface
          -interface:introduit la signature des methodes du clients
          -adapteur:implementes les methodes de l'interface en invoquant les methodes de l'objet adapté
          -adapté:objet dont l'interface doit etre adapté pour correspondre a l'interface

                    3)principe
            Il permet d'ajuster du code (sans causer des bugs dans le code existant) pour répondre aux nouveaux besoins

                    4)implémentation
            -avoir 2 classes avec des interfaces incompatibles
            -déclarer l'interface client et décrire comment les clients vont communiquer avec le service
            -Créez la classe adaptateur et faites-la implémenter l’interface client. Laissez les méthodes vides pour le                   moment.
            -Ajoutez un attribut à la classe adaptateur pour y mettre une référence vers l’objet service. En général on                   initialise cet attribut à l’aide du constructeur, mais il est parfois plus pratique de l’envoyer à                        l’adaptateur au moment de l’appel de ses méthodes.
            -Implémentez toutes les méthodes de l’interface client une par une dans la classe adaptateur. L’adaptateur                    doit déléguer le gros du travail à l’objet service et ne s’occuper que de l’interface ou de la conversion                 du format des données.
            -Les clients doivent utiliser l’adaptateur en passant par l’interface client. Vous pouvez ainsi modifier ou                   étendre les adaptateurs sans toucher au code client.

# INF_4067

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
      ->
      
                                          

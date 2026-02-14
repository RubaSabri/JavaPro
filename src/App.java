public class App {    
    public static void main(String[] args) throws Exception { 

        //System.out.println("Hello, World!"); 
        //System.out.println("hello its Ruba");

        //Voiture voiture1 = new Voiture();  
        //Voiture voiture2 = new Voiture();


        /*voiture1.Oname = "Hamody";
        voiture1.Vnumber = 123;
        System.out.println(voiture1.Oname);
        System.out.println(voiture1.Vnumber);*/


       /* voiture1.set_Oname("Ruba");
        voiture1.set_Vnumber(1234);
        voiture1.set_Paye("France");
        voiture1.set_color(Voiture.Color.RED);
        System.out.println(voiture1.get_Oname());
        System.out.println(voiture1.get_Vnumber());
        System.out.println(voiture1.get_Paye()); */

        Voiture voiture1 = new Voiture("Ruba", 123, "France"); // bonne méthode de l'encopsulation boucoup plus rapide que la méthode traditionnele
        System.out.println(voiture1.get_Oname());
        System.out.println(voiture1.get_Vnumber());
        System.out.println(voiture1.get_Paye());





    }
}


/* 
premer remarque il faut que le nom de ta classe soit la meme chose que le nom de ton fichier java
javac src/*.java compile tout les ficher java
        /*voiture2.set_Oname("Hamody");
        voiture2.set_Vnumber(7689);
        voiture2.set_Paye("Soudan");
        voiture2.set_color(Voiture.Color.BLUE);
        System.out.println(voiture2.get_Oname());
        System.out.println(voiture2.get_Vnumber());
        System.out.println(voiture2.get_Paye());
        System.out.println(voiture2.get_color());*/

 */




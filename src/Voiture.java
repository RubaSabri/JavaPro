public class Voiture {
    private String Oname ;
    private String Paye ;
    //private String Color;
    private int Vnumber ;

    public Voiture(String Oname, int Vnumber, String Paye){
        set_Oname(Oname);
        set_Vnumber(Vnumber);
        set_Paye(Paye);
       // set_color(Color);


    }
   

    void set_Oname(String Oname){
        this.Oname = Oname ;
    }

    public String get_Oname(){
        return this.Oname;
    }

    void set_Vnumber(int Vnumber){
        this.Vnumber = Vnumber;
    }

    public int get_Vnumber(){
        return this.Vnumber;
    }

    void set_Paye(String Paye){
        this.Paye = Paye ;
    }
    
    public String get_Paye(){
        return this.Paye ;
    }

    /*void set_color(Color color){
        this.color = color.name();
    }*/

    public enum Color{
        RED, BLUE, BLACK, WHITE, GRAY ;  
    }

    

    
    
}

/*
e compilateur crée le fichier .class parce que Java a besoin du bytecode compilé pour exécuter le programme. 
il faut jamais le toucher 
Le bytecode est un code intermédiaire entre le code source Java et le langage machine.
 */
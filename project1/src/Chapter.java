

import java.util.ArrayList;



public class Chapter extends Choix  {


    //champs

    private String name;
   

    private ArrayList <String>existingLvls = new ArrayList<>();
    private static short nblvls;

    //Constructors
    public Chapter (String chapIn_name){
        name = chapIn_name;
        setExistingLvls();

       
    }

    //Getters

    //Setters
    public void setExistingLvls (){
        existingLvls.add("(Debutant)");
        existingLvls.add("(Intermediaire)");
        existingLvls.add("(Avancée)");
        nblvls = 3;
    }
    
   


  

}


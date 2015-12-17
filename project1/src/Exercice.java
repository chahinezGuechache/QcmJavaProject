



//import Exeption.Exeption;

import java.util.ArrayList;



public class Exercice  {


    //champs
   
    protected Reponce[] reponces   ;
   
    OutilsBox box = new OutilsBox();
    static int newIndexTrue;

    protected ArrayList<String> printedLine = new ArrayList();

    //Constructors
    public Exercice (int chapIn_nb,int exoIn,int lvlIn_nb){
       

        interactionExo(chapIn_nb,lvlIn_nb,exoIn );

    }

    //Getters

    //Setters

    //methodes

    public int getIndexTrue (){
    return newIndexTrue;
    }
    
   public void interactionExo(int chapIn_nb,int lvlIn_nb,int exoIn){

        

    
     
       


        //affecter les reponce a un tableau de Reponce
        reponces =   box.affecterReponce(chapIn_nb, lvlIn_nb, "Reponces",exoIn);

         
            ///affecter les reponce aleatoirement àun autre tableau
            print_rand_rep();

        

    }

    public void print_rand_rep(){ /*ne pas afficher la meme sequence de reponce*/

        int rand;

        for (int i = 0 , lon = reponces.length; i < lon ; i++) {

            do{
                    rand = (int) ( Math.random() * 4);
            }while(printedLine.contains(rand) );
            if(rand == 0) {
                newIndexTrue = i ;
            }
           printedLine.add(reponces[rand].getLaReponce());

           

        }

    }

   

   }


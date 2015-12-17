





public class Lvl  {


 

    
  /*  private int score;*/
    protected Exercice[] exercices = new Exercice[5];


    //Constructors
    public Lvl (int nbLvl_nb,int nbchap){
       

        interactionlvl(nbLvl_nb,nbchap);

    }

   
    public void interactionlvl(int nbLvl_nb,int nbchap){

       

            int exoIn = 0;
          

            do {

                exercices[exoIn] = new Exercice(nbchap, exoIn + 1,nbLvl_nb);

                
                
                    exoIn++;
                

            }while(exoIn < 5 );

           


}

}
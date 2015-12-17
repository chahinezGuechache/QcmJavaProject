
import java.io.*;

public class OutilsBox  {

    //afiicher le contenu d'un file texte
    public String affich_Fichier(int chapterIn,int lvlIn,String file,int nb_enonce) {
        String s="";
        int lvl=lvlIn+1;
        try {
            File f = new File("Java_Theme/Chapter"+chapterIn+"/lvl"+lvl+"/"+file+nb_enonce); //localisation file
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);







                try {
                    String line = br.readLine();
                    while (line != null) {
                       s=s+" "+line ;
                   
                        line = br.readLine();

                    }


                    br.close();
                    fr.close();
                } catch (IOException exeption) {
                    s =s+ "Erreur l'ors de la" + exeption.getMessage();
                }



        } catch (FileNotFoundException exeption) {
            s = s+"le fichier n'a pas etait trouve";
        }

return s;
    }


    //affect the ansers in an array
    public Reponce[] affecterReponce(int chapterIn,int lvlIn,String file,int exoIn) {
        Reponce[] rep = new Reponce[4];
        int i = 1;
        try {
            File f1 = new File("Java_Theme/Chapter"+chapterIn+"/lvl"+lvlIn+"/"+file+exoIn); //locate file
            FileReader fr1 = new FileReader(f1);
            BufferedReader br1 = new BufferedReader(fr1);







            try {
                String line = br1.readLine();
                rep[0] = new Reponce( line,true); // good inser --> always in the first line
                while (line != null && i < 4) {
                    rep[i] = new Reponce( br1.readLine(),false);
                    i++;
                }


                br1.close();
                fr1.close();
            } catch (IOException exeption) {
                System.out.println(" " + exeption.getMessage());
            }



        } catch (FileNotFoundException exeption) {
            System.out.println(" ");
        }


        return rep;
    }

}


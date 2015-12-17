


public class Reponce   {


    //champs

    private String laReponce;
    private boolean v_De_Reponce;

    //Constructors
    public Reponce (String texte,boolean v){

        laReponce = texte;
        v_De_Reponce = v;
    }

    //Getters
    public String getLaReponce() {
        return laReponce;
    }

    public boolean getV() {
        return v_De_Reponce;
    }


    //To_String
    @Override
    public String toString() {
        return laReponce+" ("+v_De_Reponce+")";
    }
}

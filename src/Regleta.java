
import java.util.ArrayList;

public class Regleta {
    private static final int MAX_ENDOLLS = 10;
    private ArrayList<Endollable> aparellsEndollats = new ArrayList<>();
    
    public boolean endollar(Endollable aparellEndollable){
        if(aparellsEndollats.contains(aparellEndollable)){
            System.out.println("["+aparellEndollable.getClass().getSimpleName()+"]" +" El aparell ya esta connectat en la regleta");
            return false;
        }
        
        if (aparellsEndollats.size() < MAX_ENDOLLS) {
            aparellsEndollats.add(aparellEndollable);
            aparellEndollable.donarEnergia();
            System.out.println("["+aparellEndollable.getClass().getSimpleName()+"]"+" Aparrel endollat");
            return true;
        }else{
            System.out.println("No hi ha espai en la regleta");
        }
        
        return false;
    };
    
    public boolean desendollar(Endollable aparellEndollable){
        if (aparellsEndollats.contains(aparellEndollable)) {
            aparellEndollable.llevarEnergia();
            aparellsEndollats.remove(aparellEndollable);
            System.out.println("["+aparellEndollable.getClass().getSimpleName()+"] Aparrel desendollat");
            return true;
        } 
        System.out.println("["+aparellEndollable.getClass().getSimpleName() +"] L'aparell no està endollat a la regleta");
        return false;
    };
    
    public int obtenirNombreEndollsLliures(){
        return MAX_ENDOLLS - aparellsEndollats.size();
    };
    
    public void llistarConnectats(){
        if (aparellsEndollats.isEmpty()) {
            System.out.println("No hi ha dispositius connectats");
        }
         
        for (Endollable objeto: aparellsEndollats) {
            System.out.println(objeto);
        }
    }
}

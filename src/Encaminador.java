
import java.util.ArrayList;

public class Encaminador{
    private static final int MAX_CONEXIONS = 5;
    private ArrayList<Connectable> aparellsConnectats = new ArrayList<>();
    
    public boolean aparellar(AparellElectric aparell){
        if (aparellsConnectats.size() >= MAX_CONEXIONS) {
            return false;
        }
        if (aparell.esPermetConnexio()) {
            aparell.establirConexio();
            System.out.println("Aparell aparellat amb èxit");
            aparellsConnectats.add(aparell);
            return true;
            
        }else{
            System.out.println("No s'ha pogut establir la conexió (Sense corrent, apagada o la interficíe wifi no està habilitada)");
        }  
        return false;
    }
    
    
    public boolean desaparellar(AparellElectric aparell){
        if (aparellsConnectats.contains(aparell)) {
            aparell.llevarConexio();
            aparellsConnectats.remove(aparell);
            return true;
        }
        return false;
    }
    
    public int obtindreNumeroDeDispositiusAparellats(AparellElectric aparell){
        return -1;
    }
    
    public void actulitzarDispositiusAparellats(AparellElectric aparell){
        for(Connectable objeto: aparellsConnectats){
            if (!objeto.esPermetConnexio()) {
                aparellsConnectats.remove(aparell);
            }
        }
    }
    
}

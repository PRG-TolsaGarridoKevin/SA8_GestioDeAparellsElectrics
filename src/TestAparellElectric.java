import java.util.ArrayList;

public class TestAparellElectric {
    public static void main(String[] args) {
        ArrayList<AparellElectric> llistaElectrodomestics = new ArrayList<>();
        ArrayList<AparellElectric> llistaAparellsElectrics = new ArrayList<>();
        ArrayList<AparellElectric> llistaDispositiusInformatics = new ArrayList<>();
        
        crearLlistat(llistaElectrodomestics, llistaAparellsElectrics, llistaDispositiusInformatics);
        veureLlistat(llistaElectrodomestics, llistaAparellsElectrics, llistaDispositiusInformatics);
        
    }
    
    public static void crearLlistat(ArrayList<AparellElectric> llistaElectrodomestics, ArrayList<AparellElectric> llistaAparellsElectrics, ArrayList<AparellElectric> llistaDispositiusInformatics){
        Llavadora llavadora1 = new Llavadora("1234A","V1","Bosch");
        Llavadora llavadora2 = new Llavadora("1234B","F22","Fagor",12);
        llistaElectrodomestics.add(llavadora1);
        llistaElectrodomestics.add(llavadora2);
        
        
    }
    
    public static void veureLlistat(ArrayList<AparellElectric> llistaElectrodomestics, ArrayList<AparellElectric> llistaAparellsElectrics, ArrayList<AparellElectric> llistaDispositiusInformatics){
    //
    //
    //
    //
    //Hacer toString a las clases  [ Televisio, portatil y mobil ]
    //
    //
    //
    //
    //
    //
    //
    System.out.println("----------- Llista d'aparells elèctrics -----------");
        for (AparellElectric objeto : llistaElectrodomestics) {
            System.out.println(objeto);
        }
        for (AparellElectric objeto : llistaAparellsElectrics) {
            System.out.println(objeto);
        }
        for (AparellElectric objeto : llistaDispositiusInformatics) {
            System.out.println(objeto);
        }
    
    }
}

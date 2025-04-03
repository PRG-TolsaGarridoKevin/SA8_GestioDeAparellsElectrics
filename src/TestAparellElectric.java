import java.util.ArrayList;

public class TestAparellElectric {
    public static void main(String[] args) {
        ArrayList<AparellElectric> llistaElectrodomestics = new ArrayList<>();
        ArrayList<AparellElectric> llistaDispositiusInformatics = new ArrayList<>();
        ArrayList<AparellElectric> llistaAparellsElectrics = new ArrayList<>();
        
        
        crearLlistat(llistaElectrodomestics, llistaAparellsElectrics, llistaDispositiusInformatics);
        veureLlistat(llistaElectrodomestics, llistaAparellsElectrics, llistaDispositiusInformatics);
        
    }
    
    public static void crearLlistat(ArrayList<AparellElectric> llistaElectrodomestics, ArrayList<AparellElectric> llistaAparellsElectrics, ArrayList<AparellElectric> llistaDispositiusInformatics){
        Llavadora llavadora1 = new Llavadora("1234A","V1","Bosch");
        Llavadora llavadora2 = new Llavadora("1234B","F22","Fagor",12);
        llistaElectrodomestics.add(llavadora1);
        llistaElectrodomestics.add(llavadora2);
        
        Televisio tele1 = new Televisio("1234C","SuperGuay","LG",45);
        Televisio tele2 = new Televisio("1234D","MesChula","Sony",14);
        llistaElectrodomestics.add(tele1);
        llistaElectrodomestics.add(tele2);
        
        Portatil portatil1 = new Portatil("1234E",TipusMemoria.GB2048.obtenerMemoria(),5000,1024);
        Portatil portatil2 = new Portatil("1234F",TipusMemoria.GB1024.obtenerMemoria(),10000,2048);
        llistaDispositiusInformatics.add(portatil1);
        llistaDispositiusInformatics.add(portatil2);
        
        Mobil telefon1 = new Mobil("1234G",TipusMemoria.GB256,"Samsung","Galaxy S21");
        Mobil telefon2 = new Mobil("1234H",TipusMemoria.GB512,"Iphone","21");
        llistaDispositiusInformatics.add(telefon1);
        llistaDispositiusInformatics.add(telefon2);
        
        
    }
    
    public static void veureLlistat(ArrayList<AparellElectric> llistaElectrodomestics, ArrayList<AparellElectric> llistaAparellsElectrics, ArrayList<AparellElectric> llistaDispositiusInformatics){

    System.out.println("----------- Llista d'aparells elèctrics -----------");
        for (AparellElectric objeto : llistaElectrodomestics) {
            System.out.println(objeto);
        }
        /*
            for (AparellElectric objeto : llistaAparellsElectrics) {
                System.out.println(objeto);
            }
        */
        for (AparellElectric objeto : llistaDispositiusInformatics) {
            System.out.println(objeto);
        }
    
    }
}

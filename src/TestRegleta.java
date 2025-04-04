public class TestRegleta {
    public static void main(String[] args) {
        Regleta regleta = new Regleta();
        Llavadora llavadora1 = new Llavadora("1234A","V1","Bosch");
        Televisio tele1 = new Televisio("1234C","SuperGuay","LG",45);
        Portatil portatil1 = new Portatil("1234E",TipusMemoria.GB2048.obtenerMemoria(),5000,1024);
        Mobil telefon1 = new Mobil("1234G",TipusMemoria.GB256,"Samsung","Galaxy S21");
        
        System.out.println("------- Crear regleta i connectar els quatre aparells -------");
        
        regleta.endollar(llavadora1);
        regleta.endollar(tele1);
        regleta.endollar(portatil1);
        regleta.endollar(telefon1);
        
        System.out.println("\n------- Llistar els aparells endollats -------");
        
        regleta.llistarConnectats();
        System.out.println("\nEndolls lliures: "+regleta.obtenirNombreEndollsLliures());
    
        
        System.out.println("\n------- Desconnectar llavadora i televisió -------");
        
        regleta.desendollar(llavadora1);
        regleta.desendollar(tele1);
        
        System.out.println("\n------- Llistar aparells endollats -------");
        
        regleta.llistarConnectats();
        
        System.out.println("\n------- Crear mòbil amb número de sèrie 1234G -------");
        Mobil telefon2 = new Mobil("1234G",TipusMemoria.GB256,"Samsung","Galaxy S21");
        System.out.println(telefon2);
        
        System.out.println("\n------- Endollar mòbil anterior i obtindre missatge d'error -------");
        regleta.endollar(telefon2);
    
        System.out.println("\n------- Desconnectar aparell no endollat (llavadora) -------");
        regleta.desendollar(llavadora1);
               
    }
    
}

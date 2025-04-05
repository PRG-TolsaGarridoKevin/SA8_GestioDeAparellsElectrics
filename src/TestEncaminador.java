public class TestEncaminador {
    public static void main(String[] args) {
        Encaminador encaminador = new Encaminador();
        Regleta regleta = new Regleta();
        Televisio tele1 = new Televisio("1234C","SuperGuay","LG",45);
        Portatil portatil1 = new Portatil("1234E",TipusMemoria.GB2048.obtenerMemoria(),5000,1024);
        Mobil telefon1 = new Mobil("1234G",TipusMemoria.GB256,"Samsung","Galaxy S21");
        
        System.out.println("----------- Aparells connectables creats -----------\n");
        
        System.out.println(tele1);
        System.out.println(portatil1);
        System.out.println(telefon1);
        
        System.out.println("\n----------- Encendre televisió, mòbil i portàtil -----------\n");
        tele1.activar();
        portatil1.activar();
        telefon1.activar();
        
        System.out.println("\n----------- Connectar televisió a una regleta i encendre la TV -----------\n");
        
        regleta.endollar(tele1);
        tele1.activar();
        
        System.out.println("\n----------- Crear encaminador i aparellar els tres aparells. Televisió no podrà per no tindre habilitat Wifi -----------\n");
        
        
        
        encaminador.aparellar(tele1);
        encaminador.aparellar(portatil1);
        encaminador.aparellar(telefon1);
        
    }
}

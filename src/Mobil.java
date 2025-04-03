
public class Mobil extends DispositiuInformatic{
   
    
    private TipusMemoria memoriaInterna;
    private String marca;
    private String model;

    public Mobil(int numeroDeSerie, TipusMemoria memoriaInterna, String marca, String model) {
        super(numeroDeSerie);
        super.estaEnces = false;
        super.teCorrentElectric = false;
        super.estaConectatAInternet = false;
        
        this.marca = marca;
        this.model = model;
        this.memoriaInterna = memoriaInterna;
        
    }
}

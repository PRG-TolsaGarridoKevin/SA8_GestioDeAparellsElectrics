
public class Mobil extends DispositiuInformatic implements Connectable{

    private TipusMemoria memoriaInterna;
    private String marca;
    private String model;

    public Mobil(String numeroDeSerie, TipusMemoria memoriaInterna, String marca, String model) {
        super(numeroDeSerie);
        super.estaEnces = false;
        super.teCorrentElectric = false;
        super.estaConectatAInternet = false;
        
        this.marca = marca;
        this.model = model;
        this.memoriaInterna = memoriaInterna;
        
    }
    
    @Override
    public String toString() {
        String teCorrent;
        String estaEnces;
        String teInternet;
        
        if (teCorrentElectric) {
            teCorrent = "(Te corrent elèctric)";
        }else{
            teCorrent = "(Sense corrent elèctric)";
        }
        
        if (estaEnchufado) {
            estaEnces = "Si està encés";
        }else{
            estaEnces = "No està encés";
        }
        
        if (estaConectatAInternet) {
            teInternet = "Si està connectat a Internet";
        }else{
            teInternet = "No està connectat a Internet";
        }
        
        return "\n[Mòbil] Núm.Sèrie: "+ numeroDeSerie +" "+ teCorrent +", "+estaEnces+", "+teInternet+", Memoria: "+memoriaInterna+", Marca: "+marca+", Model: "+model;
    }

    @Override
    public String getPrefix() {
        return "[Mòbil]";
    }
}

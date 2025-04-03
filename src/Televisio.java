
public class Televisio extends Electrodomestic{
    private boolean estaWifiHabilitat;
    private boolean estaConectadaAInternet;
    private int pulgadasResolucion;
    
    public Televisio(String numSerie, String marca, String model) {
        super(numSerie, marca, model);
        this.estaWifiHabilitat = false;
        this.estaConectadaAInternet = false;
        this.pulgadasResolucion = 20;
    }

    public Televisio(String numeroSerie, String marca, String model, int pulgadasResolucion) {
        super(numeroSerie, marca, model);
        this.estaWifiHabilitat = false;
        this.estaConectadaAInternet = false;
        this.pulgadasResolucion = pulgadasResolucion;
    }
    
    
    
    @Override
    public double obtindrePreuVenda(){
        double preuVenda = super.obtindrePreuVenda();
        
        if (pulgadasResolucion > 40) {
            preuVenda = (preuVenda*0.30) + preuVenda;
        }

        return preuVenda;
    }
    
     @Override
    public String toString() {
        String teCorrent;
        String estaEnces;
        String wifiHabilitat;
        String connectadoAInternet;
        
        
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
        
        if (estaWifiHabilitat) {
            wifiHabilitat = "Wifi habilitat";
        }else{
            wifiHabilitat = "wifi deshabilitat";
        }
        
        if (estaConectadaAInternet) {
            connectadoAInternet = "Connectat a interent";
        }else{
            connectadoAInternet = "No connectat a interent";
        }
        
        return "\n[Televisió] Núm.Sèrie: "+ numeroSerie +" "+ teCorrent +", "+estaEnces+", Marca: "+marca+", Model: '"+model+"', Tipus Consum: "+consumEnergetic+", Color: "+tipusColor+", Preu Base: "+preuBase+", Preu Final: "+obtindrePreuVenda()+", "+wifiHabilitat+", "+connectadoAInternet+", Resolució: "+pulgadasResolucion;
    }
    
    @Override
    public void donarEnergia() {
        teCorrentElectric = true;
    }

    @Override
    public void llevarEnergia() {
        teCorrentElectric = false;
    }
}

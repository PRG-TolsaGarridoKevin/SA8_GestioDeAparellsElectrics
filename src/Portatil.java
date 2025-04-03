
public class Portatil extends DispositiuInformatic{
    private int memoriaRam;
    private double velocitatGpu;
    private int tamanyDiscDur;
    
    public Portatil(String numeroDeSerie, int memoriaRam, double velocitatGpu, int tamanyDiscDur) {
        super(numeroDeSerie);
        super.estaEnces = false;
        super.teCorrentElectric = false;
        super.estaConectatAInternet = false;
        
        this.memoriaRam = memoriaRam;
        this.velocitatGpu = velocitatGpu;
        this.tamanyDiscDur = tamanyDiscDur;
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
        
        return "\n[Portatil] Núm.Sèrie: "+ numeroDeSerie +" "+ teCorrent +", "+estaEnces+", "+teInternet+", RAM: "+memoriaRam+", VelocitatGPU: "+velocitatGpu+", Grandaria HD: "+tamanyDiscDur;
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

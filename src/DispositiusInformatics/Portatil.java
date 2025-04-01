package DispositiusInformatics;
public class Portatil extends DispositiuInformatic{
    private int memoriaRam;
    private int velocitatGpu;
    private int tamanyDiscDur;
    
    public Portatil(int numeroDeSerie, int memoriaRam, int velocitatGpu, int tamanyDiscDur) {
        super(numeroDeSerie);
        super.estaEnces = false;
        super.teCorrentElectric = false;
        super.estaConectatAInternet = false;
        
        this.memoriaRam = memoriaRam;
        this.velocitatGpu = velocitatGpu;
        this.tamanyDiscDur = tamanyDiscDur;
    }
    
}

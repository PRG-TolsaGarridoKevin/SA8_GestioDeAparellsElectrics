
public abstract class DispositiuInformatic extends AparellElectric{
    protected String numeroDeSerie;
    protected boolean estaEnces;
    protected boolean estaConectatAInternet;

    public DispositiuInformatic(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
        this.estaEnces = false;
        this.estaConectatAInternet = false;
    }

   

    
}

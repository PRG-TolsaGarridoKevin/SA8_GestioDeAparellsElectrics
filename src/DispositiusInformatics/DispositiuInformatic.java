package DispositiusInformatics;
public class DispositiuInformatic {
    protected int numeroDeSerie;
    protected boolean estaEnces;
    protected boolean estaConectatAInternet;
    protected boolean teCorrentElectric;

    public DispositiuInformatic(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
        this.estaEnces = false;
        this.estaConectatAInternet = false;
        this.teCorrentElectric = false;
    }

    
}

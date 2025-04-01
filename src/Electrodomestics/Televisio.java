package Electrodomestics;
public class Televisio extends Electrodomestic{
    private boolean estaEncesa;
    private boolean estaWifiHabilitat;
    private boolean estaConectadaAInternet;
    private int pulgadas;
    
    public Televisio(int numSerie, String marca, String model) {
        super(numSerie, marca, model);
        this.estaEncesa = false;
        this.estaWifiHabilitat = false;
        this.estaConectadaAInternet = false;
        this.pulgadas = 20;
    }
    
}

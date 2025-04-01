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
    
    @Override
    public double obtindrePreuVenda(){
        double preuVenda = super.obtindrePreuVenda();
        
        if (pulgadas > 40) {
            preuVenda = super.preuBase*0.30;
        }

        return preuVenda;
    }
    
}

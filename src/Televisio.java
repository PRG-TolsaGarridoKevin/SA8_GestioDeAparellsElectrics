
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
    
    @Override
    public double obtindrePreuVenda(){
        double preuVenda = super.obtindrePreuVenda();
        
        if (pulgadasResolucion > 40) {
            preuVenda = super.preuBase*0.30;
        }

        return preuVenda;
    }
    
}


public abstract class DispositiuInformatic extends AparellElectric implements Activable, Connectable{
    protected String numeroDeSerie;
    protected boolean estaEnces;
    protected boolean estaConectatAInternet;

    public DispositiuInformatic(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
        this.estaEnces = false;
        this.estaConectatAInternet = false;
    }
    
    @Override
    public void activar() {
        System.out.println("Aparell encès"); 
    }

    @Override
    public void desactivar() {
        System.out.println("Aparell apagat");  
    }
    
    @Override
    public boolean esPermetConnexio() {
        return estaEnchufado;
    }

     @Override
    public void establirConexio() {
        estaConectatAInternet = true;
    }

    @Override
    public void llevarConexio() {
        estaConectatAInternet = false;
    }
}

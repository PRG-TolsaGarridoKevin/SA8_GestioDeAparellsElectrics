
import java.util.Objects;

public abstract class AparellElectric implements Endollable, Activable, Connectable{
    protected boolean estaEnchufado;
    protected String numeroSerie;
    protected boolean teCorrentElectric;

    public AparellElectric() {
        this.estaEnchufado = false;
        this.numeroSerie = numeroSerie;
        this.teCorrentElectric = false;
    }
    
    
    @Override
    public void donarEnergia() {
        teCorrentElectric = true;
    }

    @Override
    public void llevarEnergia() {
        teCorrentElectric = false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.numeroSerie);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AparellElectric other = (AparellElectric) obj;
        return Objects.equals(this.numeroSerie, other.numeroSerie);
    }
    
    @Override
    public void activar() {
        if (teCorrentElectric) {
            System.out.println("["+this.getClass().getSimpleName()+"] Aparell encès"); 
        }else{
            System.out.println("["+this.getClass().getSimpleName()+"] No es pot encendre (no hi ha corrent)");
        }
        
    }

    @Override
    public void desactivar() {
        System.out.println("["+this.getClass().getSimpleName()+"] Aparell apagat");  
    }
    
    
}

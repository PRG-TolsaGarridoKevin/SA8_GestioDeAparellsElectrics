
import java.util.Objects;

public abstract class AparellElectric implements Endollable{
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
    
    
}

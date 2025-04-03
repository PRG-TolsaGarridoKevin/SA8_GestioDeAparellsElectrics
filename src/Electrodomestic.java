
        
public abstract class Electrodomestic extends AparellElectric{
    
    protected double preuBase;
    protected String marca;
    protected String model;
    protected TipusColor tipusColor;
    protected TipusConsumElectric consumEnergetic;
    private int pes;
    private int unidadesStock;

    public Electrodomestic(String numeroSerie, String marca, String model) {
        super.numeroSerie = numeroSerie;
        this.preuBase = 100;
        this.marca = marca;
        this.model = model;
        this.tipusColor = TipusColor.BLANC;
        this.consumEnergetic = TipusConsumElectric.F;
        this.pes = 5;
    }
    
            
    public double obtindrePreuVenda(){
        double preuVenda = 0;
        switch (TipusConsumElectric.obtenerCaracter(this.consumEnergetic)) {
            case 'A' -> {preuVenda = preuBase +  100;}
            case 'B' -> {preuVenda = preuBase +  80;}
            case 'C' -> {preuVenda = preuBase +  60;}
            case 'D' -> {preuVenda = preuBase +  50;}
            case 'E' -> {preuVenda = preuBase +  30;}
            case 'F' -> {preuVenda = preuBase +  10;}
        }
        return preuVenda;
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

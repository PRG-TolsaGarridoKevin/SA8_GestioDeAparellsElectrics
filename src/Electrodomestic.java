public class Electrodomestic {
    private final char[] consumEnergeticOpcions = {'A','B','C','D','E','F'};
    
    private int numSerie;
    private double preuBase;
    private String marca;
    private String model;
    private TipusColor tipusColor;
    private char consumEnergetic;
    private double pes;

    public Electrodomestic(int numSerie, String marca, String model) {
        this.numSerie = numSerie;
        this.preuBase = 100;
        this.marca = marca;
        this.model = model;
        this.tipusColor = TipusColor.BLANC;
        this.consumEnergetic = consumEnergeticOpcions[5];
        this.pes = 5;
    }  
}

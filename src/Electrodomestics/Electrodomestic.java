package Electrodomestics;

public class Electrodomestic {
    private final char[] consumEnergeticOpcions = {'A','B','C','D','E','F'};
    
    private int numSerie;
    protected double preuBase;
    private String marca;
    private String model;
    private TipusColor tipusColor;
    protected char consumEnergetic;
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
    
    
    public double obtindrePreuVenda(){
        double preuVenda = 0;
        switch (consumEnergetic) {
            case 'A' -> {preuVenda = preuBase +  100;}
            case 'B' -> {preuVenda = preuBase +  80;}
            case 'C' -> {preuVenda = preuBase +  60;}
            case 'D' -> {preuVenda = preuBase +  50;}
            case 'E' -> {preuVenda = preuBase +  30;}
            case 'F' -> {preuVenda = preuBase +  10;}
        }
        return preuVenda;
    }
    
    
}

package DispositiusInformatics;
public class Mobil extends DispositiuInformatic{
    public static final int[] tamanysMemoriaInterna = {64, 128, 256, 512, 1, 2};
    
    private int[] memoriaInterna;
    private String marca;
    private String model;

    public Mobil(int numeroDeSerie, int[] memoriaInterna, String marca, String model) {
        super(numeroDeSerie);
        super.estaEnces = false;
        super.teCorrentElectric = false;
        super.estaConectatAInternet = false;
        
        this.marca = marca;
        this.model = model;
        this.memoriaInterna = tamanysMemoriaInterna;
        
    }
}

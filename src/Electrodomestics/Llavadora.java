package Electrodomestics;
public class Llavadora extends Electrodomestic{
    private boolean estaEncesa;
    private double carrega;

    public Llavadora(int numSerie, String marca, String model) {
        super(numSerie, marca, model);
        this.estaEncesa = false;
        this.carrega = 7;
    }
    
    @Override
    public double obtindrePreuVenda(){
        double preuVenda = super.obtindrePreuVenda();
        
        if (carrega > 10) {
            preuVenda += 50;
        }

        return preuVenda;
    }
}

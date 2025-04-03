
public class Llavadora extends Electrodomestic{
    private int carrega;

    public Llavadora(String numSerie, String marca, String model) {
        super(numSerie, marca, model);
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

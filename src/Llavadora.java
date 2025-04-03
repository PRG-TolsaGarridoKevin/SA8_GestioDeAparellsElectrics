
public class Llavadora extends Electrodomestic{
    private int carrega;

    public Llavadora(String numSerie, String marca, String model) {
        super(numSerie, marca, model);
        this.carrega = 7;
    }

    public Llavadora(String numeroSerie, String marca, String model, int carrega) {
        super(numeroSerie, marca, model);
        this.carrega = carrega;
    }
    
    

 
    @Override
    public double obtindrePreuVenda(){
        double preuVenda = super.obtindrePreuVenda();
        
        if (carrega > 10) {
            preuVenda += 50;
        }

        return preuVenda;
    }

    @Override
    public String toString() {
        String teCorrent;
        String estaEnces;
        if (teCorrentElectric) {
            teCorrent = "(Te corrent elèctric)";
        }else{
            teCorrent = "(Sense corrent elèctric)";
        }
        
        if (estaEnchufado) {
            estaEnces = "Si està encés";
        }else{
            estaEnces = "No està encés";
        }
        
        return "\n[Llavadora] Núm.Sèrie: "+ numeroSerie +" "+ teCorrent +", "+estaEnces+", Marca: "+marca+", Model: '"+model+"', Tipus Consum: "+consumEnergetic+", Color: "+tipusColor+", Preu Base: "+preuBase+", Preu Final: "+obtindrePreuVenda()+", Càrrega: "+carrega;
    }
    
    
}

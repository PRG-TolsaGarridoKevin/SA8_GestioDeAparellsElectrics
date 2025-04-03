public enum TipusConsumElectric {
    A,B,C,D,E,F;
    
    public static char obtenerCaracter(TipusConsumElectric consumo) {
        return consumo.name().charAt(0);
    }
}

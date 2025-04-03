public enum TipusMemoria {
    GB64(64), GB128(128), GB256(256), GB512(512), GB1024(1024), GB2048(2048);
    
    private final int memoria;
    TipusMemoria(int memoria){
        this.memoria = memoria;
    }
    
    public int obtenerMemoria(){
        return memoria;
    }
}

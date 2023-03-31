public class SmartTv {
    private final int CANAL_MAXIMO = 200;
    private final int CANAL_MINIMO = 1;
    private final int VOLUME_MAXIMO = 100;
    private final int VOLUME_MINIMO = 0;
    private boolean ligada = false;
    private int canal;
    private int volume;
    
    public boolean isLigada() {
        return this.ligada;
    }

    public void botaoLigarDesligar(){
        this.ligada = !this.ligada;
        //caso estejam ligando, dá canal e volume padrão
        if(isLigada()){
            setCanal(1);
            setVolume(20);
        }
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        //caso o canal digitado seja "0", não alterar
        if(canal >= CANAL_MINIMO && canal <= CANAL_MAXIMO)
            this.canal = canal;
    }

    public int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        if(volume >= VOLUME_MINIMO && volume <= VOLUME_MAXIMO)
            this.volume = volume;
    }

    public String toString(){
        String estado = isLigada() ? 
                "Smart Tv Ligada"
                + "\nCanal: " + getCanal()
                + "\nVolume: " +  getVolume()
                : "Smart Tv Desligada";

        return estado;
    }

    public void aumentarVolume(){
        if(this.volume < VOLUME_MAXIMO)
            setVolume(this.volume+1);
    }

    public void diminuirVolume(){
        if(this.volume > VOLUME_MINIMO)
            setVolume(this.volume-1);
    }

    public void aumentarCanal(){
        setCanal(this.canal+1);
    }

    public void diminuirCanal(){
        setCanal(this.canal-1);
    }
    
    public void alterarCanal(int canal){
        setCanal(canal);
    }

}

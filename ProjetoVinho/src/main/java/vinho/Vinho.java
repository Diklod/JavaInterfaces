package vinho;

public class Vinho {
   
    private String nomeRotulo;
    private String produtor;
    private String doc;
    private String classificacao;
    private String cor;
    private int safra;
    private String tipo;
    private int tempoEnvelhecimento;
    private String carvalhoFrances;
    private String carvalhoAmericano;
    private String inox;
    private String emGarrafa;
    private String generoVitis;
    private int potencialGuarda;
    private String uvaPredominante;

    public Vinho() {
    }
    
    public Vinho(String nomeRotulo, String produtor, String doc, String classificacao, String cor, int safra, String tipo, int tempoEnvelhecimento, String carvalhoFrances, String carvalhoAmericano, String inox, String emGarrafa, String generoVitis, int potencialGuarda, String uvaPredominante) {
        this.nomeRotulo = nomeRotulo;
        this.produtor = produtor;
        this.doc = doc;
        this.classificacao = classificacao;
        this.cor = cor;
        this.safra = safra;
        this.tipo = tipo;
        this.tempoEnvelhecimento = tempoEnvelhecimento;
        this.carvalhoFrances = carvalhoFrances;
        this.carvalhoAmericano = carvalhoAmericano;
        this.inox = inox;
        this.emGarrafa = emGarrafa;
        this.generoVitis = generoVitis;
        this.potencialGuarda = potencialGuarda;
        this.uvaPredominante = uvaPredominante;
    }

    // Seletores ----------------------------------------------------
    public String getNomeRotulo() {
        return nomeRotulo;
    }

    public String getProdutor() {
        return produtor;
    }

    public String getDoc() {
        return doc;
    }

    public String getClassificação() {
        return classificacao;
    }
        
    public String getCor() {
        return cor;
    }

    public int getSafra() {
        return safra;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTempoEnvelhecimento() {
        return tempoEnvelhecimento;
    }

    public String getCarvalhoFrances() {
        return carvalhoFrances;
    }

    public String getCarvalhoAmericano() {
        return carvalhoAmericano;
    }

    public String getInox() {
        return inox;
    }

    public String getEmGarrafa() {
        return emGarrafa;
    }

    public String getGeneroVitis() {
        return generoVitis;
    }

    public int getPotencialGuarda() {
        return potencialGuarda;
    }

    public String getUvaPredominante() {
        return uvaPredominante;
    }

    // Modificadores ----------------------------------------------------
    public void setNomeRotulo(String nomeRotulo) {
        this.nomeRotulo = nomeRotulo;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public void setClassificação(String classificação) {
        this.classificacao = classificação;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setSafra(int safra) {
        this.safra = safra;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTempoEnvelhecimento(int tempoEnvelhecimento) {
        this.tempoEnvelhecimento = tempoEnvelhecimento;
    }

    public void setCarvalhoFrances(String carvalhoFrances) {
        this.carvalhoFrances = carvalhoFrances;
    }

    public void setCarvalhoAmericano(String carvalhoAmericano) {
        this.carvalhoAmericano = carvalhoAmericano;
    }

    public void setInox(String inox) {
        this.inox = inox;
    }

    public void setEmGarrafa(String emGarrafa) {
        this.emGarrafa = emGarrafa;
    }

    public void setGeneroVitis(String generoVitis) {
        this.generoVitis = generoVitis;
    }

    public void setPotencialGuarda(int potencialGuarda) {
        this.potencialGuarda = potencialGuarda;
    }

    public void setUvaPredominante(String uvaPredominante) {
        this.uvaPredominante = uvaPredominante;
    }
    
    public String ImprimirDados(int i){
        return "Vinho #" + i
                + "\n------------------------------------------------------------"
                + "\nNome do Rótulo: " + nomeRotulo
                + "\nProdutor: " + produtor
                + "\nD.O.C. : " + doc
                + "\nClassificação: " + classificacao
                + "\nCor: " + cor
                + "\nSafra: " + safra
                + "\nTipo: " + tipo
                + "\nTempo de Envelhecimento: " + tempoEnvelhecimento + " meses"
                + "\nCarvalho Francês? " + carvalhoFrances
                + "\nCarvalho Americano? " + carvalhoAmericano
                + "\nInox? " + inox
                + "\nEm garrafa? " + emGarrafa
                + "\nGênero Vitis: " + generoVitis
                + "\nPotencial de guarda: " + potencialGuarda + " anos"
                + "\nUva Predominante: " + uvaPredominante;  
    }
}

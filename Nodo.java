public class Nodo {
    private String valore;
    private Nodo destro;
    private Nodo sinistro;

    public Nodo() {
        this.valore = null;
        this.destro = null;
        this.sinistro = null;
    }

    public Nodo(String valore) {
        this.valore = valore;
        this.destro = null;
        this.sinistro = null;
    }

    public Nodo getCoppia() {
        Nodo coppia = new Nodo(this.valore);
        if (this.sinistro != null) {
            coppia.setSinistro(this.sinistro.getCoppia());
        }
        if (this.destro != null) {
            coppia.setSinistro(this.destro.getCoppia());
        }
        return coppia;
    }

    public Integer estraiValoreNodo() {
        if (this == null)
            return 0;
        String valore = this.getValore();
        return (valore != null) ? Integer.parseInt(valore) : 0;
    }

    public Integer somma(Nodo nodo) {
        /**
         * if (nodo == null) return 0;
         * return nodo.estraiValoreNodo() + somma(nodo.getDestro()) +
         * somma(nodo.getSinistro());
         */
        if (nodo == null)
            return 0;
        int valoreNodo = nodo.estraiValoreNodo();
        int sommaDestro = somma(nodo.getDestro());
        int sommaSinistro = somma(nodo.getSinistro());
        return valoreNodo + sommaDestro + sommaSinistro;
    }

    public String getValore() {
        return valore;
    }

    public void setValore(String valore) {
        this.valore = valore;
    }

    public Nodo getDestro() {
        return destro;
    }

    public void setDestro(Nodo destro) {
        this.destro = destro;
    }

    public Nodo getSinistro() {
        return sinistro;
    }

    public void setSinistro(Nodo sinistro) {
        this.sinistro = sinistro;
    }
}

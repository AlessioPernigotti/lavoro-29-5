public class SquadraNBA extends EntitaBase {
    private String nome;
    private String citta;
    private int titoli;

    public SquadraNBA(int id, String nome, String citta, int titoli) {
        this.id = id;
        this.nome = nome;
        this.citta = citta;
        this.titoli = titoli;
    }

    public String getNome() {
        return nome;
    }

    public String getCitta() {
        return citta;
    }

    public int getTitoli() {
        return titoli;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public void setTitoli(int titoli) {
        this.titoli = titoli;
    }

    @Override
    public String toString() {
        return "SquadraNBA{id=" + id + ", nome='" + nome + "', città='" + citta + "', titoli=" + titoli + "}";
    }
}

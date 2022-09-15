import java.time.LocalDate;

public class Venda {

    private String nom;
    private int quantitat;
    private double preu;
    private LocalDate data;

    public Venda(String nom, int quantitat, double preu, LocalDate data) {
        this.nom = nom;
        this.quantitat = quantitat;
        this.preu = preu;
        this.data = data;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "nom='" + nom + '\'' +
                ", quantitat=" + quantitat +
                ", preu=" + preu +
                ", data=" + data +
                '}';
    }
}

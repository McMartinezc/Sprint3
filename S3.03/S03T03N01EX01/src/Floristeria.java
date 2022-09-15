import java.util.ArrayList;

public class Floristeria {

    private ArrayList<String> llistaProductes;
    private String nom;
    private int stock;

    public Floristeria(ArrayList<String> llistaProductes, String nom, int stock) {
        llistaProductes = new ArrayList<String>();
        this.nom = nom;
        this.stock = stock;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Floristeria{" +
                "nom='" + nom + '\'' +
                ", stock=" + stock +
                '}';
    }
}

// Classe pour le Fou
public class Fou extends Piece {
    public Fou(String couleur) {
        super(couleur);
    }

    @Override
    public String toString() {
        return couleur.equals("Blanc") ? "F" : "f"; // F pour fou blanc, f pour fou noir
    }
}

// Classe pour le Roi
public class Roi extends Piece {
    public Roi(String couleur) {
        super(couleur);
    }

    @Override
    public String toString() {
        return couleur.equals("Blanc") ? "R" : "r"; // R pour roi blanc, r pour roi noir
    }
}

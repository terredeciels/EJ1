// Classe pour le Pion
public class Pion extends Piece {
    public Pion(String couleur) {
        super(couleur);
    }

    @Override
    public String toString() {
        return couleur.equals("Blanc") ? "P" : "p"; // P pour pion blanc, p pour pion noir
    }
}

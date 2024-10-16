// Classe pour la Tour
public class Tour extends Piece {
    public Tour(String couleur) {
        super(couleur);
    }

    @Override
    public String toString() {
        return couleur.equals("Blanc") ? "T" : "t"; // T pour tour blanche, t pour tour noire
    }
}

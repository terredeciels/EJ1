// Classe pour la Dame
public class Dame extends Piece {
    public Dame(String couleur) {
        super(couleur);
    }

    @Override
    public String toString() {
        return couleur.equals("Blanc") ? "D" : "d"; // D pour dame blanche, d pour dame noire
    }
}

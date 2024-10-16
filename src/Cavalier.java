// Classe pour le Cavalier
public class Cavalier extends Piece {
    public Cavalier(String couleur) {
        super(couleur);
    }

    @Override
    public String toString() {
        return couleur.equals("Blanc") ? "C" : "c"; // C pour cavalier blanc, c pour cavalier noir
    }
}

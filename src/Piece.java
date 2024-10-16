// Classe abstraite Piece pour définir les propriétés de base des pièces
public abstract class Piece {
    protected String couleur; // "Blanc" ou "Noir"

    public Piece(String couleur) {
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public abstract String toString(); // Représente la pièce en chaîne de caractères



}


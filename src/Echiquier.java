public class Echiquier {
    private Piece[][] plateau = new Piece[8][8]; // Plateau de 8x8

    // Constructeur qui initialise le plateau
    public Echiquier() {
        initialiserEchiquier();
    }

    // Méthode pour initialiser les pièces à leurs positions de départ
    private void initialiserEchiquier() {
        // Placement des pions
        for (int i = 0; i < 8; i++) {
            plateau[1][i] = new Pion("Noir");  // Ligne 2 (index 1) pour les pions noirs
            plateau[6][i] = new Pion("Blanc"); // Ligne 7 (index 6) pour les pions blancs
        }

        // Placement des pièces principales
        plateau[0][0] = plateau[0][7] = new Tour("Noir");  // Tours noires
        plateau[7][0] = plateau[7][7] = new Tour("Blanc"); // Tours blanches
        plateau[0][1] = plateau[0][6] = new Cavalier("Noir");  // Cavaliers noirs
        plateau[7][1] = plateau[7][6] = new Cavalier("Blanc"); // Cavaliers blancs
        plateau[0][2] = plateau[0][5] = new Fou("Noir");  // Fous noirs
        plateau[7][2] = plateau[7][5] = new Fou("Blanc"); // Fous blancs
        plateau[0][3] = new Dame("Noir");  // Dame noire
        plateau[7][3] = new Dame("Blanc"); // Dame blanche
        plateau[0][4] = new Roi("Noir");   // Roi noir
        plateau[7][4] = new Roi("Blanc");  // Roi blanc
    }

    // Affichage du plateau dans la console
    public void afficherEchiquier() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (plateau[i][j] != null) {
                    System.out.print(plateau[i][j] + " ");
                } else {
                    System.out.print(". ");  // Affichage d'un point pour une case vide
                }
            }
            System.out.println(); // Saut de ligne après chaque rangée
        }
    }

    public static void main(String[] args) {
        Echiquier echiquier = new Echiquier();
        echiquier.afficherEchiquier(); // Affiche le plateau de départ
    }
}
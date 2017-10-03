import java.util.Scanner;
public class paire {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        
        // Demander une valeur à l'utilisateur
        System.out.print("Entrez un nombre entier:");
        int number = scanner.nextInt();

        // Premièrement, on vérifie si le nombre est zéro, car
        // dans ce cas le test de parité n'est pas nécessaire
        if (number == 0) {
            System.out.println("Le nombre est zéro (et il est pair)");
        } else {
            // S'il n'est pas nul, voyons quel est son signe
            if (number < 0) {
                //Note: System.out.print ne commence pas de nouvelle ligne
                System.out.print("Le nombre est négatif ");
            } else {
                System.out.print("Le nombre est positif ");
            }

            // Teste la parité: si le reste de la division par deux est zéro
            // alors le nombre est pair
            int reste = number % 2;
            if (reste == 0) {
                System.out.println("et pair");
            } else {
                System.out.println("et impair");
            }
        }
    }
}
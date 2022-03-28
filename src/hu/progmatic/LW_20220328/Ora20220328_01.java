package hu.progmatic.LW_20220328;

public class Ora20220328_01 {
    public static void main(String[] args) {
        int[] homersekletek = { // Debrecen
                5, 2, 1, 0, 15, -8, -7, // 1-7
                -4, -4, -8, -8, 3, -5, -2 // 8-14
        };

        // Volt-e -7 foknál hidegebb?
        boolean voltE = false;
        for (int i = 0; i < homersekletek.length; i++) {
            if (homersekletek[i] < -7) {
                voltE = true;
                break;
            }
        }

        if (voltE) {
            System.out.println("Volt -7 foknál hidegebb.");
        } else {
            System.out.println("Nem volt -7 foknál hidegebb.");
        }



    }
}

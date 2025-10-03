package no.hvl.dat100.matriser;

public class Matriser {

    public static void skrivUt(int[][] matrise) {
        if (matrise == null) {
            System.out.println("Matrisen er null.");
            return;
        }
        for (int[] rad : matrise) {
            for (int verdi : rad) {
                System.out.print(verdi + " ");
            }
            System.out.println();
        }
    }

    public static String tilStreng(int[][] matrise) {
        if (matrise == null) {
            return "null";
        }

        String streng = "[";
        for (int i = 0; i < matrise.length; i++) {
            streng += "[";
            for (int j = 0; j < matrise[i].length; j++) {
                streng += matrise[i][j];
                if (j < matrise[i].length - 1) {
                    streng += ", ";
                }
            }
            streng += "]";
            if (i < matrise.length - 1) {
                streng += ", ";
            }
        }
        streng += "]";
        return streng;
    }

    public static int[][] skaler(int tall, int[][] matrise) {
        if (matrise == null) return null;
        int rader = matrise.length, kolonner = matrise[0].length;
        int[][] resultat = new int[rader][kolonner];
        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                resultat[i][j] = tall * matrise[i][j];
            }
        }
        return resultat;
    }

    public static boolean erLik(int[][] a, int[][] b) {
        if (a == b) return true;
        if (a == null || b == null || a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) return false;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }

    public static int[][] speile(int[][] matrise) {
        if (matrise == null) return null;
        int rader = matrise.length, kolonner = matrise[0].length;
        int[][] resultat = new int[kolonner][rader];
        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                resultat[j][i] = matrise[i][j];
            }
        }
        return resultat;
    }

    public static int[][] multipliser(int[][] a, int[][] b) {
        if (a == null || b == null) return null;
        int raderA = a.length, kolonnerA = a[0].length, raderB = b.length, kolonnerB = b[0].length;
        if (kolonnerA != raderB) return null;
        int[][] resultat = new int[raderA][kolonnerB];
        for (int i = 0; i < raderA; i++) {
            for (int j = 0; j < kolonnerB; j++) {
                for (int k = 0; k < kolonnerA; k++) {
                    resultat[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return resultat;
    }
}

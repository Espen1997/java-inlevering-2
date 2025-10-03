package no.hvl.dat100.tabeller;
import java.util.Arrays;

public class Tabeller {

    public static void skrivUt(int[] tabell) {
        for (int tall : tabell) {
            System.out.print(tall + " ");
        }
        System.out.println();
    }

    public static String tilStreng(int[] tabell) {
        return Arrays.toString(tabell);
    }

    public static int summer(int[] tabell) {
        int sum = 0;
        for (int tall : tabell) {
            sum += tall;
        }
        return sum;
    }

    public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
    }

    public static boolean finnesTall(int[] tabell, int tall) {
        for (int t : tabell) {
            if (t == tall) {
                return true;
            }
        }
        return false;
    }

    public static void reverser(int[] tabell) {
        for (int i = 0; i < tabell.length / 2; i++) {
            int temp = tabell[i];
            tabell[i] = tabell[tabell.length - 1 - i];
            tabell[tabell.length - 1 - i] = temp;
        }
    }

    public static boolean erSortert(int[] tabell) {
        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] > tabell[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] resultat = new int[tabell1.length + tabell2.length];
        System.arraycopy(tabell1, 0, resultat, 0, tabell1.length);
        System.arraycopy(tabell2, 0, resultat, tabell1.length, tabell2.length);
        return resultat;
    }
}
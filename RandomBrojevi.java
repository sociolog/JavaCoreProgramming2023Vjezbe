
import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class RandomBrojevi {
    public static void main(String[] args) {
        Random slucajniBroj = new Random();
        int[] lista = new int[11];
        for (int i = 0; i < 11; i++) {
            lista[i] = slucajniBroj.nextInt(1001);
        }
        lista[0] = 23;
        System.out.println(Arrays.toString(lista));

        int redniBrojPokusaja = 0;
        int uneseniBroj;

        MARKIRANA:
        while (true) {
            String unos = JOptionPane.showInputDialog("Unesi broj i isprobaj sreću!");
            uneseniBroj = Integer.parseInt(unos);
            redniBrojPokusaja++;

            for (int polje : lista) {
                if (uneseniBroj == polje) {
                    break MARKIRANA;
                }
            }
        }
        String smajli = "\uD83D\uDE00".repeat(15);
        String poruka = smajli + "\n" + "\uD83D\uDE00  Pogodio si iz " + redniBrojPokusaja + ". " + "pokušaja   \uD83D\uDE00" + "\n" + "\uD83D\uDE00 **" + uneseniBroj + "** je tvoj srećan broj!!! \uD83D\uDE00" + "\n" + smajli;
        JOptionPane.showMessageDialog(null, poruka);
    }

}


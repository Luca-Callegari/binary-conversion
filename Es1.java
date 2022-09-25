import javax.swing.*;

public class Es1 {
    public static void main(String[] args) {
        int ok = 0;
        do {
            String risposta = JOptionPane.showInputDialog("Vuoi convertire da *decimale a binario* o da *binario a decimale* ?");
            if (risposta.equals("binario a decimale")) {
                double n = Double.parseDouble(JOptionPane.showInputDialog("inserire numero binario"));
                int n2 = (int) n;
                double lunghezza = Math.floor(Math.log10(n) + 1);
                int lunghezza1 = (int) lunghezza;
                double somma = 0;
                int[] lista = new int[(int) lunghezza];

                for (int i = 0; i < lunghezza; i++) {
                    lista[i] = n2 % 10;
                    n2 = n2 / 10;
                }

                for (int j = lunghezza1 - 1; j >= 0; j--) {
                    if (lista[j] == 1) {
                        somma = somma + Math.pow(2, j);
                    }
                }
                System.out.println("Il numero binario " + n + " in decimale è " + somma);
                ok = 1;
            }
            if (risposta.equals("decimale a binario")) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("inserire numero decimale"));
                int numero1 = numero;
                int resto;
                int i = 0;
                do {
                    numero = numero / 2;
                    i++;
                } while (numero != 0);
                int[] resti = new int[i];
                for (int j = 0; j < i; j++) {
                    resto = numero1 % 2;
                    numero1 = numero1 / 2;
                    resti[j] = resto;
                }
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(resti[j]);
                }
                ok = 1;
            }
            String correzzione;
            if (risposta.equals("decimale a binario") || risposta.equals("binario a decimale")){

            }else{
                correzzione = JOptionPane.showInputDialog("Scrivi correttamente!");
            }
        }while(ok==0);
    }
}

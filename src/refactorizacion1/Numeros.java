
package refactorizacion1;

import javax.swing.JOptionPane;


public class Numeros {
    public static boolean esPrimo = false;
    
    public static int pedirNumDigitos(){
        int numDigitos=0;
        while (numDigitos<=0 || numDigitos>5){
        numDigitos=Integer.parseInt(JOptionPane.showInputDialog("Introduce numeros enteros"));
        
    }
    return numDigitos;
    }
    public static int calculaDigitos(int numero){
        int divisionEntera = numero;
        int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;}
            return contador;
    }
    public static void calculaPrimo (int i){
        if (i < 4) {
                    esPrimo = true;
                } else if (i % 2 == 0) {
                    esPrimo = false;
                } else {
                    int contador1 = 0;
                    int i1 = 1;
                    int limite = (i - 1) / 2;
                    if (limite % 2 == 0) {
                        limite--;
                    }
                    while (i1 <= limite) {
                        if (i % i1 == 0) {
                            contador1++;
                        }
                        i1 += 2;
                        if (contador1 == 2) {
                            i1 = limite + 1;
                        }
                    }
                    if (contador1 == 1) {
                        esPrimo = true;
                    }
                }
    }
    public void amosar (int i){
    if (esPrimo == true) {
                    System.out.println(i);
                }
    }
    
    }
      
    
        





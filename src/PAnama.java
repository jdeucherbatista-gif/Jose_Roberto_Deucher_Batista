import java.util.Scanner;

public class PAnama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

double gasolina = 5.70,valor=0.0,porcento,fina=0,valorFin=0;

        System.out.println("digite a chave  secreta: ");

     char palavra = sc.next().charAt(0);


        System.out.println("quantia a abastecer: ");

        double quantia = sc.nextDouble();



valor = quantia * gasolina;
        if (palavra ==  's' || palavra == 'S') {

            porcento = 10.0;

            fina = (valor * porcento) / 100;
            valorFin = valor - fina;
        }
        if (palavra ==  'n' || palavra == 'N') {
            valorFin = valor;
        }


        System.out.println("valor final:   R$"+Math.round(valorFin*100.0)/100.0);
        System.out.println("litro  abastecido: "+quantia);


       sc.close();
        }


    }

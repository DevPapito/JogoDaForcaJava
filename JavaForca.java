import java.util.Scanner;

public class JavaForca{

    static Scanner scanLer = new Scanner(System.in);

    public static void main(String[] args){

        Forca fo2 = new Forca("carro");
        Forca fo1 = new Forca(fo2.palavraRandomica());
        int tentativas = 12;
        boolean verificador = false;
        String letra = "";

        while (tentativas > 0){

            fo1.desenharArray();
            System.out.println("Tentativas: "+tentativas);
            System.out.print("Digite a possivel letra: ");
            letra = scanLer.next();

            verificador = fo1.verificarEntrada(letra);

            if (verificador){

                System.out.println("A letra "+letra+" existe na palavra!" );

            }else{

                System.out.println("A letra "+letra+" não existe na palavra!" );
                tentativas -= 1;

            }

            if (fo1.fimDeCodigo()){

                tentativas = 0;

            }

        }
        
    }


} 

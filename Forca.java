public class Forca{

    private String palavra;

    private String[] palavaLaco;
    private String[] palavraDesenho;
    private String[] palavrasRandom = {"carro","casa","maca","amor","felicidade","conquista","arrependimento","democracia"};
    
    public Forca(){

        this.palavaLaco = new String[this.palavra.length()];
        this.palavaLaco = this.palavra.split("");

        this.palavraDesenho = new String[this.palavra.length()];

    }

    public Forca(String palavra){

        this.palavra = palavra;

        this.palavaLaco = new String[palavra.length()];
        this.palavaLaco = palavra.split("");

        this.palavraDesenho = new String[palavra.length()];

    }

    public boolean verificarEntrada(String entradaLocal){
        boolean valorDeRetorno = false;
        String entradaLocalLocal = entradaLocal.toLowerCase();
        
        for (int i = 0; i < this.palavaLaco.length;i++){

            if (this.palavaLaco[i].equals(entradaLocalLocal)){
                
                this.palavraDesenho[i] = entradaLocalLocal;
                valorDeRetorno = true;
                
            }

        }

        return valorDeRetorno;

    }

    public void desenharArray(){

        System.out.println('\n');
        for (int i = 0; i < this.palavraDesenho.length; i++){

            if (this.palavraDesenho[i] == null){

                this.palavraDesenho[i] = "_";

            }

        }

        for (String i : this.palavraDesenho){

            System.out.print(i);

        }
        System.out.println();
        
    }

    public String palavraRandomica(){

        int randomico;
        String localString;

        randomico = (int) (Math.random() * 8);
        
        localString = this.palavrasRandom[randomico];

        return localString;

    }

    public boolean fimDeCodigo(){

        System.out.println("Verificando resultado!");
        String array1 ="";
        String array2 = "";

        for (int i = 0; i < this.palavra.length(); i++){

            array1 += this.palavaLaco[i];
            array2 += this.palavraDesenho[i];

        }
        
        if (array1.equals(array2)){

            System.out.println("Parabêns você descobriu a palavra!");
            System.out.println("\nPalavra final: "+array1);

            return true;
        }

        System.out.println("Que pena você não descobriu a ainda!");
        return false;

    }

} 

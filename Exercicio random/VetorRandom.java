import java.util.Random;

public class VetorRandom{
  public static Random rand = new Random();
  public static int[] vetor = new int[10];

  public static void main(String[] args){
    gerarAleatorios();
    //TODO: Usar Scanner pra buscar numero do vetor
    buscaSequencial();
  }
  
  public static void gerarAleatorios(){
    
    System.out.print("{");
    
    if(vetor.length >= 1){

      System.out.print(" " + vetor[0]);
      for(int i = 0; i < vetor.length; i++){
        int MAX = rand.nextInt(31);
        System.out.print(", " + MAX);
      }
      
    }

    System.out.print(" }\n");
  }

  public static int buscaSequencial(int x, int[] vetor){

    for(int i = 0; i < vetor.length; i++){
      if(x == vetor[i]){
        return i;
      }
    }
    
    return -1;
  }

  // Bubble sort 
  public static int preencherAleatorioOrdenado(int[] v, int n, int x){

  }

  // Insertion sort
  public static int inserirOrdenado(int[] vetor, int n, int x){
    int pos = n;
    while(x < v)
  }

  // Binary Search
}
import java.util.Scanner;

class Matrizes{
  public static Scanner input = new Scanner(System.in);
  public static int[][] m = new int[3][4];

  public static void main(String[] args){
    
    for(int i = 0; i < m.length; i += 1){
      for(int j = 0; j < m[0].length; j++){
        System.out.printf("Digite a %dº linha / %dº valor : ", i+1, j+1);
        m[i][j] = input.nextInt();
        m[2][1] = 55;
      }
    }

    for(int i = 0; i < m.length; i += 1){
      for(int j = 0; j < m[0].length; j += 1){
          System.out.print(m[i][j] + " ");        
      }
      System.out.print("\n");
    }

  }
}
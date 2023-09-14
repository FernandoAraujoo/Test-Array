import java.util.Scanner;
public class matriz{
    public static void main(String[] args) {
     System.out.println("Defina a quantidade da matriz quadrada: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] vet = new int[n][n];
    
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Defina os valores da matriz: " + vet[i][j]);
                vet[i][j]=sc.nextInt();

            }
            System.out.println(vet[n][n]);
        }
      

    sc.close();
    }
}
import java.util.Scanner;
class aa {
    public static void main(String args[]) {
        System.out.println("Digite o a quantidade de digitos do array");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] vet= new int(N);
        System.out.println("Digite "+ N +" números: ");
        
        for(i=0 ; i<N; i++){
           vet[i] = sc.nextInt();
            System.out.print(vet[i]);
        }
        sc.close();
    }


}
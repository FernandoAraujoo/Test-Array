import java.util.Scanner;
class aa {
    public static void main(String args[]) {
        System.out.println("Digite o a quantidade de digitos do array");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int vet[] = new int[N];
        System.out.println("Digite "+ N +" números: ");
        float media = 0;
        int soma =0;
        
        for(int i=0 ; i<N; i++){
           vet[i] = sc.nextInt();
            System.out.println(" valor "+i+ " array: " + vet[i]);
            soma = vet[i] + soma;
        }
        float soma1 = soma;
        float N1 = N;
        media = soma1/N1;
        System.out.println("soma: " + soma);
        System.out.println("resultado: "+ media);
        sc.close();
    }


}
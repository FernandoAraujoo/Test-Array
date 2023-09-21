import java.util.Scanner;
public class cc {
    public static void main(String args[]) {
        System.out.println("Digite o a quantidade de digitos do array");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String vet[] = new String[N];
        System.out.println("Digite "+ N +" nomes: ");
        int soma =0;
        
        for(int i=0 ; i<N; i++){
           vet[i] = sc.next();
            
        }
        for(String s : vet){
            System.out.println(s);
 
        }

        sc.close();
    }


}    


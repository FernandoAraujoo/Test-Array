import java.util.Scanner;

    public class bb {
        public static void main(String[] args) {
            System.out.println("Digite o tamannho do array: ");
            Scanner sc =  new Scanner(System.in);
            int N = sc.nextInt();
            int idade[] = new int[N];
            double altura[] = new double[N];
            String nome[]= new String[N];
                for(int i=0 ; i<N; i++){
                    System.out.println("digite o nome:");
                    nome[i] =sc.next();
                    System.out.println("digite a idade:");
                    idade[i]=sc.nextInt();
                    System.out.println("digite a altura: ");
                    altura[i]=sc.nextDouble();

                    System.out.println( nome[i] +" "+ idade[i] +" "+ altura[i]);
                 }
                
                 double soma =0;
                for(int i=0;i< N;i++){
                    soma = soma + altura[i];
                }
                System.out.println("soma: " + soma);
                double media = soma/N;
                System.out.println("media: " + media);

                int menorque = 0;
                for(int i=0;i< N;i++){
                    if(idade[i]<16){
                        menorque = menorque + 1;
                    }
                    else{ 
                    }
                }
                int percentagem = (menorque*100)/N;
                System.out.println(percentagem + "%");

                  sc.close(); 
            }
        }

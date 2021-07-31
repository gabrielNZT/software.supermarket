package inventory;

import java.util.Scanner;

public class Main {

    private static boolean loop = true;
    private static boolean loop1 = true;
    private static boolean first = true;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data data = new Data();
        Product product;

         System.out.println("Programa de estocagem...");

         while(loop) {


             if (first) {

                 first = false;
                 data.addProduct(new Product());
             } else {

             System.out.println("[1] Cadastrar\n[2] Remover\n[3] Pesquisar\n[4] Atualizar cadastro\n[5] Mostrar todos os produtos\n[6] Sair");
                 int option = input.nextInt();
             switch (option) {
                 case 1:
                     data.addProduct(new Product());
                     break;
                 case 2:
                     System.out.println("Informe o nome do produto a ser removido:");
                     product = data.Find(input.next());
                     if(product != null){
                         data.removeProduct(product);
                     }else{System.out.println("produto nao encontrado");}
                     break;
                 case 3:
                     System.out.println("Informe o nome do produto desejado:");
                     product = data.Find(input.next());
                     if(product != null){
                         System.out.printf("Info sobre o produto pesquisado:\nnome: %s\nquantidade: %d\npreço: %f\ncodigo: %s\n",product.getName(),product.getAmount(),product.getPrice(),product.getCod());
                         if(product.getStatus()){System.out.println("Status: Disponivel");}else{System.out.println("Status: Indisponível");}
                     }else{System.out.println("produto nao encontrado");}
                     break;
                 case 4:
                     System.out.println("Informe o nome do produto que voce deseja atualizar");
                     product = data.Find(input.next());
                     if(product != null){
                         loop1 = true;
                     }else{System.out.println("produto nao encontrado");}
                     while(loop1){
                         System.out.println("[1]Atualizar preço\n[2] Atualizar quantidade\n[3] Atualizar status\n[4] Sair");
                         switch (input.nextInt()){
                             case 1:
                                 System.out.println("Informe o novo preço:");
                                 product.setPrice(input.nextDouble());
                                 break;
                             case 2:
                                 System.out.println("Informe o valor atualizado da quantidade:");
                                 product.setAmount(input.nextInt());
                                 break;
                             case 3:
                                 product.setStatus(!product.getStatus());
                                 break;
                             case 4:
                                 loop1 = false;
                                 break;
                             default:
                                 System.out.println("Comando invalido!!");
                                 break;
                         }
                     }

                     break;
                 case 5:
                     data.getProducts();
                     break;

                 case 6:
                     loop = false;
                     break;
                 default:
                     System.out.println("Comando invalido!!");
                     break;

             }
         }
         }

    }
}

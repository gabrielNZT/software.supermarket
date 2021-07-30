package inventory;

import java.util.Scanner;

public class Register{

    protected Scanner input = new Scanner(System.in);
    protected Product product = new Product();

    public Product register(){

        System.out.printf("Cadastre o produto %d:\n",product.getCod_register());

        System.out.println("Informe o nome do produto:");
        product.setName(input.next());

        System.out.println("Informe a quantidade do produto:");
        product.setAmount(input.nextInt());

        System.out.println("Informe o preço do produto:");
        product.setPrice(input.nextDouble());

        System.out.println("Informe o código do produto:");
        product.setCod(input.next());

        product.setStatus(true);
        System.out.printf("O produto %s foi cadastrado com sucesso:\nquantidade: %d\npreço: %f\ncódigo: %s\n",product.getName(),product.getAmount(),product.getPrice(),product.getCod());
        return product;
    }
}

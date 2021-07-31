package inventory;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Data {

        private Vector<Product> products; // creation of vector products
        private Product product;
        private Scanner input = new Scanner(System.in);

    public Data(){

        products = new Vector<Product>();
    }
    public void addProduct(Product product){
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
         products.add(product);

    }

    public void removeProduct (Product product){
        //products.remove(product);
        product.setStatus(false);
    }

    public Product Find (String name){
        for(Product product : products){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
    public void getProducts(){
        String availability;
        for(Product product : products){
            if(product.getStatus()) availability = "Disponível";
            else{availability = "Indisponível";}
          System.out.println("nome: "+product.getName()+"    quantidade: "+product.getAmount()+"    preço: "+product.getPrice()+"    código: "+product.getCod()+"    Status: "+availability);
        }
    }
}

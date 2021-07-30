package inventory;
import java.util.ArrayList;
import java.util.Vector;

public class Data {

        private Vector<Product> products; // creation of vector products
        private Product product;

    public Data(){

        products = new Vector<Product>();
    }
    public void addProduct(Product product){
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

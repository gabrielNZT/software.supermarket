package inventory;

public class Product {

    private String name;
    private String cod;
    private int cod_register = 1;
    private double price;
    private int amount;
    private boolean status;

    public void setName(String name){
        this.name = name;
        this.status = true;
        this.cod_register +=1;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }

    public String getName(){
        return name;
    }

    public String getCod() {
        return cod;
    }

    public double getPrice() {
        return price;
    }

    public int getCod_register() {
        return cod_register;
    }
}

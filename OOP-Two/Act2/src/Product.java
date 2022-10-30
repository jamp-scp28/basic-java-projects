public class Product {
    String name;
    Integer price;
    Category category;

    public String GetProduct(){
        return "Product: " + this.name + "\n Price: " + this.price;
    }
}

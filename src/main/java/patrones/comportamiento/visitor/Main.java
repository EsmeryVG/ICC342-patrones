package patrones.comportamiento.visitor;
import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product) {
        products.add(product);
    }
    public double calculateTotal(ShoppingCartVisitor visitor) {
        double sum = 0;
        for (Product product : products) {
            sum += product.accept(visitor);
        }
        return sum;
    }
}

interface ShoppingCartVisitor {
    double visit(Book book);
    double visit(Electronic electronic);
}

class DiscountCalculator implements ShoppingCartVisitor {
    @Override
    public double visit(Book book) {
        double discount = book.getPrice() > 50 ? 10 : 5;
        double finalPrice = book.getPrice() - discount;
        System.out.println("Book: " + book.getTitle() + " final price: " + finalPrice);
        return finalPrice;
    }

@Override
    public double visit(Electronic electronic) {
        double discount = electronic.getPrice() * 0.1;
        double finalPrice = electronic.getPrice() - discount;
        System.out.println("Electronic Item: " + electronic.getName() + " final price: " + finalPrice);
        return finalPrice;
    }
}

interface Product {
    double accept(ShoppingCartVisitor visitor);
}

class Book implements Product {
    private String title;
    private double price;

public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

class Electronic implements Product {
    private String name;
    private double price;

public Electronic(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Book("Design Patterns", 60));
        cart.addProduct(new Electronic("Laptop", 800));
        cart.addProduct(new Book("Clean Code", 40));
        
        ShoppingCartVisitor discountCalculator = new DiscountCalculator();
        double totalPrice = cart.calculateTotal(discountCalculator);
        
        System.out.println("Total Cart Price after Discount: " + totalPrice);
    }
}
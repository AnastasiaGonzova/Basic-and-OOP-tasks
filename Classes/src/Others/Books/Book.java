package Others.Books;

import java.util.Arrays;

public class Book {
    private String name;
    private Autor[] autor;
    private double price;
    private int qty;

    public Book(String name, double price, int qty, Autor... autor) {
        this.name = name;
        this.autor = autor;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, double price, Autor... autor) {
        this.name = name;
        this.autor = autor;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Autor[] getAutor() {
        return autor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAutorsNames(){
        return Arrays.toString(autor);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 &&
                qty == book.qty &&
                name.equals(book.name) &&
                Arrays.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31*result + name.hashCode();
        result = 31*result + Double.hashCode(price);
        result = 31*result + Integer.hashCode(qty);
        result = 31 * result + Arrays.hashCode(autor);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor=" + Arrays.toString(autor) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}

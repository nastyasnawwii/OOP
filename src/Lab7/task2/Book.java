package Lab7.task2;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price<0){
            System.out.println("Price cannot be negative");
        }
        this.price = price;
    }
    public void displayInfo(){
        System.out.printf("Title: %s, Author: %s, Price: %d\n", title, author, price);
    }
}

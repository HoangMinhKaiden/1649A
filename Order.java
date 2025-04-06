public class Order {
    private static int counter = 1;
    private int id;
    private String bookTitle;

    public Order(String bookTitle) {
        this.id = counter++;
        this.bookTitle = bookTitle;
    }

    public int getId() {
        return id;
    }

    public String getBookTitle() {
        return bookTitle;
    }
}
public class BookCatalog {
    private MyArrayList<String> books = new MyArrayList<>();

    public void addBook(String title) {
        books.add(title);
    }

    public void sortBooks() {
        books.sort();
    }

    public boolean contains(String title) {
        return books.contains(title);
    }

    public void displayBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i+1) + ". " + books.get(i));
        }
    }
}

import java.util.Scanner;

public class Book {
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public Book() {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    private int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    private String title;
    private String author;
    private long price;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Nhập dữ id sách");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("\n Nhập dữ title sách");
        title = sc.nextLine();
        System.out.println("\n Nhập dữ author sách");
        author =sc.nextLine();
        System.out.println("\n Nhập dữ price sách");
        price = sc.nextInt();
    }
    public void output(){
        String mess = """
                Book: id = %d,title = %s,author=%s,price=%d""".formatted(id,title,author,price);
        System.out.println(mess);
    }
}
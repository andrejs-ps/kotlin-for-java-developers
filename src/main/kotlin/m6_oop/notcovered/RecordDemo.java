package m6_oop.notcovered;

public class RecordDemo {

    record Book(String title, String author) {

        // getters, toString(), equals(), hashCode()
    }

    public static void main(String[] args) {

        var book = new Book("Great Title", "Great Author");

        System.out.println(book.author());
        System.out.println(book.title());
    }
}

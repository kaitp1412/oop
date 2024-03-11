class Book {
    private String title;
    private String author;
    private String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void Info() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }

   // public boolean search(String keyword) {
    //  return title.contains(keyword) || author.contains(keyword) || publisher.contains(keyword);
  //  }
}

class FictionBook extends Book {
    public FictionBook(String title, String author, String publisher) {
        super(title, author, publisher);
    }
}

class NonFictionBook extends Book {
    public NonFictionBook(String title, String author, String publisher) {
        super(title, author, publisher);
    }
}

class ScienceBook extends Book {
    public ScienceBook(String title, String author, String publisher) {
        super(title, author, publisher);
    }
}

public class Main {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook("The Great ", "F. Scott ", "Scriber");
        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "Har");
        ScienceBook scienceBook = new ScienceBook("A Brief History of Time", "Stephen ", "Ban Book");

        System.out.println("Fiction Book:");
        fictionBook.Info();

        System.out.println("Non-Fiction Book:");
        nonFictionBook.Info();

        System.out.println("Science Book:");
        scienceBook.Info();
        
    }
}

package Library;

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

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }

    public boolean search(String keyword) {
        return title.contains(keyword) || author.contains(keyword) || publisher.contains(keyword);
    }
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

 class Main {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook("Hide and Seek", "Oliver Wilson", "Scribner");
        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "Harper");
        ScienceBook scienceBook = new ScienceBook("The nature of science", "A. Kalinkin V. Ilyin", "Bantam Books");

        System.out.println("Fiction Book:");
        fictionBook.displayInfo();
        System.out.println("Search 'Gatsby': " + fictionBook.search("Gatsby"));

        System.out.println();

        System.out.println("Non-Fiction Book:");
        nonFictionBook.displayInfo();
        System.out.println("Search 'Sapiens': " + nonFictionBook.search("Sapiens"));

        System.out.println();

        System.out.println("Science Book:");
        scienceBook.displayInfo();
        System.out.println("Search 'Time': " + scienceBook.search("Time"));
    }
}
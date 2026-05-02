package unit3;

public class Book {
    String title;
    int page;

    Book(String title, int page){
        this.title = title;
        this.page = page;
    }

    Book(String title){
        this(title, 0);
    }

    Book(Book obj){
        this.title = obj.title;
        this.page = obj.page;
    }

    public Book  printPage(){
        System.out.println("Page:" + this.page);
        return this;
    }

    public Book printTitle(){
        System.out.println("Title: " + this.title);
        return this;
    }
}

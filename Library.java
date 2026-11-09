import java.util.*;
class Book{
    int id;
    String name;
    String author;

    Book(int id, String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;
    }

    void display(){
        System.out.println(id + " " + name + " " + author);
    }
}

public  class Library{
    public static void main(String[] args){

        ArrayList<Book> books = new ArrayList<>();
        HashMap<Integer, Book> map = new HashMap<>();
        Book b1 = new Book(101, "java", "surya");
        Book b2 = new Book(102, "python", "viajy");

        books.add(b1);
        books.add(b2);
        map.put(b1.id,b1);
        map.put(b2.id,b2);

        System.out.println("book list:");
        for(Book b : books){
            b.display();
        }

        b1.name = "core java";
        System.out.println("after update:");
        for(Book b : books){
            b.display();
        }

        books.remove(b2);
        map.remove(102);
        System.out.println("after deletion:");
        Iterator<Book> itr = books.iterator();
        while(itr.hasNext()){
            itr.next().display();
        }


        System.out.println("Search book id 101:");
        Book search = map.get(101);
        if(search != null){
            search.display();
        }else{
            System.out.println("not found");
            
        }


    }
}
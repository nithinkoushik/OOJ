mport java.util.Scanner;

class Books {
    String name, author;
    int price, numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        String bookDetails;
        bookDetails = "Book name: " + this.name + "\n";
        bookDetails += "Author name: " + this.author + "\n";
        bookDetails += "Book price: " + this.price + "\n";
        bookDetails += "Number of pages: " + this.numPages + "\n";
        return bookDetails;
    }
}

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        String name, author;
        int price, numPages;

        System.out.println("Enter number of books:");
        n = in.nextInt();

        Books b[] = new Books[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of book " + (i + 1) + ":");
            name = in.next();
            System.out.println("Enter the name of Author " + (i + 1) + ":");
            author = in.next();
            System.out.println("Enter the price of book " + (i + 1) + ":");
            price = in.nextInt();
            System.out.println("Enter the number of pages of book " + (i + 1) + ":");
            numPages = in.nextInt();
            b[i] = new Books(name, author, price, numPages);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("The details of book " + (i + 1) + ":\n" + b[i].toString());
        }
    }
}

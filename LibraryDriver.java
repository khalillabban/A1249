package com.library;

import com.library.clients.Client;
import com.library.items.Book;
import com.library.items.Journal;
import com.library.items.Media;
import com.library.items.Item;

import java.util.Scanner;

public class LibraryDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu and get user choice
        System.out.println("Library Management System");
        System.out.println("1. Run predefined scenario");
        System.out.println("2. Display menu");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                runPredefinedScenario();
                break;
            case 2:
            	//insert code
            case 3:
                System.out.println("Exiting program.");
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
        }

        scanner.close();
    }

    private static void runPredefinedScenario() {
        // Create sample objects
        Client client1 = new Client("C1", "John Doe", "1234567890", "john@example.com");
        Client client2 = new Client("C2", "Jane Smith", "9876543210", "jane@example.com");
        Client client3 = new Client("C3", "Alice Johnson", "1112223333", "alice@example.com");

        Book book1 = new Book("B1", "Java Programming", "John Smith", 2020, 500);
        Book book2 = new Book("B2", "Python Basics", "Alice Brown", 2019, 400);
        Book book3 = new Book("B3", "C++ Essentials", "Bob Johnson", 2018, 600);

        Journal journal1 = new Journal("J1", "Science Journal", "Jane Doe", 2021, 10);
        Journal journal2 = new Journal("J2", "Nature Journal", "John Smith", 2022, 15);
        Journal journal3 = new Journal("J3", "Tech Journal", "Alice Brown", 2020, 8);

        Media media1 = new Media("M1", "Movie DVD", "Director X", 2022, "video");
        Media media2 = new Media("M2", "Music CD", "Artist Y", 2023, "audio");
        Media media3 = new Media("M3", "Game DVD", "Developer Z", 2021, "interactive");

        // Display information of created objects using toString() method
        System.out.println("Client Information:");
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);

        System.out.println("\nBook Information:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("\nJournal Information:");
        System.out.println(journal1);
        System.out.println(journal2);
        System.out.println(journal3);

        System.out.println("\nMedia Information:");
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        // Test equality of objects
        System.out.println("\nTesting Equality:");
        System.out.println("Client1 equals Client2: " + client1.equals(client2));
        System.out.println("Book1 equals Book2: " + book1.equals(book2));
        System.out.println("Journal1 equals Journal3: " + journal1.equals(journal3));

        // Create arrays of items
        Book[] books = {book1, book2, book3};
        Journal[] journals = {journal1, journal2, journal3};
        Media[] mediaArray = {media1, media2, media3};
        Item[] allItems = {book1, book2, book3, journal1, journal2, journal3, media1, media2, media3};

        // Demonstrate usage of getBiggestBook() method
        Book biggestBook = getBiggestBook(books);
        System.out.println("\nBiggest Book:");
        System.out.println(biggestBook);

        // Demonstrate usage of copyBooks() method
        Book[] copiedBooks = copyBooks(books);
        System.out.println("\nCopied Books:");
        for (Book book : copiedBooks) {
            System.out.println(book);
        }
    }

    private static Book getBiggestBook(Book[] books) {
        if (books == null || books.length == 0) {
            return null;
        }

        Book biggestBook = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].getNumberOfPages() > biggestBook.getNumberOfPages()) {
                biggestBook = books[i];
            }
        }
        return biggestBook;
    }

    private static Book[] copyBooks(Book[] books) {
        if (books == null || books.length == 0) {
            return null;
        }

        Book[] copiedBooks = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            copiedBooks[i] = new Book(books[i]);
        }
        return copiedBooks;
    }
}

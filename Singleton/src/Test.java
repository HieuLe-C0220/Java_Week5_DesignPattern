public class Test {
    public static void main(String[] args) {
        System.out.println("BEGIN TESTING SINGLETON PATTERN");
        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("BookBorrower1 asked to borrow the book");
        System.out.println("BookBorrower1 Author and Tittle: ");
        System.out.println(bookBorrower1.getAuthorAndTittle());

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 asked to borrow the book");
        System.out.println("BookBorrower2 Author and Tittle: ");
        System.out.println(bookBorrower2.getAuthorAndTittle());
        bookBorrower1.returnBook();
        System.out.println("BookBorrower1 returned the book");

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 Author and Tittle: ");
        System.out.println(bookBorrower1.getAuthorAndTittle());

        System.out.println("END TESTING SINGLETON PATTERN");
    }
}

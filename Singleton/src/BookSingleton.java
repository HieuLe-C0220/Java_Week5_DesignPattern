public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;
    private BookSingleton() {
        author = "Gamma, Helm, Jonhson, and Vlissides";
        title = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }
    public static BookSingleton borrowBook() {//Xây dựng phương thức thực hiện mượn sách
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }
    public void returnBook(BookSingleton bookReturned) {//Xây dựng phương thức thực hiện trả sách
        isLoanedOut = false;
    }
    // Xây dựng phương thức get để lấy thông tin về sách
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTittle() {
        return getTitle()+" by "+getAuthor();
    }
}

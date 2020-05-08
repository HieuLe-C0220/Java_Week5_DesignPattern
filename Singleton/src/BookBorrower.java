public class BookBorrower {// Tạo lớp của người mượn sách
    private BookSingleton borrowedBook;
    private boolean haveBook = false;
    public void borrowBook() {//Tạo phương thức mượn sách borrowBook
        borrowedBook = BookSingleton.borrowBook();
        if (borrowedBook == null) {
            haveBook = false;
        } else {
            haveBook = true;
        }
    }
    // Xây dựng về thông tin sách mượn
    public String getAuthorAndTittle() {
        if (haveBook) {
            return borrowedBook.getAuthorAndTittle();
        }
        return "I don't have the book";
    }
    public void returnBook() {
        borrowedBook.returnBook(borrowedBook);
    }
}

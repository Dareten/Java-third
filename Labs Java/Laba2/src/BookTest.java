public class BookTest {
    public static void main(String[] args){
        Book b1 = new Book();
        b1.setAuthor("George O.");
        b1.setPageCount(495);
        b1.setPrice(100);
        b1.setPubYear(1994);
        b1.setTitle(String.valueOf(b1.getPubYear() - 10));
        System.out.println(b1.getTitle() + " by " + b1.getAuthor() + " was published in " + b1.getPubYear() + " for " + b1.getPrice() + "$ with " +
                            b1.getPageCount() + " pages");
    }
}
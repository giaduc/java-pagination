package app;

/**
 *
 * @author giaduc
 */
public class App {

    public static void main(String[] args) {
        Pagination pagination = new Pagination();
        
        pagination.start();
        pagination.nextPage();
        pagination.prevPage();
    }
    
}

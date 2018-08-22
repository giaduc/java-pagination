package app;

import java.util.List;
import model.Person;
import model.PersonRepo;

/**
 *
 * @author giaduc
 */
public class Pagination {

    private int pageSize = 5;
    private int currentPage = 1;
    private List<Person> persons = PersonRepo.getAll();
    private int totalPages;
    private int mod;

    public Pagination() {
        totalPages = (int) Math.ceil(persons.size() / (double) pageSize);
        mod = persons.size() % pageSize;
        System.out.println("mod: " + mod);
    }

    public void start() {
        int start = 0;
        int end = persons.size() >= pageSize ? pageSize : persons.size();

        loadPage(start, end);
    }

    public void nextPage() {
        // TODO If currentPage < totalPages, increment the currentPage of 1. 
        if (currentPage < totalPages) {
            currentPage++;
            System.out.println(currentPage);

            // TODO Calculate start and end then call loadPage.
            int start = (currentPage - 1) * pageSize;
            int end = (start + pageSize) >= persons.size() ? start + mod : start + pageSize;
            System.out.println("start" + start);
            System.out.println("end" + end);

            loadPage(start, end);
        }

    }

    public void prevPage() {
        // TODO If currentPage > 1, decrement the currentPage of 1.
        if (currentPage > 1) {
            currentPage--;
            System.out.println(currentPage);

            // TODO Calculate start and end then call loadPage.
            int start = (currentPage - 1) * pageSize;
            int end = start + pageSize;
            System.out.println("start" + start);
            System.out.println("end" + end);

            loadPage(start, end);
        }

    }

    /**
     * Load items from @start to @end in list data source
     *
     * @param start
     * @param end
     */
    private void loadPage(int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.println(persons.get(i));
        }
    }

}

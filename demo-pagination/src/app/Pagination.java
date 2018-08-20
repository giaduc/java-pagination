package app;

import java.util.List;
import model.Person;
import model.PersonRepo;

/**
 *
 * @author giaduc
 */
public class Pagination {

    private static final int PAGE_SIZE = 5;
    private static int currentPage = 1;
    private static int totalPages;

    private static final List<Person> PERSONS = PersonRepo.getAll();

    private void loadPage(int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.println(PERSONS.get(i));
        }
    }

    public void start() {
        for (int i = 0; i < PAGE_SIZE; i++) {
            System.out.println(PERSONS.get(i));
        }
    }

    public void nextPage() {
        int current = currentPage + 1;
        int start = current * PAGE_SIZE;
        int end = start + PAGE_SIZE;
        System.out.println("Current page: " + current);
        System.out.println("Start: " + start);
        System.out.println("End: " + end);
    }

    public void prevPage() {
        int current = currentPage - 1;
        int start = current * PAGE_SIZE;
        int end = start + PAGE_SIZE;
        System.out.println("Current page: " + current);
        System.out.println("Start: " + start);
        System.out.println("End: " + end);
    }

}

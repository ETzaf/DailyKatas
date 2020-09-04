package paginationHelper;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PaginationHelperShould {

    private PaginationHelper paginationHelper;

    @Test
    public void
    should_return_the_number_of_the_items() {
        paginationHelper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        Assert.assertEquals(6, paginationHelper.itemCount());
    }

    @Test
    public void
    correctly_returns_the_number_of_pages() {
        paginationHelper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        Assert.assertEquals(2, paginationHelper.pageCount());
    }

    @Test
    public void
    correctly_returns_the_items_per_page() {
        paginationHelper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        Assert.assertEquals(4, paginationHelper.pageItemCount(1));
        Assert.assertEquals(2, paginationHelper.pageItemCount(2));
        Assert.assertEquals(-1, paginationHelper.pageItemCount(5));
    }

    @Test
    public void
    correctly_returns_the_page_that_belongs_to_the_item() {
        paginationHelper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        Assert.assertEquals(0, paginationHelper.pageIndex(3));
        Assert.assertEquals(1, paginationHelper.pageIndex(5));
        Assert.assertEquals(-1, paginationHelper.pageIndex(20));
        Assert.assertEquals(-1, paginationHelper.pageIndex(-10));
     }
}

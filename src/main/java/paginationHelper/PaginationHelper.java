package paginationHelper;

import java.util.List;

public class PaginationHelper {

    List<Character> items;
    int itemsPage;

    public PaginationHelper(List<Character> items, int itemsPage) {
        this.items = items;
        this.itemsPage = itemsPage;
    }

    public int itemCount() {
        return items.size();
    }

    public int pageCount() {

        int pageCountRaw = items.size() / itemsPage;
        int pageCountMode = items.size() % itemsPage;

        if (pageCountMode != 0) {
            pageCountRaw++;
        }

        return pageCountRaw;
    }

    public int pageItemCount(int pageIndex) {

        int itemsPerPage = 0;

        int pageCount = pageCount();
        int pageCountMode = items.size() % itemsPage;

        if (pageIndex < pageCount) {
            itemsPerPage = itemsPage;
        }

        if (pageIndex == pageCount) {
            itemsPerPage =   pageCountMode;
        }

        if (pageIndex > pageCount) {
            itemsPerPage = -1;
        }

        return itemsPerPage;
    }

    public int pageIndex(int itemIndex) {

        if (itemIndex > items.size() || itemIndex < 0) {
            return  -1;
        }

        return itemIndex / itemsPage;
    }
}

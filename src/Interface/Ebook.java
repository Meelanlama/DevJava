package Interface;

import java.util.ArrayList;

public class Ebook implements Readable{
    private String name;
     ArrayList<String> pages;
    private int pageNumber;

    public Ebook(String name,ArrayList<String> pages){
        this.pageNumber = 0;
        this.name = name;
        this.pages = pages;
    }

    public String getName(){
        return this.name;
    }

    public int pagesSize(){
        return this.pages.size();
    }

    public String read(){
        String page = this.pages.get(this.pageNumber);
        nextPage();
        return page;
    }

    public void nextPage() {
        this.pageNumber = this.pageNumber + 1;
        if (this.pageNumber % this.pages.size() == 0) {
            this.pageNumber = 0;
        }
    }
}

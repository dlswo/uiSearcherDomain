package org.letter.ui;

import org.letter.domain.Store;
import org.letter.searcher.Searcher;

import java.util.List;
import java.util.Scanner;

public abstract class AbstractUI {

    private Searcher searcher;
    private Scanner scanner;

    public AbstractUI() {

        this.scanner = new Scanner(System.in);
    }

    public void setSearcher(Searcher searcher) {
        this.searcher = searcher;
    }

    public String input(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }

    public Searcher getSearcher() {
        return searcher;
    }

    public abstract void doJob();

    public void printResult(List<Store> resultList){


        for (Store store: resultList) {
            System.out.println(store);
        }
    }
}

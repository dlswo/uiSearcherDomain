package org.letter;

import org.letter.searcher.Searcher;
import org.letter.searcher.SearcherFactory;
import org.letter.ui.AbstractUI;
import org.letter.ui.UIFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);

        System.out.println("N or A or D ");

        String str = scanner.nextLine();

        Searcher searcher = SearcherFactory.getSearcher(str);

        AbstractUI ui = UIFactory.getSearcher(str);

        ui.setSearcher(searcher);
        ui.doJob();

    }
}
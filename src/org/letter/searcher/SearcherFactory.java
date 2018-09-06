package org.letter.searcher;

import java.util.HashMap;
import java.util.Map;

public class SearcherFactory {

    private static  Map<String, AbstractSearcher> searcherMap;

    static{
        searcherMap = new HashMap<>();
        searcherMap.put("A", new ASearcher());
        searcherMap.put("N", new NSearcher());
        searcherMap.put("D", new DSearcher());

    }

    public static Searcher getSearcher(String type){

        return searcherMap.get(type);
    }

}

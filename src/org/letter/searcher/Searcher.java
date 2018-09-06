package org.letter.searcher;

import org.letter.domain.Criteria;
import org.letter.domain.Store;

import java.util.List;

public interface Searcher {

    public List<Store> search(Criteria cri);

}

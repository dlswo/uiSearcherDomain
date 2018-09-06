package org.letter.searcher;

import org.letter.domain.Criteria;
import org.letter.domain.Store;

import java.util.List;

public class ASearcher extends AbstractSearcher {
    @Override
    public List<Store> search(Criteria cri) {

        String area = cri.getAreacode();

        return getAreaMap().get(area);

    }
}

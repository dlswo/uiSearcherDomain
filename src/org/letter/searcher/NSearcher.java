package org.letter.searcher;

import org.letter.domain.Criteria;
import org.letter.domain.Store;

import java.util.List;

public class NSearcher extends AbstractSearcher {
    @Override
    public List<Store> search(Criteria cri){

        double lat = cri.getLat();
        double lng = cri.getLng();

        getStoreList().sort((o1,o2) ->{
            double gap1 = Math.sqrt(Math.pow(o1.getLat() - lat,2) + Math.pow(o1.getLng() - lng,2));
            double gap2 = Math.sqrt(Math.pow(o2.getLat() - lat,2) + Math.pow(o2.getLng() - lng,2));

            return gap1 > gap2 ? -1: gap1 < gap2 ? 1: 0;

        });
        return getStoreList();
    }
}

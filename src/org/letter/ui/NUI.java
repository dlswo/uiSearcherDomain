package org.letter.ui;

import org.letter.domain.Criteria;
import org.letter.domain.Store;
import org.letter.searcher.Searcher;

import java.util.List;

public class NUI extends AbstractUI{



    @Override
    public void doJob() {

        double lat = Double.parseDouble(input("위도"));
        double lng = Double.parseDouble(input("경도"));

        Criteria cri = new Criteria();
        cri.setLat(lat);
        cri.setLng(lng);

        printResult(getSearcher().search(cri));

    }
}

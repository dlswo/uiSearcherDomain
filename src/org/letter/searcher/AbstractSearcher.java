package org.letter.searcher;

import org.letter.domain.Store;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

abstract class AbstractSearcher implements  Searcher {

    private  List<Store> storeList;
    private  Map<String, List<Store>> areaMap;

    public AbstractSearcher(){
        storeList = new ArrayList<>();
        areaMap = new HashMap<>();
        for(int i = 1; i <= 4; i++){
            String fileName = "C:\\zzz\\"+i+"_store.txt";
            try{
                InputStream in = new FileInputStream(fileName);
                Scanner scanner = new Scanner(in);

                List<Store> areaList = new ArrayList<>();

                while(true){
                    try{
                        String str = scanner.nextLine();
                        String[] arr = str.split(",");

                        Store obj = new Store();
                        obj.setName(arr[0]);
                        obj.setLat(Double.parseDouble(arr[1]));
                        obj.setLng(Double.parseDouble(arr[2]));
                        obj.setDesc(arr[3]);
                        areaList.add(obj);
                        storeList.add(obj);

                    }catch(Exception e){
                        break;
                    }
                }
                areaMap.put(""+i, areaList);

            }catch(Exception e){

            }
        }

    }


    public  List<Store> getStoreList() {
        return storeList;
    }

    public  Map<String, List<Store>> getAreaMap() {
        return areaMap;
    }

}

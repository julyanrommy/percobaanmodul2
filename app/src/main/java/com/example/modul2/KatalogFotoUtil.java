package com.example.modul2;

import java.util.ArrayList;
import java.util.List;

public class KatalogFotoUtil {
    private static int[] ridArray = {
            R.drawable._510848979697,
            R.drawable._82828282828,
    };

    private static String[] filenameArray = {
            "_510848979697",
            "_82828282828"
    };

    private static List<KatalogFoto> katalogFotoList;

    public static void init(){
        katalogFotoList = new ArrayList<>();
        int nArray = ridArray.length;
        for(int i=0;i<nArray;i++){
            katalogFotoList.add(new KatalogFoto(ridArray[i],filenameArray[i]));
        }
    }

    public static List<KatalogFoto> getKatalogFotoList() {
        return katalogFotoList;
    }

    public static KatalogFoto getKatalogFotoAt(int i){
        return katalogFotoList.get(i);
    }
}

package com.example.modul2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderFotoUtil {
    private static List<OrderFoto> orderFotoList;
    private HashMap<String, Double> hargaMap;

    public void initHargaMap(){
        hargaMap = new HashMap<>();
        hargaMap.put("3R",800.0);
        hargaMap.put("4R",800.0);
        hargaMap.put("8R",800.0);
        hargaMap.put("10R",800.0);
    }

    public void init(){
        orderFotoList = new ArrayList<>();
        initHargaMap();
    }

}

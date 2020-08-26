package com.muflihundev.recipeapp.model;

import java.util.ArrayList;

public class DataResep {

    private static String[] namaResep = {
            "Resep Lontong Ayam",
            "Resep Bubur Ayam",
            "Resep Kuah Ayam",
            "Resep Mie Ayam"
    };
    private static String[] gambarResep = {
            "https://img-global.cpcdn.com/recipes/1713f1285a4d8c52/751x532cq70/opor-ayam-kampung-kuah-lontong-lebaran-foto-resep-utama.jpg",
            "https://img-global.cpcdn.com/recipes/1713f1285a4d8c52/751x532cq70/opor-ayam-kampung-kuah-lontong-lebaran-foto-resep-utama.jpg",
            "https://img-global.cpcdn.com/recipes/1713f1285a4d8c52/751x532cq70/opor-ayam-kampung-kuah-lontong-lebaran-foto-resep-utama.jpg",
            "https://img-global.cpcdn.com/recipes/1713f1285a4d8c52/751x532cq70/opor-ayam-kampung-kuah-lontong-lebaran-foto-resep-utama.jpg"
    };
    private static String[] detailResep = {
            "Bahan-bahan\n" +
                    " 5 porsi\n" +
                    "1/2 kg ayam, potong 5\n" +
                    "1 bh labu siam, potong korek\n" +
                    "4 bh kacang panjang, potong korek\n" +
                    "1 papan tempe kecil, potong korek\n" +
                    "3 bh tahu, potong korek\n" +
                    "Bumbu halus\n" +
                    "6 siung bawang merah\n" +
                    "2 siung bawang putih\n" +
                    "8 siung cabe keriting\n" +
                    "8 siung cabe rawit\n" +
                    "2 bh kemiri sangrai\n" +
                    "2 sdm gula pasir\n" +
                    "2 sdt garam\n" +
                    "1 sdt kaldu jamur\n" +
                    "1/2 bungkus bubuk kaldu ayam (me : rocyo ayam)\n" +
                    "Bumbu lainnya\n" +
                    "2 lembar salam\n" +
                    "1 btg sereh\n" +
                    "1 ruas lengkuas\n" +
                    "2 lembar daun jeruk\n" +
                    "200 ml santan kental\n" +
                    "1 liter air\n" +
                    "Pelengkap\n" +
                    "Bawang goreng\n" +
                    "Sambal\n" +
                    "Kerupuk",
            "Resep Bubur Ayam",
            "Resep Kuah Ayam",
            "Resep Mie Ayam"
    };

    public static ArrayList<ModelResep> getListResep() {

        ArrayList<ModelResep> list = new ArrayList<>();
        for (int position = 0; position < namaResep.length; position++){
            ModelResep modelResep = new ModelResep();
            modelResep.setNamaResep(namaResep[position]);
            modelResep.setDetailResep(detailResep[position]);
            modelResep.setGambarResep(gambarResep[position]);
            list.add(modelResep);
        }
        return list;
    }

}

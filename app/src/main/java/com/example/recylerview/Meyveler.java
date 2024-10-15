package com.example.recylerview;

import java.util.ArrayList;

public class Meyveler {

    private String Meyveismi;
    private int MeyveKalori,MeyveResmi;
    public Meyveler(){}

    public Meyveler(String meyveismi, int meyveKalori, int meyveResmi) {
        Meyveismi = meyveismi;
        MeyveKalori = meyveKalori;
        MeyveResmi = meyveResmi;
    }



    public String getMeyveismi() {
        return Meyveismi;
    }

    public void setMeyveismi(String meyveismi) {
        Meyveismi = meyveismi;
    }

    public int getMeyveKalori() {
        return MeyveKalori;
    }

    public void setMeyveKalori(int meyveKalori) {
        MeyveKalori = meyveKalori;
    }

    public int getMeyveResmi() {
        return MeyveResmi;
    }

    public void setMeyveResmi(int meyveResmi) {
        MeyveResmi = meyveResmi;
    }

    static  public ArrayList<Meyveler> getData(){
        ArrayList<Meyveler> meyvelerList= new ArrayList<Meyveler>(); //  geriye dönen metot oldu
        String[] meyveler={"Muz","Kiraz","Çilek","Elma "};
        int[] kaloriler={15,5,25,20};
        int[]resimler={R.drawable.muz,R.drawable.kiraz,R.drawable.cilek,R.drawable.elma};

        for (int i=0; i<meyveler.length; i++){
            Meyveler meyve= new Meyveler();
            meyve.setMeyveismi(meyveler[i]);
            meyve.setMeyveKalori(kaloriler[i]);
            meyve.setMeyveResmi(resimler[i]);

            meyvelerList.add(meyve);

        }
        return meyvelerList;
    }

}

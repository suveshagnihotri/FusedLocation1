package com.koove.mphasis.fusedlocation;

/**
 * Created by MphasiS on 1/21/2016.
 */
public class Location {

    String _langitude;
    String _lattitude;
    public Location(){

    }

    public Location(String langitude, String lattitute){

        this._langitude=langitude;
        this._lattitude=lattitute;
    }

    public String getLangitude(){
     return this._langitude;
    }
    public void setLangitude(String langitude){

        this._langitude=langitude;
    }
   public String getLattitude(){
       return this._lattitude;
   }
    public void setLattitude(String lattitude){


        this._lattitude=lattitude;

    }
}

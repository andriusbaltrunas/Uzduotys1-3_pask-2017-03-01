package com.kcs.firstLecture.bolt;

/**
 * Created by User on 2017-02-27.
 */
public class Bolt {
    private int sriegis = 0;

    private boolean isSave(){
        boolean response = true;
        if(sriegis >= 5){
           response = false;
        }
        return response;
    }

    public void prisukti(){
        boolean val = isSave();
        if (val) {
            sriegis++;
        }else {
            System.out.println("Jau gana!!!");
        }
    }

    public void atsukti(){
        if(sriegis > 0) {
            sriegis--;
        }else {
            System.out.println("Neisuktas");
        }
    }
}

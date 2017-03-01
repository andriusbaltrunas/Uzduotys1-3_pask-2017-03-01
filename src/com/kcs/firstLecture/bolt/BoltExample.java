package com.kcs.firstLecture.bolt;

/**
 * Created by User on 2017-02-27.
 */
public class BoltExample {
    public static void main(String[] args) {
        Bolt bolt = new Bolt();

        bolt.prisukti();

       // bolt.atsukti();

        /* Kai metodas loop nestatinis
        BoltExample example = new BoltExample();
        example.loop(bolt);*/

        loop(bolt);
    }

    private static void loop(Bolt bolt){
        for(int i = 0; i <= 5; i++ ){
            bolt.prisukti();
        }
    }
}

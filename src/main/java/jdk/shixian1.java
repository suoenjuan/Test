package main.java.jdk;

import java.util.ArrayList;
import java.util.List;

public class shixian1 implements jdk181 {

    @Override
    public double calaulate(int a) {
        System.out.println("jdk1811=="+jdk1811);
        return jdk1811.calaulate(a);
    }


    jdk181 jdk1811=new jdk181() {//???????
        @Override
        public double calaulate(int a) {
            return sqat(a * 10);
        }
    };

}

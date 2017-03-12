package com.github.punkkk.tpo1;

/**
 * Created by dart on 12.03.17.
 */
public class App {
    public static void main( String[] args )
    {
        ArctgPowerSeries arctg = new ArctgPowerSeries();
        System.out.println( arctg.getArctg( 1., 0.001) );
    }
}

package com.github.punkkk.tpo1;

public class ArctgPowerSeries
{
    private Double getSeriesMember(Double x, int n){
        Double dividend = Math.pow(-1, ( n - 1 )) * Math.pow(x, ( 2 * n - 1));
        Double divider = 2 * (double)n - 1;
        return dividend / divider;
    }
    public Double getArctg(Double value, Double accuracy){
        Expect.notNullArgument(value, "value", "ArctgPowerSeries.getArctg value can not be null");
        Expect.notNullArgument(accuracy, "accuracy", "ArctgPowerSeries.getArctg accuracy can not be null");
        Double result = 0.;
        Double newMember = 0.;
//        Double oldResult = Double.MAX_VALUE;
        for (int i = 1; Math.abs(newMember = this.getSeriesMember(value, i)) > accuracy; i++) {
            result += newMember;
//            result += this.getSeriesMember(value, i);
        }
        return result;
    }
}

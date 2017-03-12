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
        Double result = this.getSeriesMember(value, 1);
        Double oldResult = Double.MAX_VALUE;
        for (int i = 2; Math.abs(oldResult - result) > accuracy; i++) {
            oldResult = result;
            result += this.getSeriesMember(value, i);
        }
        return result;
    }
}

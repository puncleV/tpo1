package com.github.punkkk.tpo1;

  class ArctgPowerSeries
{
    private Double getSeriesMember(Double x, int n){
        Double dividend = Math.pow(-1, ( n - 1 )) * Math.pow(x, ( 2 * n - 1));
        Double divider = 2 * (double)n - 1;
        return dividend / divider;
    }
    public Double getArctg(Double value, Double error){
        Expect.notNullArgument(value, "value", "ArctgPowerSeries.getArctg value can not be null");
        Expect.notNullArgument(error, "error", "ArctgPowerSeries.getArctg error can not be null");
        Double newMember, result = 0.;
        for (int i = 1; Math.abs(newMember = this.getSeriesMember(value, i)) > error; i++) {
            result += newMember;
        }
        return result;
    }
}

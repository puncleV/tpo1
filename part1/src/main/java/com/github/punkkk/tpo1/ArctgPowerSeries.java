package com.github.punkkk.tpo1;

  class ArctgPowerSeries
      extends PowerSeries
{
    public ArctgPowerSeries(double argumentValue, double error) {

        super(Expect.absLesserThanOne( argumentValue, "argumentValue", "ArctgPowerSeries: |argumentValue| must be <= 1"), error);
//        if(this.argumentValue < 0) {
//            this.minus = true;
//            this.argumentValue = -1. * this.argumentValue;
//        }
    }

    private Double getNthSeriesMember(int n){
        Double dividend = Math.pow(-1, ( n - 1 )) * Math.pow(this.argumentValue, ( 2 * n - 1));
        Double divider = 2 * (double)n - 1;
        return dividend / divider;
    }
    public Double getValue() {
        Double result = 0.;
        for (int i = 1; Math.abs(this.getNthSeriesMember(i)) > this.error; i++) {
            result += this.getNthSeriesMember(i);
        }
//        if(this.minus)
//            result = -1. * result;
        return result;
    }
//    boolean minus = false;
}

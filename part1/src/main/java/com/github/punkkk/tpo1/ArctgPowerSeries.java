package com.github.punkkk.tpo1;

  class ArctgPowerSeries
      extends PowerSeries
{
    public ArctgPowerSeries(double argumentValue, double error) {
        super(argumentValue, error);
    }
    @Override
    public void setError(double error){
        super.setError(Expect.positiveNotZero(error, "error", "ArctgPowerSeries.setError: error must be bigger than 0"));
    }
    @Override
    public void setArgumentValue(double argumentValue){
        super.setArgumentValue(Expect.absLesserThanOne( argumentValue, "argumentValue.setArgumentValue", "ArctgPowerSeries: |argumentValue| must be <= 1"));
    }

    private Double getNthSeriesMember(int n){
        Double dividend = Math.pow(-1, ( n - 1 )) * Math.pow(this.argumentValue, ( 2 * n - 1));
        Double divider = 2 * (double)n - 1;
        return dividend / divider;
    }
    public Double calculate() {
        Double result = 0.d;
        for (int i = 1; Math.abs(this.getNthSeriesMember(i)) > this.error; i++) {
            result += this.getNthSeriesMember(i);
        }
        return result;
    }
}

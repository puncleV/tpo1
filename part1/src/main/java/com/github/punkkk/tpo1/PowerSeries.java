package com.github.punkkk.tpo1;

public class PowerSeries {
    public PowerSeries(double argumentValue, double error) {
        this.setArgumentValue(argumentValue);
        this.setError(error);
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    public double getArgumentValue() {
        return argumentValue;
    }

    public void setArgumentValue(double argumentValue) {
        this.argumentValue = argumentValue;
    }

    double error = 0;
    double argumentValue = 0;
}

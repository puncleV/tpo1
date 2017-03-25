package com.github.punkkk.tpo1;

public class PowerSeries {
    public PowerSeries(double argumentValue, double error) {
        this.error = Expect.notNullArgument(error, "error", "PowerSeries: error can not be null");
        this.argumentValue = Expect.notNullArgument(argumentValue, "argumentValue", "PowerSeries: value can not be null");
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

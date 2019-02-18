package ee.taltech.itcolledge.cars;

public class GasTank {

    private Double gasoline;

    public GasTank() {
        gasoline = 0.0;
    }


    public void addGas(double l) {
        gasoline += l;
    }

    public void consumeGas(double i) {
        gasoline -= i;
    }

    public Double getGasoline() { return gasoline; }
}

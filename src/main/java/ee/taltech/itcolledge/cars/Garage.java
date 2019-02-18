package ee.taltech.itcolledge.cars;

public class Garage {

    private Car car;
    private Molecule molecule;

    public Garage() {
        molecule = new Molecule();
        car = new Car();
    }

    public Car getCar() {
        return car;
    }

    public Molecule getMolecule() {
        return molecule;
    }
}

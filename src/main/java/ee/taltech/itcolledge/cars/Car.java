package ee.taltech.itcolledge.cars;

public class Car {

    private Molecule molecule;
    private Engine engine;

    public Car() {
        molecule = new Molecule();
        engine = new Engine();
    }

    public Engine getEngine() {
        return engine;
    }

    public Molecule getMolecule() {
        return molecule;
    }
}

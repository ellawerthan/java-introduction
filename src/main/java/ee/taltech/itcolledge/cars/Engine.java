package ee.taltech.itcolledge.cars;

public class Engine {

    private Gasoline gasoline;
    private Molecule molecule;

    public Engine() {
        gasoline = new Gasoline();
        molecule = new Molecule();
    }

    public Gasoline getGasoline() {
        return gasoline;
    }

    public Molecule getMolecule() {
        return molecule;
    }
}

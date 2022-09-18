public class Bagpipes extends SuperInstrument {

    int pipeNumber;
    public Bagpipes(InstrumentType instrumentType, Double purchasePrice, Double salePrice, String colour, int pipeNumber) {
        super(instrumentType, purchasePrice, salePrice, colour);
        this.pipeNumber = pipeNumber;
    }

    public int getPipeNumber() {
        return this.pipeNumber;
    }

    @Override
    public String play() {
        return "You're on the Royal Mile/Princes Street";
    }
}

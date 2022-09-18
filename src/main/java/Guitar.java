public class Guitar extends Instrument {

    private GuitarType guitarType;
    private int stringNumber;

    public Guitar(InstrumentType instrumentType, Double purchasePrice, Double salePrice, String colour, GuitarType guitarType, int stringNumber) {
        super(instrumentType, purchasePrice, salePrice, colour);
        this.guitarType = guitarType;
        this.stringNumber = stringNumber;

    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    @Override
    public String play() {
        return "Oh it's just a little song called Stairway To Heaven, have you heard of it?";
    }

}

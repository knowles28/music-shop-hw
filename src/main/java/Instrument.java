public class Instrument implements IPlay, ISell {

    InstrumentType instrumentType;
    Double purchasePrice;
    Double salePrice;
    String colour;

    public Instrument(InstrumentType instrumentType, Double purchasePrice, Double salePrice, String colour) {
        this.instrumentType = instrumentType;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.colour = colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public String getColour() {
        return colour;
    }

    public void setSalePrice(double newPrice){
        this.salePrice = newPrice;
    }

    public String play() {
        return "MUSIC SOUNDS MUSIC SOUNDS";
    }

    public double calculateMarkup() {
        return getSalePrice() - getPurchasePrice();
    }
}

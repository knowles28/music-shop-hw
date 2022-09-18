public class Accessory implements ISell {

    Double purchasePrice;
    Double salePrice;

    Instrument associatedInstrument;

    public Accessory(Double purchasePrice, Double salePrice,Instrument associatedInstrument) {
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.associatedInstrument = associatedInstrument;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public Instrument getAssociatedInstrument() {
        return associatedInstrument;
    }

    public void setSalePrice(Double newSalePrice) {
        this.salePrice = newSalePrice;
    }

    public void setAssociatedInstrument(Instrument associatedInstrument) {
        this.associatedInstrument = associatedInstrument;
    }

    public double calculateMarkup() {
        return getSalePrice() - getPurchasePrice();
    }
}

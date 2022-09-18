public abstract class SuperAccessory implements ISell {

    Double purchasePrice;
    Double salePrice;

    SuperInstrument associatedInstrument;

    public SuperAccessory(Double purchasePrice, Double salePrice, SuperInstrument associatedInstrument) {
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

    public SuperInstrument getAssociatedInstrument() {
        return associatedInstrument;
    }

    public void setSalePrice(Double newSalePrice) {
        this.salePrice = newSalePrice;
    }

    public void setAssociatedInstrument(SuperInstrument associatedInstrument) {
        this.associatedInstrument = associatedInstrument;
    }

    public double calculateMarkup() {
        return getSalePrice() - getPurchasePrice();
    }
}

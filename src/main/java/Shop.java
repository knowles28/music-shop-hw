import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private double till;

    public Shop(double till) {
        this.stock = new ArrayList<ISell>();
        this.till = till;
    }

//    USE STREAMS??
    public int getStockSize() {
        return this.stock.size();
    }

    public double getTillTotal() {
        return this.till;
    }

    public void setTill(double newTill) {
        this.till = newTill;
    }

    public void buyStockItem(SuperInstrument newItem){
        this.stock.add(newItem);
        setTill(this.till - newItem.purchasePrice);

    }

    public void buyStockItem(SuperAccessory newItem){
        this.stock.add(newItem);
        setTill(this.till - newItem.purchasePrice);

    }

    public void sellStockItem(SuperInstrument currentItem){
        this.stock.remove(currentItem);
        setTill(this.till + currentItem.salePrice);
    }

    public void sellStockItem(SuperAccessory currentItem){
        this.stock.remove(currentItem);
        setTill(this.till + currentItem.salePrice);
    }

    public double calculateProfitFromCurrentStock(){
        double profit = 0.00;
        for (ISell stockItem: this.stock){
            profit += stockItem.calculateMarkup();
        }
        return profit;
    }


}

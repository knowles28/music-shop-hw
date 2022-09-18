import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    private ArrayList<ISell> stock;
    private double till;

    private HashMap<Integer, Customer> customerDB;

    public Shop(double till) {
        this.stock = new ArrayList<ISell>();
        this.till = till;
        this.customerDB = new HashMap<>();
    }

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


    public HashMap<Integer, Customer> getCustomerDB() {
        return customerDB;
    }

    public void addCustomerToCustomerDB(Integer customerNumber, Customer customer){
        this.customerDB.put(customerNumber, customer);
    }

    public String getCustomersFavouriteInstrument(Integer customerNumber){
        if(this.customerDB.containsKey(customerNumber)){
            return "Favourite instrument: " + this.customerDB.get(customerNumber).getFavouriteInstrument();
        } else {
            return "Sorry, customer number " + customerNumber + " is not in the database";
        }
    }

}

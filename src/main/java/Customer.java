public class Customer {

    String name;
    String email;
    String favouriteInstrument;

    public Customer(String name, String email, String favouriteInstrument) {
        this.name = name;
        this.email = email;
        this.favouriteInstrument = favouriteInstrument;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFavouriteInstrument() {
        return this.favouriteInstrument;
    }
}

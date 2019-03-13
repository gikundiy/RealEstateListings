package muchaiClasses;

public class Property {
    private double askingPrice;
    private String propertyType;
    private double lotSize;
    private int numBaths;
    private int numBeds;
    public Property (double askingPrice, String properTytype, double lotSize ){
        this.askingPrice = askingPrice;
        this.propertyType = properTytype;
        this.lotSize = lotSize;
        this.numBaths = 0;
        this.numBeds  = 0;
    }
    public String toString() {
        return "Asking price: $" + askingPrice +
                "\nProperty Type: " + propertyType +
                "\nLot Size: " + lotSize +
                "\nNumber of bedrooms: " +numBeds +
                "\nNumber of bathrooms: " + numBaths;
    }
}

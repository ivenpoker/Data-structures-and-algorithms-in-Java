package Book_1.Exercises.Exercise_3_12;

public class Invoice {

    private String _partNumber;
    private String _partDescription;
    private int    _quantity;
    private double _pricePerItem;

    public Invoice(String newPartNumber, String newPartDescription,
                   int newQuantity, double newPricePerItem) {
        this._partNumber      = newPartNumber;
        this._partDescription = newPartDescription;
        if (newQuantity > 0.0) {
            this._quantity = newQuantity;
        } else {
            this._quantity = 0;
        }
        if (newPricePerItem > 0.0) {
            this._pricePerItem = newPricePerItem;
        } else {
            this._pricePerItem = 0;
        }
    }

    public void setPartNumber(String newPartNumber) {
        this._partNumber = newPartNumber;
    }

    public void setPartDescription(String newPartDescription) {
        this._partDescription = newPartDescription;
    }

    public void setQuantity(int newQuantity) {
        if (newQuantity > 0.0) {
            this._quantity = newQuantity;
        } else {
            this._quantity = 0;
        }
    }

    public void setPricePerItem(double newPricePerItem) {
        this._pricePerItem = newPricePerItem;
    }

    public double getInvoiceAmount() {
        return this._quantity * this._pricePerItem;
    }

    public String getPartNumber() {
        return this._partNumber;
    }

    public String getPartDescription() {
        return this._partDescription;
    }

    public int getQuantity() {
        return this._quantity;
    }

    public double getPricePerItem() {
        return this._pricePerItem;
    }





}

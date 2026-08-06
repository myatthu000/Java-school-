// Invoice.java
public class Invoice{
    String PartDescription;
    String PartNumber;
    int Quantity;
    Double PricePerItem;

    public Invoice(String PartDes, String PNumber, int Qty, Double Price){
        PartDescription = PartDes;
        PartNumber = PNumber;
        Quantity = Qty;
        PricePerItem = Price;
    }

    // public Invoice(){
    //     //
    // }

    void setPartDescription(String Desp){
        PartDescription = Desp;
    }
    String getPartDescrion(){
        return PartDescription;
    }

    void setPartNumber(String PNumber){
        PartNumber = PNumber;
    }
    String getPartNumber(){
        return PartNumber;
    }

    void setQuantity(int Qty){
        if(Qty >0 ){
            Quantity = Qty;
        }
    }
    int getQuantity(){
        return Quantity;
    }

    void setPricePerItem(Double Price){
        if (Price > 0) {
            PricePerItem = Price;
        }
    }
    Double getPricePerItem(){
        return PricePerItem;
    }

    Double getInvoiceAccount(){
        return getQuantity()*getPricePerItem();
    }

}
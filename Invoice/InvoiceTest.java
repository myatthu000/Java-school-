// InvoiceTest.java
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Samsung", "0123456", 19, 1000.5);
        System.out.printf("PartDescription= %s\n Part Number= %s\n Quantity= %d\n Price Per Item= %.2f\n Total Amount of Price=%.2f \n", invoice.getPartDescrion(), invoice.getPartNumber(), invoice.getQuantity(), invoice.getPricePerItem(), invoice.getInvoiceAccount());

        Invoice invoice1 = new Invoice(null, null, 0, null);
        invoice1.setPartDescription("MI");
        invoice1.setPartNumber("444555666");
        invoice1.setQuantity(14);
        invoice1.setPricePerItem(45.50);
        
        System.out.printf("PartDescription= %s\n Part Number= %s\n Quantity= %d\n Price Per Item= %.2f\n Total Amount of Price=%.2f \n", invoice1.getPartDescrion(), invoice1.getPartNumber(), invoice1.getQuantity(), invoice1.getPricePerItem(), invoice1.getInvoiceAccount());


    }
}

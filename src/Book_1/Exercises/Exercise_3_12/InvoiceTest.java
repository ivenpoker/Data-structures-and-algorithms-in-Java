package Book_1.Exercises.Exercise_3_12;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("11223", "Handler", 3, 3000);
        Invoice invoice2 = new Invoice("UI67D3F", "Back Light Keyboard", 4, 3000);

        // displaying information for invoice1....

        System.out.printf("Invoice1 details....%n%n");
        System.out.printf("Item part number:      %s%n", invoice1.getPartNumber());
        System.out.printf("Item part description: %s%n", invoice1.getPartDescription());
        System.out.printf("Item quantity:         %d%n", invoice1.getQuantity());
        System.out.printf("Item price per item:   $%.2f%n", invoice1.getPricePerItem());

        // displaying information for invoice2....

        System.out.printf("Invoice1 details....%n%n");
        System.out.printf("Item part number:      %s%n", invoice2.getPartNumber());
        System.out.printf("Item part description: %s%n", invoice2.getPartDescription());
        System.out.printf("Item quantity:         %d%n", invoice2.getQuantity());
        System.out.printf("Item price per item:   $%.2f%n", invoice2.getPricePerItem());

    }

}

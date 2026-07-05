package ElectricBill;
import java.util.Scanner;

public class MeterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Meter Unit : ");
        int totalUnit = scanner.nextInt();
        
        System.out.println("--------------------------------------------------");
        System.out.printf("%-3s %-12s %-6s %-6s %-10s\n", "No", "UnitLayer", "Cost", "Unit", "Price");
        System.out.println("--------------------------------------------------");
        
        int remainingUnit = totalUnit;
        int totalPrice = 0;
        int countedUnit = 0;
        
        // Layer 1: 0 - 50 (Cost: 50)
        if (remainingUnit > 0) {
            int unit1;
            if (remainingUnit > 50) {
                unit1 = 50;
            } else {
                unit1 = remainingUnit;
            }
            
            int price1 = unit1 * 50;
            remainingUnit -= unit1;
            countedUnit += unit1;
            totalPrice += price1;
            System.out.printf("%-3d %-12s %-6s %-6d %-10s\n", 1, "0-50", "50K", unit1, price1 + "K");
        }
        
        // Layer 2: 51 - 100 (Cost: 100)
        if (remainingUnit > 0) {
            int unit2;
            if (remainingUnit > 50) {
                unit2 = 50;
            } else {
                unit2 = remainingUnit;
            }
            
            int price2 = unit2 * 100;
            remainingUnit -= unit2;
            countedUnit += unit2;
            totalPrice += price2;
            System.out.printf("%-3d %-12s %-6s %-6d %-10s\n", 2, "51-100", "100K", unit2, price2 + "K");
        }
        
        // Layer 3: 101 - 200 (Cost: 150)
        if (remainingUnit > 0) {
            int unit3;
            if (remainingUnit > 100) {
                unit3 = 100; // 101 မှ 200 အထိ Layer သတ်မှတ်ချက်က ၁၀၀ စာဖြစ်လို့ပါ
            } else {
                unit3 = remainingUnit;
            }
            
            int price3 = unit3 * 150;
            remainingUnit -= unit3;
            countedUnit += unit3;
            totalPrice += price3;
            System.out.printf("%-3d %-12s %-6s %-6d %-10s\n", 3, "101-200", "150K", unit3, price3 + "K");
        }
        
        // Layer 4: >200 ကျော်သွားခဲ့ရင်
        if (remainingUnit > 0) {
            int priceExtra = remainingUnit * 150;
            countedUnit += remainingUnit;
            totalPrice += priceExtra;
            System.out.printf("%-3d %-12s %-6s %-6d %-10s\n", 4, ">200", "150K", remainingUnit, priceExtra + "K");
        }
        
        System.out.println("--------------------------------------------------");
        System.out.printf("%-23s %-6d %-10s\n", "Total", countedUnit, totalPrice + "K");
        System.out.println("--------------------------------------------------");
        
        scanner.close();
    }
}
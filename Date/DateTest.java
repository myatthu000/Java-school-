package Date;

public class DateTest {
    public static void main(String[] args) {
        
        Date d = new Date(6,16,2026);
        System.out.print("Date: ");
        d.displayDate();

        d.setDay(20);
        d.setMonth(6);
        d.setYear(2026);

        System.out.println("----- After using setter method -----");
        // System.out.println("Month: " + d.getMonth());
        // System.out.println("Day: " + d.getDay());
        // System.out.println("Year: " + d.getYear());

        d.displayDate();

    }
}

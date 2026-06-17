public class EmployeeTest {
    
    public static void main(String[] args) {
        Employee employee1 = new Employee("Min", "Thuta", 500000.0);
        Employee employee2 = new Employee("Hsu", "Myat", 600000.0);

        System.out.println("-----Salary of Employee-----");
        System.out.printf("Yearly Salary of %s %s: %.2f%n",
            employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary()*12
        );
        System.out.printf("Yearly Salary of %s %s: %.2f%n",
            employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary()*12
        );

        System.out.println("-----Salary of Employee after 10% raise-----");

        // employee1.setMonthlySalary(employee1.getMonthlySalary()*1.10);
        // employee2.setMonthlySalary(employee2.getMonthlySalary()*1.10);

        double currentSalary1 = employee1.getMonthlySalary();
        double raiseSalary1 = currentSalary1 * 0.10;
        double newSalary1 = currentSalary1 + raiseSalary1;
        employee1.setMonthlySalary(newSalary1);

        double currentSalary2 = employee2.getMonthlySalary();
        double raiseSalary2 = currentSalary2 * 0.10;
        double newSalary2 = currentSalary2 + raiseSalary2;
        employee2.setMonthlySalary(newSalary2);


        System.out.printf("(New) Yearly Salary of %s %s: %.2f%n",
            employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary()*12
        );
        System.out.printf("(New) Yearly Salary of %s %s: %.2f%n",
            employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary()*12
        );

    }
}

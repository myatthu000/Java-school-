public class Employee{

    private String first_name;
    private String last_name;
    private Double monthly_salary;

    public Employee(String first_name, String last_name, double monthly_salary){
        this.first_name = first_name;
        this.last_name = last_name;

        if(monthly_salary > 0.0){
            this.monthly_salary = monthly_salary;
        }else{
            this.monthly_salary = 0.0;
        }
    }

    public void setFirstName(String first_name){
        this.first_name = first_name;
    }

    public String getFirstName(){
        return first_name;
    }

    public void setLastName(String last_name){
        this.last_name = last_name;
    }

    public String getLastName(){
        return last_name;
    }

    public void setMonthlySalary(double monthly_salary){
        if(monthly_salary>0.0){
            this.monthly_salary = monthly_salary;
        }else {
            this.monthly_salary = 0.0;
        }
    }

    public double getMonthlySalary(){
        return monthly_salary;
    }

}
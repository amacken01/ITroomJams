public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
    public Employee(int baseSalary){
        this(baseSalary,0);
    }

    public int calculateWage(int hoursWorked){
        return baseSalary + getHourlyRate()*hoursWorked;
    }
    // overloading calculateWage to work with no inputs
    // in Python we would have one method with a default value (0)
    public int calculateWage(){
        return calculateWage(0);
    }
    private int getBaseSalary(){
        return this.baseSalary;
    }
    private void setBaseSalary(int baseSalary){
        if(baseSalary < 0){
            throw new IllegalArgumentException("Base Salary must be greater than 0.");
        }
        this.baseSalary = baseSalary;

    }
    private int getHourlyRate(){
        return this.hourlyRate;
    }
    private void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0){
            throw new IllegalArgumentException("Hourly Rate must be greater than 0.");
        }
        this.hourlyRate = hourlyRate;
    }
    // With the addition of a constructor, the setters have been made private, to reduce coupling.
}
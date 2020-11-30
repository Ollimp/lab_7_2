public class ReportItem {
    private Employee employee;
    private Integer workUnits;
    private Integer tax;
    private Boolean isOffshore;
    private Integer salaryType; // 0 - ставка, 1 - почасовая, 2 - сдельная
    private Integer salary;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax() {
        if (this.salaryType == 0 || this.salaryType == 1)
            this.tax = 20;
        else
            this.tax = 15;
        if (this.employee.getHasKids() != null){
            if (!this.employee.getHasKids())
                this.tax+= 5;
        }

        if (this.getOffshore() != null){
            if (this.getOffshore()){
                this.tax = 0;
            }
        }
    }

    public Integer getWorkUnits() {
        return workUnits;
    }

    public void setWorkUnits(Integer workUnits) {
        this.workUnits = workUnits;
    }

    public Boolean getOffshore() {
        return isOffshore;
    }

    public void setOffshore(Boolean offshore) {
        isOffshore = offshore;
    }

    public Integer getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(Integer salaryType) {
        this.salaryType = salaryType;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public ReportItem(){}

    public ReportItem(Employee employee, Integer tax, Integer workUnits, Boolean isOffshore, Integer salaryType, Integer salary) {
        this.employee = employee;
        this.tax = tax;
        this.workUnits = workUnits;
        this.isOffshore = isOffshore;
        this.salaryType = salaryType;
        this.salary = salary;
    }
}

public class Employee {
    private String fullName;
    private Boolean hasKids;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getHasKids() {
        return hasKids;
    }

    public void setHasKids(Boolean hasKids) {
        this.hasKids = hasKids;
    }

    public Employee(String fullName, Boolean hasKids) {
        this.fullName = fullName;
        this.hasKids = hasKids;
    }

    public Employee(){}

}

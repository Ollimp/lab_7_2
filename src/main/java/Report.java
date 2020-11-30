import java.util.List;

public class Report {
    private List<ReportItem> reportItemList;

    public List<ReportItem> getreportItemList() {
        return reportItemList;
    }

    public void setReportItemList(List<ReportItem> reportItemList) {
        this.reportItemList = reportItemList;
    }

    public Report(){}

    public Report(List<ReportItem> reportItemList) {
        this.reportItemList = reportItemList;
    }

    public void printReportOne(){
        Integer total = 0;
        System.out.println("Name    |   Salary type     |       Sum(hrn)");
        System.out.println("____________________________________________");
        for (ReportItem reportItem : this.reportItemList){
            System.out.print(reportItem.getEmployee().getFullName() + "     ");
            if (reportItem.getSalaryType() == 0)
                System.out.print("  Wage              ");
            else if (reportItem.getSalaryType() == 1)
                System.out.print("  Hourly            ");
            else if (reportItem.getSalaryType() == 2)
                System.out.print("  Piece             ");
            System.out.println(reportItem.getSalary() * reportItem.getWorkUnits());
            total+= reportItem.getSalary() * reportItem.getWorkUnits();
        }
        System.out.println("Total: " + total);
    }

    public void printReportTwo(){
        System.out.println("Name    |   Tax     |       Sum(hrn)    |       To be paid(hrn)");
        System.out.println("_______________________________________________________________");
        for (ReportItem reportItem : this.reportItemList){
            System.out.print(reportItem.getEmployee().getFullName() + "         ");
            System.out.print(reportItem.getTax() + "%                ");
            System.out.print(reportItem.getSalary() * reportItem.getWorkUnits() + "             ");
            System.out.println((reportItem.getSalary() * reportItem.getWorkUnits()) / 100 * (100 - reportItem.getTax()));
        }
    }

    public void printReportFour(){
        System.out.println("Name    |   Tax     |       Sum(hrn)    |       To be paid(hrn/toogriks)");
        System.out.println("________________________________________________________________________");
        for (ReportItem reportItem : this.reportItemList){
            System.out.print(reportItem.getEmployee().getFullName() + "         ");
            System.out.print(reportItem.getTax() + "%                ");
            System.out.print(reportItem.getSalary() * reportItem.getWorkUnits() + "             ");
            if (reportItem.getSalaryType() != 1)
                System.out.println((reportItem.getSalary() * reportItem.getWorkUnits()) / 100 * (100 - reportItem.getTax()) + "     ");
            else {
                System.out.print((reportItem.getSalary() * reportItem.getWorkUnits()) / 100 * (100 - reportItem.getTax()) / 2);
                System.out.print('/');
                System.out.println((reportItem.getSalary() * reportItem.getWorkUnits()) / 100 * (100 - reportItem.getTax()) / 16);
            }
        }
    }

    public void printReportSix(Integer premium){
        System.out.println("Name    |   Tax     |       Sum(hrn)    |       To be paid(hrn/toogriks)");
        System.out.println("________________________________________________________________________");
        for (ReportItem reportItem : this.reportItemList){
            System.out.print(reportItem.getEmployee().getFullName() + "         ");
            System.out.print(reportItem.getTax() + "%                ");
            if (reportItem.getSalaryType() == 1 && !reportItem.getOffshore() && reportItem.getWorkUnits() >= 200)
                System.out.print((reportItem.getSalary() * reportItem.getWorkUnits() + premium) + "             ");
            else
                System.out.print(reportItem.getSalary() * reportItem.getWorkUnits() + "             ");
            if (reportItem.getSalaryType() != 1)
                System.out.println((reportItem.getSalary() * reportItem.getWorkUnits()) / 100 * (100 - reportItem.getTax()) + "     ");
            else {
                System.out.print((reportItem.getSalary() * reportItem.getWorkUnits()) / 100 * (100 - reportItem.getTax()) / 2);
                System.out.print('/');
                System.out.println((reportItem.getSalary() * reportItem.getWorkUnits()) / 100 * (100 - reportItem.getTax()) / 16);
            }
        }
    }
}

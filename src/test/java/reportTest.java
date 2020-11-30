import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class reportTest {
    @Test
    public void testReportOne(){
        System.out.println("Report one:");
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.setFullName("Ivanov");
        employee2.setFullName("Petrov");
        employee3.setFullName("Sidorov");
        ReportItem item1 = new ReportItem();
        ReportItem item2 = new ReportItem();
        ReportItem item3 = new ReportItem();
        item1.setEmployee(employee1);
        item2.setEmployee(employee2);
        item3.setEmployee(employee3);
        item1.setSalary(1000);
        item1.setSalaryType(0);
        item1.setWorkUnits(20);
        item2.setSalary(100);
        item2.setSalaryType(1);
        item2.setWorkUnits(130);
        item3.setSalary(2000);
        item3.setSalaryType(2);
        item3.setWorkUnits(3);
        List<ReportItem> reportItemList = new ArrayList<>();
        reportItemList.add(item1);
        reportItemList.add(item2);
        reportItemList.add(item3);
        Report report = new Report(reportItemList);
        report.printReportOne();
    }

    @Test
    public void testReportTwo(){
        System.out.println("Report two:");
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.setFullName("Ivanov");
        employee2.setFullName("Petrov");
        employee3.setFullName("Sidorov");
        ReportItem item1 = new ReportItem();
        ReportItem item2 = new ReportItem();
        ReportItem item3 = new ReportItem();
        item1.setEmployee(employee1);
        item2.setEmployee(employee2);
        item3.setEmployee(employee3);
        item1.setSalary(1000);
        item1.setSalaryType(0);
        item1.setWorkUnits(20);
        item2.setSalary(100);
        item2.setSalaryType(1);
        item2.setWorkUnits(130);
        item3.setSalary(2000);
        item3.setSalaryType(2);
        item3.setWorkUnits(3);
        item1.setTax();
        item2.setTax();
        item3.setTax();
        List<ReportItem> reportItemList = new ArrayList<>();
        reportItemList.add(item1);
        reportItemList.add(item2);
        reportItemList.add(item3);
        Report report = new Report(reportItemList);
        report.printReportTwo();
    }

    @Test
    public void testReportThree(){
        System.out.println("Report three:");
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.setFullName("Ivanov");
        employee2.setFullName("Petrov");
        employee3.setFullName("Sidorov");
        employee1.setHasKids(true);
        employee2.setHasKids(false);
        employee3.setHasKids(true);
        ReportItem item1 = new ReportItem();
        ReportItem item2 = new ReportItem();
        ReportItem item3 = new ReportItem();
        item1.setEmployee(employee1);
        item2.setEmployee(employee2);
        item3.setEmployee(employee3);
        item1.setSalary(1000);
        item1.setSalaryType(0);
        item1.setWorkUnits(20);
        item2.setSalary(100);
        item2.setSalaryType(1);
        item2.setWorkUnits(130);
        item3.setSalary(2000);
        item3.setSalaryType(2);
        item3.setWorkUnits(3);
        item1.setTax();
        item2.setTax();
        item3.setTax();
        List<ReportItem> reportItemList = new ArrayList<>();
        reportItemList.add(item1);
        reportItemList.add(item2);
        reportItemList.add(item3);
        Report report = new Report(reportItemList);
        report.printReportTwo();
    }

    @Test
    public void testReportFour(){
        System.out.println("Report four:");
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.setFullName("Ivanov");
        employee2.setFullName("Petrov");
        employee3.setFullName("Sidorov");
        employee1.setHasKids(true);
        employee2.setHasKids(false);
        employee3.setHasKids(true);
        ReportItem item1 = new ReportItem();
        ReportItem item2 = new ReportItem();
        ReportItem item3 = new ReportItem();
        item1.setEmployee(employee1);
        item2.setEmployee(employee2);
        item3.setEmployee(employee3);
        item1.setSalary(1000);
        item1.setSalaryType(0);
        item1.setWorkUnits(20);
        item2.setSalary(100);
        item2.setSalaryType(1);
        item2.setWorkUnits(130);
        item3.setSalary(2000);
        item3.setSalaryType(2);
        item3.setWorkUnits(3);
        item1.setTax();
        item2.setTax();
        item3.setTax();
        List<ReportItem> reportItemList = new ArrayList<>();
        reportItemList.add(item1);
        reportItemList.add(item2);
        reportItemList.add(item3);
        Report report = new Report(reportItemList);
        report.printReportFour();
    }

    @Test
    public void testReportFive(){
        System.out.println("Report five:");
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.setFullName("Ivanov");
        employee2.setFullName("Petrov");
        employee3.setFullName("Sidorov");
        employee1.setHasKids(true);
        employee2.setHasKids(false);
        employee3.setHasKids(true);
        ReportItem item1 = new ReportItem();
        ReportItem item2 = new ReportItem();
        ReportItem item3 = new ReportItem();
        item1.setEmployee(employee1);
        item2.setEmployee(employee2);
        item3.setEmployee(employee3);
        item1.setSalary(1000);
        item1.setSalaryType(0);
        item1.setWorkUnits(20);
        item1.setOffshore(true);
        item2.setSalary(100);
        item2.setSalaryType(1);
        item2.setWorkUnits(130);
        item2.setOffshore(false);
        item3.setSalary(2000);
        item3.setSalaryType(2);
        item3.setWorkUnits(3);
        item3.setOffshore(false);
        item1.setTax();
        item2.setTax();
        item3.setTax();
        List<ReportItem> reportItemList = new ArrayList<>();
        reportItemList.add(item1);
        reportItemList.add(item2);
        reportItemList.add(item3);
        Report report = new Report(reportItemList);
        report.printReportFour();
    }

    @Test
    public void testReportSix(){
        System.out.println("Report six:");
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        employee1.setFullName("Ivanov");
        employee2.setFullName("Petrov");
        employee3.setFullName("Sidorov");
        employee4.setFullName("Bodrov");
        employee1.setHasKids(true);
        employee2.setHasKids(false);
        employee3.setHasKids(true);
        employee4.setHasKids(true);
        ReportItem item1 = new ReportItem();
        ReportItem item2 = new ReportItem();
        ReportItem item3 = new ReportItem();
        ReportItem item4 = new ReportItem();
        item1.setEmployee(employee1);
        item2.setEmployee(employee2);
        item3.setEmployee(employee3);
        item4.setEmployee(employee4);
        item1.setSalary(1000);
        item1.setSalaryType(0);
        item1.setWorkUnits(20);
        item1.setOffshore(true);
        item2.setSalary(100);
        item2.setSalaryType(1);
        item2.setWorkUnits(130);
        item2.setOffshore(false);
        item3.setSalary(2000);
        item3.setSalaryType(2);
        item3.setWorkUnits(3);
        item3.setOffshore(false);
        item4.setSalary(100);
        item4.setSalaryType(1);
        item4.setWorkUnits(205);
        item4.setOffshore(false);
        item1.setTax();
        item2.setTax();
        item3.setTax();
        item4.setTax();
        List<ReportItem> reportItemList = new ArrayList<>();
        reportItemList.add(item1);
        reportItemList.add(item2);
        reportItemList.add(item3);
        reportItemList.add(item4);
        Report report = new Report(reportItemList);
        report.printReportSix(3000);
    }
}

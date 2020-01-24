package company;

public class Expenditure {

    private double purchases;
    private double serviceCharge;
    private double salaries;
    private double adminAndDocumentation;

    public Expenditure(double purchases, double serviceCharge, double salaries, double adminAndDocumentation) {
        this.purchases = purchases;
        this.serviceCharge = serviceCharge;
        this.salaries = salaries;
        this.adminAndDocumentation = adminAndDocumentation;
    }

    public double getPurchases() {
        return purchases;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public double getSalaries() {
        return salaries;
    }

    public double getAdminAndDocumentation() {
        return adminAndDocumentation;
    }
}

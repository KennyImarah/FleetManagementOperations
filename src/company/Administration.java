package company;

public class Administration extends Expenditure{

    private String vehicleId;
    private String licenseType;
    private double insuranceCost;
    private double operationCost;


    public String getVehicleId() {
        return vehicleId;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    public double getOperationCost() {
        return operationCost;
    }

    public Administration(double purchases, double serviceCharge, double salaries, double adminAndDocumentation,
                          String vehicleId, String licenseType, double insuranceCost, double operationCost) {
        super(purchases, serviceCharge, salaries, adminAndDocumentation);
        this.vehicleId = vehicleId;
        this.licenseType = licenseType;
        this.insuranceCost = insuranceCost;
        this.operationCost = operationCost;


    }




    public Administration(double purchases, double serviceCharge, double salaries, double adminAndDocumentation) {
        super(purchases, serviceCharge, salaries, adminAndDocumentation);
    }
}

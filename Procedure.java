package PatientApplication;

public class Procedure {
    // Attributes
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharge;

    // No-arg constructor
    public Procedure() {
        this.procedureName = "";
        this.procedureDate = "";
        this.practitionerName = "";
        this.procedureCharge = 0.0;
    }

    // Constructor with procedure name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = "";
        this.procedureCharge = 0.0;
    }

    // Constructor with all attributes
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharge) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharge = procedureCharge;
    }

    // Accessor methods (getters)
    public String getProcedureName() {
        return procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public double getProcedureCharge() {
        return procedureCharge;
    }

    // Mutator methods (setters)
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public void setProcedureCharge(double procedureCharge) {
        this.procedureCharge = procedureCharge;
    }

    // toString method to display all information of the procedure
    @Override
    public String toString() {
        return procedureName + "\t" 
             + procedureDate + "\t" 
             + practitionerName + "\t$" 
             + String.format("%.2f", procedureCharge);
    }
}
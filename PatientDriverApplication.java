package PatientApplication;

public class PatientDriverApplication {
    public static void main(String[] args) {
        // Creating a Patient object
        Patient patient = new Patient(
                "Joe", "Bideenn", "Sa", 
                "234 Taklen Street", "Mytown", "VA", "1234", 
                "777-555-1212", "Bill Santori", "301-987-6755");

        // Creating Procedure objects using different constructors
        Procedure procedure1 = new Procedure("X-ray", "07/20/2019", "Dr. Jameson", 5500.43);
        Procedure procedure2 = new Procedure("Physical Exam", "07/20/2019", "Dr. Irvine", 3250.00);
        Procedure procedure3 = new Procedure("Blood Test", "07/20/2019", "Dr. Smith", 1400.75);

        // Display Patient information
        displayPatient(patient);
        
        // Display Procedure information
        displayProcedure(procedure1);
        System.out.println();
        displayProcedure(procedure2);
        System.out.println();
        displayProcedure(procedure3);
        System.out.println();

        // Calculate and display total charges
        double totalCharges = procedure1.getProcedureCharge() 
                            + procedure2.getProcedureCharge() 
                            + procedure3.getProcedureCharge();
        System.out.printf("Total Charges: $%,.2f%n", totalCharges);

        // Student information
        System.out.println("\nStudent Name: Ange Stephy");
        System.out.println("MC21177595");
        System.out.println("Due Date: 03/03/2025");
    }

    // Method to display patient details
    public static void displayPatient(Patient patient) {
        System.out.println(patient);
    }

    // Method to display procedure details
    public static void displayProcedure(Procedure procedure) {
        System.out.println("Procedure: " + procedure.getProcedureName());
        System.out.println("Procedure Date: " + procedure.getProcedureDate());
        System.out.println("Practitioner: " + procedure.getPractitionerName());
        System.out.printf("Charges: $%,.2f%n", procedure.getProcedureCharge()); // Fixed here
    }
}
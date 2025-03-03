package PatientApplication;

public class Patient {
    // Attributes
    private String firstName, middleName, lastName;
    private String address, city, state, zipCode;  // Corrected 'adress' to 'address', and 'code' to 'zipCode'
    private String phoneNumber;
    private String emergencyContactName, emergencyContactPhone;
    
    // Constructor to initialize all attributes
    public Patient(String firstName, String middleName, String lastName, String address, String city, String state, String zipCode,
                   String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }
    
    // Method to get the full name
    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // Method to get the full address
    public String getAddress() {
        return address + ", " + city + ", " + state + " " + zipCode;
    }

    // Method to get emergency contact details
    public String getEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    // Override toString method to display all information
    @Override
    public String toString() {
        return "Patient Info: \n\n" +
                "Name: " + getFullName() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Phone: " + phoneNumber + "\n" +  // Adding phone number in toString
                "Emergency Contact: " + getEmergencyContact();
    }
}
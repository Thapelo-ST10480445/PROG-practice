// 3. THE SUBCLASS
public class StaffHiring extends Staff {
    
    public StaffHiring(int staffNumber, String staffLocation) {
        super(staffNumber, staffLocation); // MUST be first line
    }
    
    @Override
    public String getStaffHiringProcess() {
        if (staffNumber < 20) {
            return "YES";
        } else {
            return "NO";
        }
    }
    
    // REQUIRED BY THE QUESTION
    public void printStaffHiring() {
        System.out.println("STAFF HIRING REPORT");
        System.out.println("*************************");
        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER: " + getStaffNumber());
        System.out.println("HIRE STAFF: " + getStaffHiringProcess());
        System.out.println("*************************");
    }
}
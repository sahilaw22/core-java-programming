/* 5. Hospital Management System  */

class Patient {
    private int patientId;
    protected String disease;

    public Patient(int p,String d) {
        patientId = p;
        disease = d;
    }

    public String getDetails() {
        return "Patient ID: " + patientId + "\nDisease: " + disease;
    }
}
class DoctorAccess extends Patient {
    public DoctorAccess(int p, String d){
        super(p,d);
    }
    public String checkDisease() {
        return disease;
    }

}
public class SET4P5 {
    public static void main(String[] args) {
        System.out.println("--Hospital Management System--");
        DoctorAccess[] patients = new DoctorAccess[2];

        patients[0] = new DoctorAccess(1100, "Diabetes");
        System.out.println("Patient No.1\tDisease: " + patients[0].checkDisease());


        patients[1] = new DoctorAccess(1101, "Cancer");
        System.out.println("Patient No.2\tDisease: " + patients[1].checkDisease());

        System.out.println("\n==Patient Details==");
        for (DoctorAccess p : patients) {
            System.out.println(p.getDetails());
        }
    }
}
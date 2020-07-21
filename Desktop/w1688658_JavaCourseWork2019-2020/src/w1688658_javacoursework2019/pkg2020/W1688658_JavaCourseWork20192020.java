package w1688658_javacoursework2019.pkg2020;

public class W1688658_JavaCourseWork20192020 {

    static final int maxParkingSlots = 50;
    public static void main(String[] args) {
        VehicleRentalManager manager1 = new WestminsterVehicleRentalManager(maxParkingSlots);
        boolean exit  = false;
        
        while(!exit){
            exit = manager1.managersMenu();
        }
        
    }
    
}

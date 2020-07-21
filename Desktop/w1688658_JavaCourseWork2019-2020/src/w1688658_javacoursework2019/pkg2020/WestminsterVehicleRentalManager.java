package w1688658_javacoursework2019.pkg2020;
import java.io.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author hady
 */
public class WestminsterVehicleRentalManager implements VehicleRentalManager{
    Scanner scan = new Scanner(System.in);
    protected ArrayList<Vehicle> vehicleList;
    protected int maxParking;
    
    
   public  WestminsterVehicleRentalManager(int listLength){
       this.maxParking = listLength;
       vehicleList = new ArrayList<Vehicle>();
       
   } 

    @Override
    public void addVehicle(Vehicle vehicle) {
        if (vehicleList.size() <= maxParking){
            vehicleList.add(vehicle);
            maxParking--;
            System.out.println("Vehicle Added Successfully, number of parking spaces left is " +maxParking);
            
        }
        else{
            System.out.println("ERROR!! No more Parking Space Available.");
        }
    }

    @Override
    public void deleteVehicle() {
        if(vehicleList.size() != 0){
            String plateNumber = "";
            System.out.println("Please Enter the plate number for vehicle you want to remove ? ");
            plateNumber = scan.next();
            if(plateNumber.equals(0)){
                System.out.println("ERROR!! invalid Plate Number.");
            }
            else{
                boolean found = false;
                for(int i = 0; i<vehicleList.size(); i++){
                    if(vehicleList.get(i).getPlateNumber().equalsIgnoreCase(plateNumber)){
                        System.out.println("Vehicle " + vehicleList.get(i).getPlateNumber() + "is removed Successfully.");
                        vehicleList.remove(i);
                        maxParking++;
                        
                        System.out.println("Number of Parking Slots Available are " +maxParking);
                        found = true;
                    }
                }
                if (!found){
                    System.out.println("ERROR!!! No vehicle matches the entred plate number.");
                }
            }
        }
        else{
            System.out.println("Error!! No vehicles Available to delete, PLease Update the stock.");
        }
    }

    @Override
    public void printVehicleList() {
        Collections.sort(vehicleList);
        if(vehicleList.size() != 0){
            for(int i = 0; i<vehicleList.size(); i++){
                if(vehicleList.get(i).getVehicleType().equalsIgnoreCase("Car")){
                    System.out.println("Vehicle: Car, Plate-Number " +vehicleList.get(i).getPlateNumber() +", Make " +vehicleList.get(i).getMake());
                }
                else if(vehicleList.get(i).getVehicleType().equalsIgnoreCase("MotorBike")){
                    System.out.println("Vehicle: Motorbike, Plate-Number " +vehicleList.get(i).getPlateNumber() +", Make " +vehicleList.get(i).getMake());
                }
            }
        }
        else{
            System.out.println("ERROR!! No Vehicle found.");
        }
        
        
    
    }

    @Override
    public void storeInFile() {
        
        System.out.println("Please Enter  A Name for file to store your Data: ");
        String FileNamex = scan.next(); // Save User Input (Name for the file)
        
        try (PrintWriter PrintFile = new PrintWriter(FileNamex)) { // Exceptional Handling (Try  & Catch)
            
        for (int i = 0; i<vehicleList.size(); i++) {
        PrintFile.println(vehicleList.get(i).toString());
        }
        PrintFile.close();
        System.out.println("File Created Successfully");
        }
        catch (IOException ex) { //Error Handler to dsplaty the message if there's an Error
        System.out.println("Error!! File Name Already Exixts" +ex);
        } 

    }
    
    
    
    @Override
    public void openGUI() {
        
        WestminsterRentalVehicle Table = new WestminsterRentalVehicle(vehicleList);
        Table.setVisible(true);
        
    }

    @Override
    public boolean managersMenu() {
        boolean exit = false;
        boolean isDouble;
        boolean isInt;
        System.out.println("|--Westminster vehicle Rental System--|\n");
        System.out.println("|-------Westminster Rental Vehicle Manager Window-------|");
        System.out.println("Please Enter 'A' to Add Vehicle: ");
        System.out.println("Please Enter 'D' to Delete Vehicle: ");
        System.out.println("Please Enter 'P' to Print vehicle List: ");
        System.out.println("Please Enter 'S' to Save Data to a file: ");
        System.out.println("Please Enter 'O' to open GUI: ");
        System.out.println("Please Enter 'Q' to Quit: ");

        
        String options = scan.next();

        
        
        switch(options){
            case "A":
                System.out.println("Press'C' to add a Car: ");
                System.out.println("Press 'B' to add a Motorbike :");
                
                String vOptions = scan.next();
                
                System.out.println("Please Enter 'COLOUR' of the Vehicle: ");
                String color = scan.next();
                System.out.println("Please Enter 'MAKE' of the Vehicle: ");
                String make = scan.next();
                System.out.println("Please Enter 'MODEL' of the Vehicle: ");
                String model = scan.next();
                System.out.println("Please Enter 'PLATE-NUMBER' of the Vehicle: ");
                String plateNumber = scan.next();
                System.out.println("Please Enter 'MILEAGE' of the Vehicle: ");
                double mileage = 0.0;
                do{
                    if(scan.hasNextDouble()){
                        mileage = scan.nextDouble();
                        isDouble = true;
                    }
                    else{
                        System.out.println("Please  Re-enter & make sure it's numbers: ");
                        isDouble = false;
                        scan.next();
                    }
                    
                }
                while(!(isDouble));
                
                
                
                switch(vOptions){
                    case "C": // if its a car
                        System.out.println("Please Enter 'Car-Category': ");
                        String carCategory = scan.next();
                        System.out.println("Please Enter 'Number of Seats': ");
                        int numberOfSeats = 0;
                        do{
                            if(scan.hasNextInt()){
                                numberOfSeats = scan.nextInt();
                                isInt = true;
                            }
                            else{
                                System.out.println("Plese Re-enter & make sure it's number: ");
                                isInt = false;
                                scan.next();
                            }
                        }
                        while(!(isInt));
                        System.out.println("Please Enter 'Number of Doors': ");
                        int numberOfDoors =0;
                        do{
                            if(scan.hasNextInt()){
                                numberOfDoors = scan.nextInt();
                                isInt = true;
                            }
                            else{
                                System.out.println("Plese Re-enter & make sure it's number: ");
                                isInt = false;
                                scan.next();
                            }
                        }
                        while(!(isInt));                        
                        
                        Car a1 = new Car(color, make, model, plateNumber, mileage, carCategory, numberOfSeats, numberOfDoors);
                        a1.setColor(color);
                        a1.setMake(make);
                        a1.setModel(model);
                        a1.setPlateNumber(plateNumber);
                        a1.setMileage(mileage);
                        this.addVehicle(a1);
                        break;
                        
                        
                    case "B":
                        System.out.println("Please Enter 'Motorbike-Type': ");
                        String bikeType = scan.next();
                        System.out.println("Please Enter 'Engine-Size': ");
                        String engineSize = scan.next();
                        System.out.println("Enter Motor Bikes 'Number of Trnsmissions': ");
                        int numTransmission = 0;
                        do{
                            if(scan.hasNextInt()){
                                numTransmission = scan.nextInt();
                                isInt = true;
                            }
                            else{
                                System.out.println("Plese Re-enter & make sure it's number: ");
                                isInt = false;
                                scan.next();
                            }
                        }
                        while(!(isInt));                        
                        Motorbike b1 = new Motorbike(color, make, model, plateNumber, mileage, bikeType, engineSize, numTransmission);
                        b1.setColor(color);
                        b1.setMake(make);
                        b1.setModel(model);
                        b1.setPlateNumber(plateNumber);
                        b1.setMileage(mileage);
                        this.addVehicle(b1);
                        break;
                           
                }
                break;
                
            case "D":
                System.out.println("Deleting Vechiles");
                deleteVehicle();
                break;
            
            case "P":
                System.out.println("Printing Vehicle");
                printVehicleList();
                break;
                
            case "S":
                System.out.println("Saving File");
                storeInFile();
                break;
                
            case "O":
                System.out.println("Opening GUI,,,,,,");
                openGUI();
                break;
                
            case "Q":
                System.out.println("Are you sure you want to exit 'Y/N': ");
                String close = scan.next();
                if(close.equalsIgnoreCase("Y")){
                    exit = true;
                    break;
                }
                else{
                   managersMenu();
                }
                
            default:
                System.out.println("Please Chosse from the options provided!!!");
        }

       return exit; 
    }

    
    
    
}

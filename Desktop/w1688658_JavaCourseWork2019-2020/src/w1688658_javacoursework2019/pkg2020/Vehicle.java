package w1688658_javacoursework2019.pkg2020;

public abstract class Vehicle implements Comparable<Vehicle> {
    protected String color;
    protected String make;
    protected String model;
    protected String plateNumber;
    protected double mileage;
    protected Schedule currentSchedule;    
    
    public Vehicle(){
        
    }
    
    public Vehicle(String color, String make, String model, String plateNumber, double mileage, Schedule currentSchedule){
        this.color = color;
        this.make = make;
        this.model = model;
        this.plateNumber = plateNumber;
        this.mileage = mileage;
        this.currentSchedule = currentSchedule;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    
    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return make;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    
    public void setPlateNumber(String plateNumber){
        this.plateNumber = plateNumber;
    }
    public String getPlateNumber(){
        return plateNumber;
    }
    
    public void setMileage(double mileage){
        this.mileage = mileage;
    }
    public double getMileage(){
        return mileage;
    }
    
    public void setSchedule(Schedule currentSchedule){
        this.currentSchedule = currentSchedule;
    }
    
    public Schedule getSchedule(){
        return currentSchedule;
    }
    
    public abstract String getVehicleType();
    
    
    public int compareTo(Vehicle veh){
        return(this.make.compareTo(veh.make));
    }

    
    @Override
    public String toString(){
        return "The requested Vehicle colour is " +getColor() + ", Make of the vehicle is " +getMake() + ", the Model is " +getModel()
                + ", Plate Number is " +getPlateNumber() + "and Millege on vehicle are " +getMileage() +".";
    }
    
}

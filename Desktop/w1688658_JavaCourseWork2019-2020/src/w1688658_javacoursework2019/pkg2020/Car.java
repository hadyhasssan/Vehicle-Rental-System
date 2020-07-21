package w1688658_javacoursework2019.pkg2020;;

public class Car extends Vehicle {
    
    protected String carCategory;
    protected int numberOfSeats;
    protected int numberOfDoors;
    
    //Conatructor without any parameter
    public Car(){
        super();
    }
    
    //Parametrized Constractor
    public Car(String carCatagory, int numberOfSeats, int numberOfDoors){
        super();
        this.carCategory = carCatagory;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        
    }
    
    //Parametrized Constractor with super class constructor parameter included
    public Car (String color, String make, String model, String plateNumber, double mileage, 
            String carCategory, int numberOfSeats, int numberOfDoors){
        super();
        this.color = color;
        this.make = make;
        this.model = model;
        this.plateNumber = plateNumber;
        this.mileage = mileage;
        this.carCategory = carCategory;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;

    }
    
        public void setCarCategory(String carCategory){
            this.carCategory = carCategory;
        }
        public String getCarCategory(){
            return carCategory;
        }
        
        
        public void setNumberOfSeats(int numberOfSeats){
            this.numberOfSeats = numberOfSeats;
        }
        public int getNumberOfSeats(){
            return numberOfSeats;
        }
        
        
        public void setNumberOfDoors(int numberOfDoors){
            this.numberOfDoors = numberOfDoors;
        }
        public int getNumberOfDoors(){
            return numberOfDoors;
        }
         
    
    
    
        
        
    @Override
    public String toString(){
        return super.toString() + "The Car Category is " +getCarCategory() + ", Number of seats are " +getNumberOfSeats()
                + ", Number of seats are " +getNumberOfDoors() +".";
    } 

    @Override
    public String getVehicleType() {
        return("Car");
    }
    

    
}

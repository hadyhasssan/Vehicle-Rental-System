package w1688658_javacoursework2019.pkg2020;

public class Motorbike extends Vehicle {

    protected String bikeType;
    protected String engineSize;
    protected int numTransmission;
    
    
        //Conatructor without any parameter
    public Motorbike(){
        super();
    }
    
    //Parametrized Constractor
    public Motorbike(String bikeType, String engineSize, int numTransmission){
        super();
        this.bikeType = bikeType;
        this.engineSize = engineSize;
        this.numTransmission = numTransmission;

        
    }
    
    //Parametrized Constractor with super class constructor parameter included
    public Motorbike (String color, String make, String model, String plateNumber, double mileage,
            String bikeType, String engineSize, int numTransmission){
        super();
        this.color = color;
        this.make = make;
        this.model = model;
        this.plateNumber = plateNumber;
        this.mileage = mileage;
        this.bikeType = bikeType;
        this.engineSize = engineSize;
        this.numTransmission = numTransmission;
    }
    
    public void setBikeType(String bikeType){
        this.bikeType = bikeType;
    }
    public String getBikeType(){
        return bikeType;
    }
    
    
    public void setEngineSize(String engineSize){
        this.engineSize = engineSize;
    }
    public String getEngineSize(){
        return engineSize;
    }


    public void setNumTransmission(int numTransmission){
        this.numTransmission = numTransmission;
    }
    public int getNumTransmission(){
        return numTransmission;
    } 
    
    
    @Override
    public String toString(){
        return super.toString() + "The Bike Type is " +getBikeType() + ", Engine Size of the bike is " +getEngineSize()
                + ", Number of Transmissions this bike has are " +getNumTransmission() +".";
    }

    @Override
    public String getVehicleType() {
        return ("Motorbike");
    }
    
    
}

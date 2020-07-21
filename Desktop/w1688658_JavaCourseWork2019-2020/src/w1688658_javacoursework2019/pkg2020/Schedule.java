package w1688658_javacoursework2019.pkg2020;
import w1688658_javacoursework2019.pkg2020.Date;

public class Schedule extends Vehicle {
    protected Date pickUpDate;
    protected Date dropOffDate;
    
    
    
    
    
    public Schedule(){
    }
    
    public Schedule(Date pickUpDate, Date dropOffDate){
        this.pickUpDate = pickUpDate;
        this.dropOffDate = dropOffDate;
    }
    
    
    
    public void setPickUpDate(Date pickUpDate){
        this.pickUpDate = pickUpDate;
    }
    public Date getPickUpDate(){
        return pickUpDate;
    }
    
    
    public void setDropOffDate(Date dropOffDate){
        this.dropOffDate = dropOffDate;
    }
    public Date getDropOffDate(){
        return dropOffDate;
    }
    
   

    @Override
    public String toString(){
        return "The pickup Date is " +getPickUpDate() + ", the Drop Off Date is " +getDropOffDate();
    }

    @Override
    public String getVehicleType() {
        return "";
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1688658_javacoursework2019.pkg2020;

/**
 *
 * @author hady
 */
public interface VehicleRentalManager {
    public abstract void addVehicle(Vehicle vehicle);
    public abstract void deleteVehicle();
    public abstract void printVehicleList();
    public abstract void storeInFile();
    public abstract void openGUI();
    public abstract boolean managersMenu();
    
    
}

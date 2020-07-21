/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1688658_javacoursework2019.pkg2020;

import javax.swing.table.*;
import java.util.*;

/**
 *
 * @author hady
 */
public class ModelTable extends AbstractTableModel {
    
    private ArrayList<Vehicle> list;
    private String[] columnsNames = {"Make", "Model", "Plate-Number", "Vehicle-Type", "Avalibility-Status"}; 
    
    
    
    public ModelTable(ArrayList <Vehicle> Vehicles){
        list = Vehicles;
    }
    

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnsNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp = null;
        switch (columnIndex) {
            case 0:
                temp = list.get(rowIndex).getMake();
                break;
            case 1:
                temp = list.get(rowIndex).getModel();
                break;
            case 2:
                temp = list.get(rowIndex).getPlateNumber();
                break;
            case 3:
                temp = list.get(rowIndex).getVehicleType();
                break;
            case 4:
                if(list.get(rowIndex).currentSchedule == null){
                    temp = "Available";
                }
                else{
                    temp = "Already Booked";
                }   break;
            default:
                break;
        }
        return temp;
    }
    
    
    
    @Override
    public String getColumnName(int col){
        return columnsNames[col];
        
    } 
    
}

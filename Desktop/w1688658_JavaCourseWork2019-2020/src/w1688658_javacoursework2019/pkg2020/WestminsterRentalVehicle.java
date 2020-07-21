/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1688658_javacoursework2019.pkg2020;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author hady
 */
class WestminsterRentalVehicle extends JFrame{

    JTable guiTable;
    ModelTable tableModel;
    ArrayList<Vehicle> vehicleList;

    // contructor
    public WestminsterRentalVehicle(ArrayList<Vehicle> vehicleList){
        this.vehicleList = vehicleList;
        tableModel = new ModelTable(vehicleList);
        guiTable =  new JTable(tableModel);

        setBounds(10,10,850,700); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        guiTable.setAutoCreateRowSorter(true); 

        JScrollPane scrollPane = new JScrollPane(guiTable); 
        scrollPane.setPreferredSize(new Dimension(600,400)); 

        JPanel panel = new JPanel(); 
        panel.add(scrollPane); 
        add(panel,BorderLayout.CENTER); 

        JPanel p2 = new JPanel(); 
        p2.add(new JButton("Book Vehicle"));
        add(p2,BorderLayout.SOUTH);
        panel.add(p2,BorderLayout.SOUTH);

    }


}
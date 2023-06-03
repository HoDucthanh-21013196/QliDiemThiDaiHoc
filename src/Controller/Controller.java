/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vietsiuucute
 */
public interface Controller {
    <T> void writetoFile (List<T> list, String fileName);
    
    <T> List<T> readDatafromFile(String fileName);

//    <T> List<T> searchByName(List<T> list, String fileName);
//    
//    <T> void sortByName(List<T> list);
//    
//    <T> void sortByID(List<T> list);
     
    
    <T> void showData(List<T> Data, DefaultTableModel model);
}

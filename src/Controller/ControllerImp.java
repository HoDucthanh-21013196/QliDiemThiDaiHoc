/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vietsiuucute
 */
public class ControllerImp implements Controller{

    private Component parentComponent;

    @Override
    public <T> void writetoFile(List<T> list, String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileOutputStream fos =  new FileOutputStream(file) ;
            ObjectOutputStream oos = new ObjectOutputStream(fos) ;
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();           
        }
    }

    @Override
    public <T> List<T> readDatafromFile(String fileName) {
        List<T> list = new ArrayList<>();
        File file = new File(fileName);
        if(file.length() > 0){
           try{
            file.createNewFile();
            FileInputStream fos =  new FileInputStream(file) ;
            ObjectInputStream oos = new ObjectInputStream(fos) ;
            Object o = oos.readObject();
            list = (List<T>) o;
            oos.close();
            fos.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        }
        return list;
    }

//    @Override
//    public <T> List<T> searchByName(List<T> list, String fileName) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    public QuanLy getManager(List<QuanLy> managers,KhachHang kh){
//        for(QuanLy ql : managers){
//            if(ql.getKhachhang().getPhone().equals(kh.getPhone())){
//                return ql;
//            }
//        }
//        return null;
//    }
//    public void add(List<QuanLy> managers,KhachHang kh,Sim s){
//        QuanLy m = this.getManager(managers, kh);
//        if(m == null){
//            QuanLy man = new QuanLy(kh, s);
//            managers.add(man);
//        }else{
//            JOptionPane.showMessageDialog(parentComponent, "Khách hàng đã tồn tại trong bảng"); 
//            
//        }
// 
//    }
//    
//    public boolean add_test(List<QuanLy> managers,KhachHang kh,Sim s){
//        QuanLy m = this.getManager(managers, kh);
//        if(m == null){
//            QuanLy man = new QuanLy(kh, s);
//            managers.add(man);
//        }else{
//            JOptionPane.showMessageDialog(parentComponent, "Khách hàng đã tồn tại trong bảng"); 
//            return false;           
//        }
//        return true;
//    }
//    
//    @Override
//    public <T> void showData(List<T> Data, DefaultTableModel model) {
//    }
//
//    @Override
//    public <T> void sortByName(List<T> list) {
//        list.sort(new Comparator<T>() {
//            @Override
//            public int compare(T o1, T o2) {
//                if(o1 instanceof QuanLy){
//                    QuanLy q1 = (QuanLy) o1;
//                    QuanLy q2 = (QuanLy) o2;
//                    String fullName1 = q1.getKhachhang().getName().trim();
//                    String fullName2 = q2.getKhachhang().getName().trim();
//                    String name = fullName1.substring(fullName1.lastIndexOf(" "));
//                    String name2 = fullName2.substring(fullName2.lastIndexOf(" "));
//                    return name.compareTo(name2);
//                }
//                return 0;
//            }
//        });
//    }
//
//    @Override
//    public <T> void sortByID(List<T> list) {
//        list.sort(new Comparator<T>() {
//            @Override
//            public int compare(T o1, T o2) {
//                if(o1 instanceof QuanLy){
//                    QuanLy q1 = (QuanLy) o1;
//                    QuanLy q2 = (QuanLy) o2;                   
//                    return Integer.parseInt(q2.getKhachhang().getId())  - Integer.parseInt(q1.getKhachhang().getId());
//                }
//                return 0;
//            }
//        });
//    }

    @Override
    public <T> void showData(List<T> Data, DefaultTableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

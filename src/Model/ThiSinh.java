/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class ThiSinh implements Serializable {
    private String sbd;
    private String ten_thi_sinh;
    private Date ngay_sinh;
    private String gioi_tinh;
    private String tinh; 
    private String sdt;
    private String khoi_thi;
    private static int sId = 100000;
    
    public ThiSinh() {
        
    }
    
    public ThiSinh(String sbd, String ten_thi_sinh) {
        this.sbd = sbd;
        this.ten_thi_sinh = ten_thi_sinh;
    }

    public ThiSinh(String sbd, String ten_thi_sinh, Date ngay_sinh, String gioi_tinh, String tinh, String sdt, String khoi_thi) {
        this.sbd = sbd;
        this.ten_thi_sinh = ten_thi_sinh;
        this.ngay_sinh = ngay_sinh;
        this.gioi_tinh = gioi_tinh;
        this.tinh = tinh;
        this.sdt = sdt;
        this.khoi_thi = khoi_thi;
    }
    

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getTen_thi_sinh() {
        return ten_thi_sinh;
    }

    public void setTen_thi_sinh(String ten_thi_sinh) {
        this.ten_thi_sinh = ten_thi_sinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getKhoi_thi() {
        return khoi_thi;
    }

    public void setKhoi_thi(String khoi_thi) {
        this.khoi_thi = khoi_thi;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public static int getsId() {
        return sId;
    }

    public static void setsId(int sId) {
        ThiSinh.sId = sId;
    }

    
}

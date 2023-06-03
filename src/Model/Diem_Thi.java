/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class Diem_Thi extends ThiSinh implements Serializable {
//    private int sbd;
//    private String ho_ten;
    private String khoi_thi;
    private float Diem_Toan, Diem_Van, Diem_Anh,Diem_Vli, Diem_Hoa, Diem_Sinh,
            Diem_Su, Diem_Dli, Diem_Gdcd, Diem_Tohop;
    private static int sId = 100000;
    
    public Diem_Thi() {}
    
    public Diem_Thi(String sbd, String ten_thi_sinh) {
        super(sbd, ten_thi_sinh);
    }

    public Diem_Thi(String sbd, String ten_thi_sinh, String khoi_thi, float Diem_Toan, 
            float Diem_Van, float Diem_Anh, float Diem_Tohop) {
        super(sbd, ten_thi_sinh);
        this.khoi_thi = khoi_thi;
        this.Diem_Toan = Diem_Toan;
        this.Diem_Van = Diem_Van;
        this.Diem_Anh = Diem_Anh;
        this.Diem_Tohop = Diem_Tohop;
    }

    public Diem_Thi(String sbd, String ten_thi_sinh, String khoi_thi, float Diem_Toan, 
            float Diem_Van, float Diem_Anh, float Diem_Vli, float Diem_Hoa, 
            float Diem_Sinh, float Diem_Su, float Diem_Dli, float Diem_Gdcd, float Diem_Tohop) {
        super(sbd, ten_thi_sinh);
        this.khoi_thi = khoi_thi;
        this.Diem_Toan = Diem_Toan;
        this.Diem_Van = Diem_Van;
        this.Diem_Anh = Diem_Anh;
        this.Diem_Vli = Diem_Vli;
        this.Diem_Hoa = Diem_Hoa;
        this.Diem_Sinh = Diem_Sinh;
        this.Diem_Su = Diem_Su;
        this.Diem_Dli = Diem_Dli;
        this.Diem_Gdcd = Diem_Gdcd;
        this.Diem_Tohop = Diem_Tohop;
    }

//    public int getSbd() {
//        return sbd;
//    }
//
//    public void setSbd(int sbd) {
//        this.sbd = sbd;
//    }
//
//    public String getHo_ten() {
//        return ho_ten;
//    }
//
//    public void setHo_ten(String ho_ten) {
//        this.ho_ten = ho_ten;
//    }

    public String getKhoi_thi() {
        return khoi_thi;
    }

    public void setKhoi_thi(String khoi_thi) {
        this.khoi_thi = khoi_thi;
    }

    public float getDiem_Toan() {
        return Diem_Toan;
    }

    public void setDiemToan(float Diem_Toan) {
        this.Diem_Toan = Diem_Toan;
    }

    public float getDiem_Van() {
        return Diem_Van;
    }

    public void setDiem_Van(float Diem_Van) {
        this.Diem_Van = Diem_Van;
    }

    public float getDiem_Anh() {
        return Diem_Anh;
    }

    public void setDiem_Anh(float Diem_Anh) {
        this.Diem_Anh = Diem_Anh;
    }

    public float getDiem_Tohop() {
        return Diem_Tohop;
    }

    public void setDiem_Tohop(float Diem_Tohop) {
        this.Diem_Tohop = Diem_Tohop;
    }

    public float getDiem_Vli() {
        return Diem_Vli;
    }

    public void setDiem_Vli(float Diem_Vli) {
        this.Diem_Vli = Diem_Vli;
    }

    public float getDiem_Hoa() {
        return Diem_Hoa;
    }

    public void setDiem_Hoa(float Diem_Hoa) {
        this.Diem_Hoa = Diem_Hoa;
    }

    public float getDiem_Sinh() {
        return Diem_Sinh;
    }

    public void setDiem_Sinh(float Diem_Sinh) {
        this.Diem_Sinh = Diem_Sinh;
    }

    public float getDiem_Su() {
        return Diem_Su;
    }

    public void setDiem_Su(float Diem_Su) {
        this.Diem_Su = Diem_Su;
    }

    public float getDiem_Dli() {
        return Diem_Dli;
    }

    public void setDiem_Dli(float Diem_Dli) {
        this.Diem_Dli = Diem_Dli;
    }

    public float getDiem_Gdcd() {
        return Diem_Gdcd;
    }

    public void setDiem_Gdcd(float Diem_Gdcd) {
        this.Diem_Gdcd = Diem_Gdcd;
    }
    
    public static int getsId() {
        return sId;
    }

    public static void setsId(int sId) {
        Diem_Thi.sId = sId;
    }
}

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
public class ThongTinPhongThi extends ThiSinh implements Serializable {
//    private int sbd;
//    private String ho_ten;
    private String phongthi;
    private String dia_diem_thi;
    private String nguoi_giam_ho;
    private static int sId = 100000;
    
    public ThongTinPhongThi() {
        
    }
    
    public ThongTinPhongThi(String sbd, String ten_thi_sinh) {
        super(sbd, ten_thi_sinh);
    }

    public ThongTinPhongThi(String sbd, String ten_thi_sinh, String phongthi, String dia_diem_thi, String nguoi_giam_ho) {
       super(sbd, ten_thi_sinh);
        this.phongthi = phongthi;
        this.dia_diem_thi = dia_diem_thi;
        this.nguoi_giam_ho = nguoi_giam_ho;
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

    public String getPhongthi() {
        return phongthi;
    }

    public void setPhongthi(String phongthi) {
        this.phongthi = phongthi;
    }

    public String getDia_diem_thi() {
        return dia_diem_thi;
    }

    public void setDia_diem_thi(String dia_diem_thi) {
        this.dia_diem_thi = dia_diem_thi;
    }

    public String getNguoi_giam_ho() {
        return nguoi_giam_ho;
    }

    public void setNguoi_giam_ho(String nguoi_giam_ho) {
        this.nguoi_giam_ho = nguoi_giam_ho;
    }

    public static int getsId() {
        return sId;
    }

    public static void setsId(int sId) {
        ThongTinPhongThi.sId = sId;
    }
    
    
}

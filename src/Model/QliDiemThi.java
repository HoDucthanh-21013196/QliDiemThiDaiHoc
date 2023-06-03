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
public class QliDiemThi implements Serializable{
    private ThiSinh thisinh;
    private ThongTinPhongThi phongthi;
    private Diem_Thi diemthi;

    public QliDiemThi() {
    }

    public QliDiemThi(ThiSinh thisinh, ThongTinPhongThi phongthi, Diem_Thi diemthi) {
        this.thisinh = thisinh;
        this.phongthi = phongthi;
        this.diemthi = diemthi;
   
    }

    public ThiSinh getThisinh() {
        return thisinh;
    }

    public void setThisinh(ThiSinh thisinh) {
        this.thisinh = thisinh;
    }

    public ThongTinPhongThi getPhongthi() {
        return phongthi;
    }

    public void setPhongthi(ThongTinPhongThi phongthi) {
        this.phongthi = phongthi;
    }

    public Diem_Thi getDiemthi() {
        return diemthi;
    }

    public void setDiemthi(Diem_Thi diemthi) {
        this.diemthi = diemthi;
    }
}

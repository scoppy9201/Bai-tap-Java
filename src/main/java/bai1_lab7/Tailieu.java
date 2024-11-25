/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_lab7;
import java.util.Scanner;
/**
 *
 * @author anhbp
 */
public class Tailieu {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;
    
    // Constructor
    public Tailieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        maTaiLieu = maTaiLieu;
        tenNhaXuatBan = tenNhaXuatBan;
        soBanPhatHanh = soBanPhatHanh;
    }

    // Getter
    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void hienThiThongTin() {
        System.out.println("Ma tai lieu " + maTaiLieu + ", Nha xuat ban: " + tenNhaXuatBan + ", So ban phat hanh:  " + soBanPhatHanh);
    }
}

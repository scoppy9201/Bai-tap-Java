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
public class Tapchi extends Tailieu{
    private int soPhatHanh;
    private int thangPhatHanh;

    public Tapchi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        soPhatHanh = soPhatHanh;
        thangPhatHanh = thangPhatHanh;
    }

    public void hienThiThongTinTapChi() {
        hienThiThongTin();
        System.out.println("So phat hanh: " + soPhatHanh + ", Thang phat hanh: " + thangPhatHanh);
    }
}

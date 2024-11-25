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
public class Bao extends Tailieu{
    private String ngayPhatHanh;

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        ngayPhatHanh = ngayPhatHanh;
    }

    public void hienThiThongTinBao() {
        hienThiThongTin();
        System.out.println("Ngay phat hanh: " + ngayPhatHanh);
    }
}

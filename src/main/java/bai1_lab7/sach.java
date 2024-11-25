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
public class sach extends Tailieu {
    private String tenTacGia;
    private int soTrang;

    public sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        tenTacGia = tenTacGia;
        soTrang = soTrang;
    }

    public void hienThiThongTinSach() {
        hienThiThongTin();
        System.out.println("Tac gia: " + tenTacGia + ", So trang: " + soTrang);
    }
}

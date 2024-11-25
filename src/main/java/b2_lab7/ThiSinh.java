/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_lab7;
import java.util.Scanner;
/**
 *
 * @author anhbp
 */
public class ThiSinh {
        protected String soBaoDanh;
        protected String hoTen;
        protected String diaChi;
        protected int uuTien;
        protected String khoiThi;
        
        // Contructor mặc định 
        public ThiSinh() {
            soBaoDanh = "";
            hoTen = "";
            diaChi = "";
            uuTien = 0;
            khoiThi = "Chưa xác định";
        }

        public String getSoBaoDanh(){
                return soBaoDanh;
        }

        public void nhapThongTin() {
            Scanner s = new Scanner(System.in);
                    System.out.print("Nhap so bao danh: ");
                    soBaoDanh = s.nextLine();
                    System.out.print("Nhap ho ten: ");
                    hoTen = s.nextLine();
                    System.out.print("Nhap dia chi: ");
                    diaChi = s.nextLine();
                    System.out.print("Nhap muc uu tien: ");
                    uuTien = s.nextInt();
                    s.nextLine(); // xóa ký tự trắng 
        }

    public void hienThiThongTin() {
            System.out.println("So bao danh: " + soBaoDanh);
            System.out.println("Ho ten: " + hoTen);
            System.out.println("Dia chi: " + diaChi);
            System.out.println("Uu tien: " + uuTien);
            System.out.println("Khoi thi: " + khoiThi);
    }
}

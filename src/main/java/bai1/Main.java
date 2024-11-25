/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;
/**
 *
 * @author anhbp
 */
public class Main {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        
        System.out.println("Nhập thông tin Cán Bộ:");
        System.out.print("Họ tên: ");
        String hoten = s.nextLine();
        System.out.print("Năm sinh: ");
        int namsinh = s.nextInt();
        s.nextLine();  // Đọc bỏ ký tự newline còn sót lại
        System.out.print("Giới tính: ");
        String gioitinh = s.nextLine();
        System.out.print("Địa chỉ: ");
        String diachi = s.nextLine();
        
        Canbo canBo = new Canbo(hoten, namsinh, gioitinh, diachi);
        System.out.println("Thông tin Cán Bộ:");
        canBo.xuat();
        
        System.out.println("\nNhập thông tin Công Nhân:");
        System.out.print("Họ tên: ");
        hoten = s.nextLine();
        System.out.print("Năm sinh: ");
        namsinh = s.nextInt();
        s.nextLine();  // Đọc bỏ ký tự newline còn sót lại
        System.out.print("Giới tính: ");
        gioitinh = s.nextLine();
        System.out.print("Địa chỉ: ");
        diachi = s.nextLine();
        System.out.print("Bậc công nhân: ");
        String bac = s.nextLine();
        
        Congnhan congNhan = new Congnhan(hoten, namsinh, gioitinh, diachi, bac);
        System.out.println("Thông tin Công Nhân:");
        congNhan.xuat();
        
        System.out.println("\nNhập thông tin Kỹ Sư:");
        System.out.print("Họ tên: ");
        hoten = s.nextLine();
        System.out.print("Năm sinh: ");
        namsinh = s.nextInt();
        s.nextLine();  // Đọc bỏ ký tự newline còn sót lại
        System.out.print("Giới tính: ");
        gioitinh = s.nextLine();
        System.out.print("Địa chỉ: ");
        diachi = s.nextLine();
        System.out.print("Ngành đào tạo: ");
        String nganhdaotao = s.nextLine();
        
        Kysu kySu = new Kysu(hoten, namsinh, gioitinh, diachi, nganhdaotao);
        System.out.println("Thông tin Kỹ Sư:");
        kySu.xuat();
        
        System.out.println("\nNhập thông tin Nhân Viên:");
        System.out.print("Họ tên: ");
        hoten = s.nextLine();
        System.out.print("Năm sinh: ");
        namsinh = s.nextInt();
        s.nextLine();  // Đọc bỏ ký tự newline còn sót lại
        System.out.print("Giới tính: ");
        gioitinh = s.nextLine();
        System.out.print("Địa chỉ: ");
        diachi = s.nextLine();
        System.out.print("Công việc: ");
        String congviec = s.nextLine();
        
        // Khởi tạo đối tượng NhanVien và hiển thị thông tin
        Nhanvien nhanVien = new Nhanvien(hoten, namsinh, gioitinh, diachi, congviec);
        System.out.println("Thông tin Nhân Viên:");
        nhanVien.xuat();
    }
}


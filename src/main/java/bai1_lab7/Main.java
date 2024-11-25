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
public class Main {
        public static void main(String[] args){
            QuanLySach quanLySach = new QuanLySach();
            Scanner s = new Scanner(System.in);
            
            while (true){
                        System.out.println("\n==== QUAN LY TAI LIEU =====");
                        System.out.println("1. Nhap tai lieu: ");
                        System.out.println("2. Hien thi thong tin tai lieu: ");
                        System.out.println("3. Tim kiem tai lieu theo loai: ");
                        System.out.println("4. Thoat");
                        System.out.print("Chon: ");
                        int chon = s.nextInt();
         
            switch (chon){
                case 1: 
                    quanLySach.nhapThongTinTaiLieu(s);
                    break;
                case 2: 
                    quanLySach.xuatThongTinTaiLieu();
                    break;
                case 3: 
                    quanLySach.timKiemTheoLoai(s);
                    break;
                case 4: 
                    System.out.println("Thoat chuong trinh.");
                    s.close();
                    return ;
                default:
                    System.out.println("Lua chon khong hop le!");
                    }
            }
       }
}

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
public class Main {
    public static void main(String[] args) {
        TuyenSinh ts = new TuyenSinh();
        Scanner s = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap thong tin thi sinh");
            System.out.println("2. Hien thi thong tin thi sinh");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            luaChon = s.nextInt();

            switch (luaChon) {
                case 1:
                    ts.nhapThongTin();
                    break;
                case 2:
                    ts.hienThiThongTin();
                    break;
                case 3:
                    System.out.print("Nhap so bao danh thí sinh cần tìm: ");
                    String soBaoDanh = s.nextLine();
                    ThiSinh thiSinh = ts.timkiemsobaodanh(soBaoDanh); // Tìm thí sinh theo số báo danh
                    if (thiSinh != null) {
                        thiSinh.hienThiThongTin();
                    } else {
                        System.out.println("Khong tim thay thi sinh voi so bao danh " + soBaoDanh);
                    }
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (luaChon != 0);
    }
}

// Ly do sử dụng do while là vì chương trình cần ít nhất 1 lần chạy nên do while cho phép hiển thị ngay cả khi sai
// khi sử dụng for hay while vòng lặp sẽ kiêm tra điều kiện đúng trước khi cho phép thực thi 

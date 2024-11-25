/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_lab7;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author anhbp
 */
public class QuanLySach {
        private ArrayList<Tailieu> danhsachtailieu;
        
public QuanLySach (){
        danhsachtailieu = new ArrayList<>();
        }
public void nhapThongTinTaiLieu(Scanner scanner){
            System.out.print("Nhap loai tai lieu (1-Sach, 2-Tap chi, 3-Bao): ");
            int loai = scanner.nextInt();
            scanner.nextLine(); // Bỏ qua ký tự xuống dòng
            System.out.print("Nhap ma tai lieu: ");
            String maTaiLieu = scanner.nextLine();
            System.out.print("Nhap ten nha xuat ban: ");
            String tenNhaXuatBan = scanner.nextLine();
            System.out.print("Nhap so ban phat hanh: ");
            int soBanPhatHanh = scanner.nextInt();
            scanner.nextLine();
        
            if(loai == 1){
                        System.out.print("Nhap ten tac gia: ");
                        String tenTacGia = scanner.nextLine();
                        System.out.print("Nhap so trang: ");
                        int soTrang = scanner.nextInt();
                        danhsachtailieu.add(new sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang));
            }else if(loai == 2){
                        System.out.print("Nhap so phat hanh: ");
                        int soPhatHanh = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nhap thang phat hanh: ");
                        int thangPhatHanh = scanner.nextInt();
                        scanner.nextLine();
                        danhsachtailieu.add(new Tapchi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh));
            }else if(loai == 3){
                        System.out.print("Nhap ngay phat hanh: ");
                        String ngayPhatHanh = scanner.nextLine();
                        danhsachtailieu.add(new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh));
            }else{
                        System.out.println("Loai tai lieu khong hop le!");
            }
        }
    
 public void xuatThongTinTaiLieu(){
            for(Tailieu tailieu : danhsachtailieu){
            if(tailieu instanceof sach){
                ((sach) tailieu).hienThiThongTinSach();
            }else if(tailieu instanceof Tapchi){
                ((Tapchi) tailieu).hienThiThongTinTapChi();
            }else{
                ((Bao) tailieu).hienThiThongTinBao();
            }
            System.out.println();
            }
        }

 public void timKiemTheoLoai(Scanner scanner){
            System.out.print("Nhap loai tai lieu can tim (1-Sach, 2-Tap chi, 3-Bao): ");
            int loai  = scanner.nextInt();
            scanner.nextLine();
        
            for(Tailieu tailieu : danhsachtailieu){
            if(loai == 1 && tailieu instanceof sach){
                       ((sach) tailieu).hienThiThongTinSach();
            }else if(loai == 2 && tailieu instanceof Tapchi){
                       ((Tapchi) tailieu).hienThiThongTinTapChi();
            }else if(loai == 3 && tailieu instanceof Bao){
                       ((Bao) tailieu).hienThiThongTinBao();
            }
                       System.out.println();
           }
       }
}

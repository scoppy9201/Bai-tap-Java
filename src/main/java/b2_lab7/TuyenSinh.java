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
public class TuyenSinh {
    private ThiSinh[] danhSach;
    private int soLuong;

    public TuyenSinh() {
        danhSach = new ThiSinh[100]; // Mảng tĩnh chứa tối đa 100 thí sinh
        soLuong = 0;
    }

    public void nhapThongTin() {
        if (soLuong >= 100) {
            System.out.println("Danh sach da day!");
            return;
        }

        Scanner s = new Scanner(System.in);
        System.out.print("Nhap loai thi sinh (1: Khoi A, 2: Khoi B, 3: Khoi C): ");
        int luaChon = s.nextInt();

        ThiSinh thiSinh = null;
        switch (luaChon) {
            case 1:
                thiSinh = new ThISinhKhoiA();
                break;
            case 2:
                thiSinh = new ThiSinhKhoiB();
                break;
            case 3:
                thiSinh = new ThiSinhKhoiC();
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                return;
        }

        thiSinh.nhapThongTin();
        danhSach[soLuong++] = thiSinh;
    }

    public void hienThiThongTin() {
        if (soLuong == 0) {
            System.out.println("Danh sach trong!");
            return;
        }

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Thong tin thi sinh thu " + (i + 1) + ":");
            danhSach[i].hienThiThongTin();
            System.out.println("----------------------------");
        }
    }
     public ThiSinh timkiemsobaodanh(String soBaoDanh){
        for(int i  = 0; i < soLuong; i++){
            if(danhSach[i].getSoBaoDanh().equals(soBaoDanh)){
                return danhSach[i];
                }
            }
        return null;
        }
    public void Ketthuc(){
        System.out.println("Ket thuc chuong trinh!");
    }
}

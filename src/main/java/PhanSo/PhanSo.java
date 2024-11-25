/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhanSo;
import java.util.Scanner;
/**
 *
 * @author anhbp
 */
public class PhanSo {
    private int tuSo, mauSo;
    
    public PhanSo(){
        tuSo = 0;
        mauSo = 1;
    }    
    
    public PhanSo (int tu, int mau){
        tuSo = tu;
        if(mau != 0){
            mauSo = mau;
        }else{
            System.out.println("Mau so khong the bang 0.Da gan mau bang 1");
            mauSo = mau;
        }
    }
    
    public void nhapPS(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tuSo = s.nextInt();
        System.out.print("Nhap mau so: ");
        mauSo = s.nextInt();
        if(mauSo == 0){
            System.out.print("Mau khong duoc bang 0. Da gan gia tri bang 1");
            mauSo = 1;
        }
    }
    
    public PhanSo cong (PhanSo ps){
        int new_tu = tuSo*ps.mauSo + mauSo*ps.tuSo;
        int new_mau = mauSo*ps.mauSo;
        return new PhanSo(new_tu, new_mau);
    }
    
    public PhanSo tru (PhanSo ps){
        int new_tu = tuSo*ps.mauSo - mauSo*ps.tuSo;
        int new_mau = mauSo*ps.mauSo;
        return new PhanSo(new_tu, new_mau);
    }
    
    public PhanSo nhan (PhanSo ps){
        int new_tu = tuSo*ps.tuSo;
        int new_mau = mauSo*ps.mauSo;
        return new PhanSo(new_tu, new_mau);
    }
    
    public PhanSo chia (PhanSo ps){
        int new_tu = tuSo*ps.mauSo; 
        int new_mau = mauSo*ps.tuSo;
        return new PhanSo(new_tu, new_mau);
    }
    
    public void inPS(){
        System.out.println(tuSo + "/" + mauSo);
    }
    
    public static void main(String[] args){
        PhanSo p1 = new PhanSo();
        PhanSo p2 = new PhanSo();
        
        System.out.println("Nhap phan so thu nhat: ");
        p1.nhapPS();
        System.out.println("Nhap phan so thu hai: ");
        p2.nhapPS();
        
        System.out.print("Tong = ");
        p1.cong(p2).inPS();
        System.out.print("Hieu = ");
        p1.tru(p2).inPS();
        System.out.print("Tich = ");
        p1.nhan(p2).inPS();
        System.out.print("Thuong = ");
        p1.chia(p2).inPS();
    }
}

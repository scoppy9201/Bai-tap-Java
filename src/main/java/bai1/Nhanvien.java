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
public class Nhanvien extends Canbo{
    String congviec;
    public Nhanvien(String hoten ,int namsinh, String gioitinh, String diachi, String congviec){
        super(hoten, namsinh, gioitinh, diachi);
        congviec = congviec;
    }
    public void xuat(){
        super.xuat();
        System.out.println("Cong viec: " + congviec);
    }
}

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
public class Canbo {
    String hoten;
    int namsinh;
    String gioitinh;
    String diachi;
    public Canbo(String hoten, int namsinh, String gioitinh, String diachi){
        hoten = hoten;
        namsinh = namsinh;
        gioitinh = gioitinh;
        diachi = diachi;
    }
    public void xuat(){
        System.out.println("Ho ten: " + hoten);
        System.out.println("Nam sinh: " + namsinh);
        System.out.println("Gioi tinh: " + gioitinh);
        System.out.println("Dia chi: " + diachi);
    } 
}

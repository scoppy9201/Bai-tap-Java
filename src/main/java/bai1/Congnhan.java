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
public class Congnhan extends Canbo {
    String bac;
    public Congnhan(String hoten, int namsinh, String gioitinh, String diachi, String bac){
        super(hoten, namsinh, gioitinh, diachi);
        bac = bac;
        }
    public void xuat(){
        super.xuat();
        System.out.println("Bac: " + bac);
    }   
}

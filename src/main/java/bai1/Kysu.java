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
public class Kysu extends Canbo{
    String nganhdaotao;
    
    public Kysu(String hoten , int namsinh, String gioitinh, String diachi, String nganhdaotao){
        super(hoten, namsinh, gioitinh, diachi);
        nganhdaotao = nganhdaotao;
        }
    public void xuat(){
        super.xuat();
        System.out.println("Nganh dao tao: " + nganhdaotao);
    }
}

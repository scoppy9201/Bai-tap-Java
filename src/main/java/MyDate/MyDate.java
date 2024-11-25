/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyDate;
import java.util.Scanner;
/**
 *
 * @author anhbp
 */
public class MyDate {
    private int day,month,year;
    
    // phuong thuc khoi tao khong tham so
    public MyDate(){
        this.day = 11;
        this.month = 11;
        this.year = 2024;
    }
    
    // phuong thuc khoi tao tham só 
    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    // phuong thuc nhap 
    public void inputDate(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ngay = ");
        this.day = s.nextInt();
        System.out.print("Nhap thang = ");
        this.month = s.nextInt();
        System.out.print("Nhap nam = ");
        this.year = s.nextInt();
    }
    
    // phuong thuc xuat 
    public void outDate(){
        System.out.println("Ngay " + day +"thang " + month + " nam" +year);
    }
    
    // ham main
    public static void main(String[] args){
        MyDate date = new MyDate();
        date.inputDate();
        date.outDate();
    }
}

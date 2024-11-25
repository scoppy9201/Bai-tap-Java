/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class2;
import java.util.Scanner;

class diem 
{
    private int x, y;
    
    // phuong thuc nhap diem 
    public void nhapdiem(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap x = ");
        x = s.nextInt();
        System.out.print("Nhap y = ");
        y = s.nextInt();
    }
    
    // phuong thuc in diem 
    public void indiem(){
        System.out.print("(" + x + ", " + ")");
    }
    
    // phuong thuc tinh khoang cach hai diem 
    public float KC2D(diem d2){
        return (float) Math.sqrt((x-d2.x)*(x-d2.x)+(y-d2.y)*(y-d2.y));
    }  
}
/**
 *
 * @author anhbp
 */
public class clas2 {
    public static boolean kiemtratamgiac(float a, float b, float c){
        return (a+b>c) && (a+c>b) && (b+c>a);
    }
    
    public static String loaitamgiac(float a, float b, float c){
        if(a == b && b == c)
            return ("Tam giac deu.");
        else if(a==b || b == c || a == c)
            return ("Tam giac can.");
        else if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b)
            return ("Tam giac vuong.");
        else
            return ("Tam giac thuong.");
    }    
    
    public static float chuvi(float a, float b, float c){
        return a+b+c;
    }
    
    public static float dientich (float a, float b, float c ){
        float p = chuvi(a,b,c) / 2;
        return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    public static void main(String[] args){
        diem d1 = new diem();
        diem d2 = new diem();
        diem d3 = new diem();
        
        System.out.println("Nhap toa do diem thu nhat: ");
        d1.nhapdiem();
        System.out.println("Nhap toa đoiem thu hai: ");
        d2.nhapdiem();
        System.out.println
        ("Nhap toa do diem thu ba: ");
        d3.nhapdiem();
        
        System.out.println("Toado  diem thu nhat:");
        d1.indiem();
        System.out.println("Toa đoiem thu hai la: ");
        d2.indiem(); 
        System.out.println("Toa do diem thu ba la: ");
        d3.indiem();
        
        float a = d1.KC2D(d2);
        float b = d1.KC2D(d3);
        float c = d2.KC2D(d3);
        
        System.out.println("Khoang cach giua diem d1 va d2 la: "+a);
        System.out.println("Khoang cach giua diem d1 va d3 la: "+b);
        System.out.println("Khoang cach giua diem d2 va diem d3 la: "+c);
        
        if(kiemtratamgiac(a,b,c)){
            System.out.println("\nBa diem tao thanh mot tam giac\n");
            System.out.println("Loai tam giac: "+loaitamgiac(a,b,c));
            System.out.println("Chu vi = "+chuvi(a,b,c));
            System.out.println("Dien tich = "+dientich(a,b,c));
            }else{
            System.out.println("\nBa canh khong toa thanh mot tam giac\n");
        }
    } 
}

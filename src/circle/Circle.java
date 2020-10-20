/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.util.Scanner;//nhap tu ban phim trong console2

/**
 *
 * @author PCPV
 */
public class Circle {
    Scanner sc=new Scanner(System.in); //nhap tu ban phim trong console1
    Double x,y,r;

    public Circle() {
        
    }
    
    public Circle(Double x, Double y, Double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }
    
    public void input(){
        System.out.print("Enter x=");
        x=sc.nextDouble();
        
        System.out.print("Enter y=");
        y=sc.nextDouble();
        
        System.out.print("Enter r=");
        r=sc.nextDouble();
    }
    
    public void output(){
        System.out.println(String.format("Toa do x=%.2f, y=%.2f, ban kinh r=%.2f" ,x,y,r));
    }
    
    public void displayRelationship(Circle b){
        Double distance=Math.sqrt(Math.pow(x-b.x, 2)+Math.pow(y-b.y, 2));
        Double sumOfRadius=r+b.r;
        if (distance==0)
            System.out.println("Day la 2 hinh tron dong tam");
        else if (distance>sumOfRadius)
            System.out.println("Day la 2 hinh tron xa nhau");
        else if (distance<sumOfRadius)
            System.out.println("Day la 2 hinh tron cat nhau");
    }
    
    
}

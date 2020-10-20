/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author PCPV
 */
public class RUN {
    public static void main(String[] args){
        Circle b=new Circle();
        Circle c=new Circle(7.0,8.0,5.0);
        
        b.input();
        b.output();
        
        b.displayRelationship(c);
    }
    
}

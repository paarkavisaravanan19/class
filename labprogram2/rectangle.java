/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram2;

/**
 *
 * @author NEW
 */
public class rectangle {
    public static void main(String args[]){
        rec obj=new rec();
        System.out.println("given data");
        System.out.println(obj);
        obj.getlength();
        obj.getwidth();
        System.out.println("changed length "+obj.setlength(2));
        System.out.println("changed width "+obj.setwidth(2));
        System.out.println(obj);
        System.out.println("area "+obj.getarea());
        System.out.println("perimeter "+obj.getperimeter());
    }
        
    }
    

class rec
{
    float length=1.0f;
    float width=1.0f;
    float l1;
    double area;
    double peri;
    void rec(float l,float w)
    {
        length=l;
        width=w;
    }
    float getlength()
    {
        return length;
    }
    float setlength(float l1)
    {
        length=l1;
        return length;
    }
    float getwidth()
    {
        return width;
    }
    float setwidth(float w1)
    {
        width=w1;
        return width;
    }
    double getarea()
    {
        area=(width*length);
        return area;
    }
    double getperimeter()
    {
        peri=2*(length+width);
        return peri;
    }
    public String toString()
    {
        return "length "+length+" \nwidth"+width;
    }
}
    
            
                
    
    

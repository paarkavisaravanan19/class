/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram2;
import java.util.Scanner;
/**
 *
 * @author NEW
 */
public class complexnumber {
    public static void main(String args[]){
        float num1,num2,answer;
        complex cal=new complex();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        System.out.println("enter the real part");
        num1=input.nextInt();
        System.out.println("enter the imaginary");
        num2=input.nextInt();
        complex obj=new complex(num1,num2);
        
        System.out.println("Enter the second number");
        System.out.println("enter the real part");
        num1=input.nextInt();
        System.out.println("enter the imaginary");
        num2=input.nextInt();
        complex obj1=new complex(num1,num2);
        
        System.out.println("addition ");
        cal.add(obj,obj1);
        System.out.println("Subraction ");
        cal.sub(obj,obj1);
        System.out.println("multiplication ");
        cal.mult(obj,obj1);
        System.out.println("division ");
        cal.div(obj,obj1);
        
        
        
        
        
    } 
       
}
class complex
{
    float real,imag;
    complex(float comp1,float comp2){
        real=comp1;
        imag=comp2;
    }

    complex() 
    {
   
    }
    void add(complex c1,complex c2)
    {
        this.real=(c1.real+c2.real);
        this.imag=(c1.imag+c2.imag);
        System.out.println("Answer is :("+this.real+")+("+this.imag+")i");
    }
    void sub(complex c1,complex c2)
    {
        this.real=(c1.real-c2.real);
        this.imag=(c1.imag-c2.imag);
        System.out.println("Answer is :("+this.real+")+("+this.imag+")i");
    }
    void mult(complex c1,complex c2)
    {
        this.real=(c1.real*c2.real-c1.imag*c2.imag);
        this.imag=(c1.real*c2.imag+ c2.real*c1.imag);
        System.out.println("Answer is :("+this.real+")+("+this.imag+")i");
    }
    void div(complex c1,complex c2)
    {
        float demo;
        demo=(c2.real*c2.real+c2.imag*c2.imag);
        this.real=(c1.real*c2.real+c1.imag*c2.imag)/demo;
        this.imag=(c1.real*c2.imag- c2.real*c1.imag)/demo;
        System.out.println("Answer is :("+this.real+")+("+this.imag+")i");
    }
        
    }
    
    
    

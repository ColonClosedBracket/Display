 package ch7ex2;

import java.util.Scanner;
 
public class Ch7Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double numToConvert = input.nextDouble();
        System.out.print("Convert: ");
        System.out.format("%-1s %30s","\n1. Inches to centimeters","5. Centimeters to inches");
        System.out.format("%-1s %30s","\n2. Feet to centimeters","6. Centimeters to feet");
        System.out.format("%-1s %30s","\n3. Yards to meters","7. Meters to yards");
        System.out.format("%-1s %30s","\n4. Miles to kilometers","8. Kilometers to miles\n");
        int Choice = input.nextInt();
        
        switch(Choice){
            default: System.out.println("probably out of range or error");
            case 1: System.out.format("%2.2f inches is equal to %4.2f cm",numToConvert,InCmConversionReturn(numToConvert)); break;
            case 2: System.out.format("%2.2f feet is equal to %4.2f cm",numToConvert,FtCmConversionReturn(numToConvert)); break;
            case 3: System.out.format("%2.2f yards is equal to %4.2f m",numToConvert,YMConversionReturn(numToConvert)); break;
            case 4: System.out.format("%2.2f miles is equal to %4.2f km",numToConvert,MlKmConversionReturn(numToConvert)); break;
            case 5: CmInConvert(numToConvert); break;
            case 6: CmFtConvert(numToConvert); break;
            case 7: MYConvert(numToConvert); break;
            case 8: KmMlConvert(numToConvert); break;
            
        }
    }

    public static double InCmConversionReturn(double num)
    {return(num*2.54);}
    
    public static double FtCmConversionReturn(double num)
    {return(num*30);}
    
    public static double YMConversionReturn(double num)
    {return(num*0.91);}
    
    public static double MlKmConversionReturn(double num)
    {return(num*1.6);}
    
    public static void CmInConvert(double num)
    {System.out.format("%2.2f centimeters is equal to %2.2f inches",num,num/2.54);}
    
    public static void CmFtConvert(double num)
    {System.out.format("%2.2f centimeters is equal to %2.2f feet",num,num/30);}
    
    public static void MYConvert(double num)
    {System.out.format("%2.2f meters is equal to %2.2f feet",num,num/0.91);}

    public static void KmMlConvert(double num)
    {System.out.format("%2.2f kilometers is equal to %2.2f miles",num,num/1.6);}
    
}

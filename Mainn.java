import java.io.*;
import java.lang.Math; 
class Calculator
{
static Double PowerInt(int num1,int num2)
{
return Math.pow(num1,num2);
}	
static Double PowerDouble(double num1,int num2)
{
return Math.pow(num1,num2);
}
}

public class Mainn
{
public static void main(String args[])
{
System.out.println(Calculator.PowerInt(5,5));
System.out.println(Calculator.PowerDouble(5,5));
}
}


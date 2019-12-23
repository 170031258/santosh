import java.io.*;
class Patient
{
	String name;
        Double weight,height;
	       Double	BMI(Double weight,Double height)

{
 return weight/(height*height)*703;
}
}
public class Patients
{
public static void main(String args[])
{
Patient ob=new Patient();
System.out.println(ob.BMI(5.5,2.5));
}
}

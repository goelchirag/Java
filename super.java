package examP3;

import java.util.Scanner;

abstract class Vehicle{
	int yom;
	public abstract void getData();
	public abstract void putData();
	Vehicle(){
		yom=1999;
	}
}
class twowheeler extends  Vehicle{
	int yom;
	String s=new String();
	Scanner cin=new Scanner(System.in);
	public void getData(){
		 System.out.println("\n Enter the year of manufacture and the brand of the Two wheeler");
		yom=cin.nextInt();
		s=cin.next();
	}
	public void putData(){
		System.out.println("\n The year of manufacture is"+yom+"\nThe name of the Brand is "+s);
	}
}
final class fourwheeler extends  Vehicle{
	int yom;
	String s=new String();
	Scanner cin=new Scanner(System.in);
	public void getData(){
		 System.out.println("\n Enter the year of manufacture and the brand of the Two wheeler");
		yom=cin.nextInt();
		s=cin.next();
	}
	public void putData(){
		System.out.println("\n The year of manufacture is"+yom+"\nThe name of the Brand is "+s);
	
	}
}
class mtw extends twowheeler{
	String s=new String();
	Scanner cin=new Scanner(System.in);
	public void Input(){
		System.out.println("Enter the name of the vehicle ");
		s=cin.next();
		getData();
	}
	public void show(){
		 System.out.println("The name of the vehicle  is "+s+"\nyear of manufacture and brand is \n"+super.yom+"\n"+super.s);
	}
	
}
public class p3{
	public static void main(String[] args){
	mtw m=new mtw();
	m.Input();
	m.show();
	
	
	}
}

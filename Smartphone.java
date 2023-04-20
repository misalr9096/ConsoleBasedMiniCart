import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
class Smartphone 
{
	String brand;
	double price;
	int ram;
	int internalStorage;
	int batteryCapacity;
	double screenSize;
	int itemno;
	Smartphone(int itemno,String brand,double price,int ram,int internalStorage,int batteryCapacity,double screenSize){
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		this.internalStorage=internalStorage;
		this.batteryCapacity=batteryCapacity;
		this.screenSize=screenSize;
		this.itemno=itemno;
	}


	public String toString(){
		return "["+"Brand : "+brand+" \n Price : "+price+" \n Ram : "+ram+" \n InternalStroage : "+internalStorage+" \n BatteryCapacity : "+batteryCapacity+" \n ScreenSize : "+screenSize+" \n Smartphone No :"+itemno+"]";
	}

	public static void render(String filtername,Comparator filter,ArrayList al){
		
		System.out.println("___________________Result On the basis of "+filtername+"___________________");
		
		Collections.sort(al,filter);

		for(Object ob:al){
			System.out.println(ob);
			System.out.println();
		}
	}
}


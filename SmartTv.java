import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
class SmartTv 
{
	String brand;
	double price;
	double screenResolution;
    int ports;
	int ram;
	int internalStroage;
	int itemno;
	SmartTv(int itemno,String brand,double price,double screenResolution,int ports,int ram,int internalStroage){
		this.brand=brand;
		this.price=price;
		this.screenResolution=screenResolution;
		this.ports=ports;
		this.ram=ram;
		this.internalStroage=internalStroage;
		this.itemno=itemno;
	}
	
	public String toString(){
		return "["+"Brand : "+brand+" \n Price : "+price+" \n Ram : "+ram+" \n InternalStroage : "+internalStroage+" \n ScreenResolution : "+screenResolution+" \n Ports : "+ports+" \n SmartTv No : "+itemno+"]";
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

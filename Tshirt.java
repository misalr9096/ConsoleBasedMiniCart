import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
class Tshirt 
{
	String brand;
	double price;
	String color;
	int customberRating;
	int itemno;

	Tshirt(int itemno,String brand,double price,int customberRating,String color){
		this.brand=brand;
		this.price=price;
		this.customberRating=customberRating;
		this.color=color;
		this.itemno=itemno;
	}

	public String toString(){
		return "["+"Brand : "+brand+" \n Price : "+price+" \n CustomberRating : "+customberRating+" \n Color : "+color+" \n Tshirt No : "+itemno+"]";
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

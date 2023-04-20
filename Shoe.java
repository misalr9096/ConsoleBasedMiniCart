import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Shoe
{
	String brand;
	String color;
	double price;
	int customerRating;
	int itemno;
	Shoe(int itemno,String brand,String color,double price,int customerRating){
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.customerRating=customerRating;
		this.itemno=itemno;

	}

	public String toString(){
		return "["+"Brand : "+brand+" \n Price : "+price+" \n CustomberRating : "+customerRating+" \n Color : "+color+"\n Shoe No : "+itemno+"]";
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

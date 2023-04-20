import java.util.Comparator;
class TshirtPriceComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		
		Tshirt sm1=(Tshirt)o1;
		Tshirt sm2=(Tshirt)o2;

		if(sm1.price > sm2.price){
			return 1;
		}
		if(sm1.price < sm2.price){
			return -1;
		}
		
		return 0;
	}
}


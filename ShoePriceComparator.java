import java.util.Comparator;
class ShoePriceComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		
		Shoe sm1=(Shoe)o1;
		Shoe sm2=(Shoe)o2;

		if(sm1.price > sm2.price){
			return 1;
		}
		if(sm1.price < sm2.price){
			return -1;
		}
		
		return 0;
	}
}


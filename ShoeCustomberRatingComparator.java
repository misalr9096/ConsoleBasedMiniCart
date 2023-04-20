import java.util.Comparator;
class ShoeCustomberRatingComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		
		Shoe sm1=(Shoe)o1;
		Shoe sm2=(Shoe)o2;

		if(sm1.customerRating > sm2.customerRating){
			return 1;
		}
		if(sm1.customerRating < sm2.customerRating){
			return -1;
		}
		
		return 0;
	}
}


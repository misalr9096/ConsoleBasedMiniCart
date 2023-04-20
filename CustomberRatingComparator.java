import java.util.Comparator;
class CustomberRatingComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		
		Tshirt sm1=(Tshirt)o1;
		Tshirt sm2=(Tshirt)o2;

		if(sm1.customberRating > sm2.customberRating){
			return 1;
		}
		if(sm1.customberRating < sm2.customberRating){
			return -1;
		}
		
		return 0;
	}
}


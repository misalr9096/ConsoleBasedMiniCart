import java.util.Comparator;
class ShoeColorComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		
		Shoe sm1=(Shoe)o1;
		Shoe sm2=(Shoe)o2;

		if(sm1.color.charAt(0) > sm2.color.charAt(0)){
			return 1;
		}
		if(sm1.color.charAt(0) < sm2.color.charAt(0)){
			return -1;
		}
		
		return 0;
	}
}


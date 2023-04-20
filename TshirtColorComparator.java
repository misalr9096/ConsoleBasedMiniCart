import java.util.Comparator;
class TshirtColorComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		
		Tshirt sm1=(Tshirt)o1;
		Tshirt sm2=(Tshirt)o2;

		if(sm1.color.charAt(0) > sm2.color.charAt(0)){
			return 1;
		}
		if(sm1.color.charAt(0) < sm2.color.charAt(0)){
			return -1;
		}
		
		return 0;
	}
}


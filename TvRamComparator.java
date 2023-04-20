import java.util.Comparator;
class TvRamComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		
		SmartTv sm1=(SmartTv)o1;
		SmartTv sm2=(SmartTv)o2;

		if(sm1.ram > sm2.ram){
			return 1;
		}
		if(sm1.ram < sm2.ram){
			return -1;
		}
		
		return 0;
	}
}


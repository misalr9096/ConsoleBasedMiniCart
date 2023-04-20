import java.util.Comparator;
class ScreenSizeComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		
		Smartphone sm1=(Smartphone)o1;
		Smartphone sm2=(Smartphone)o2;
		
		if(sm1.screenSize > sm2.screenSize){
			return 1;
		}
		if(sm1.screenSize < sm2.screenSize){
			return -1;
		}
		return 0;
	}
}

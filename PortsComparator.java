import java.util.Comparator;
class PortsComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		
		SmartTv sm1=(SmartTv)o1;
		SmartTv sm2=(SmartTv)o2;

		if(sm1.ports > sm2.ports){
			return 1;
		}
		if(sm1.ports < sm2.ports){
			return -1;
		}
		
		return 0;
	}
}


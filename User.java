import java.util.HashSet;
import java.util.HashMap;
class User 
{
	private String name;
	private String address;
	private String mobileno;
	private String passward;

	static HashMap<String,String> userAcc=new HashMap<>();

	User(String name,String address,String mobileno,String passward){
		
		this.name=name;
		this.address=address;
		this.mobileno=mobileno;
		this.passward=passward;
	
		
	
		userAcc.put(mobileno,passward);
	}

	public String toString(){
		return "Name : "+name+" Address : "+address+" MobileNo : "+mobileno;
	}

	public boolean equlas(Object obj){
		
		User user=(User)obj;
		return this.mobileno.equals(user.mobileno);

	}

	public int hashCode(){
		return mobileno.hashCode();
	}

	public String getName(){
		return name;
	}
	public String getMobileNo(){
		return mobileno;
	}
	public String getAddress(){
		return address;
	}
	public void setMobileNo(String mobileno){
		this.mobileno=mobileno;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setPassward(String passward){
		this.passward=passward;
	}

	public static boolean isValid(String username,String passward){
	
		if(userAcc.containsKey(username)){
			if(userAcc.get(username).compareTo(passward)==0){
				
				return true;
			}
		}
		return false;
	}

}

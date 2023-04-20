import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class MiniCart
{
	static HashSet<User> user=new HashSet<User>();
	static ArrayList cart=new ArrayList();
	static ArrayList<Smartphone> mobiles=new ArrayList<>();
	static ArrayList<SmartTv> tvs=new ArrayList<>();
	static ArrayList<Tshirt>shirts=new ArrayList<>();
	static ArrayList<Shoe>shoes=new ArrayList<>();
		
		

	public static void show(String mobileno){
		for(User us:user){
			if(us.getMobileNo().equals(mobileno)){
				System.out.println("--------Profile--------");
				System.out.println("Name : "+us.getName());
				System.out.println("Mobile no : "+us.getMobileNo());
				System.out.println("Address : "+us.getAddress());

			}
		}
	}

	public static void buySmartPhone(int smno){
		
		for(Smartphone m:mobiles){
			if(m.itemno==smno){
				cart.add(m);
				System.out.println("Smartphone Added in Cart..!");
			}
		}

	}

	public static void buySmartTv(int smno){
		for(SmartTv s:tvs){
			if(s.itemno==smno){
				cart.add(s);
				System.out.println("SmartTv Added in Cart..!");
			}
		}
	}

	public static void buyTshirt(int smno){

		for(Tshirt sh:shirts){
			if(sh.itemno==smno){
				cart.add(sh);
				System.out.println("Tshirt Added in Cart..!");
			}
		}

	}

	public static void buyShoe(int smno){
		for(Shoe so:shoes){
			if(so.itemno==smno){
				cart.add(so);
				System.out.println("Shoe Added in Cart..!");
			}
		}
	}
		
        
		
	
	public static void main(String[] args) throws IOException{
		
		Scanner sc=new Scanner(System.in);
	
		InputStreamReader r=new InputStreamReader(System.in);  
	    BufferedReader br=new BufferedReader(r);
		
	    mobiles.add(new Smartphone(1,"Samsung",15000,4,64,5000,6));
		mobiles.add(new Smartphone(2,"Opp",18000,6,16,4000,6.5));
		
		tvs.add(new SmartTv(1,"Samsung",25000,36,4,2,16));
		tvs.add(new SmartTv(2,"OnePluse",21000,34,3,1,16));

		shirts.add(new Tshirt(1,"Levis",2500,3,"white"));
		shirts.add(new Tshirt(2,"Allen Solly",3000,4,"Black"));
		
		shoes.add(new Shoe(1,"Puma","White",2500,3));
		shoes.add(new Shoe(2,"RedTape","black",5000,3));


		boolean login=true;
		
		while(login){
			System.out.println("--------Welcome to MiniCart--------");
			System.out.println();
			System.out.println("1.Catagories \n2.Profile \n3.Cart \n4.Exit");
			System.out.println("Enter the valid choice..!");
			switch(sc.nextInt()){
				
				case 1:
					boolean l1=true;
					while(l1){
						System.out.println("-------Catagories-------");
						System.out.println("1.Eletronics \n2.Fashion \n3.back");
						System.out.println("Enter the valid choice..!");
						switch(sc.nextInt()){
							case 1:
								  boolean c1=true;
										while(c1){
												System.out.println("-------Eletronics-------");
												System.out.println("1.Smartphone \n2.SmartTv \n3.back");
												System.out.println("Enter the valid choice..!");
												switch(sc.nextInt()){
													case 1:

														 boolean t1=true;
													  int i=0;
													  while(t1){
			
														System.out.println("--------Welcome to SmartPhones--------");
														System.out.println();
														System.out.println("****These are the Avaiable Smartphones****");
														if(i==0){
															
															for(Object phone:mobiles){
																System.out.println(phone);
																System.out.println();
															}	

															i++;
														}

														System.out.println("Filters");
														System.out.println("1.Price \n2.Ram \n3.InternalStroage \n4.BatteryCapacity \n5.ScreenSize \n6.Buy \n7.Exit");
														System.out.println("Enter the valid Choice..!");
														switch(sc.nextInt()){
															
															case 1: Smartphone.render("Price",new PriceComparator(),mobiles);
																	break;
															case 2: Smartphone.render("Ram",new RamComparator(),mobiles);
																	break;
															case 3: Smartphone.render("InternalStroage",new InternalStroageComparator(),mobiles);
																	break;
															case 4: Smartphone.render("BatteryCapacity",new BatteryCapacityComparator(),mobiles);
																	break;
															case 5: Smartphone.render("ScreenSize",new ScreenSizeComparator(),mobiles);
																	break;
															case 6: 
																 System.out.println("****These are the Avaiable Smartphones****");
															
																 for(Object phone:mobiles){
																	   System.out.println(phone);
																	   System.out.println();
																	}
																System.out.println("Enter the smartphone no..");
																int smno=sc.nextInt();
																buySmartPhone(smno);
																break;
															case 7:
																	t1=false;
																	break;
															default:
																System.out.println("Please enter the valid choice..!");
														}
													
													}
													
														break;
													case 2:
													boolean t2=true;
													int j=0;
													while(t2){
			
														System.out.println("--------Welcome to SmartTv--------");
														System.out.println();
														System.out.println("****These are the Avaiable SmartTv****");
														if(j==0){
															
															for(Object smarttv:tvs){
																System.out.println(smarttv);
																System.out.println();
															}	

															j++;
														}

														System.out.println("Filters");
														System.out.println("1.Price \n2.Ram \n3.InternalStroage \n4.ScrenResolution \n5.Ports \n6.Buy \n7.Exit");
														System.out.println("Enter the valid Choice..!");
														switch(sc.nextInt()){
															
															case 1: SmartTv.render("Price",new TvPriceComparator(),tvs);
																	break;
															case 2: Smartphone.render("Ram",new TvRamComparator(),tvs);
																	break;
															case 3: Smartphone.render("InternalStroage",new TvInternalStroageComparator(),tvs);
																	break;
															case 4: Smartphone.render("ScreenResolution",new ScreenResolutionComparator(),tvs);
																	break;
															case 5: Smartphone.render("Ports",new PortsComparator(),tvs);
																	break;
															case 6:
																	System.out.println("****These are the Avaiable SmartTv****");
																		for(Object smarttv:tvs){
																			System.out.println(smarttv);
																			System.out.println();
																		}	
																		System.out.println("Enter the smarttv no..");
																		int tvno=sc.nextInt();
																		buySmartTv(tvno);
																	break;	
															case 7:
															        t2=false;
																	break;
															default:
																System.out.println("Please enter the valid choice..!");
														}
													
													}
													
														break;
													case 3:
														c1=false;
														break;
													default:
														System.out.println("Please enter the valid choice..!");
												}
									}
									break;
										
							case 2:
									boolean c2=true;
										while(c2){
												System.out.println("-------Fashion-------");
												System.out.println("1.Tshirt \n2.Shoe \n3.back");
												System.out.println("Enter the valid choice..!");
												switch(sc.nextInt()){
													case 1:
													boolean t2=true;
													int j=0;
													while(t2){
			
														System.out.println("--------Welcome to Tshirt--------");
														System.out.println();
														System.out.println("****These are the Avaiable Tshirt****");
														if(j==0){
															
															for(Object sh:shirts){
																System.out.println(sh);
																System.out.println();
															}	

															j++;
														}

														System.out.println("Filters");
														System.out.println("1.Price \n2.Color \n3.CustomerRating \n4.Buy \n5.back");
														System.out.println("Enter the valid Choice..!");
														switch(sc.nextInt()){
															
															case 1: SmartTv.render("Price",new TshirtPriceComparator(),shirts);
																	break;
															case 2: Smartphone.render("Color",new TshirtColorComparator(),shirts);
																	break;
															case 3: Smartphone.render("CustomerRating",new CustomberRatingComparator(),shirts);
																	break;
															case 4: 
																System.out.println("****These are the Avaiable Tshirt****");
															
																 for(Object shoe:shoes){
																	   System.out.println(shoe);
																	   System.out.println();
																	}

																System.out.println("Enter the tshirt no..");
																int smno=sc.nextInt();
																buyTshirt(smno);
																break;
															case 5:
																	t2=false;
																	break;
															default:
																System.out.println("Please enter the valid choice..!");
														}
													
													}

														break;
													case 2:
														boolean t3=true;
													int m=0;
													while(t3){
			
														System.out.println("--------Welcome to Shoe--------");
														System.out.println();
														System.out.println("****These are the Avaiable Shoe****");
														if(m==0){
															
															for(Object sho:shoes){
																System.out.println(sho);
																System.out.println();
															}	

															m++;
														}

														System.out.println("Filters");
														System.out.println("1.Price \n2.Color \n3.CustomerRating \n4.Buy \n5.back");
														System.out.println("Enter the valid Choice..!");
														switch(sc.nextInt()){
															
															case 1: SmartTv.render("Price",new ShoePriceComparator(),shoes);
																	break;
															case 2: Smartphone.render("Color",new ShoeColorComparator(),shoes);
																	break;
															case 3: Smartphone.render("CustomerRating",new ShoeCustomberRatingComparator(),shoes);
																	break;
															case 4:
																System.out.println("****These are the Avaiable Shoes****");
															
																 for(Object shoe:shoes){
																	   System.out.println(shoe);
																	   System.out.println();
																	}
																System.out.println("Enter the shoe no..");
																int smno=sc.nextInt();
																buyShoe(smno);
																break;
															case 5:
																	t3=false;
																	break;
															default:
																System.out.println("Please enter the valid choice..!");
														}
													
													}
														break;
													case 3: c2=false;
													break;
													default:
														System.out.println("Enter the valid choice..!");
												}
										}
								break;
							case 3:l1=false;
						}
					}
					break;			
				case 2:
					boolean l2=true;
					  while(l2){
					
								System.out.println("--------Profile--------");
								System.out.println("1.Login \n2.Register \n3.back");
								System.out.println("Enter the valid choice..!");
								switch(sc.nextInt()){
										case 1:
											System.out.println("Enter the Mobileno : ");
											String uname=br.readLine();
									
											System.out.println("Enter the Passward : ");
											String passward=br.readLine();
							
											if(User.isValid(uname,passward)){
												
												show(uname);

											}else{
												System.out.println("Someting went wrong..!");
											}
											break;
										case 2:
											System.out.println("Enter name : ");
											String name=br.readLine();
											
											System.out.println("Enter Address : ");
											String address=br.readLine();
											
											System.out.println("Enter MobileNo :");
											String mob=br.readLine();
										
											System.out.println("Enter passward : ");
											String pass=br.readLine();

											user.add(new User(name,address,mob,pass));
												
											System.out.println("Thanks for Registering..!");
											break;
										case 3: l2=false;
										break;	
										default:
											System.out.println("Enter the valid choice..!");
								}
						}



					break;
				case 3:
					System.out.println();
					System.out.println("--------@---@ Cart @---@--------");
					if(cart.isEmpty()){
						System.out.println("Cart is Empty..!");
						System.out.println("Cart is missing you add something..!");
					}else{
						System.out.println();
						double total=0;
						for(Object ob:cart){
							System.out.println(ob);
							System.out.println();
						}
						for(Object ob:cart){
							if(ob instanceof Smartphone){
								Smartphone sm=(Smartphone)ob;
								total+=sm.price;
							}else if(ob instanceof SmartTv){
								SmartTv st=(SmartTv)ob;
								total+=st.price;
							}else if(ob instanceof Tshirt){
								Tshirt sh=(Tshirt)ob;
					total+=sh.price;
							}if(ob instanceof Shoe){
								Shoe so=(Shoe)ob;
								total+=so.price;
							}
						}
						System.out.println();
						System.out.println("--------Invoice--------");
						System.out.println(" \n Total : "+total);
						System.out.println(" \n Discount : "+(total*1/10));
						System.out.println(" \n Total Order : "+(total-(total*1/10)));
						System.out.println();

						System.out.println("1.Order it \n2.clear cart ");
						System.out.println("Enter the choice..!");
						int ch=sc.nextInt();
						if( ch == 1){
							cart.clear();
							System.out.println("Wait for Payment getWay..!");
						}else if(ch == 2){
							System.out.println("happy Shopping again..!");
						}else{
							System.out.println("Enter the valid choice..!");
						}
					}
					break;
				case 4:
					login=false;
					System.out.println("Thanks for visiting..!");
					break;
				default:
					System.out.println("Enter the valid choice..!");
			}

	
		}
		sc.close();
	}

}

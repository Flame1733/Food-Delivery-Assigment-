import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

/**
* Foodeliver system for restaurant and customer
*
* @author ALHATTAMI
* @author TENGKU FAHAD
* 
*/
public class FoodDeliver {	

	private static Scanner input;
	private static Scanner input1;
	private static Scanner input3;

	/**
	 * Method important to run any java program
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		input = new Scanner (System.in);
		input1 = new Scanner (System.in);
		input3 = new Scanner (System.in);
		String name;
		int choose;

		Restaurant kfc =new Restaurant();
		
		Restaurant mc =new Restaurant();

		Restaurant sub =new Restaurant();

		food food1=new food("Value Bucket",159,50);
		food food2=new food("Super Dinner", 979, 39);
		food food3=new food("Zinger Box",694,20);
		food food4=new food("Big Mac",368,14);
		food food5=new food("Big Tasty",574,13);
		food food6=new food("Grand Chicken",587,14);
		food food7=new food("Steak & Cheese",471,29);
		food food8=new food("Tuna",472,27);
		food food9=new food("Salad",262,9);
		
		kfc.getMenu().add(food1);
		kfc.getMenu().add(food2);
		kfc.getMenu().add(food3);
		mc.getMenu().add(food4);
		mc.getMenu().add(food5);
		mc.getMenu().add(food6);
		sub.getMenu().add(food7);
		sub.getMenu().add(food8);
		sub.getMenu().add(food9);

		Customer customer1=new Customer("customer1");

		Customer customer2=new Customer("customer2");

		Customer customer3=new Customer("customer3");

		Customer curcustomer=new Customer("customer");
		
		ArrayList<Customer>customers=new ArrayList<Customer>(); 
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		
		order order1 =new order("order 1","customer1");
		
		order order2 =new order("order 2","customer1");
		
		order order3 =new order("order 3","customer2");
		
		order order4 =new order("order 4","customer2");
		
		order order5 =new order("order 5","customer3");
		
		order order6 =new order("order 6","customer3");

		order curorder =new order("curorder","customer");

		order1.setOrderhistory(new java.util.Date());
		order1.setOrderstatus("delivering");
		order1.setSignature("kfc");
		
		order2.setOrderhistory(new java.util.Date());
		order2.setOrderstatus("delivering");
		order2.setSignature("mc");
		
		order3.setOrderhistory(new java.util.Date());
		order3.setOrderstatus("delivering");
		order3.setSignature("mc");
		
		order4.setOrderhistory(new java.util.Date());
		order4.setOrderstatus("delivering");
		order4.setSignature("sub");
		
		order5.setOrderhistory(new java.util.Date());
		order5.setOrderstatus("delivering");
		order5.setSignature("kfc");
		
		order6.setOrderhistory(new java.util.Date());
		order6.setOrderstatus("delivering");
		order6.setSignature("sub");
		
		customer1.getOrders().add(order1);
		customer1.getOrders().add(order2);
		
		customer2.getOrders().add(order3);
		customer2.getOrders().add(order4);
		
		customer3.getOrders().add(order5);
		customer3.getOrders().add(order6);


		
		Admin admin=new Admin();
		
		Rider rider1=new Rider("rider 1");
		rider1.setStatus("ready");
		rider1.getRiderorders().add(order1);
		rider1.getRiderorders().add(order2);
		rider1.getRiderorders().add(order3);

		Rider rider2=new Rider("rider 2");
		rider2.setStatus("ready");
		rider2.getRiderorders().add(order4);
		rider2.getRiderorders().add(order5);
		rider2.getRiderorders().add(order6);


		admin.getRiders().add(rider1);
		admin.getRiders().add(rider2);

		System.out.println("\t---------------------------");
		System.out.println("\t  WELCOME TO FOODELIVER");
		System.out.println("\t        ORDER");
		System.out.println("\t        COMING");
		System.out.println("\t        EATNG");
		System.out.println("\t---------------------------");
		System.out.println("\tPress any number only!");
		int skip = input.nextInt();

		System.out.println("-------------------------------------------------------------");
		System.out.println("\tNoted");
		System.out.println("- If you dont folow the structure you ");
		System.out.println("Will lose all your order and menu");
		System.out.println("- you will use only number except name food for resturant");
		System.out.println("-------------------------------------------------------------");
		System.out.println("\tPress any number only!");
		 skip = input.nextInt();
		

		while(true){
			Rider currider=admin.getRiders().peek();

			System.out.println("\tchoose role");

			System.out.println("1-resturant");
			
			System.out.println("2-customer");
		
			System.out.println("3-Admin");
			
			System.out.println("4-Rider");

			System.out.println("5-close!");

			choose=input.nextInt();	
			if (choose==1){
				System.out.println("1-KFC");
			
				System.out.println("2-McDonalds");
			
				System.out.println("3-Subway");
			
				choose=input.nextInt();
				//kfc
				if(choose==1){
					System.out.println("\tKFC");
					System.out.println("1-add/update/remove food");
				
					System.out.println("2-edit order status");
				
					System.out.println("3-view order history");
					
					System.out.println("4-view menu");
					
					choose=input.nextInt();
					if(choose==1){	
						System.out.println("1-Add");
						
						System.out.println("2-Remove");
						
						System.out.println("3-update");

						choose=input.nextInt();
						if(choose==1){
							System.out.println("enter the number of items you want to add:");
							int number=input3.nextInt();
						
							for (int i = 0;i<number;i++){
								System.out.println("enter the name:");
								name=input1.nextLine();	
						
								System.out.println("enter the code:");
								int code=input.nextInt();
						
								System.out.println("enter the price:");
								double price=input.nextDouble();
							
								food food=new food(name, code, price);
						
								kfc.getMenu().add(food);
							}
						}
						else{
							if(choose==2){
								System.out.println("---------------------------------------");
								System.out.println("| CODE\t\tNAME\t\tPRICE |");
								System.out.println("---------------------------------------");
								for(int i=0;i<kfc.getMenu().size();i++){
									System.out.println(kfc.getMenu().get(i).toString());
								}
								System.out.println("enter the code of the item you want to remove:");
								choose=input.nextInt();
								for(int i=0;i<kfc.getMenu().size();i++){
									if(choose==kfc.getMenu().get(i).getCode()){
										kfc.getMenu().remove(i);
									}
								}
							}
							else {
								if(choose==3){
									System.out.println("---------------------------------------");
									System.out.println("| CODE\t\tNAME\t\tPRICE |");
									System.out.println("---------------------------------------");
									for(int i=0;i<kfc.getMenu().size();i++){
										System.out.println(kfc.getMenu().get(i).toString());
									}
									System.out.println("enter the code of the item you want to update:");
									choose=input.nextInt();
									for(int i=0;i<kfc.getMenu().size();i++){
										if(choose==kfc.getMenu().get(i).getCode()){
											System.out.println("1-update the name ");
											System.out.println("2-update the code ");
											System.out.println("3-update the price ");
											choose=input.nextInt();

											if(choose==1){
												System.out.println("enter the name:");
												kfc.getMenu().get(i).setName(input1.nextLine());
											}
											else{
												if (choose==2){
													System.out.println("enter the code:");
													kfc.getMenu().get(i).setCode(input.nextInt());
												}
												else {
													if (choose==3){
														System.out.println("enter the price:");
														kfc.getMenu().get(i).setPrice(input.nextDouble());
													}
												}
											}
										}
									}
								}
							}
						}
					}
					else {
						if(choose==2){
							for(int i=0;i<customers.size();i++){
								for(int j=0;j<customers.get(i).getOrders().size();j++){
									if(customers.get(i).getOrders().get(j).getSignature().equals("kfc")&&!customers.get(i).getOrders().get(j).getOrderstatus().equals("collected")){
										System.out.println(customers.get(i).getOrders().get(j).getName()+", "+customers.get(i).getOrders().get(j).getOrderstatus());
									}
								}
							}
							System.out.println("enter the name of the order you want to edit:");
							System.out.println("Eg: order ##");
							name=input1.nextLine();
							for(int i=0;i<customers.size();i++){
								for(int j=0;j<customers.get(i).getOrders().size();j++){
									if(customers.get(i).getOrders().get(j).getName().equals(name)){
										curorder=customers.get(i).getOrders().get(j);
									}
								}
							}
							if(curorder.getName().equals(name)){
								System.out.println("1-preparing");
								
								System.out.println("2-ready");
								
								System.out.println("3-delivering");

								System.out.println("4-collected");
								
								choose=input.nextInt();
								if(choose==1){
									curorder.setOrderstatus("preparing");
									System.out.println("the order is: "+curorder.getOrderstatus());
								}
								else{
									if(choose==2){
										curorder.setOrderstatus("ready");
										System.out.println("the order is: "+curorder.getOrderstatus());
									}
									else{
										if(choose==3){
											curorder.setOrderstatus("delivering");
											System.out.println("the order is: "+curorder.getOrderstatus());
										}
										else{
											if(choose==4){
												curorder.setOrderstatus("collected");
												System.out.println("the order is: "+curorder.getOrderstatus());
												for(int i=0;i<admin.getRiders().size();i++){
													if(admin.getRiders().peek().getRiderorders().contains(curorder)){
														admin.getRiders().peek().setStatus("ready");
													}
													else{
														admin.getRiders().add(admin.getRiders().remove());
													}
												}
											}
										}
									}
								}
							}
							else{
								System.out.println("the name you enterd is wrong plese try again !");
							}
						}
						else {
							if (choose==3){
								for(int i=0;i<customers.size();i++){
									for(int j=0;j<customers.get(i).getOrders().size();j++){
										if(customers.get(i).getOrders().get(j).getSignature().equals("kfc")){
											System.out.println(customers.get(i).getCustomerName()+" : "+ customers.get(i).getOrders().get(j).getName()+" , "+customers.get(i).getOrders().get(j).getOrderhistory());
										}
									}
								}
							}
							else{
								if(choose==4){
									System.out.println("\tKFC Menu");
									System.out.println("---------------------------------------");
									System.out.println("| CODE\t\tNAME\t\tPRICE |");
									System.out.println("---------------------------------------");
									for(int i=0;i<kfc.getMenu().size();i++){
										System.out.println(kfc.getMenu().get(i).toString());
									}
								}
							}
						}
					}
				}
				//mc
				else{
					if(choose==2){
						System.out.println("\tMcDonalds");
						System.out.println("1-add/update/remove food");
					
						System.out.println("2-edit order status");
					
						System.out.println("3-view order history");
						
						System.out.println("4-view menu");

						choose=input.nextInt();
						if(choose==1){
							System.out.println("1-Add");
							
							System.out.println("2-Remove");
							
							System.out.println("3-Update");

							choose=input.nextInt();
							if(choose==1){
								System.out.println("enter the number of items you want to add:");
								int number=input3.nextInt();
							
								for (int i = 0;i<number;i++){
									System.out.println("enter the name:");
									name=input1.nextLine();	
							
									System.out.println("enter the code:");
									int code=input.nextInt();
							
									System.out.println("enter the price:");
									double price=input.nextDouble();
								
									food food=new food(name, code, price);
							
									mc.getMenu().add(food);
								}
							}
							else{
								if(choose==2){
									System.out.println("---------------------------------------");
									System.out.println("| CODE\t\tNAME\t\tPRICE |");
									System.out.println("---------------------------------------");
									for(int i=0;i<mc.getMenu().size();i++){
										System.out.println(mc.getMenu().get(i).toString());
									}
									System.out.println("enter the code of the item you want to remove:");
									choose=input.nextInt();
									for(int i=0;i<mc.getMenu().size();i++){
										if(choose==mc.getMenu().get(i).getCode()){
											mc.getMenu().remove(i);
										}
									}
								}
								else {
									if(choose==3){
										System.out.println("---------------------------------------");
										System.out.println("| CODE\t\tNAME\t\tPRICE |");
										System.out.println("---------------------------------------");
										for(int i=0;i<mc.getMenu().size();i++){
											System.out.println(mc.getMenu().get(i).toString());
										}
										System.out.println("enter the code of the item you want to update:");
										choose=input.nextInt();
										for(int i=0;i<mc.getMenu().size();i++){
											if(choose==mc.getMenu().get(i).getCode()){
												System.out.println("1-update the name ");
												
												System.out.println("2-update the code ");
												
												System.out.println("3-update the price ");
												
												choose=input.nextInt();

												if(choose==1){
													System.out.println("enter the name:");
													mc.getMenu().get(i).setName(input1.nextLine());
												}
												else{
													if (choose==2){
														System.out.println("enter the code:");
														mc.getMenu().get(i).setCode(input.nextInt());
													}
													else {
														if (choose==3){
															System.out.println("enter the price:");
															mc.getMenu().get(i).setPrice(input.nextDouble());
														}
													}
												}
											}
										}
									}
								}
							}
						}
						else{
							if(choose==2){
								for(int i=0;i<customers.size();i++){
									for(int j=0;j<customers.get(i).getOrders().size();j++){
										if(customers.get(i).getOrders().get(j).getSignature().equals("mc")&&!customers.get(i).getOrders().get(j).getOrderstatus().equals("collected")){
											System.out.println(customers.get(i).getOrders().get(j).getName()+", "+customers.get(i).getOrders().get(j).getOrderstatus());
										}
									}
								}
								System.out.println("enter the name of the order you want to edit:");
								System.out.println("Eg: order ##");
								name=input1.nextLine();
								for(int i=0;i<customers.size();i++){
									for(int j=0;j<customers.get(i).getOrders().size();j++){
										if(customers.get(i).getOrders().get(j).getName().equals(name)){
											curorder=customers.get(i).getOrders().get(j);
										}
									}
								}
								if(curorder.getName().equals(name)){
									System.out.println("1-preparing");
									
									System.out.println("2-ready");
									
									System.out.println("3-delivering");
									
									System.out.println("4-collected");
									
									choose=input.nextInt();
									if(choose==1){
										curorder.setOrderstatus("preparing");
										System.out.println("the order is: "+curorder.getOrderstatus());
									}
									else{
										if(choose==2){
											curorder.setOrderstatus("ready");
											System.out.println("the order is: "+curorder.getOrderstatus());
										}
										else{
											if(choose==3){
												curorder.setOrderstatus("delivering");
												System.out.println("the order is: "+curorder.getOrderstatus());
											}
											else{
												if(choose==4){
													curorder.setOrderstatus("collected");
													System.out.println("the order is: "+curorder.getOrderstatus());
													for(int i=0;i<admin.getRiders().size();i++){
														if(admin.getRiders().peek().getRiderorders().contains(curorder)){
															admin.getRiders().peek().setStatus("ready");
														}
														else{
															admin.getRiders().add(admin.getRiders().remove());
														}
													}
												}
											}
										}
									}
								}
								else{
									System.out.println("the name you enterd is wrong plese try again !");
								}

							}
							else {
								if (choose==3){
									for(int i=0;i<customers.size();i++){
										for(int j=0;j<customers.get(i).getOrders().size();j++){
											if(customers.get(i).getOrders().get(j).getSignature().equals("mc")){
												System.out.println(customers.get(i).getCustomerName()+" : "+ customers.get(i).getOrders().get(j).getName()+" , "+customers.get(i).getOrders().get(j).getOrderhistory());
											}
										}
									}
								}
								else {
									if(choose==4){
										System.out.println("\tMcDonalds Menu");
										System.out.println("---------------------------------------");
										System.out.println("| CODE\t\tNAME\t\tPRICE |");
										System.out.println("---------------------------------------");
										for(int i=0;i<mc.getMenu().size();i++){
											System.out.println(mc.getMenu().get(i).toString());
										}
									}
								}
							}
						}
					}
					//sub
					else{
						if(choose==3){
							System.out.println("\tSubway");
							System.out.println("1-add and remove food");
							
							System.out.println("2-edit order status");
						
							System.out.println("3-view order history");

							System.out.println("4-view menu");

							choose=input.nextInt();
							if(choose==1){
								System.out.println("1-Add");
								
								System.out.println("2-Remove");

								System.out.println("3-Update");
									
								choose=input.nextInt();
								if(choose==1){
									System.out.println("enter the number of items you want to add:");
									int number=input3.nextInt();
									
									for (int i = 0;i<number;i++){
										System.out.println("enter the name:");
										name=input1.nextLine();	
									
										System.out.println("enter the code:");
										int code=input.nextInt();
									
										System.out.println("enter the price:");
										double price=input.nextDouble();
										
										food food=new food(name, code, price);
									
										sub.getMenu().add(food);
									}
								}				
								else{
									if(choose==2){
										System.out.println("---------------------------------------");
										System.out.println("| CODE\t\tNAME\t\tPRICE |");
										System.out.println("---------------------------------------");
										for(int i=0;i<sub.getMenu().size();i++){
											System.out.println(sub.getMenu().get(i).toString());
										}
										System.out.println("enter the code of the item you want to remove:");
										choose=input.nextInt();
										for(int i=0;i<sub.getMenu().size();i++){
											if(choose==sub.getMenu().get(i).getCode()){
												sub.getMenu().remove(i);
											}
										}
									}
									else {
										if(choose==3){
											System.out.println("---------------------------------------");
											System.out.println("| CODE\t\tNAME\t\tPRICE |");
											System.out.println("---------------------------------------");
											for(int i=0;i<sub.getMenu().size();i++){
												System.out.println(sub.getMenu().get(i).toString());
											}
											System.out.println("enter the code of the item you want to update:");
											choose=input.nextInt();
											for(int i=0;i<sub.getMenu().size();i++){
												if(choose==sub.getMenu().get(i).getCode()){
													System.out.println("1-update the name ");
													
													System.out.println("2-update the code ");
													
													System.out.println("3-update the price ");
													
													choose=input.nextInt();

													if(choose==1){
														System.out.println("enter the name:");
														sub.getMenu().get(i).setName(input1.nextLine());
													}
													else{
														if (choose==2){
															System.out.println("enter the code:");
															sub.getMenu().get(i).setCode(input.nextInt());
														}
														else {
															if (choose==3){
																System.out.println("enter the price:");
																sub.getMenu().get(i).setPrice(input.nextDouble());
															}
														}
													}
												}
											}
										}
									}
								}
							}
							else{
								if(choose==2){
									for(int i=0;i<customers.size();i++){
										for(int j=0;j<customers.get(i).getOrders().size();j++){
											if(customers.get(i).getOrders().get(j).getSignature().equals("sub")&&!customers.get(i).getOrders().get(j).getOrderstatus().equals("collected")){
												System.out.println(customers.get(i).getOrders().get(j).getName()+" , "+customers.get(i).getOrders().get(j).getOrderstatus());
											}
										}
									}
									System.out.println("enter the name of the order you want to edit:");
									System.out.println("Eg: order ##");
									name=input1.nextLine();
									for(int i=0;i<customers.size();i++){
										for(int j=0;j<customers.get(i).getOrders().size();j++){
											if(customers.get(i).getOrders().get(j).getName().equals(name)){
												curorder=customers.get(i).getOrders().get(j);
											}
										}
									}
									if(curorder.getName().equals(name)){
										System.out.println("1-preparing");
										
										System.out.println("2-ready");
										
										System.out.println("3-delivering");
										
										System.out.println("4-collected");
										
										choose=input.nextInt();
										if(choose==1){
											curorder.setOrderstatus("preparing");
											System.out.println("the order is: "+curorder.getOrderstatus());
										}
										else{
											if(choose==2){
												curorder.setOrderstatus("ready");
												System.out.println("the order is: "+curorder.getOrderstatus());
											}
											else{
												if(choose==3){
													curorder.setOrderstatus("delivering");
													System.out.println("the order is: "+curorder.getOrderstatus());
												}
												else{
													if(choose==4){
														curorder.setOrderstatus("collected");
														System.out.println("the order is: "+curorder.getOrderstatus());
														for(int i=0;i<admin.getRiders().size();i++){
															if(admin.getRiders().peek().getRiderorders().contains(curorder)){
																admin.getRiders().peek().setStatus("ready");
															}
															else{
																admin.getRiders().add(admin.getRiders().remove());
															}
														}
													}
												}
											}
										}
									}
									else {
										System.out.println("the name you enterd is wrong plese try again !");
									}
								}
								else {
									if (choose==3){
										for(int i=0;i<customers.size();i++){
											for(int j=0;j<customers.get(i).getOrders().size();j++){
												if(customers.get(i).getOrders().get(j).getSignature().equals("kfc")){
													System.out.println(customers.get(i).getCustomerName()+" : "+ customers.get(i).getOrders().get(j).getName()+" , "+customers.get(i).getOrders().get(j).getOrderhistory());
												}
											}
										}								
									}
									else {
										if(choose==4){
											System.out.println("\tSubway Menu");
											System.out.println("---------------------------------------");
											System.out.println("| CODE\t\tNAME\t\tPRICE |");
											System.out.println("---------------------------------------");
											for(int i=0;i<sub.getMenu().size();i++){
												System.out.println(sub.getMenu().get(i).toString());
											}
										}
									}
								}
							}
						}
					}
				}
			}
			else{
				if(choose==2){
					System.out.println("1-new customer");
					System.out.println("2-old custumer");
					choose=input.nextInt();
					if (choose==1){
						System.out.println("enter the customer name:");
						name =input1.nextLine();
						Customer customer=new Customer(name);
						curcustomer=customer;
						customers.add(curcustomer);
						System.out.println("\tResturant List");
						System.out.println("1-KFC");
						System.out.println("2-McDonalds");
						System.out.println("3-Subway");
						choose=input.nextInt();
						if(choose==1){
							System.out.println("\tKFC");
							System.out.println("1-purchase food from FoodeliverMenu");
							System.out.println("2-view order");
							System.out.println("3-view order status");
							System.out.println("4-view order history");
							choose=input.nextInt();
							if (choose==1){
								kfc.setCount(kfc.getCount()+1);
								System.out.println("enter the order number:");
								choose =input.nextInt();
								curorder=new order("order "+choose,curcustomer.getCustomerName());
								curorder.setOrderhistory(new java.util.Date());
								curorder.setOrderstatus("preparing");
								curorder.setSignature("kfc");
								curcustomer.getOrders().add(curorder);
								curcustomer.setCount(curcustomer.getCount()+1);

								System.out.println("---------------------------------------");
								System.out.println("| CODE\t\tNAME\t\tPRICE |");
								System.out.println("---------------------------------------");

								for(int i=0;i<kfc.getMenu().size();i++){
									System.out.println(kfc.getMenu().get(i).toString());
								}
								System.out.println("enter the number of items you want to buy:");
								int number1=input1.nextInt();

								for(int i=0;i<number1;i++){
									System.out.println("enter the code of the item you want to buy:");
									choose=input3.nextInt();
									for(int j=0;j<kfc.getMenu().size();j++){
										if(choose==kfc.getMenu().get(j).getCode()){
											curcustomer.getCart().add(kfc.getMenu().get(j));
										}
									}
								}
								System.out.println("1-self-collect");
								System.out.println("2-delivery");
								choose=input1.nextInt();
								if (choose==1){
									double total=0;
									System.out.println("---------------------------------------");
									System.out.println("| CODE\t\tNAME\t\tPRICE |");
									System.out.println("---------------------------------------");
									for(int i=0;i<curcustomer.getCart().size();i++){
										System.out.println(curcustomer.getCart().get(i).toString());
										total=total+curcustomer.getCart().get(i).getPrice();
									}
									System.out.println("The total= "+total);
									System.out.println("The order is: self-collect");

								}
								else {
									if(choose==2){
										double total=0;
										System.out.println("---------------------------------------");
										System.out.println("| CODE\t\tNAME\t\tPRICE |");
										System.out.println("---------------------------------------");
										for(int i=0;i<curcustomer.getCart().size();i++){
											System.out.println(curcustomer.getCart().get(i).toString());
											total=total+curcustomer.getCart().get(i).getPrice();
										}
										System.out.println("The total= "+total);
										System.out.println("The order is: delivering");
									}
								}
							}
							else{
								if(choose==2){
									System.out.println("---------------------------------------");
									System.out.println("| CODE\t\tNAME\t\tPRICE |");
									System.out.println("---------------------------------------");
									for(int i=0;i<curcustomer.getCart().size();i++){
										System.out.println(curcustomer.getCart().get(i).toString());
									}
								}
								else{
									if(choose==3){
										System.out.println("the order is " +curorder.getOrderstatus());	
									}
									else{
										if(choose==4){
											System.out.println("order history : "+curorder.getOrderhistory());
										}
									}
								}
							}
						}
						else{
							if(choose==2){
								System.out.println("\tMcdonalds");
								System.out.println("1-purchase food from FoodeliverMenu");
								System.out.println("2-view order");
								System.out.println("3-view order status");
								System.out.println("4-view order history");
								choose=input.nextInt();
								if (choose==1){
									mc.setCount(mc.getCount()+1);
									System.out.println("enter the order number:");
									choose =input.nextInt();
									curorder=new order("order "+choose,curcustomer.getCustomerName());
									curorder.setOrderhistory(new java.util.Date());
									curorder.setOrderstatus("preparing");
									curorder.setSignature("mc");
									curcustomer.getOrders().add(curorder);
									curcustomer.setCount(curcustomer.getCount()+1);

									System.out.println("---------------------------------------");
									System.out.println("| CODE\t\tNAME\t\tPRICE |");
									System.out.println("---------------------------------------");

									for(int i=0;i<mc.getMenu().size();i++){
										System.out.println(mc.getMenu().get(i).toString());
									}
									System.out.println("enter the number of items you want to buy:");
									int number1=input1.nextInt();

									for(int i=0;i<number1;i++){
										System.out.println("enter the code of the item you want to buy:");
										choose=input1.nextInt();
										for(int j=0;j<mc.getMenu().size();j++){
											if(choose==mc.getMenu().get(j).getCode()){
												curcustomer.getCart().add(mc.getMenu().get(j));
											}
										}
									}
									System.out.println("1-self-collect");
									System.out.println("2-delivery");
									choose=input1.nextInt();
									if (choose==1){
										System.out.println("---------------------------------------");
										System.out.println("| CODE\t\tNAME\t\tPRICE |");
										System.out.println("---------------------------------------");
										double total=0;
										for(int i=0;i<curcustomer.getCart().size();i++){
											System.out.println(curcustomer.getCart().get(i).toString());
											total=total+curcustomer.getCart().get(i).getPrice();
										}
										System.out.println("the total= "+total);
										System.out.println("the order is: self-collect");
									}
									else {
										if(choose==2){
											System.out.println("---------------------------------------");
											System.out.println("| CODE\t\tNAME\t\tPRICE |");
											System.out.println("---------------------------------------");
											double total=0;
											for(int i=0;i<curcustomer.getCart().size();i++){
											System.out.println(curcustomer.getCart().get(i).toString());
											total=total+curcustomer.getCart().get(i).getPrice();
											}
											System.out.println("the total= " +total);
											System.out.println("the order is: delivering");

										}
									}
								}
								else{
									if(choose==2){
										System.out.println("---------------------------------------");
										System.out.println("| CODE\t\tNAME\t\tPRICE |");
										System.out.println("---------------------------------------");
										for(int i=0;i<curcustomer.getCart().size();i++){
											System.out.println(curcustomer.getCart().get(i).toString());
										}
									}
									else{
										if(choose==3){
											System.out.println("the order is "+curorder.getOrderstatus());
										}	
										else{
											if(choose==4){
												System.out.println("order history : " +curorder.getOrderhistory());
											}
										}
									}
								}
							}
							else{
								if(choose==3){
									System.out.println("\tSubway");
									System.out.println("1-purchase food from FoodeliverMenu");
									System.out.println("2-view order");
									System.out.println("3-view order status");
									System.out.println("4-view order history");
									choose=input.nextInt();
									if (choose==1){
										sub.setCount(sub.getCount()+1);
										System.out.println("enter the order number:");
										choose =input.nextInt();
										curorder=new order("order "+choose,curcustomer.getCustomerName());
										curorder.setOrderhistory(new java.util.Date());
										curorder.setOrderstatus("preparing");
										curorder.setSignature("sub");
										curcustomer.getOrders().add(curorder);
										curcustomer.setCount(curcustomer.getCount()+1);

										System.out.println("---------------------------------------");
										System.out.println("| CODE\t\tNAME\t\tPRICE |");
										System.out.println("---------------------------------------");

										for(int i=0;i<sub.getMenu().size();i++){
											System.out.println(sub.getMenu().get(i).toString());
										}
										System.out.println("enter the number of items you want to buy:");
										int number1=input1.nextInt();

										for(int i=0;i<number1;i++){
											System.out.println("enter the code of the item you want to buy:");
											choose=input1.nextInt();
											for(int j=0;j<sub.getMenu().size();j++){
												if(choose==sub.getMenu().get(j).getCode()){
													curcustomer.getCart().add(sub.getMenu().get(j));
												}
											}
										}
										System.out.println("1-self-collect");
										System.out.println("2-delivery");
										choose=input1.nextInt();
										if (choose==1){
											double total=0;
											System.out.println("---------------------------------------");
											System.out.println("| CODE\t\tNAME\t\tPRICE |");
											System.out.println("---------------------------------------");
											for(int i=0;i<curcustomer.getCart().size();i++){
												System.out.println(curcustomer.getCart().get(i).toString());
												total=total+curcustomer.getCart().get(i).getPrice();
											}
											System.out.println("the total= "+total);
											System.out.println("the order is: self-collect");
										}
										else {
											if(choose==2){
												double total=0;
												System.out.println("---------------------------------------");
												System.out.println("| CODE\t\tNAME\t\tPRICE |");
												System.out.println("---------------------------------------");
												for(int i=0;i<curcustomer.getCart().size();i++){
													System.out.println(curcustomer.getCart().get(i).toString());
													total=total+curcustomer.getCart().get(i).getPrice();
												}
												System.out.println("the total= "+total);
												System.out.println("the order is: delivering");
											}
										}
									}
									else{
										if(choose==2){
											System.out.println("---------------------------------------");
											System.out.println("| CODE\t\tNAME\t\tPRICE |");
											System.out.println("---------------------------------------");
											for(int i=0;i<curcustomer.getCart().size();i++){
												System.out.println(curcustomer.getCart().get(i).toString());
											}
										}
										else{
											if(choose==3){
												System.out.println("the order is "+curorder.getOrderstatus());
											}
											else{
												if(choose==4){
													System.out.println("order history : "+curorder.getOrderhistory());
												}
											}
										}
									}
								}
							}
						}
					}
					else{
						if (choose==2){
							for(int i=0;i<customers.size();i++){
								System.out.println(customers.get(i).getCustomerName());
							}
							System.out.println("enter the name of the customer you want to chose:");
							name=input1.nextLine();
							for(int i=0;i<customers.size();i++){
								if(customers.get(i).getCustomerName().equals(name)){
									curcustomer=customers.get(i);
								}
							}
							if(curcustomer.getCustomerName().equals(name)){
								System.out.println("\tResturant List");
								System.out.println("1-KFC");
								System.out.println("2-McDonalds");
								System.out.println("3-Subway");
								choose=input.nextInt();
								if(choose==1){
									System.out.println("\tKFC");
									System.out.println("1-purchase food from FoodeliverMenu");
									System.out.println("2-view order");
									System.out.println("3-view order status");
									System.out.println("4-view order history");
									choose=input.nextInt();
									if (choose==1){
										kfc.setCount(kfc.getCount()+1);
										System.out.println("enter the order number:");
										choose =input.nextInt();
										curorder=new order("order "+choose,curcustomer.getCustomerName());
										curorder.setOrderhistory(new java.util.Date());
										curorder.setOrderstatus("preparing");
										curorder.setSignature("kfc");
										curcustomer.getOrders().add(curorder);
										curcustomer.setCount(curcustomer.getCount()+1);
										System.out.println("---------------------------------------");
										System.out.println("| CODE\t\tNAME\t\tPRICE |");
										System.out.println("---------------------------------------");

										for(int i=0;i<kfc.getMenu().size();i++){
											System.out.println(kfc.getMenu().get(i).toString());
										}
										System.out.println("enter the number of items you want to buy:");
										int number1=input1.nextInt();

										for(int i=0;i<number1;i++){
											System.out.println("enter the code of the item you want to buy:");
											choose=input3.nextInt();
											for(int j=0;j<kfc.getMenu().size();j++){
												if(choose==kfc.getMenu().get(j).getCode()){
													curcustomer.getCart().add(kfc.getMenu().get(j));
												}
											}
										}
										System.out.println("1-self-collect");
										System.out.println("2-delivery");
										choose=input1.nextInt();
										if (choose==1){
											double total=0;
											System.out.println("---------------------------------------");
											System.out.println("| CODE\t\tNAME\t\tPRICE |");
											System.out.println("---------------------------------------");
											for(int i=0;i<curcustomer.getCart().size();i++){
												System.out.println(curcustomer.getCart().get(i).toString());
												total=total+curcustomer.getCart().get(i).getPrice();
											}
											System.out.println("the total= "+total);
											System.out.println("the order is: self-collect");
										}
										else {
											if(choose==2){
												double total=0;
												System.out.println("---------------------------------------");
												System.out.println("| CODE\t\tNAME\t\tPRICE |");
												System.out.println("---------------------------------------");
												for(int i=0;i<curcustomer.getCart().size();i++){
													System.out.println(curcustomer.getCart().get(i).toString());
													total=total+curcustomer.getCart().get(i).getPrice();
												}
												System.out.println("the total= "+total);
												System.out.println("the order is: delivering");
											}
										}
									}
									else{
										if(choose==2){
											System.out.println("---------------------------------------");
											System.out.println("| CODE\t\tNAME\t\tPRICE |");
											System.out.println("---------------------------------------");
											for(int i=0;i<curcustomer.getCart().size();i++){
												System.out.println(curcustomer.getCart().get(i).toString());
											}
										}
										else{
											if(choose==3){
												System.out.println("the order is " +curorder.getOrderstatus());	
											}
											else{
												if(choose==4){
													System.out.println("order history : "+curorder.getOrderhistory());
												}
											}
										}
									}
								}
								else{
									if(choose==2){
										System.out.println("\tMcDonalds");
										System.out.println("1-purchase food from FoodeliverMenu");
										System.out.println("2-view order");
										System.out.println("3-view order status");
										System.out.println("4-view order history");
										choose=input.nextInt();
										if (choose==1){
											mc.setCount(mc.getCount()+1);
											System.out.println("enter the order number:");
											choose =input.nextInt();
											curorder=new order("order "+choose,curcustomer.getCustomerName());
											curorder.setOrderhistory(new java.util.Date());
											curorder.setOrderstatus("preparing");
											curorder.setSignature("mc");
											curcustomer.getOrders().add(curorder);
											curcustomer.setCount(curcustomer.getCount()+1);
											System.out.println("---------------------------------------");
											System.out.println("| CODE\t\tNAME\t\tPRICE |");
											System.out.println("---------------------------------------");

											for(int i=0;i<mc.getMenu().size();i++){
												System.out.println(mc.getMenu().get(i).toString());
											}
											System.out.println("enter the number of items you want to buy:");
											int number1=input1.nextInt();

											for(int i=0;i<number1;i++){
												System.out.println("enter the code of the item you want to buy:");
												choose=input1.nextInt();
												for(int j=0;j<mc.getMenu().size();j++){
													if(choose==mc.getMenu().get(j).getCode()){
														curcustomer.getCart().add(mc.getMenu().get(j));
													}
												}
											}
											System.out.println("1-self-collect");
											System.out.println("2-delivery");
											choose=input1.nextInt();
											if (choose==1){
												System.out.println("---------------------------------------");
												System.out.println("| CODE\t\tNAME\t\tPRICE |");
												System.out.println("---------------------------------------");
												double total=0;
												for(int i=0;i<curcustomer.getCart().size();i++){
													System.out.println(curcustomer.getCart().get(i).toString());
													total=total+curcustomer.getCart().get(i).getPrice();
												}
												System.out.println("the total= " +total);
												System.out.println("the order is: self-collect");
											}
											else {
												if(choose==2){
													System.out.println("---------------------------------------");
													System.out.println("| CODE\t\tNAME\t\tPRICE |");
													System.out.println("---------------------------------------");
													double total=0;
													for(int i=0;i<curcustomer.getCart().size();i++){
														System.out.println(curcustomer.getCart().get(i).toString());
														total=total+curcustomer.getCart().get(i).getPrice();
													}
													System.out.println("the total= "+total);
													System.out.println("the order is: delivering");
												}
											}
										}
										else{
											if(choose==2){
												System.out.println("---------------------------------------");
												System.out.println("| CODE\t\tNAME\t\tPRICE |");
												System.out.println("---------------------------------------");
												for(int i=0;i<curcustomer.getCart().size();i++){
													System.out.println(curcustomer.getCart().get(i).toString());
												}
											}
											else{
												if(choose==3){
													System.out.println("the order is "+curorder.getOrderstatus());
												}	
												else{
													if(choose==4){
														System.out.println("order history : " +curorder.getOrderhistory());
													}
												}
											}
										}
									}
									else{
										if(choose==3){
											System.out.println("\tSubway");
											System.out.println("1-purchase food from FoodeliverMenu");
											System.out.println("2-view order");
											System.out.println("3-view order status");
											System.out.println("4-view order history");
											choose=input.nextInt();
											if (choose==1){
												sub.setCount(sub.getCount()+1);
												System.out.println("enter the order number:");
												choose =input.nextInt();
												curorder=new order("order "+choose,curcustomer.getCustomerName());
												curorder.setOrderhistory(new java.util.Date());
												curorder.setOrderstatus("preparing");
												curorder.setSignature("sub");
												curcustomer.getOrders().add(curorder);
												curcustomer.setCount(curcustomer.getCount()+1);
												System.out.println("---------------------------------------");
												System.out.println("| CODE\t\tNAME\t\tPRICE |");
												System.out.println("---------------------------------------");

												for(int i=0;i<sub.getMenu().size();i++){
													System.out.println(sub.getMenu().get(i).toString());
												}
												System.out.println("enter the number of items you want to buy:");
												int number1=input1.nextInt();

												for(int i=0;i<number1;i++){
													System.out.println("enter the code of the item you want to buy:");
													choose=input1.nextInt();
													for(int j=0;j<sub.getMenu().size();j++){
														if(choose==sub.getMenu().get(j).getCode()){
															curcustomer.getCart().add(sub.getMenu().get(j));
														}
													}
												}
												System.out.println("1-self-collect");
												System.out.println("2-delivery");
												choose=input1.nextInt();
												if (choose==1){
													System.out.println("---------------------------------------");
													System.out.println("| CODE\t\tNAME\t\tPRICE |");
													System.out.println("---------------------------------------");
													double total=0;
													for(int i=0;i<curcustomer.getCart().size();i++){
														System.out.println(curcustomer.getCart().get(i).toString());
														total=total+curcustomer.getCart().get(i).getPrice();
													}
													System.out.println("the total= "+total);
													System.out.println("the order is: self-collect");
												}
												else {
													if(choose==2){
														System.out.println("---------------------------------------");
														System.out.println("| CODE\t\tNAME\t\tPRICE |");
														System.out.println("---------------------------------------");
														double total=0;
														for(int i=0;i<curcustomer.getCart().size();i++){
															System.out.println(curcustomer.getCart().get(i).toString());
															total=total+curcustomer.getCart().get(i).getPrice();
														}
														System.out.println("the total= "+total);
														System.out.println("the order is: delivering");
													}
												}
											}
											else{
												if(choose==2){
														System.out.println("---------------------------------------");
														System.out.println("| CODE\t\tNAME\t\tPRICE |");
														System.out.println("---------------------------------------");
													for(int i=0;i<curcustomer.getCart().size();i++){
														System.out.println(curcustomer.getCart().get(i).toString());
													}
												}
												else{
													if(choose==3){
														System.out.println("the order is "+curorder.getOrderstatus());
													}
													else{
														if(choose==4){
															System.out.println("order history : "+curorder.getOrderhistory());
														}
													}
												}
											}
										}
									}
								}
							}
							else{
								System.out.println("the name you entered is wrong plese try again !");
							}
						}
					}
				}
				else{
					if(choose==3){
						System.out.println("\tAdmin");
						System.out.println("1-add rider");
						System.out.println("2-view rider queue");
						System.out.println("3-view order history");
						System.out.println("4-view order status");
						System.out.println("5-view order statistics");

						choose=input.nextInt();
						if(choose==1){
							System.out.println("enter the rider name:");
							name =input1.next();
							Rider rider=new Rider(name);
							rider.setStatus("ready");
							admin.getRiders().add(rider);
							}
						else {
							if(choose==2){
									System.out.println(admin.getRiders().toString());
							}
							else{
								if(choose==3){
									for(int i=0;i<customers.size();i++){
										for(int j=0;j<customers.get(i).getOrders().size();j++){
											System.out.println(customers.get(i).getCustomerName()+" : "+customers.get(i).getOrders().get(j).getName()+" , " +customers.get(i).getOrders().get(j).getOrderhistory());
										}
									}
								}
								else{
									if(choose==4){
										for(int i=0;i<customers.size();i++){
											for(int j=0;j<customers.get(i).getOrders().size();j++){
												System.out.println(customers.get(i).getCustomerName()+" : "+customers.get(i).getOrders().get(j).getName()+" , " +customers.get(i).getOrders().get(j).getOrderstatus());
											}
										}
									}
									else {
										if(choose==5){
											if(kfc.getCount()>mc.getCount()&&mc.getCount()>sub.getCount()){
												System.out.println("KFC is the most selling resturant with "+kfc.getCount()+" total orders");
											}
											else{
												if (kfc.getCount()>mc.getCount()&&mc.getCount()<sub.getCount()){
													if(kfc.getCount()>sub.getCount()){
														System.out.println("KFC is the most selling resturant with "+kfc.getCount()+" total orders");
													}
													else{
														System.out.println("SUB is the most selling resturant with "+sub.getCount()+" total orders");
													}
												}
												else {
													if(kfc.getCount()<mc.getCount()&&mc.getCount()>sub.getCount()){
														System.out.println("MC is the most selling resturant with "+mc.getCount()+" total orders");
													}
													else{
														System.out.println("SUB is the most selling resturant with "+sub.getCount()+" total orders");
													}
												}
											}
											Customer maxcustomers=customers.get(0);
											for(int i=0;i<customers.size();i++){
												if(customers.get(i).getCount()>maxcustomers.getCount()){
													maxcustomers=customers.get(i);
												}
											}
											System.out.println(maxcustomers.getCustomerName()+" is the highest order amount customer with "+maxcustomers.getCount()+" total orders");
											
											Rider maxRiders=admin.getRiders().peek();
											for(int i=0;i<admin.getRiders().size();i++){
												admin.getRiders().add(admin.getRiders().remove());
												if(admin.getRiders().peek().getCount()>maxRiders.getCount()){
													maxRiders=admin.getRiders().peek();
												}
											}
											System.out.println(maxRiders.getName()+" is the highest delivering rider with "+maxRiders.getCount()+" total orders");
										}
									}
								}
							}
						}
					}
					else{
						if(choose==4){
							System.out.println("the currider is :"+currider.getName()+" , "+currider.getStatus());
							System.out.println("1-deliver the order");
							System.out.println("2-view order status");
							System.out.println("3-view order history");
							System.out.println("4-how many riders before you");
							choose=input.nextInt();

							if(choose==1){
								if(currider.getStatus().equals("delivering")){
									System.out.println("you are still delivering an order check how many rider befor you");
								}
								else {
									for(int i=0;i<customers.size();i++){
										for(int j=0;j<customers.get(i).getOrders().size();j++){
											if(customers.get(i).getOrders().get(j).getOrderstatus().equals("ready")){
												System.out.println(customers.get(i).getOrders().get(j).getName()+" : "+customers.get(i).getOrders().get(j).getSignature());
											}
										}
									}
									System.out.println("enter the name of the order you want to deliver:");
									System.out.println("Eg: order ##");
									name=input1.nextLine();
									for(int i=0;i<customers.size();i++){
										for(int j=0;j<customers.get(i).getOrders().size();j++){
											if(customers.get(i).getOrders().get(j).getName().equals(name)){
												curorder=customers.get(i).getOrders().get(j);
												System.out.println("youre delivering this order");
												currider.setStatus("delivering");
												currider.setCount(currider.getCount()+1);
												currider.getRiderorders().add(curorder);
												admin.getRiders().add(admin.getRiders().remove());
										}
									}
								}
									if(!curorder.getName().equals(name)){
										System.out.println("the name you enterd is wrong plese try again !");
									}
							}
						}
							else {
								if(choose==2){
									System.out.println(curorder.getOrderstatus());
								}
								else{
									if(choose==3){
										System.out.println(curorder.getOrderhistory());
									}
									else{
										if(choose==4){
											int count=0;
											if(currider.getStatus()=="ready"){
												System.out.println("its your turn");
												System.out.println("you are ready to deliver");

											}
											else{
												for (int i=0;i<admin.getRiders().size()-1;i++){
													count++;
													admin.getRiders().add(admin.getRiders().remove());
												}
												System.out.println("there are "+count+" before you");
											}
										}
									}
								}
							}
						}
						else{
							if(choose==5){
								System.out.println("Thank You for using my app ;)");
								break;	
							}
						}
					}
				}
			}
		}
	}
}
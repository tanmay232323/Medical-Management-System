package project;

import java.util.Scanner;

public class Store {

	static int count,addAll,sumAdd;
	double percentAdd;
	
	static int s_no[]=new int[20];
	
	static int price[]=new int[20];
	
	static int quantity[]=new int[20];

	static String productArr[]=new String[20];
	
	static int i;
	static int counting=-1;
	
	int store() {
			System.out.println("-----------------------------------------");
			System.out.println("|         1)Human Medicine              |");
			System.out.println("|         2)Animal Medicine             |");
			System.out.println("|         3)Cosmetics                	|");
			System.out.println("|         4)Equipment           		|");
			System.out.println("|         5)Exit                    	|");
			System.out.println("-----------------------------------------");
			Scanner sc = new Scanner(System.in);
			System.out.println("Please choose your option:");
			int x = sc.nextInt();
				return x;
		}
	int HumanMedicine() {
		while(true) {
		System.out.println("--------------------------------------");
		System.out.println("|   101)Metformin------------1packet--- Rs.200--|");
		System.out.println("|   102)Losartan-------------1packet----Rs.250--|");
		System.out.println("|   103)Antibiotics---------1packet----Rs.50----|");
		System.out.println("|   104)Gabapentin-----------1packet----Rs.70---|");
		System.out.println("|   105)Omeprazole-----------1packet----Rs.60---|");
		System.out.println("--------------------------------------");
		System.out.println("Please choose your product code:");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
			switch(x) {
			case 101:
				System.out.println("How many Packet do you need?");
				int Metformin=sc.nextInt();
				quantity[i]=Metformin;
				price[i]=Metformin*200;
				addAll+=Metformin*200; 
				productArr[i]="Metformin";
				s_no[i]=++count;
				i++;
				break;
			case 102:
				System.out.println("How many Packet do you need?");
				int Losartan=sc.nextInt();
				quantity[i]=Losartan;
				price[i]=Losartan*250;
				addAll+=Losartan*250;
				productArr[i]="Losartan";
				s_no[i]=++count;
				i++;
				break;
			case 103:
				System.out.println("How many Packet do you need?");
				int Antibiotics=sc.nextInt();
				quantity[i]=Antibiotics;
				price[i]=Antibiotics*50;
				addAll+=Antibiotics*50;
				s_no[i]=++count;
				productArr[i]="Antibiotics";
				i++;
				break;
			case 104:
				System.out.println("How many packet do you need?");
				int Gabapentin=sc.nextInt();
				quantity[i]=Gabapentin;
				price[i]=Gabapentin*70;
				addAll+=Gabapentin*70;
				s_no[i]=++count;
				productArr[i]="Gabapentin";
				i++;
				break;
			case 105:
				System.out.println("How many Packet do you need?");
				int Omeprazole=sc.nextInt();
				quantity[i]=Omeprazole;
				price[i]=Omeprazole*60;
				addAll+=Omeprazole*60;
				s_no[i]=++count;
				productArr[i]="Omeprazole";
				i++;
				break;
			default:
				System.out.println("----X---Invalid Number---X----");
				continue;
			}
			while(true) {
				System.out.println("Press 1 to continue");
				System.out.println("Press 2 for exit");
				int z=sc.nextInt();
					switch(z) {
					case 1:
						return z;
					case 2:
						return z;
					default :
						System.out.println("----X---Invalid Number---X----");
						continue;
					}
			}
		}
	}
	
	int AnimalMedicine() {
		while(true){
		System.out.println("------------------------------------------------------");
		System.out.println("|   201)MarboFloxacin-----------1Tablet-------Rs.60--|");
		System.out.println("|   202)Maropitant--------------1Tablet-------Rs.20--|");
		System.out.println("|   203)Mavacoxid---------------1Tablet-------Rs.50--|");
		System.out.println("|   204)Meloxicam---------------1Tablet-------Rs.35--|");
		System.out.println("|   205)Metacam-----------------1Tablet-------Rs.45--|");
		System.out.println("------------------------------------------------------");
		System.out.println("Please choose your product code:");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
			switch(x) {
			case 201:
				System.out.println("How many 1Tablet do you need?");
				int MarboFloxacin=sc.nextInt();
				quantity[i]=MarboFloxacin;
				price[i]=MarboFloxacin*60;
				addAll+=MarboFloxacin*200;
				productArr[i]="MarboFloxacin";
				s_no[i]=++count;
				i++;
				break;
			case 202:
				System.out.println("How many 1Tablet do you need?");
				int Maropitant=sc.nextInt();
				quantity[i]=Maropitant;
				price[i]=Maropitant*20;
				addAll+=Maropitant*20;
				productArr[i]="Maropitant";
				s_no[i]=++count;
				i++;
				break;
			case 203:
				System.out.println("How many 1Tablet do you need?");
				int Mavacoxid=sc.nextInt();
				quantity[i]=Mavacoxid;
				price[i]=Mavacoxid*50;
				addAll+=Mavacoxid*50;
				productArr[i]="Mavacoxid";
				s_no[i]=++count;
				i++;
				break;
			case 204:
				System.out.println("How many 1Tablet do you need?");
				int Meloxicam=sc.nextInt();
				quantity[i]=Meloxicam;
				price[i]=Meloxicam*35;
				addAll+=Meloxicam*35;
				productArr[i]="Meloxicam";
				s_no[i]=++count;
				i++;
				break;
			case 205:
				System.out.println("How many 1Tablet do you need?");
				int Metacam=sc.nextInt();
				quantity[i]=Metacam;
				price[i]=Metacam*45;
				addAll+=Metacam*45;
				productArr[i]="Metacam";
				s_no[i]=++count;
				i++;
				break;
			default:
				System.out.println("----X---Invalid Number---X----");
				continue;
			}
			while(true){
			System.out.println("Press 1 to continue");
			System.out.println("Press 2 for exit");
			int z=sc.nextInt();
			int abz=z;
				switch(z) {
				case 1:
					return z;
				case 2:
					return z;
				default :
					System.out.println("----X---Invalid Number---X----");
					continue;
			}
			
			}
		}
	}
	
	int cosmetics() {
		while(true) {
			System.out.println("--------------------------------------");
			System.out.println("|   301)Kajal------------1----Rs.50--|");
			System.out.println("|   302)Lip stick--------1----Rs.20--|");
			System.out.println("|   303)Nail polish------1----Rs.30--|");
			System.out.println("|   304)Face Powder------1----Rs.70--|");
			System.out.println("|   305)Lotion-----------1----Rs.120--|");
			System.out.println("--------------------------------------");
			System.out.println("Please choose your product code:");
			Scanner sc = new Scanner(System.in);
			int x=sc.nextInt();
				switch(x) {
				case 301:
					System.out.println("How many quantity do you need?");
					int Kajal=sc.nextInt();
					quantity[i]=Kajal;
					price[i]=Kajal*50;
					addAll+=Kajal*50; 
					productArr[i]="Kajal";
					s_no[i]=++count;
					i++;
					break;
				case 302:
					System.out.println("How many quantity do you need?");
					int lip=sc.nextInt();
					quantity[i]=lip;
					price[i]=lip*20;
					addAll+=lip*20;
					productArr[i]="Lip stick";
					s_no[i]=++count;
					i++;
					break;
				case 303:
					System.out.println("How many quantity do you need?");
					int polish=sc.nextInt();
					quantity[i]=polish;
					price[i]=polish*30;
					addAll+=polish*30;
					s_no[i]=++count;
					productArr[i]="Nail polish";
					i++;
					break;
				case 304:
					System.out.println("How many quantity do you need?");
					int powder=sc.nextInt();
					quantity[i]=powder;
					price[i]=powder*70;
					addAll+=powder*70;
					s_no[i]=++count;
					productArr[i]="Face powder";
					i++;
					break;
				case 305:
					System.out.println("How many quantity do you need?");
					int lotion=sc.nextInt();
					quantity[i]=lotion;
					price[i]=lotion*60;
					addAll+=lotion*50;
					s_no[i]=++count;
					productArr[i]="Lotion";
					i++;
					break;
				default:
					System.out.println("----X---Invalid Number---X----");
					continue;
				}
				while(true) {
					System.out.println("Press 1 to continue");
					System.out.println("Press 2 for exit");
					int z=sc.nextInt();
						switch(z) {
						case 1:
							return z;
						case 2:
							return z;
						default :
							System.out.println("----X---Invalid Number---X----");
							continue;
						}
				}
			}
	}
	
	int Equaipment() {
		while(true) {
			System.out.println("--------------------------------------");
			System.out.println("|   401)Mask------------1pocket----Rs.30--|");
			System.out.println("|   402)ToothBrush--------1kg----Rs.60--|");
			System.out.println("|   403)Face Wash-------1kg----Rs.50--|");
			System.out.println("|   404)cerelac-------1kg----Rs.350--|");
			System.out.println("|   405)thermometer------1kg----Rs.370--|");
			System.out.println("--------------------------------------");
			System.out.println("Please choose your product code:");
			Scanner sc = new Scanner(System.in);
			int x=sc.nextInt();
				switch(x) {
				case 401:
					System.out.println("How many kgs do you need?");
					int Mask=sc.nextInt();
					quantity[i]=Mask;
					price[i]=Mask*30;
					addAll+=Mask*30; 
					productArr[i]="Mask";
					s_no[i]=++count;
					i++;
					break;
				case 402:
					System.out.println("How many kgs do you need?");
					int ToothBrush=sc.nextInt();
					quantity[i]=ToothBrush;
					price[i]=ToothBrush*60;
					addAll+=ToothBrush*60;
					productArr[i]="ToothBrush";
					s_no[i]=++count;
					i++;
					break;
				case 403:
					System.out.println("How many kgs do you need?");
					int FaceWash=sc.nextInt();
					quantity[i]=FaceWash;
					price[i]=FaceWash*50;
					addAll+=FaceWash*50;
					s_no[i]=++count;
					productArr[i]="FaceWash";
					i++;
					break;
				case 404:
					System.out.println("How many kgs do you need?");
					int cerelac=sc.nextInt();
					quantity[i]=cerelac;
					price[i]=cerelac*350;
					addAll+=cerelac*350;
					s_no[i]=++count;
					productArr[i]="cerelac";
					i++;
					break;
				case 405:
					System.out.println("How many kgs do you need?");
					int thermometer=sc.nextInt();
					quantity[i]=thermometer;
					price[i]=thermometer*370;
					addAll+=thermometer*370;
					s_no[i]=++count;
					productArr[i]="thermometer";
					i++;
					break;
				default:
					System.out.println("----X---Invalid Number---X----");
					continue;
				}
				while(true) {
					System.out.println("Press 1 to continue");
					System.out.println("Press 2 for exit");
					int z=sc.nextInt();
						switch(z) {
						case 1:
							return z;
						case 2:
							return z;
						default :
							System.out.println("----X---Invalid Number---X----");
							continue;
						}
				}
			}
	}
	
	void sumOfAll() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name      :");
		String x=sc.next();
		System.out.print("Enter your address   :");
		String y=sc.next();
		System.out.print("Enter your contact no:");
		long z=sc.nextLong();
		System.out.println("--------------------------------------");
		System.out.println("-------Welcome to Medical Store-----");
		System.out.println("---------------------------------------");
		System.out.println("S.no   |   Qty  | Name                | Price");
		System.out.println("-----------------------------------------------");
		for(int k=0;k<count;k++) {
			System.out.printf("%d          %-2d     %-20s   %-6d\n",s_no[k],quantity[k],productArr[k],price[k]);
		} 
		System.out.println("------------------------------------------");
		System.out.println("Total bill of purchased items:      "+addAll);
		if(addAll>500) {
			percentAdd=addAll*0.05;
			addAll-=percentAdd;
			System.out.println("you received a discount of 5% : "+percentAdd);
		}
		System.out.println("Final bill is:                      "+addAll);
		System.out.println("=====Thankyou for Shopping you saved Rs."+percentAdd+"======");
		System.out.println("------------------------------------------------");
		System.out.println("Name        :"+x);
		System.out.println("Address     :"+y);
		System.out.println("Contact no. :"+z);
		System.out.println("================Java is Awesome===============");
		
}
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------");
		System.out.println("-------Welcome to Medicine Store-----");
		Store objStore=new Store();
		int x=0;
		while(x<10) {
			x=objStore.store();
			if(x==1) {
				int val=objStore.HumanMedicine();
				if(val==1) {
					continue;
				}
				if(val==2) {
					objStore.sumOfAll();
					return;
				}
			}
			else if(x==2) {
				int reu=objStore.AnimalMedicine();
				if(reu==1) {
					continue;
				}
				if(reu==2) {
					objStore.sumOfAll();
					return;
				}
				
			}
			else if(x==3) {
				int reu=objStore.cosmetics();
				if(reu==1) {
					continue;
				}
				if(reu==2) {
					objStore.sumOfAll();
					return;
				}
				
			}
			else if(x==4) {
				int reu=objStore.Equaipment();
				if(reu==1) {
					continue;
				}
				if(reu==2) {
					objStore.sumOfAll();
					return;
				}
				
			}
			
			else if(x==5 && count>0) {
				objStore.sumOfAll();
			}
			else if(x==5 && count==0) {
				return;
			}
			else {
				System.out.println("----X---Invalid Number---X----");
			}
		}
	}
}


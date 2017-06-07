import java.io.*; 
import java.util.*;
import java.text.NumberFormat; 
public class Pointofsale{

		 public static void main(String[] args)throws IOException { 
		  BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
		   int subtotal=0;
		   int price[]={10,25,80,110,100}; 
		   String products[]={"BEER","VODKA","WINE","CHAMPAGNE","BELIERE"}; 
		   String product;   
		 System.out.println("\t\tMODERN SUPERMARKET LTD");  
		 System.out.println("Please Choose a product:");  
		 System.out.printf("\n"+"\t[0] BEER    [2] WINE"); 
		 System.out.printf("%n\t[1] VODKA   [3] CHAMPAGNE"); 
		 System.out.printf("%n\t[4] BELIERE");
		 System.out.println("\n....................................."); 
		 System.out.print("\nSelect Product:"); 
		 String prdid = input.readLine(); 
		 int productid=Integer.valueOf(prdid); 
		 System.out.print("Enter Quantity:"); 
		 String quant=input.readLine(); 
		 int quantity=Integer.parseInt(quant); 
		   
		 if(productid==0){ 
		  subtotal=(price[0])*quantity; 
		  } 
		  else if(productid==1){ 
		  subtotal=(price[1])*quantity; 
		   } 
		  else if(productid==2){ 
		  subtotal=(price[2])*quantity; 
		   } 
		  else if(productid==3){ 
		  subtotal=(price[3])*quantity; 
		   } 
		  else if(productid==4){ 
			  subtotal=(price[4])*quantity; 
			   } 
		  else{ 
		   System.out.println("Wrong product I.D"); 
		  } 
		  
		switch (productid){
		case 0:
		    product=products[0]; 
		    break;
		case 1:
		  product=products[1]; 
		    break;
		case 2: 
		  product=products[2]; 
	       break;
		case 3:
		  product=products[3]; 
		break;
		case 4:
			  product=products[4]; 
		break;
		default:
		   product=""; 
		  } 
		 NumberFormat currency = NumberFormat.getCurrencyInstance(); 
		double salestax= subtotal*(19.5/100); 
		double totalsale=subtotal+salestax; 
		System.out.println("\tMODERN SUPERMARKET LTD"); 
		System.out.println("....................................."); 
		Date saledate = new Date();
		System.out.println(saledate); 
		System.out.println("Branch: Bugolobi  \nPlot 54 Village Mall");
		System.out.println("modernug@gmail.com");
		System.out.println("....................................."); 


		System.out.print("Sold:  "+product); 
		  System.out.println("		Qty:  "+quantity); 
		  System.out.println("....................................."); 
		  System.out.println("Subtotal:  "+currency.format(subtotal)); 
		  System.out.println("Sales Tax Amount: "+currency.format(salestax)); 
		  System.out.println("Total Sale Amount: "+currency.format(totalsale)); 
		  System.out.println("....................................."); 
		  String methodpay[]={"Credit/Debit card","CASH"};
		  System.out.print("Enter Payment Metod:");
		  String payem= input.readLine(); 
			 int paymethod=Integer.valueOf(payem);
			
			 if(paymethod==1){
				System.out.println("Paid With:"+methodpay[0]+":"+currency.format(totalsale));
			 }
			 else if (paymethod==2){
		  System.out.print("Enter Cash:");
		  String money = input.readLine(); 
			 int cash=Integer.valueOf(money);
			 System.out.println("Paid With  :"+methodpay[1]+":"+currency.format(cash));
			 double  change=cash-totalsale;
			 int changecust=(int)change;
			 while(changecust<0){
				 changecust=0;
			 System.out.print("CHANGE	:"+changecust);
			 }
			 System.out.println("\tCHANGE	:"+changecust);
			 }
			   System.out.printf("%nTHANK YOU FOR SHOPPING THE SMART WAY"); 
		     }  
}

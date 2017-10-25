//this is class FillInProperties, it does NOT inherit the property class as it acts as my "sub" main, here i implement my printing and cost generator 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FillInProperties  {
	
	public static void FillInPropertiesMethod(ArrayList<House> houses,ArrayList<Apartment> apartments, ArrayList<Villa> villas)  {
		
		//filling in house property 
		/*houses.add(new House(3,"Tope Akinwale","6 Castlegate Mews Adamstown",150,3,4,3,300,3));
		houses.get(0).RenterProperty(3); //the first number is the postion in the array the second number is the amount of days it was rented for
		houses.add(new House(2,"Nikolaj Jasenko","5 Castlegate Mews Blanch",200,4,4,4,300,3));
		houses.get(1).RenterProperty(3);
		houses.add(new House(1,"Youseff Mourad","17 Finnstown Avenue",150,3,3,3,100,3));
		houses.get(2).RenterProperty(3);
		houses.get(0).RenterProperty(4);
		houses.get(0).RenterProperty(3);
		houses.get(2).RenterProperty(1);
		houses.get(2).RenterProperty(2);
		houses.get(1).RenterProperty(5);
		houses.get(1).RenterProperty(4);
		
		
		//filling in apartment property
		apartments.add(new Apartment(4,"Peter Odemwingie","17 Ashpark Grove",500,2,3,1));
		apartments.get(0).RenterProperty(1);
		apartments.add(new Apartment(5,"Lucas Peterson","5 Kilmartin Road",600,3,3,1));
		apartments.get(1).RenterProperty(1);
		apartments.add(new Apartment(6,"John Hughes","25 Christchurch park",500,2,3,2));
		apartments.get(2).RenterProperty(2);
		apartments.get(0).RenterProperty(3);
		apartments.get(0).RenterProperty(3);
		apartments.get(1).RenterProperty(2);
		apartments.get(2).RenterProperty(2);
		apartments.get(2).RenterProperty(1);
		apartments.get(1).RenterProperty(1);
		
		
		
		//filling in villa property 
		villas.add(new Villa(7,"Mohammad Basha","9 Castlerida drive", 550,3,5,30,12,4));
		villas.get(0).RenterProperty(4);
		villas.add(new Villa(8,"Kamil Cierpisz","18 Portloaise crescent",650,4,7,30,12,3));
		villas.get(1).RenterProperty(3);
		villas.add(new Villa(9,"James Martin","24 Belfield walk",550,3,5,30,12,2));
		villas.get(2).RenterProperty(2);
		villas.get(2).RenterProperty(3);
		villas.get(2).RenterProperty(5);
		villas.get(1).RenterProperty(3);
		villas.get(1).RenterProperty(5);
		villas.get(0).RenterProperty(3);
		villas.get(0).RenterProperty(5);*/
		

		//ArrayList<String>Apartments = new ArrayList<String>();
		try (BufferedReader BC= new BufferedReader(new FileReader("InputProperty.txt"))){

			String line; 
			while ((line = BC.readLine()) != null) {
				//Apartments.add(line);
				String [] myArray= line.split(" ");
				//System.out.println(myArray);
				if(myArray.length>0) {
					if(myArray[0].equals("1")) {
						apartments.add(new Apartment(Integer.parseInt(myArray[1]),myArray[2],myArray[3],Integer.parseInt(myArray[4]),Integer.parseInt(myArray[5]),Integer.parseInt(myArray[6]),Integer.parseInt(myArray[7])));
					}
					
					else if(myArray[0].equals("2")) {
						houses.add(new House(Integer.parseInt(myArray[1]),myArray[2],myArray[3],Integer.parseInt(myArray[4]),Integer.parseInt(myArray[5]),Integer.parseInt(myArray[6]),Integer.parseInt(myArray[7]),Integer.parseInt(myArray[8]),Integer.parseInt(myArray[9])));
					}
					
					else if(myArray[0].equals("3")) {
						villas.add(new Villa(Integer.parseInt(myArray[1]),myArray[2],myArray[3],Integer.parseInt(myArray[4]),Integer.parseInt(myArray[5]),Integer.parseInt(myArray[6]),Integer.parseInt(myArray[7]),Integer.parseInt(myArray[8]),Integer.parseInt(myArray[9])));
					}
					
					else {
						String message = "The arraylist identifier is incorrect,enter in 1,2 or 3 please";
						JFrame frame = new JFrame("Arraylist identifier problem");
						JOptionPane.showInputDialog(message);
						System.exit(0);
					}
					//System.out.println("The elements of the arraylist are: ");
					/*for(int i=0;i<Apartments.size();i++){
						int g= 1;
						Apartments.get(i).printApartment(); 
						System.out.println();
						Houses.get(i).printHouse();
						System.out.println();
						Villas.get(i).villPrint();
						System.out.println(); 
					}*/

				}
			}

		}
		catch (IOException e) {
			e.printStackTrace();
		}

	
		
	} 
	
	//method for printing out all the properties
	public static void PrintOutMethod(ArrayList<House> houses,ArrayList<Apartment> apartments, ArrayList<Villa> villas) {
		int k;
		for(k=0; k<3; k++) {
			villas.get(k).villPrint();
			System.out.println();
			apartments.get(k).printApartment();
			System.out.println();
			houses.get(k).printHouse();
			System.out.println();
			
		}
		/*for(int i=0;i<apart();i++){
			int g= 1;
			Apartments.get(i).printApartment();
		} */
	}
		
	     //generates the cost of the house property
		 public static void houseCost(ArrayList<House> houses){
			 int i;
			 int sumofcost=0;
			 int SumOfHouse=0;
			 int clearingfee=0;
			 System.out.println("**HOUSE PROPERTY*");
			 for(i=0; i<houses.size(); i++) {
				 System.out.println("The cost of this house per day is : "  +houses.get(i).getCost());
				 sumofcost+= houses.get(i).getCost(); //sumofcost is equal to the cost of each house 
				 houses.get(i).TotalRentDays = houses.get(i).TotalRentDays * houses.get(i).getCost(); //multiplying cost by the number of days the property is being rented
				 System.out.println("The total income of this package is " +houses.get(i).TotalRentDays);
				 SumOfHouse+= houses.get(i).TotalRentDays;
				 System.out.println();
			 }
			 
			 System.out.println("The total amount of money made by the house property is: "+SumOfHouse);
			 System.out.println("**********************************************************************");
			 System.out.println();
	}
	
		 //method to generate cost of the apartment property
		 public static void apartmentCost(ArrayList<Apartment> apartments) {
			 int i;
			 int sumofcost=0;
			 int SumOfApartment=0;
			 System.out.println("**APARTMENT PROPERTY**");
			 for(i=0; i<apartments.size(); i++) {
				 System.out.println("The cost of this apartment per day is :" +apartments.get(i).getCost());
				 sumofcost+= apartments.get(i).getCost();
				 apartments.get(i).TotalRentDays= apartments.get(i).TotalRentDays * apartments.get(i).getCost();
				 System.out.println("The total amount made for this package is "+apartments.get(i).TotalRentDays);
				 SumOfApartment+= apartments.get(i).TotalRentDays;
				 System.out.println();
			 }
			 System.out.println("The total amount of money made by the apartment property is: "+SumOfApartment);
			 System.out.println("***********************************************************************************");
			 System.out.println();
		 }
	
		 //method to generate cost of the villa property
		 public static void villaCost(ArrayList<Villa> villas) {
			 
			 //Variable initialisation 
			 int i;
			 int sumofcost=0;
			 int SumOfVilla=0;
			 int tax=0;
			 int amounttaxed=0;
			 int roomservice=0;
			 int addon=0; //add on is how much is made from luxury tax and room service
			 
			 System.out.println("**VILLA PROPERTY**");
			 for(i=0; i<villas.size(); i++) {
				 System.out.println("The cost of this villa per day is " +villas.get(i).getCost() ); //printing cost of each villa per day
				 sumofcost+= villas.get(i).getCost();
				 tax= villas.get(i).getLuxuryTax(); //getting tax
				 roomservice = villas.get(i).getRoomService(); //getting room service 
				 System.out.println("The luxury tax is: " +tax+ " euro extra per day");
				 System.out.println("The room service is: " +roomservice+ " euro extra per day");
				 addon=roomservice +tax;
				 addon*= villas.get(i).TotalRentDays;
				 System.out.println("The add on price is: "+addon); //how much money generated from luxury tax and room service
				 sumofcost= sumofcost + tax;
				 addon+=villas.get(i).getCost();
				 sumofcost = villas.get(i).TotalRentDays * addon;
				 System.out.println("The cost of the property is: "+sumofcost);
				 SumOfVilla+= sumofcost;
				 System.out.println();
			 }
			 System.out.println("The total amount of money made by the villa property is: "+SumOfVilla);
		 }
		 //I decided to do the cost in three methods rather than in one to make it clearer that they are 3 different properties rather than one 
}
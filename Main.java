//This is my main class, here i declare my array lists and call all my functions
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
	
//main method 
	public static void main(String []args) {
		//initializing arrayLists
		ArrayList<House> houses = new ArrayList<House>(); //declaring an array list of type house called "houses"
		ArrayList<Apartment> apartments = new ArrayList<Apartment>();
		ArrayList<Villa> villas = new ArrayList<Villa>();
		
		//calling methods
		FillInProperties.FillInPropertiesMethod(houses, apartments, villas);
		FillInProperties.PrintOutMethod(houses,apartments,villas);
		FillInProperties.houseCost(houses);
		FillInProperties.apartmentCost(apartments);
		FillInProperties.villaCost(villas);
		
	}
	
	public static void IntoArrayList1(ArrayList<Apartment>apartments,ArrayList<House>houses,ArrayList<Villa> villas) {
		Apartment A= new Apartment(1,"hhah","aa",1,1,1,1);
		House B= new House(1,"hhah","aa",1,1,1,1,1,1);
		Villa C = new Villa(1,"hhah","aa",1,1,1,1,1,1);
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
}
 
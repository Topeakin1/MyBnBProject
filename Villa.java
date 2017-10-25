//this is my villa subclass, it inherits the property superclass
public class Villa extends Property {
  private int roomService;
  private int luxuryTax;
  private int StoreyNum;
  private int Beds;
  private int days;
  
  
  public Villa(int num,String name, String address,int cost, int StoreyNum, int Beds,int roomService, int luxuryTax,int days) { //constructor
	   super(num, name, address, cost); //accessing constructor from superclass
	   this.roomService = roomService;
	   this.luxuryTax = luxuryTax;
	   this.StoreyNum= StoreyNum; 
	   this.Beds= Beds; 
	   this.days= days;
  }
      //accessor
	  public void setRoomService(int input3) {
		   this.roomService= input3; 
	   }
	   
	  //mutator
	  public int getRoomService() {
		   return roomService;
	   }
	  
	  //accessor
	  public void setLuxuryTax(int input4) {
		   this.luxuryTax= input4; 
	   }
	  
	  //mutator
	  public int getLuxuryTax() {
		   return luxuryTax;
	   }
	  
	  //villa print method
	  public void villPrint() {
		  printDetails(); //adding to the printDetails method 
		  System.out.println("There are "+StoreyNum+" stories in the property");
		  System.out.println("There are "+Beds+" beds in the property");
		  System.out.println("The cost of room service is: "+roomService+ " euro per day");
		  System.out.println("Luxury tax is "+luxuryTax+" euro per day");
		  System.out.println("This property was rented for " +days+" day(s)");
	  }
	  
}
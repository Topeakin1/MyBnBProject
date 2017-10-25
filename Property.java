/*This is my superclass it contains a constructor, my methods, mutators and accessors */

public class Property implements RentalItem {
	    //variable declaration
	   private int num;
	   private String name;
	   private String address;
	   private int cost;
	   int TotalRentDays=0;
	   
	   public void RentalItem() {
		   
	   }

	    public Property(int num,String name, String address, int cost) { //constructor (has to have same name as class)
	      setCost(cost); 
	      setName(name);
	      setNum(num);
	      setAddress( address);
	    }
	    
	    //method for calculating total number of days the property was rented for
        public void RenterProperty(int RentDays ) {
        	
        	TotalRentDays+= RentDays;
        	
        }
        
        //method for cost
		public double Cost(int cost) {
			return cost; 
		}
		
		public void Season() {
		
		}

        // accessor
		public int getNum() {
			return num; 
		}

        //mutator
		public void setNum(int num) {
			this.num = num;
		}

        //accessor
		public String getAddress() {
			return address;
		}

        //mutator
		public void setAddress(String address) {
			if(address!=null) { //stops code from crashing address cant be null
				this.address = address;
			}
			
		}

        //accessor
		public String getName() {
			return name;
		}

        //mutator
		public void setName(String name) {
			this.name = name;
		}

        //cost accessor
		public int getCost() {
			return cost;
		}

        //cost mutator
		public void setCost(int cost) {
			if(cost>0) { //cost has to be positive
				this.cost = cost; //creating an instance of cost
			}	
		}
		
		//print details method
		public void printDetails(){
			System.out.println("The register number is: "+num);
			System.out.println("The owners name is: "+name);
			System.out.println("The owners address is: "+address);
			System.out.println("The cost of the property is: "+cost+ " euro per day");
			
		} 
	}
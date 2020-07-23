package practical4;
import java.util.Scanner;

public class TestCarRegistration {
    public static void main(String[] args) {
        //todo:: By using array, create 3 CarType objects
      CarType[] typeList = {new CarType("Toyota","Vois",1.5),
                              new CarType("Nissan","Teana",2.0),
                              new CarType("Honda", "City", 1.6)}; 
  	//todo:: create an array that will able to store 6 registrations
        Registration []registration = new Registration[2]; // more
  	  	
  	Scanner scanner = new Scanner(System.in);
  	
  	for (int i = 0; i < registration.length; ++i) {

  		System.out.println("\nRegistration number: " +  Registration.nextRegNo);
  		
                //todo:: request and read the owner detail
  		System.out.print("Enter owner name : ");
                String name = scanner.nextLine();
                System.out.print("Enter owner Ic : ");
                String icNo = scanner.nextLine();
                
                Owner owner = new Owner(name , icNo);
  		//todo:: request and read car detail
                System.out.print("Enter car plate number: ");
                String platenumber = scanner.nextLine();
                System.out.print("Enter color : ");
                String color = scanner.nextLine();
                System.out.print("Enter Year : ");
                int year = scanner.nextInt();
                
                //construsct car object
                Car car = new Car(platenumber,color,year);
  		  		
  		System.out.println("\nCar Types: ");
  		//todo:: display all available carType
                //for(CarType type:typeList){
                //    System.out.print(type.toString());
                // }
                for(int x=0;x<typeList.length;x++){
                    System.out.println((x+1) + "." + typeList[x].toString());
                }
                
  		System.out.print("\nSelect car type [1.." + typeList.length + "]: ");
  		int selection = scanner.nextInt();
  		
                //todo:: get cartype from array (based on selection)
                CarType selectedType = typeList[selection-1];
  		//todo:: create car object
  		//todo:: register the car
                Registration newReg = new Registration(car, selectedType , owner);
                registration[i] = newReg;               
  		scanner.nextLine();
  	}
  
  	displayListing(registration);
  }
   public static void displayListing(Registration[] regArr) {
        System.out.printf("\n\n%50s\n", "Car Registration Listing");
        System.out.printf("%-10s %-20s %-15s %-10s %-10s %-10s %-10s %-7s %-10s\n",
                "Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
        for (int i = 0; i < regArr.length; ++i) {
            System.out.println(regArr[i]);
        }
    }
}

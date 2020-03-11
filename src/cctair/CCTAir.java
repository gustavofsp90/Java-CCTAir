/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCTAir;

import entities.AirPlane;
import entities.Flight;
import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import utils.StringUtils;

/**
 *
 * @author Gustavo Passos - 2018396
 * @author Micaias Barros - 2018271
 */
public class CCTAir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Plase, run the file (shif + f6), sometimes the program run only with this method.
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Creation of Airplanes, calling the methods and atributtes from class Airplane. 
        //On this case the list was created manually, because on the assigment asked only a
        // few quantity of Airplanes. After the declaration, the array numAirplanes[] was created.
        AirPlane plane1 = new AirPlane("Boeing", "737", 215, "Steven Gerrard");
        AirPlane plane2 = new AirPlane("Boeing", "737", 215, "Leo Messi");
        AirPlane plane3 = new AirPlane("Boeing", "737", 215, "Andres Iniesta");
        AirPlane plane4 = new AirPlane("Embraer", "190", 124, "Ronaldinho Gaucho");
        AirPlane plane5 = new AirPlane("Embraer", "190", 124, "Zinedine Zidani");
        AirPlane plane6 = new AirPlane("Embraer", "190", 124, "Clarence Seedorf");
        AirPlane plane7 = new AirPlane("AirBus", "A320", 215, "Gianluiggi Buffon");
        AirPlane plane8 = new AirPlane("AirBus", "A320", 215, "Roberto Firmino");

        AirPlane numAirPlanes[] = {plane1, plane2, plane3, plane4, plane5, plane6, plane7, plane8};

       // Creation of Flights calling the methods and atributtes from class Flight.
       //At first, a  list has been created, one for each variable on the class Flight. Each variable has approximately 5 items.
        String[] originContainer = {"Zakhyntos", "Venice", "Manchester", "Cardiff", "Barcelona", "Madrid"};
        String[] destinationContainer = {"Edinburgh", "London", "Liverpool", "Brussels", "Amsterdan", "Krakow"};
        String[] departureTimeContainer = {"10:30", "10:45", "11:00", "11:45", "11:00"};
        String[] arrivalTimeContainer = {"17:30", "17:45", "18:00", "18:45", "19:00"};
	String[] dateOfFlightContainer = {"26/08/2019", "27/08/2019", "29/08/2019", "28/08/2019", "29/08/2019"};
 	

        List <Flight> flights = new ArrayList();
        
//the items stored in the arrayList,  will be randonly allocated by a loop, in the variable flights.
        for (int i = 0; i < 30; i++) {
            int originIndex = random.nextInt(originContainer.length);
            int destinationIndex = random.nextInt(destinationContainer.length);
            int departureTimeIndex = random.nextInt(departureTimeContainer.length);
            int arrivalTimeIndex = random.nextInt(arrivalTimeContainer.length);
	    int dateOfFlightIndex = random.nextInt(dateOfFlightContainer.length);
	    int numAirPlanesIndex = random.nextInt(numAirPlanes.length);

            Flight flight = new Flight ( originContainer[originIndex],
                    destinationContainer[destinationIndex],
                    departureTimeContainer[departureTimeIndex],
                    arrivalTimeContainer[arrivalTimeIndex], 
                    dateOfFlightContainer[dateOfFlightIndex],
                    numAirPlanes[numAirPlanesIndex]);
            
            flights.add(flight);
            
        }
        
        //The method convertWithStream is used to convert the new list flights to an array called flights array.
        //The reason for use this conversor method, is because on the beggining of this project the array was manually created, after the loop, those itens became a list. this conversor just make the list become array.
        Flight[] flightsArray = Flight.convertWithStream(flights);
        
        
        
     /**   
this was the flight list created on the beggining of this project.
        
        Flight[] flights = new Flight[33];

        Flight f7 = new Flight("Paris", "12/04/2019", "Amsterdan", plane7);
        flights[6] = f7;
        Flight f8 = new Flight("Madrid", "19/10/2019", "Paris", plane1);
        flights[7] = f8;
        Flight f9 = new Flight("Brussels", "27/09/2019", "Barcelona", plane2);
        flights[8] = f9;
        Flight f10 = new Flight("Liverpool", "30/04/2019", " Barcelona ", plane1);
        flights[9] = f10;
        Flight f11 = new Flight("Liverpool ", "01/06/2019", " Barcelona ", plane2);
        flights[10] = f11;
        Flight f12 = new Flight("Liverpool ", "03/04/2019", "Amsterdan", plane2);
        flights[11] = f12;
        Flight f13 = new Flight("Madrid", "04/04/2019", "Amsterdan", plane2);
        flights[12] = f13;
        Flight f14 = new Flight("Porto", "11/05/2019", "Eindhoven", plane2);
        flights[13] = f14;
        Flight f15 = new Flight("Porto ", "11/05/2019", "Amsterdam", plane3);
        flights[14] = f15;
        Flight f16 = new Flight("Porto ", "11/05/2019", "Amsterdam", plane3);
        flights[15] = f16;
        Flight f17 = new Flight("Madrid", "11/05/2019", "Zakhyntos", plane3);
        flights[16] = f17;
        Flight f18 = new Flight("London", "11/05/2019", " Zakhyntos ", plane3);
        flights[17] = f18;
        Flight f19 = new Flight("London", "11/05/2019", " Zakhyntos ", plane4);
        flights[18] = f19;
        Flight f20 = new Flight("Madrid", "11/05/2019", "Amsterdan", plane4);
        flights[19] = f20;
        Flight f21 = new Flight("Madrid", "11/05/2019", "Amsterdan", plane4);
        flights[20] = f21;
        Flight f22 = new Flight("Madrid", "11/05/2019", "Amsterdan", plane4);
        flights[21] = f22;
        Flight f23 = new Flight("Paris ", "11/05/2019", "Amsterdan", plane5);
        flights[22] = f23;
        Flight f24 = new Flight("Paris ", "11/05/2019", "Amsterdan", plane5);
        flights[23] = f24;
        Flight f25 = new Flight("Paris", "11/05/2019", " Sao Paulo ", plane6);
        flights[24] = f25;
        Flight f26 = new Flight("Paris ", "11/05/2019", " Sao Paulo ", plane6);
        flights[25] = f26;
        Flight f27 = new Flight("Madrid", "11/05/2019", "Sao Paulo", plane7);
        flights[26] = f27;
        Flight f28 = new Flight("Bristol ", "11/05/2019", "Ibiza", plane7);
        flights[27] = f28;
        Flight f29 = new Flight("Bristol ", "11/05/2019", " Ibiza ", plane7);
        flights[28] = f29;
        Flight f30 = new Flight("Bristol", "11/05/2019", " Ibiza ", plane7);
        flights[29] = f30;
        Flight f31 = new Flight("Edimburgh", "11/05/2019", " Monte Carlo ", plane7);
        flights[30] = f31;
        Flight f32 = new Flight("Paris", "11/05/2019", " Monte Carlo ", plane7);
        flights[31] = f32;
        Flight f33 = new Flight("Bristol", "11/05/2019", " Monte Carlo ", plane7);
        flights[32] = f33;
**/
        int opt = 0;

        
        /* do while: is a statement conditional, the program will keep running (doing) the structured
            code while the int "opt" be different of "0". The whole logic of this program is inside this statement.*/
        do {
            
            // main menu of program, Ask users to choose the 
            //options in the CCTAir menu, chosing a number between 0 and 3, genetaring the variable opt.
            System.out.println("");
            System.out.println("Welcome to CCTAir!");
            System.out.println("Please, choose an option: ");
            System.out.println("");
            System.out.println("1: Show all scheduled Flights.");
            System.out.println("2: Schedule 5 new flights.");
            System.out.println("3: Assign Pilot.");
            System.out.println("0: Exit.");
            System.out.print("Which option would you like to choose? (0, 1, 2, 3):");
            opt = sc.nextInt();
// we decide to use the statment switch instead if, once we only will use single number of choices.
// Switch is a statement similar as if, but is a good option to use 
//  simple variables as number or characters. On this case, we created the menu with 
//the options 1, 2, 3 and 0. Basically, in case the user type 1, the statement will display the flights, 
//2 for schedule then, 3 to assign pilot and 0 to exit the application. In case for the user type a diffrent 
//character from the indicated,thre program will return to type the variable again.
//Basiclly the main logic run through this statment the .
            switch(opt){
                case 1:
                    
                    //loop created to print the flghts generated "flightsArray",the quantity requested was 30, which is the size of the array. 
                    
                for (int i = 0; i < flightsArray.length; i++) {
                    System.out.println(flightsArray[i].toString());
                    System.out.println("");
                }
                System.out.println("Quantity of flights booked: " + flightsArray.length);
                System.out.println("");    
                    break;
                    
                    //As requested as goal of this assigment, the user will be able to add 5 new flight on the array.
                case 2:
                    System.out.println("");
                System.out.println("Scheduling 5 new flights: ");
                System.out.println("");

                //a new array is created, the function "array.copyOf" copy the previous array, and add 5 more spaces on the array.
                Flight[] AddFlights = Arrays.copyOf(Flight.convertWithStream(flights), flightsArray.length + 5);
                
                
               // loop created to schedule the flights, on this case will be 5 loops.
                for (int i = flightsArray.length; i < flightsArray.length + 5; i++) {
                    //brief menu to interact with user and read the variables typed by then.
                    System.out.println("");
                    System.out.println("Adding flight number: " + (i + 1));
                    System.out.println("");
                    System.out.print("Type the origin city: ");
                    String origin = sc.next();
                    System.out.print("Type the destination city: ");
                    String destination = sc.next();
                    System.out.print("Type the date of the flight: ");
                    String dateOfFlight = sc.next();
                    
                    //isDateValid is a function only for validate the the data inserted by the user, a class has been created "utils" for this method.
                    while (!StringUtils.isDateValid(dateOfFlight)) {
                        System.out.println("Invalid date. The correct format is DD-MM-YYYY");
                        System.out.println("tyoe date again: ");
                        dateOfFlight = sc.next();
                    }
                    //a number between 1 & to define the airplane.
                    System.out.print("Please enter a number between 1 & 8 to choose the Airplane: ");
                    int nPlane = sc.nextInt();

                    while (nPlane < 1 || nPlane > 8) {
                        // a while statment to validate the user choice.

                        System.out.println("This number is not valid, please type a number between 1 & 8: ");
                        nPlane = sc.nextInt();
                    }

                    
                    //creation of variable newFlight, calling the class Flight.
                    Flight newFlight = new Flight(origin, destination, dateOfFlight, numAirPlanes[nPlane - 1]);

                    //as requested on the assigment, statment created to to call the methods schedule. on this case only to get the arrivalTime.
                    System.out.println("Would you like to set the schedule for this flight? (Y/N)");
                    String ans = sc.next();

                    if (ans.equalsIgnoreCase("Y")) {

                        System.out.println("please type the Arrival time: ");
                        sc.next();
                        String arrivalTime = sc.nextLine();
                        newFlight.schedule(arrivalTime);
                    //on this case ask to call the second schedule function(overload).
                        System.out.println("Would you o set up the departure time for this flight? in case of yes, type the time, if not type N;");
                        String departureTime = sc.nextLine();
                        //the user has the option to dont choose any departure time.
                        if (departureTime.equalsIgnoreCase("N")) {
                            newFlight.schedule(arrivalTime, departureTime);

                        }
                     
                        AddFlights[i]  = newFlight;
                        System.out.println("This flight has been added.");

                    } else if (ans.equalsIgnoreCase("N")) {
                        //condition to add the flight without departure and arrival time.
                        //data being stored on newFlight

                        System.out.println("This flight has been added without Scheduled: ");
                        AddFlights[i] = newFlight;
                        

                    } else {
                    //condition else to make sure the user type the right character
                    
                        System.out.println("This character is not valid, please type Y or N: ");
                        ans = sc.next();
                        AddFlights[i] = newFlight;
                    }
                }
                //data collected beig stored on  flightsArray
               flightsArray = AddFlights;

                    break;
                    
                case 3:
                    //funcition to use the method on the class Airplane, to assign pilot to some airplane.
                System.out.println("Enter the name of the pilot: ");
                String pilotName = sc.nextLine();
                
                        //function to make sure type only single name, without spaces.
                while (pilotName.trim().equalsIgnoreCase("")) {
                    System.out.println("");
                    System.out.println("Enter a valid name: ");
                    pilotName = sc.nextLine();
                    sc.next();
                }
                
                System.out.println("");
                System.out.print("Please enter a number between 1 & 8 to assign the pilot to the respective Airplane: ");
                int nPlane2 = sc.nextInt();
                //while statment to validate the gap of numbers
                while (nPlane2 < 1 || nPlane2 > 8) {
                    System.out.println("");
                    System.out.println("This number is not valid, please type a number between 1 & 8: ");
                    nPlane2 = sc.nextInt();
                }
                //subtracting the variable to define the position on the array.
                int numAirPlane = nPlane2 - 1;
                //calling the method on the class AirPlane
                numAirPlanes[numAirPlane].assignPilot(pilotName);

                //printing the data generated.
                System.out.println(pilotName + " will be assigned to " + numAirPlanes[numAirPlane].getMake() + " " + numAirPlanes[numAirPlane].getModel());

                    break;
                case 0:
                    //in case of 0, the system will end.
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong number, type 0, 1, 2 or 3: ");
                opt = sc.nextInt();
            }
           
            //end of the loop
        } while (opt != 0);
//to close the Scanner
        sc.close();
    }
}

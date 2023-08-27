import java.util.Scanner;
public class OnlineReservation{

private static boolean[] seats=new boolean [10];
public static void main(String args[]){

Scanner scanner=new Scanner(System.in);
while(true){

//display name
System.out.println("\n please select an option:");
System.out.println("1. View Seat Map");
System.out.println("2. Resort seat");
System.out.println("3. Cancel Reservation");
System.out.println("4. Text");

//get User input
int option=scanner.nextInt();

switch(option){

case 1:
  viewSeatMap();
   break;

case 2:
  reserveSeat();
  break;
case 3:
  cancelReservation();
  break;
case 4:
    System.exit(status: 0);  //exit the program
default:
System.out.println("Invalid option!");
}
}
}
private static void viewSeatMap(){
System.out.println("\n Current Seat Map");
for(int i=0;i<seatss.length;i++){
if(seats[i]){
System.out.print("X"); // print as X,if seat is reserved
}
else{
System.out.print((i+1)+""); //print the seat number if its empty
}
}
System.out.println();

private static void reserveSeat(){
Scanner scanner=new Scanner(System.in);
System.out.print("\n Enter seat number 1-10:");
int seatNumber=scanner.nextInt();
if(seatNumber< 1 || seatNumber>10){
System.out.println("Invalid seat Number");
}
else if(seats[seatNumber-1]){
System.out.println("Seats Already Reserved");
}
else{
seats[seatNumber-1]=true; // reserve the seat
System.out.println("seat Reserved");
}
}


private static void cancelReservation(){
Scanner scanner=new Scanner(System.in);
int seatNumber=scanner.nextInt();
if(seatNumber<1 || seatNumber>10){
System.out.println("Invalid seat Number");
}
else if(!seats[seatNumber-1]){
System.out.println("Seat not Reserved");
}
else{
seats[seatNumber-1]=false; //unreserve the seat
System.out.println("Reservation cancelled");
}
}









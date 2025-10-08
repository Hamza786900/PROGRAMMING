import java.util.Arrays;
public class Screen{
         String ScreenName;
	Seat seats[][];
	public static final double PRICE_REGULAR = 500.0;
	public static final double PRICE_PREMIUM = 750.0;
	public static final double PRICE_VIP = 1000.0;
	public static final double PRICE_RECLINER = 1200.0;

	int num;


	Screen(){}

	Screen(String ScreenName,int num){

	this.ScreenName=ScreenName;
	
	this.seats =new Seat[num][];

	for(int i=0;i<num;i++){

	 seats[i] = new Seat[i+1];
		for(int j=0;j<seats[i].length;j++)
	seats[i][j]=new Seat(i,j,500,Seat.SeatType.VIP);

}

}
public String getScreenName(){
return ScreenName;
}
public int getAvailibleSeatCount(){
int count=0;

for(int i=0;i<seats.length;i++){
	for(int j=0;j<seats[i].length;j++){
	if(seats[i][j].isAvailable==true){
	count++;
}
}
}
 return  count;
}

public int getTotalSeatCount(){
int totalseats=0;
for(int i=0;i<seats.length;i++){
for(int j=0;j<seats[i].length;j++){
totalseats++;
}
}
return totalseats;
}

public Seat getSeat(String seatid){
for(int i=0;i<num;i++){
for(int j=0;j<seats[i].length;j++){
if(seats[i][j].id.equals(seatid)){
return seats[i][j];
}
}
}
return null;
}
public Seat getSeat(int row,int column){
for(int i=0;i<seats.length;i++){
	for(int j=0;j<seats[i].length;j++){

	if(seats[i][j]==seats[row][column]){

	return seats[i][j];
}
}

}
	return null;
}
public boolean book(String Seatid){
for(int i=0;i<num;i++){
for(int j=0;j<seats[i].length;j++){
if(seats[i][j].id.equals(Seatid)){
 if(seats[i][j].isAvailable){
  seats[i][j].isAvailable=false;
  return true;
}
}
}
}
return false;
}


public boolean cancel(int r,int c){
for(int i=0;i<num;i++){
for(int j=0;j<seats[i].length;j++){
if(seats[i][j]==seats[r][c]){
if(seats[i][j].isAvailable==false){
  seats[i][j].isAvailable=true;
  return true;
}
}
}
}
return false;
}
public boolean checkRow(int row) {
    if (row > 0 && row <= seats.length) {
        return true;                
    } else {
        return false;                
    }
}

public boolean cancel(String seatid){
for(int i=0;i<num;i++){
for(int j=0;j<seats[i].length;j++){
if(seats[i][j].id.equals(seatid)){
 if(seats[i][j].isAvailable==false){
  seats[i][j].isAvailable=true;
  return true;
}
}
}
}
return false;
}


public boolean book(int r,int c){
for(int i=0;i<num;i++){
for(int j=0;j<seats[i].length;j++){
if(seats[i][j]==seats[r][c]){
  if(seats[i][j].isAvailable==true){
   seats[i][j].isAvailable=false;
   return true;
}

}
}
}
return false;
}

public void checkBounds(int r,int c){
if(r>=0 && r<num && c>=0 && c<num){
System.out.println("valid index");
}
else{
System.out.println("invalid index");
}
}

public int getAvailableSeatCount(Seat.SeatType s){
int count=0;
for(int i=0;i<num;i++){
for(int j=0;j<seats[i].length;j++){
if(seats[i][j].isAvailable){
if(seats[i][j].seatType==s){
count++;
}
}
}
}
return count;
}
public void setRowType(int row, Seat.SeatType type, double price) {
    if (row > 0 && row <= seats.length) {
        int r = row - 1;
        
        for (int j = 0; j < seats[r].length; j++) {
            seats[r][j].setseatType(type);
            seats[r][j].setprice(price);
        }
        
        System.out.println("Row " + row + " updated to " + type + " with price " + price);
    } else {
        System.out.println("Invalid row number: " + row);
    }
}

public void displayVerbose(){
for(int i=0;i<num;i++){
for(int j=0;j<seats[i].length;j++){
 System.out.println(seats[i][j]);
}
}

}

public Seat findFirstAvailable(Seat.SeatType type){
for(int i=0;i<num;i++){
for(int j=0;j<seats[i].length;j++){
 if(seats[i][j].seatType==type){
  if(seats[i][j].isAvailable){
   return seats[i][j];
}
}
}
}
return null;
}

public int[] buildDefaultRowLengths(int rownum){
int rowlength[]=new int[rownum];
for(int i=0;i<rownum;i++){
int count=0;
for(int j=0;j<seats[i].length;j++){
count++;
}
rowlength[i]=count;
}
Arrays.toString(rowlength);
return rowlength;
}

public double priceFor(Seat.SeatType type){
if(type==Seat.SeatType.REGULAR){
 return 500;
}
else if(type==Seat.SeatType.PREMIUM){
 return 750;
}
else if(type==Seat.SeatType.VIP){
 return 1000;
}
else if(type==Seat.SeatType.RECLINER){
 return 1200;
}
else{

 return 0;}
}

public int getRowLength(int row){
int count=0;
for(int i=row;i==row;i++){
for(int j=0;j<seats[i].length;j++){
count++;
}
}
return count;
}

public int getRowCount(){
int count=0;
for(int i=0;i<num;i++)
{
count++;
}
return count;
}

public Seat.SeatType seatTypeFor(int r, int c){
for(int i=0;i<num;i++){
for(int j=0;j<seats[i].length;j++){
if(seats[i][j]==seats[r][c]){
return seats[i][j].seatType;
}
}
}
return null;
}

public Seat[] listAvailable(Seat.SeatType type){
int count=0;
for(int i=0;i<num;i++){
for(int j=0;j<seats[i].length;j++){
if(type==seats[i][j].seatType){
 if(seats[i][j].isAvailable){
 count++;
}
}
}
}
return null;
}

public void seatList() {
    for (int i = 0; i < seats.length; i++) {
        for (int j = 0; j < seats[i].length; j++) {
            System.out.println(seats[i][j].toString());
        }
    }
}
public void displayLayout(){
for(int i=0;i<num;i++){
for(int j=0;j<seats[i].length;j++){
 if(seats[i][j].isAvailable()){
  System.out.print(" o ");
}
else{
 System.out.print(" x ");
}
}
System.out.println(" ");
}
}



}
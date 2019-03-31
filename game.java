import java.util.Scanner;
public class game {
static int pscore=0;
static int cscore=0;
Scanner player= new Scanner(System.in); 
static String cotvet="";	


	public static void g(){
String potvet= player.nextLine();
int rand=(int)(Math.random()*3);
if(rand==0){
cotvet="Камень";	
}else if(rand==1){
cotvet="Ножницы";	
}else if(rand==2){
cotvet="Бумага";	
}if (cotvet.equals(potvet)){
	System.out.println("Ничья");
}else if (potvet.equals(Ножницы) && cotvet.equals("Бумага") || potvet.equals("Камень") && cotvet.equals("Ножницы") || potvet.equals("Бумага") && cotvet.equals("Камень")){
	System.out.println("Игрок победил");
}else if(cotvet.equals("Ножницы") && potvet.equals("Бумага") || cotvet.equals("Камень") && potvet.equals("Ножницы") || cotvet.equals("Бумага") && potvet.equals("Камень")){
	System.out.println("Компьютер победил");
}}

System.out.println(potvet);
	public static void main(String[] args){
	while(true){
g();
System.out.println("Игрок" + pscore);
System.out.println("Компьютер" + cscore);
}}
}

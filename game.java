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
cotvet="������";	
}else if(rand==1){
cotvet="�������";	
}else if(rand==2){
cotvet="������";	
}if (cotvet.equals(potvet)){
	System.out.println("�����");
}else if (potvet.equals(�������) && cotvet.equals("������") || potvet.equals("������") && cotvet.equals("�������") || potvet.equals("������") && cotvet.equals("������")){
	System.out.println("����� �������");
}else if(cotvet.equals("�������") && potvet.equals("������") || cotvet.equals("������") && potvet.equals("�������") || cotvet.equals("������") && potvet.equals("������")){
	System.out.println("��������� �������");
}}

System.out.println(potvet);
	public static void main(String[] args){
	while(true){
g();
System.out.println("�����" + pscore);
System.out.println("���������" + cscore);
}}
}

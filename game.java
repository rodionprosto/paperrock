import java.util.HashMap;
import java.util.Scanner;
public class game {
    static int pscore=0;
    static int cscore=0;



    public static void g(){
        Scanner player= new Scanner(System.in);
        static String cotvet="";
        String potvet= player.nextLine();
        int rand=(int)(Math.random()*3);
        HashMap<Integer, String> weapons = new HashMap();
weapons.put(0,"ножницы");
weapons.put(1,"бумага");
weapons.put(2,"камень");
        if(rand==0){
            cotvet=weapons.get(0);
        }else if(rand==1){
            cotvet=weapons.get(1);
        }else if(rand==2){
            cotvet=weapons.get(2);
        }if (cotvet.equals(potvet)){
            System.out.println("ничья");
        }else if (potvet.equals(weapons.get(0)) && cotvet.equals(weapons.get(1)) || potvet.equals(weapons.get(1)) && cotvet.equals(weapons.get(0)) || potvet.equals("ножницы") && cotvet.equals("бумага")){
            System.out.println("игрок победил");
        }else if(cotvet.equals("Íîæíèöû") && potvet.equals("Áóìàãà") || cotvet.equals("Êàìåíü") && potvet.equals("Íîæíèöû") || cotvet.equals("Áóìàãà") && potvet.equals("Êàìåíü")){
            System.out.println("компьютер победил");
        }}

System.out.println(potvet);
    public static void main(String[] args){
        while(true){
            g();
            System.out.println("игрок " + pscore);
            System.out.println("КОМПЬЮТЕР " + cscore);
        }}
}

import java.util.Scanner;

public class Aplicacion_entregable {
	public static void main(String[] args) {
		
		String dato = "";
		

		System.out.println(" __  __ _               _ _                _             ");
		System.out.println("|  \\/  (_)             | (_)              (_)            ");
		System.out.println("| \\  / |_    __ _ _ __ | |_  ___ __ _  ___ _  ___  _ __  ");
		System.out.println("| |\\/| | |  / _` | '_ \\| | |/ __/ _` |/ __| |/ _ \\| '_ \\ ");
		System.out.println("| |  | | | | (_| | |_) | | | (_| (_| | (__| | (_) | | | |");
		System.out.println("|_|  |_|_|  \\__,_| .__/|_|_|\\___\\__,_|\\___|_|\\___/|_| |_|");
		System.out.println("                 | |                                     ");
		System.out.println("                 |_|                                     ");
		System.out.println("");
		System.out.println(">>>>Z>o>d>i>a>c>o>>>> <1>");
		System.out.println(">>>>D>i>a>s> >v>i>v>i>d>o>s>>>> <2>");
		System.out.println(">>>>A>n>o>s> >p>e>r>r>o>>>> <3>");
		System.out.println(">>>>N>u>m>e>r>o>l>o>g>i>a>>>> <4>");

		Scanner selector = new Scanner(System.in);
		
		while(!dato.equals("1") && !dato.equals("2") && !dato.equals("3") && !dato.equals("4"))
		{
			System.out.print("Que quieres hacer, elige entre 1 y 4: ");
		    dato = selector.next();

		    switch(dato){
		    	case "1":  
                    Zodiaco();   
		    		break;
		    	case "2": 
		    		Dias_vividos();
		    		break;
		    	case "3":  
		    		Anos_perro();
		    		break;
		    	case "4":  
		    		Numerologia();
		    		break;
		    }
		}
		selector.close();
		
	}

	static void Zodiaco(){
		int mesN = 0;
		int diaN = 0;

		System.out.println("Has elegido zodiaco");
		
		Scanner mes = new Scanner(System.in);
		Scanner dia = new Scanner(System.in);
		
		System.out.println("Elige tu mes de nacimiento");
		mesN = mes.nextInt();
		System.out.println("Elige tu dia de nacimiento");
		diaN = dia.nextInt();
			
		if (diaN > 31 && (mesN == 1 || mesN == 3 || mesN == 5 || mesN == 7 || mesN == 8 || mesN == 10 || mesN == 12)) {
			diaN = 31;
		}
		else if (diaN > 30 && (mesN == 4 || mesN == 6 || mesN == 9 || mesN == 11)) {
			diaN = 30;
		}
		else if (diaN > 28 && mesN == 2) {
			diaN = 28;
		}
		
		dia.close();
		mes.close();

		if ((mesN == 1 && diaN >= 21) || (mesN == 2 && diaN <= 19)){
			System.out.println("Tu zodiaco es aquario");
		}
		if ((mesN == 2 && diaN >= 20) || (mesN == 3 && diaN <= 20)){
			System.out.println("Tu zodiaco es piscis");
		}
		if ((mesN == 3 && diaN >= 21) || (mesN == 4 && diaN <= 20)){
			System.out.println("Tu zodiaco es aries");
		}
		if ((mesN == 4 && diaN >= 21) || (mesN == 5 && diaN <= 21)){
			System.out.println("Tu zodiaco es tauro");
		}
		if ((mesN == 5 && diaN >= 22) || (mesN == 6 && diaN <= 21)){
			System.out.println("Tu zodiaco es geminis");
		}
		if ((mesN == 6 && diaN >= 22) || (mesN == 7 && diaN <= 22)){
			System.out.println("Tu zodiaco es cancer");
		}
		if ((mesN == 7 && diaN >= 23) || (mesN == 8 && diaN <= 23)){
			System.out.println("Tu zodiaco es leo");
		}
		if ((mesN == 8 && diaN >= 24) || (mesN == 9 && diaN <= 23)){
			System.out.println("Tu zodiaco es virgo");
		}
		if ((mesN == 9 && diaN >= 24) || (mesN == 10 && diaN <= 23)){
			System.out.println("Tu zodiaco es libra");
		}
		if ((mesN == 10 && diaN >= 24) || (mesN == 11 && diaN <= 22)){
			System.out.println("Tu zodiaco es escorpio");
		}
		if ((mesN == 11 && diaN >= 23) || (mesN == 12 && diaN <= 21)){
			System.out.println("Tu zodiaco es sagitario");
		}
		if ((mesN == 12 && diaN >= 22) || (mesN == 1 && diaN <= 20)){
			System.out.println("Tu zodiaco es capricornio");
		}
		
    }
	static void Dias_vividos(){
		System.out.println("Has elegido tus dias vividos");
		}
	static void Anos_perro(){

		Scanner year = new Scanner(System.in);
		System.out.println("Has elegido tus anos en perro");	
		int uyear = 0;
		System.out.println("Escribe tu edad:");
		uyear = year.nextInt();
		
		float edad = uyear / 7;
		System.out.println("tu edad de perro es " + edad);

		year.close();
		}
	static void Numerologia(){
		System.out.println("Has elegido la numerologia");	
		}
	
	
}
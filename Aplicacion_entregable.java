import java.util.Scanner;

public class Aplicacion_entregable {
	public static void main(String[] args) {
		
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
		String dato = "";

		while(!dato.equals("1") && !dato.equals("2") && !dato.equals("3") && !dato.equals("4"))
		{
			System.out.print("Que quieres hacer, elige entre 1 y 4: ");
		    dato = selector.next();

		    switch(dato){
		    	case "1": System.out.println("Has elegido zodiaco"); break;
		    	case "2": System.out.println("Has elegido tus dias vividos"); break;
		    	case "3": System.out.println("Has elegido tus anos en perro"); break;
		    	case "4": System.out.println("Has elegido la numerologia"); break;
		    }
		}
	}
}
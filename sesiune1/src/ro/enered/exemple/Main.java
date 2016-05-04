package ro.enered.exemple;

public class Main {

	public static void main(String[] args) {
		//pentru afisare pe ecran
		System.out.println("Ceva");
		//definirea variabilelor
		int a = 4;
		int b = 3;
		int c ;
		c= adunare (a,b);
		//afisare c\
		System.out.println(c);
		c= scadere (a,b);
		System.out.println(c);
		initializareStudent();
		initializareNota();
		Stocnr();
	}
		private static int adunare (int a1, int b1){
			return a1+b1;
		}
		private static int scadere (int a1, int b1){
			return a1-b1;
		}
		private static void initializareStudent (){
			/* Student nou
			 * ii punem un nume, clasa
			 * ii dam sa invete un curs
			 * ii dam sa invete un curs pentru un numar de ore
			 */
			Student s = new Student();
			//atribuim un nume studentului
			s.nume = "Vlad";
			//atribuim o clasa studentului
			s.grup = 4;
			//apelam metoda invata
			System.out.println(s.invata("JAVA ",3));
	        s.invata("Java", 3); 	
	 	}
		public static void initializareNota(){
			/*
			 * Atribuim studentului numele Ion din Grupa 2 nota 8
			*/
		
			Student s = new Student();
			s.nume = "Ion";
			s.grup = 2;
			Nota n = new Nota();
			//n.atribuie(s, 8);
			System.out.println(n.atribuie(s, 8));
		};
		
		public static void Stocnr() {
		Stoc Stocnr = new Stoc();
		System.out.println(Stocnr.calcNr());
}}


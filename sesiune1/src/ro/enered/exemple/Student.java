package ro.enered.exemple;

public class Student {
//proprietatile studentului
	public String nume;
	int grup;
	public String invata(String numeCurs, int ore){
	String rezultat = " Studentul " + nume + " din grupa " + grup + " a invatat " + numeCurs + "timp de " + ore + " ore ";
			return rezultat;
	//studentul "nume" din grupa "grup" a invatat "numeCurs" timp de  " ore " ore
	}
	
}


package app;

public class Program{
	public static void main (String[] args){
		P1.Test obj1 = new P1.Test();
		P2.Test obj2 = new P2.Test();
		obj1.TampilTeks();
		obj2.TampilTeks();
	}//compile = javac -d build -sourcepath src -cp build src/app/Program.java
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class NunAlumnos {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader ( new FileReader("C:\\PRUEBAS\\DAM1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("C:\\PRUEBAS\\DAM2.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\PRUEBAS\\numeroAlumnos.txt"));
		String alumno;
		int numAlumnos1=0;
		int numAlumnos2=0;
		
		while((alumno = br1.readLine()) != null) 
			numAlumnos1++;
		
			bw.write("el numero de alumnos de Dam1 es: "+ numAlumnos1+"\n");
		
				
		while((alumno = br2.readLine()) != null) 
			numAlumnos2++;
			bw.write("el numero de alumnos de Dam2 es: "+ numAlumnos2);
		
		bw.flush();
		bw.close();
		br1.close();
		br2.close();

	}
	
}

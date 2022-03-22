package com.uvg.main;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import com.uvg.main.Interprete;

public class Main {
	public static void main(String[] args)  throws FileNotFoundException{
    String operacion = null;
    
		try {
			File fr = new File("ListadoProducto.txt");
			Interprete inter = new Interprete();
		 
			Scanner sc = new Scanner(fr);
			Scanner scan = new Scanner(System.in);
			System.out.println("Elige el tipo de Map<> a utilizar: ");
			System.out.println("1. HashMap ");
			System.out.println("2. MapTree ");
			System.out.println("3. LinkedHashMap ");
			int resp = scan.nextInt();
			if (resp == 1) {
				
			}else if (resp == 2) {
				
			}else if (resp == 3) {
				
			}
			 
		    while (sc.hasNextLine())
		    	linea = sc.nextLine();
		    	inter.Interpretar(linea);
		    	
		        
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
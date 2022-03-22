package com.uvg.main;

import java.util.Stack;
import java.util.Map;


public class Interprete {
	String operacion;
	private static Stack<String> muebles = new Stack<>();
	private static Stack<String> sillones = new Stack<>();
	private static Stack<String> bebidas = new Stack<>();
	private static Stack<String> condimentos = new Stack<>();
	private static Stack<String> frutas = new Stack<>();
	private static Stack<String> carnes = new Stack<>();
	private static Stack<String> lacteos = new Stack<>();
	private static Map<String,Stack<String>> map;
	public Interprete() {
		
	}
	
	public static void Interpretar(String str, Map<String,Stack<String>> m) {
		String[] expresionPartida = str.split("|");
		for (int i = 0; i < expresionPartida.length; i++){
            String ch = expresionPartida[i];
            String ch2 = expresionPartida[i+1];
            try {
                
                if (ch.equalsIgnoreCase("Mueble de terraza ")){
                    muebles.push(ch2);
                }
                else if (ch.equalsIgnoreCase("Sillones de masaje ")){
                    sillones.push(ch2);
                }
                else if (ch.equalsIgnoreCase("Bebidas ")){
                	bebidas.push(ch2);

                }
                else if(ch.equalsIgnoreCase("Condimentos ")){
                	condimentos.push(ch2);

                }
                else if(ch.equalsIgnoreCase("Frutas ")){
                	frutas.push(ch2);

                }
                else if(ch.equalsIgnoreCase("Carnes ")){
                	carnes.push(ch2);

                }
                else if(ch.equalsIgnoreCase("Lácteos ")){
                	lacteos.push(ch2);

                }

            } catch (Exception e) {
              

            }
        }
		
		m.put("Muebles", muebles);
		m.put("Sillas", sillones);
		m.put("Muebles", bebidas);
		m.put("Muebles", condimentos);
		m.put("Muebles", frutas);
		m.put("Muebles", carnes);
		m.put("Muebles", lacteos);
		map = m;
	}
	
	public static Map<String,Stack<String>> getMapa(){
		return map;
	}
}

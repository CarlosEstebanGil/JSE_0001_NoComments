package pru_JSE_0001;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Prueba_JavaJr_Mitocode2022 {

	public static void main(String[] args) {
		

		String str = "Hola Mi nombre es Charly sama";

			StringBuilder sb = new StringBuilder(str);
			System.out.println(sb.reverse());

			char[] cArrCadena = str.toCharArray();
			for (int i = cArrCadena.length -1 ; i >=0; i-- ) {	
				System.out.print(cArrCadena[i]);
			}
			System.out.println();

			String sep = " ";
			String[] arrStrSplittedText = str.split(sep);
			for (int i = arrStrSplittedText.length -1 ; i>=0; i--) {
				System.out.print(arrStrSplittedText[i] + sep);
			}
			
			
			System.out.println();
			long numero1 = 4543454; 	
			long numero2 = 45433454;	
			long numero3 = 1;			
			long numero4 = 45432454;	
			long numero5 = 1824814;		
			
			
			
			char[] cArrNumero = Long.toString(numero5).toCharArray();
			
			boolean isCapicua = true;
			int iFin = cArrNumero.length - 1;	
			int iCom = 0;						
			
			char charFin= cArrNumero[iFin];
			char charCom= cArrNumero[iCom];
			
			while ( iFin > iCom && isCapicua == true )  {	
				if ( charFin != charCom ) {
					isCapicua = false;					
				} else {	
					iFin--; 
					iCom++;
					charFin= cArrNumero[iFin];
					charCom= cArrNumero[iCom];
				}
			}
			System.out.println("Resultado de esCapicua: " + isCapicua);
			
	
			
			
			boolean esCapicua =false;
			String strNumero = Long.toString(numero1);
			StringBuilder sbReversedStr= new StringBuilder(strNumero);
			String strReversedNumero = sbReversedStr.reverse().toString();
			
			if (strNumero.equalsIgnoreCase(strReversedNumero)) esCapicua = true;
			System.out.println("/n" + "Es capicua facilongo: " + esCapicua );
	
			
			
			Prueba_JavaJr_Mitocode2022 appInstance = new Prueba_JavaJr_Mitocode2022();
			
			Map<Character, Integer> mapa;
			
			mapa = appInstance.ContarCaracteresEnTexto("hola Mi nombre es charly sama");
			
			System.out.println(" ------------- chars en text ------- ");
			
			mapa.forEach( (k,v)-> System.out.println("el char " + k + " aparece " + v + " veces"));
			

			System.out.println(" ------------- todos chars repetidos en text ------- ");
			
			int[] arrICounts = new int[256];
			
			String strTexto = "hola Mi nombre es charly sama"; 
			
			for ( int i = 0; i< strTexto.length(); i++) {
			
				arrICounts[strTexto.charAt(i)]++;				
			}													
			for ( int i = 0; i< arrICounts.length; i++) {		
				if (arrICounts[i]>1) {
					System.out.print((char) i + ":" + arrICounts[i] + " "); 
				}															
			}
			

			int numerito = 188; System.out.println();
			if (numerito % 2 == 0 ) System.out.println(numerito + ": ES multiplo de 2"); else System.out.println(numerito + ": NO es multiplo de 2"); 

			System.out.println();
			int anio = 2024; 
			boolean isAnioBiciesto = LocalDate.of(anio, 1, 1).isLeapYear();
			System.out.println(anio + ", como anio biciesto es: " + isAnioBiciesto);

			
			System.out.println("------------------ Dado un String, Desordenarlo!  ---------------");
			
			strTexto = "hola Mi nombre es charly sama"; // hm y bsa o arlhr  a a mcM  --> hola my bs  arhr  a a mcM
			
			int min = 0; 
			int max = strTexto.length()-1;
			char[] arrCharStrTextoDesordenado = new char[strTexto.length()];
			
			int newPos=0;
			
			min = 0; 

			
			arrCharStrTextoDesordenado = new char[strTexto.length()];
			List<Character> listCharsTexto = strTexto.chars()	
                    										.mapToObj(e -> (char)e)		
                    										.collect(Collectors.toList()); 
			max = listCharsTexto.size();
			
			int posRnd= (int) ((Math.random() * (max - min)) + min);
			
			for (int i=0; i < strTexto.length() ; i++) {
				arrCharStrTextoDesordenado[i] = listCharsTexto.get(posRnd); 
				listCharsTexto.remove(posRnd); 
				max = listCharsTexto.size(); 
				posRnd= (int) ((Math.random() * (max - min)) + min);
			}	
			 
			System.out.println(arrCharStrTextoDesordenado); 
			
			System.out.println("----------- o desorden por palabras, y ademass via facil x api.. : --------------------- ");
			
			
			String[] arrayPalabrasTexto = strTexto.split(""); 
			List<String> listaPalabrasTexto = Arrays.asList( arrayPalabrasTexto );			
			Collections.shuffle(listaPalabrasTexto);
			listaPalabrasTexto.stream().forEach(System.out::print);
			
			

			System.out.println(" -------- 7 -- Obtener solamente los caracteres no duplicados en un string / text ---------");
			
			strTexto = "hola Mi nombre es charly sama";
			
			int[] arrBytes = new int[256]; 
			for (int i = 0; i < strTexto.length(); i++) {
				arrBytes[strTexto.charAt(i)]++;
			}
			for (int i = 0; i < arrBytes.length; i++) {
				if(arrBytes[i]==1) System.out.print((char) i);
			}
			
			
			
			List<Integer> listaIntElemsPrueba = new ArrayList();
			
			 System.out.println(" 8) ----------- elems de lista q no esten repes: ");
			
			listaIntElemsPrueba.add(8000); 
			listaIntElemsPrueba.add(1000);	
			listaIntElemsPrueba.add(9000);
			listaIntElemsPrueba.add(1000);
			listaIntElemsPrueba.add(7000);
			listaIntElemsPrueba.add(8000);
			listaIntElemsPrueba.add(3000);	
			listaIntElemsPrueba.add(1000); 
			
			
			Map<Integer,Integer> mapaIntElems = new HashMap<>();
			
			listaIntElemsPrueba.forEach(e -> mapaIntElems.put(e,0));  
			
			listaIntElemsPrueba.forEach(e -> mapaIntElems.put(e, mapaIntElems.get(e)+1 ) ); 
			
			mapaIntElems.entrySet().stream().filter(e -> e.getValue()==1).forEach( e -> System.out.print("clave:"+ e.getKey() + " valor: " + e.getValue()));
	
			
			System.out.println("----------- 9 ) Revisar si hay alguna vocal en este texto  --------------");
			Map<Integer,Character> vocals = new HashMap<>();
			vocals.put((int) 'A', 'A'); 	vocals.put((int) 'a', 'a');
			vocals.put((int) 'E', 'E');		vocals.put((int) 'e', 'e');
			vocals.put((int) 'I', 'I');		vocals.put((int) 'i', 'i');
			vocals.put((int) 'O', 'O');		vocals.put((int) 'o', 'o');
			vocals.put((int) 'U', 'U');		vocals.put((int) 'u', 'u');  
			
			strTexto = "hola Mi nombre es charly sama"; System.out.println("texto a evaluar sus vocales: " + strTexto);
			for (int i=0; i < strTexto.length(); i++) {
				char c = strTexto.charAt(i);  							
				if ( vocals.containsKey( (int) c) ) {		
					System.out.println("El caracter: " + c + " en la posicion: " + i + " es una vocal ");
				}
			}
			
			
			System.out.println("-------- forma 2 encontrar vocales sin tantos recursos adicionales: ------------ ");
			String[] arrStrTexto1RowxChar= strTexto.split("");
			for(String s: arrStrTexto1RowxChar) {	
				if (s.toLowerCase().equals("a") || s.toLowerCase().equals("e") || s.toLowerCase().equals("i") || s.toLowerCase().equals("o") || s.toLowerCase().equals("u") ) {	
					System.out.println("El caracter: " + s + " es una vocal "); 
				}																
			}
			
						
			boolean containsVocals = false;
			for(String s: arrStrTexto1RowxChar) {
				if (s.toLowerCase().equals("a") || s.toLowerCase().equals("e") || s.toLowerCase().equals("i") || s.toLowerCase().equals("o") || s.toLowerCase().equals("u") ) {
					containsVocals = true;
					break;					
				} 
			}
			System.out.println("ContainsVocals: " + containsVocals);
			
			
			
			containsVocals = strTexto.matches(".*[aeiou].*");
			System.out.println("ContainsVocals (usando regex) : " + containsVocals);   
			
			containsVocals = Arrays.asList(strTexto.split("")).stream().anyMatch(s -> s.toLowerCase().equals("a") || s.toLowerCase().equals("e") || s.toLowerCase().equals("i") || s.toLowerCase().equals("o") || s.toLowerCase().equals("u") );
			System.out.println("ContainsVocals (usando Streams) : " + containsVocals);
			
			
			String strPalabra=  "Anilina"; 
			char[] cArrPalabra= strPalabra.toLowerCase().toCharArray();
			
			boolean isPalindromo= true;
			iFin = cArrPalabra.length - 1;	
			iCom = 0;						
			
			if (strPalabra.length()>1) { 
				
				charFin= cArrPalabra[iFin];
				charCom= cArrPalabra[iCom];
				
				while ( iFin > iCom && isPalindromo== true )  {	
					if ( charFin != charCom ) {
						isPalindromo = false;					
					} else {	
						iFin--; 
						iCom++;
						charFin= cArrPalabra[iFin];
						charCom= cArrPalabra[iCom];
					}
				}
				System.out.println("Resultado de esPalindromo(algoritmo secuencial): " + isPalindromo);
			}
			
			
			isPalindromo=true;
			
			System.out.println("Resultado de esPalindromo(algoritmo Recursivo): " + appInstance.esPalindromo(cArrPalabra,0,cArrPalabra.length-1,true));
			
		}	
	
		
		public boolean esPalindromo(char[] cArrPalabraParam, int iPos, int fPos, boolean seguir)  { 
			
			if (fPos-iPos ==0) { 
				seguir = false;
				return true; 
			}else if (fPos-iPos==1) { 
				seguir = false;
				return (cArrPalabraParam[iPos]==cArrPalabraParam[fPos]); 
			}else {
				if (seguir) { 
					if (cArrPalabraParam[iPos]!=cArrPalabraParam[fPos]) {
						seguir = false;
						return false; 
					} else {
						return esPalindromo(cArrPalabraParam,++iPos, --fPos,true); 
					}		
				}else {		
					seguir = false;	 
					return false; 
				}
			} 
		
		}
		
		public boolean isPalByCharlySan(char[] cArrPal) {
			return isPalHelper(cArrPal, 0, cArrPal.length - 1);
		}

		private boolean isPalHelper(char[] cArrPal, int iPos, int fPos) {
			if (iPos >= fPos) {
				return true; 
			}

			if (cArrPal[iPos] != cArrPal[fPos]) {
				return false; 
			}

			
			return isPalHelper(cArrPal, iPos + 1, fPos - 1);
		}
	
	
	
	public Map<Character, Integer> ContarCaracteresEnTexto(String texto) {
	
		
		Map<Character, Integer> mapaCounter = new HashMap<>();
		
		if ( texto != null &&  texto.length() > 0 ) { 
			
			for (int i=0; i< texto.length() ; i++ ) { 	
				char charAct= texto.charAt(i);
				if (!yaVisto(charAct, mapaCounter)) {   
					int currCharOcurrs = contarChar(charAct, texto.substring(i));
					mapaCounter.put(charAct, currCharOcurrs);
				}
			}
		}
		
		return mapaCounter;
	}
	
	public boolean yaVisto(char charActual, Map<Character, Integer> mapaParam) {
		boolean r=false;
		if (mapaParam.containsKey(charActual)) r= true;
		return r;
	}
	
	
	public int contarChar(char charParam, String strText) {
		int cont = 0;
		for (int i=0; i < strText.length(); i++ ) {
			if ( strText.charAt(i) == charParam ) {
				cont++;
			}
		}
		return cont;
	}


}


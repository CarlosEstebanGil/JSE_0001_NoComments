package pru_JSE_0001;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import pru_JSE_0001.IHumano.sexo;

public class Jse0001_varios {

	public static void main(String[] args) throws FileNotFoundException{

		Jse0001_varios appJse0001 = new Jse0001_varios();
		
		try {
			
			// appJse0001.conversionesTiposBasicas(); //(1)
			
			// appJse0001.polimorfismos(); //(2)
			
			// appJse0001.collections_1_basico(); //(3)
			
			// appJse0001.maps(); //(4)
			
			// appJse0001.trycathall(); //(5)
			
			//appJse0001.creandoApiClasesGenericsT(); //(6)
			
		    //appJse0001.collections_2_avanzado(); //(7)
		    
			// appJse0001.collections_3_avanzado(); //(8)
			
			// appJse0001.REGEXs(); //(9)
			
			// appJse0001.FilesJava7Avanzado(); //appJse0001.pruebatmp(); //.FilesJava7Avanzado(); //(10)
			
			 appJse0001.Hilos(); //(11)
			
			// Java 8: 
			
			// appJse0001.exprsLambdas();  //(12)
			
			// Metodos por Defecto ( @Default )//(13) 
			// Interfaces funcionales ( @FunctionalInterface ) //(14)  
			
			//appJse0001.referencias_a_Metodos(); // ( es el operador :: ) (15) 

			//appJse0001.Java8NewCollectionMethods(); // (16) 
			
			//appJse0001.Java8_Streams(); // (17) STREAMS 
			 //appJse0001.Java8_Optional(); // (18) OPTIONAL<T>
			
			//appJse0001.Java8_Streams_Paralelos(); // (19) STREAMS ( PARALELOS )
			
			//appJse0001.Java8_MAP_Nueva_Funcionalidad(); // (20) API MAP NUEVA FUNCIONALIDAD  
			
			//appJse0001.Java8_LOCAL_DATE_TIME_NEW_API(); // (21) API NUEVA JAVA 8 PARA FECHAS Y HORAS
			
			//appJse0001.Java8_HIGHT_ORDER_FUNCTIONS(); // (22) HIGH ORDER FUNCTIONS
			
			appJse0001.RX_2_Java(); // (23) RX JAVA PROGRAMACION ASYNCRONA // PUSH PARADIGMA REACTIVO FUNCIONAL
			
															
			// appJse0001.Val_Var_Let_y_Auto_InferencedTypes(); 	

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	/*---------------------------------------------------------------------------------------------------
	 								(1)Conversiones basicas de Tipos de datos
	 ----------------------------------------------------------------------------------------------------*/
	public void conversionesTiposBasicas() {
		
		int x=100;
		String strY = new String("50");
		int y = Integer.parseInt(strY);
		
		System.out.println(x+y);
		
		System.out.println("hola \"soy charly \" ");
		
		Integer iy;
		iy=Integer.decode(strY); 
		int ii = Integer.decode(strY);
		
		System.out.println(ii);
		
		String strX = new String(Integer.toString(x)); 
		
		System.out.println(x);
		
		System.out.println(strX.compareTo(strY)); 
		System.out.println("a".compareTo("c"));   
		
		int[] arrx = new int[] {0,1,2,3}; 
		for (int e : arrx) {
			System.out.print (e+ ". "); 
		}
		
		System.out.println( "\n " + ( (x>ii)?x:ii ) ); 
		
		for (int i = 0; i < arrx.length; i++) {
			if (i==2) continue;
			if (i>2) break;
			System.out.println("i vale: " + i);
		}
		
		final int COLS = 4;
		
		int[][] imat = new int[3][COLS];	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < COLS; j++) {
				imat[i][j]=  Double.valueOf(Math.random()*100).intValue();			
				System.out.print(imat[i][j] + " ");
				if (j==COLS-1) System.out.print("\n");
			}
		}		
		
		switch (ii) {
		case 100:
			System.out.println("ii vale 100");
			break;
		case 50:
			System.out.println("ii vale 50");
			break;
		default:
			System.out.println(" ii ni 50 ni 100 sino que vale " + ii );
			break;
		}

		String iiStr =  Integer.toString(ii);
		switch (iiStr) {
		case "100":
			System.out.println("ii vale 100");
			break;
		case "50":
			System.out.println("ii vale 50"); break;
		default:
			System.out.println(" ii ni 50 ni 100 sino que vale " + iiStr ); break;
		}	
	}
	
	public void polimorfismos() {
		IHumano humano1 = new Humano();
		Perro perro1 = new Perro();
		
		IMamifero humano2 = new Humano();
		getMamifero(humano2).caminar();
		
		IMamifero perro2 = perro1; 
		getMamifero(perro2).caminar();
		
		humano1.setName("car");

		IHumano hum2 = ((Humano) humano2);
		hum2.setName("noe");
		
		System.out.println(humano1.getName());

		System.out.println(hum2.getName());
		
		hum2=humano1;
		System.out.println(hum2.getName());
	}

	public IMamifero getMamifero(IMamifero mamifParam) {
		return mamifParam;
	}
	
	public void collections_1_basico() { 
		final int INIT_CAP_LSTR = 10; 
		List<String> lStr = new ArrayList<>(INIT_CAP_LSTR); 
		
		for (int i=0; i<10; i++) 
			lStr.add(Integer.toString(i));
		
		for (String s : lStr) System.out.println(s); 
		
		
		List<Integer> lIntCarrito = new LinkedList<>(); 
		
		for (int i=0; i<10; i++) 
			lIntCarrito.add(  Double.valueOf( Math.random()*100  ).intValue() ) ;
		
		for (Iterator<Integer> it = lIntCarrito.iterator(); it.hasNext();) {
			Integer integerValue = it.next(); 
			System.out.println(integerValue);
			
		}
		Set<Integer> setConj;
		try {
			setConj= new HashSet<>();
			setConj.add(1);
			setConj.add(2);
			setConj.add(3);
			setConj.add(1); 
			System.out.println("--------------------------------------set-----------------------");
			System.out.println("set.size() :" + setConj.size());
			for (Integer i: setConj) System.out.println(i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("---------------------Lista de Objetos Custom (c/polimorfismo)---------------");
		List<IMamifero> lMamiferos = new ArrayList<>();
		lMamiferos.add(new Humano());
		lMamiferos.add(new Perro());
		lMamiferos.add(
						new Mamifero() { 
							@Override
							public void caminar() {
								super.caminar();
								
							}

							@Override
							public void respirar() {								 
								super.respirar();
							}
							
						}
					);
		for (IMamifero iMamiferoElem : lMamiferos) iMamiferoElem.caminar();
	}
	
	

	public void maps() { 
		Map<Integer, IMamifero> mapaMamiferosMap = new HashMap<Integer, IMamifero>();

		mapaMamiferosMap.put(1, new Humano());
		mapaMamiferosMap.put(2, new Humano());
		mapaMamiferosMap.put(1, new Perro());
		mapaMamiferosMap.put(1, new Humano());

		System.out.println("---------------------Lista de Objetos Custom (c/polimorfismo)---------------");
		
		mapaMamiferosMap.keySet().forEach(System.out::println);
		mapaMamiferosMap.entrySet().forEach(System.out::println);
		
		System.out.println(mapaMamiferosMap.containsKey(1));
	}
	
	

	public void trycathall() throws FileNotFoundException { 

				try {			
					int x = 3 / 0;
					
				} catch ( ArithmeticException | NumberFormatException e ){ 
					
					System.out.println(e.getClass().getName() =="java.lang.ArithmeticException"?1:2);
					
					System.out.println(e instanceof java.lang.ArithmeticException ?1:2);
				}
				catch (Exception e2) {	
																
					System.out.println("Otra Excepcion ");
				}
				


					Scanner scanner = null;
					try {
					    scanner = new Scanner(new File("test.txt"));
					    while (scanner.hasNext()) {
					        System.out.println(scanner.nextLine());
					    }
					} catch (FileNotFoundException e) {
					    e.printStackTrace();
					} finally {
					    if (scanner != null) {
					        scanner.close();
					    }
					}

					try (Scanner scanner2 = new Scanner(new File("test.txt"))) {
					    while (scanner2.hasNext()) {
					        System.out.println(scanner2.nextLine());
					    }
					} catch (FileNotFoundException fnfe) {
					    fnfe.printStackTrace();
					}


						try (	Scanner scanner3 = new Scanner(new File("testRead.txt"));
								PrintWriter writer = new PrintWriter(new File("testWrite.txt"))
							) {
								    while (scanner3.hasNext()) {
									writer.print(scanner3.nextLine());
							  }
						}catch (Exception e) {

						}
						
	}
	

	public void creandoApiClasesGenericsT() {
		MiClaseGeneric<Integer> miClsGenIntObj = new MiClaseGeneric<Integer>(25);
		MiClaseGeneric<String> miClsGenStringObj = new MiClaseGeneric<String>("hola");
		
		miClsGenIntObj.mostrarTipo();
		miClsGenStringObj.mostrarTipo();
		
		System.out.println("-------------------- Con mas de un obj interno generico estereotipado (sin limites x ahora): ");

		MiClaseGeneric_conMasTiposEstereotipados<Integer, Double, String, Perro> miClsGenMultipleGensObjs= 
				new MiClaseGeneric_conMasTiposEstereotipados<Integer, Double, String, Perro>(new Double( 3.0),new Integer(2), 
						"hola", new Perro());
		miClsGenMultipleGensObjs.mostrarTipos();

		MiClaseGeneric_conMasTiposEstereotipados<Humano, Humano, Double, Integer> miClsGenMultipleGensObjs2= 
				new MiClaseGeneric_conMasTiposEstereotipados<Humano, Humano, Double, Integer>(new Humano(),
						new Humano(),  3.0, 2);
		miClsGenMultipleGensObjs2.mostrarTipos();
		
		
		System.out.println("-------------------- bounded: ");
		MiClaseGenericBounded<Humano> miClsGenBoundedHumanObj = new MiClaseGenericBounded<Humano>(new Humano());
		miClsGenBoundedHumanObj.mostrarTipo();
		
		MiClaseGenericBounded<Perro> miClsGenBoundedPerroObj = new MiClaseGenericBounded<Perro>(new Perro());
		miClsGenBoundedPerroObj.mostrarTipo();
				
		

	}
	

	public void collections_2_avanzado() {	
		List<Integer> lInts = new ArrayList<>(300); 
		List<Integer> larrInts= new ArrayList<>(20);
		larrInts.add(2); larrInts.add(1); larrInts.add(3);
		
		for (Integer i: larrInts) System.out.println(i);
		
		larrInts.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			} }); 
		System.out.println("com <I>Comparator----------------------------------");
		
		List<Humano> lhumans = new ArrayList<>();

		Humano homer = new Humano("homer");
		Humano moe = new Humano("Moe");

        lhumans.add(homer);
        lhumans.add(moe);

        Collections.sort(lhumans, (Comparator.<Humano> comparingInt(  human1 -> human1.getName().length() ) .thenComparingInt(
                        														 human2-> human2.getName().length()
                        														)													
                        			)																								
        				);																											
        System.out.println(lhumans); 
        
      
        System.out.println("fin <I>Comparator----------------------------------");
		
        
		for (Integer i: larrInts) System.out.println(i);
		
		Collections.reverse(larrInts);
		for (Integer i: larrInts) System.out.println(i);
		
		larrInts.sort( (Integer o1, Integer  o2 ) -> o1 - o2  );
		for (Integer i: larrInts) System.out.println(i);
		
		
		
		List<IMamifero> lMamiferos = new ArrayList<>(20);
		Humano pers1  = new Humano(); pers1.setEdad(20); 
		Humano pers2  = new Humano(); pers2.setEdad(80);
		
		lMamiferos.add(pers1);
		lMamiferos.add(pers2); 

		lMamiferos.sort(new Comparator<IMamifero>() {
			@Override
			public int compare(IMamifero o1, IMamifero o2) {
				return  o2.getEdad() - o1.getEdad(); 
			} });
		
		for (IMamifero elemMamif: lMamiferos) System.out.println(elemMamif.getEdad()); 

		
		
		List<Humano> lHumanos = new ArrayList<>(30);
		lHumanos.add(pers1);
		lHumanos.add(pers2);
		
		if (pers1.compareTo(pers2) < 0 ) { System.out.println("La persona p1: es menor."); }
		
		
		Collections.sort(lHumanos); 
		
		for (Humano humanoElem: lHumanos) System.out.println(humanoElem.getEdad()); 
		
		System.out.println("----------------------------------------------------------------------"); 
		Humano[] basicArrPers = new Humano[] {pers1, pers2 }; 
		 Arrays.stream(basicArrPers).forEach(System.out::println);  
	}


	public void collections_3_avanzado() {  
		
		Set<Humano> conjHumanosUnicos = new HashSet<>();
		
		Humano human1 = new Humano("Carlitos"); human1.setId(111111111); human1.setSexo(sexo.MALE);
		Humano human2 = new Humano("noe"); human2.setId(222222222);human2.setSexo(sexo.FEMALE);
		Humano human3 = new Humano("Carlitos"); human3.setId(111111111); human3.setSexo(sexo.MALE);
		Humano human4 = human3;
		
		conjHumanosUnicos.add(human1);conjHumanosUnicos.add(human2);conjHumanosUnicos.add(human3);conjHumanosUnicos.add(human4);
		System.out.println("SETS ---- Equals and hash code ----- xa custom objets ----------- ");
		for (Humano h: conjHumanosUnicos) System.out.println(h.getName()+' '+h.getId()+' ' + h.getSexo());
		System.out.println("SIZE del set: " + conjHumanosUnicos.size());
		 
		System.out.println("MAP:---------------------------------------------------------------");
		
		Map<Integer,Humano> myMap=new HashMap<>();  
		 
		myMap.put(1, human1);
		myMap.put(2, null);		
		myMap.put(3, human2);
		
		for ( Entry<Integer,Humano> entry: myMap.entrySet() ) {
			  System.out.println( entry.getKey() + ( entry.getValue() == null ?  "null" : entry.getValue() .toString() ) ); // 
		}
	}
	
	
	public void cadenasDeCaracteres() {  
	
		System.out.println("------------------------------------------------------------");
		
		StringBuilder sb = new StringBuilder(); 
		sb.append("Hola").append(" soy").append( "charly");
		sb.reverse();
		System.out.println(sb.toString());
		
		
		String strTxt = " Hola. Mi nombre es carlos esteban gil. licenciado sistemas. musico. bailarin. ";
		String[] arrSplittedTxt = strTxt.split("\\.");
		for (int i = 0; i < arrSplittedTxt.length; i++) System.out.println(arrSplittedTxt[i]);
		
		System.out.println("EXPRESIONES REGULARES (regex) Matcher Patter compile.. ");
			  
		Pattern p = Pattern.compile(".*carlos.*");  
		Matcher m = p.matcher(strTxt); 
					    
		System.out.println(m.matches());
		
		
		boolean b = Pattern.compile(".*carlos.*", Pattern.CASE_INSENSITIVE).matcher(strTxt).matches();
		System.out.println(b);
		
		String texto = "Hola, soy carlos. dije hola xa dar > informalidad. hoy es 24/09/2022. 10am . \n "
				+ "			Mi dni es 36894252. mail CarlosestebangiL@Gmail.Com \n "
				+ "			profesion lic. en sistemaS . soy musico . soy bailarin de tango. sexo masculino \n"
				+ "		Fecha nacimiento 19880709. familia noemi gerosa, carlos jose , natalia, lali, bulma."
				+ "		La contraseÃ±a que elijo para su servicio es adOraci@n071002. Mi pagina personal es "
				+ 		"https://www.charlysan.com/theBest ";
		
		System.out.println("--------------REGEX (Introduccion): -----------------------");
		String[] strArrRegexs = new String[100];
		String[] strArrTexts = new String[100];
			
		
				strArrTexts[0] = "hola .Mi Nombre es charly , esteban gil . soy hombre          .    SI";
				strArrRegexs[0] ="(\\w)(\\s+)([\\.,])";
				
				System.out.println(strArrTexts[0].replaceAll(strArrRegexs[0] , "$1$3"));
				
		
		
	}
	
	
	public void REGEXs(){  
		

		String strText = ""; 		String regex = ""; 	Pattern pattern; Matcher matcher;
		
		System.out.println("--------------REGEX EXAMPLES: -----------------------"); 
	
		
		strText = " buenas";
		
		regex=".+";
		
		matcher = Pattern.compile(regex).matcher(strText);
		
		regex="^hola.*";	
		AplicarATextoYmostrarRtado(" hola" , regex);	
		AplicarATextoYmostrarRtado("holass  " , regex); 
		AplicarATextoYmostrarRtado("hola" , regex);		
		
		regex="^hola$";
		AplicarATextoYmostrarRtado(" hola" , regex); 
		AplicarATextoYmostrarRtado("holass  " , regex); 
		AplicarATextoYmostrarRtado("hola" , regex); 
		AplicarATextoYmostrarRtado("asasholaasas" , regex); 
		
		regex=".*hola.*";
		AplicarATextoYmostrarRtado(" hola" , regex); 
		AplicarATextoYmostrarRtado("holass  " , regex); 
		AplicarATextoYmostrarRtado("hola" , regex); 
		AplicarATextoYmostrarRtado("asasholaasas" , regex); 

		
		regex=".*hola$";	
		AplicarATextoYmostrarRtado("asasaasashola" , regex); 

							
		regex = "\\bhola.*";
				
		AplicarATextoYmostrarRtado("hola ." , regex); 
		
		regex = ".*\\bjava\\b.*"; //"\\bjava\\b/g"; 
		
		AplicarATextoYmostrarRtado("Today, java is object oriented language", regex); 
		
		
		AplicarATextoYmostrarRtado("Today, java is object oriented language java", regex,true); 

		regex = "(.*\\bjava\\b.*)*";			
		AplicarATextoYmostrarRtado("Today, java is object oriented language java", regex,true); 
		
		
		AplicarATextoYmostrarRtado("asasholaasas" , regex);

		regex = "\\bhola\\b"; 
		AplicarATextoYmostrarRtado("sadsad hola ss" , regex); 
		
		regex = "\\\bhola";
		AplicarATextoYmostrarRtado("sadsadhola  ss  " , regex);	
		
		AplicarATextoYmostrarRtado("sadsad hola  ss  " , regex);
		AplicarATextoYmostrarRtado("sadsadhola " , regex); 		
		AplicarATextoYmostrarRtado("sadsadhola" , regex); 		
		AplicarATextoYmostrarRtado("hola chau" , regex); 		
		AplicarATextoYmostrarRtado("hi hola chau" , regex); 	
		
		
		AplicarATextoYmostrarRtado("hola " , regex); 
		AplicarATextoYmostrarRtado("hola \\n" , regex); 
		AplicarATextoYmostrarRtado("hola	" , regex); 

		
		
		regex = "\\bhola";
		AplicarATextoYmostrarRtado("holasadsadholasasasasasasa" , regex);
		
		
		regex="^[A-Za-z0-9_]+";	strText="21sd32A121aa1";
		pattern = Pattern.compile(regex); 
											
		matcher = pattern.matcher(strText); 
										
										
		System.out.println( matcher.find() ) ; 
		
		regex="^hola"; strText="hola como estas";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(strText);
		System.out.println(matcher.find());	
		regex="^\\w+?\\s+\\d+\\D\\s\\W+$"; strText="Aa_b   123W !!"; 
		pattern = Pattern.compile(regex);							 
		matcher = pattern.matcher(strText);							 
		System.out.println(matcher.find());							 
		

	}
	
	
	public void AplicarATextoYmostrarRtado(String cadenaParam, String regexParam) {
		AplicarATextoYmostrarRtado(cadenaParam, regexParam, false);
	}
	public void AplicarATextoYmostrarRtado(String cadenaParam, String regexParam, boolean showCantMatches) { 
		Pattern pattern = Pattern.compile(regexParam);
		Matcher matcher = pattern.matcher(cadenaParam);
		
		
		 int count = 0;
	        while( matcher.find() ) {
	            
	            count++;
	        }
	        
	        if (showCantMatches) {  
	        	System.out.println("Match count is: " + count);
	        }
 
	        System.out.println("Resultado del match: " + (count >0?true:false) );
	}    
	

	public void FilesJava7Avanzado() throws IOException, URISyntaxException{
		File f1 = new File("carlitos.txt"); 
		
		if ( !f1.exists() ) {
			f1.createNewFile(); 
		}

		File f2 = new File("c:\\carlitos.txt"); 
		System.out.println(f2.exists());
		

		System.out.println( f2.createNewFile() );
		
		URI uri = f2.toURI();
		System.out.println(uri); 
		
		URI fileURI = new URI("file:///C:/java_tmp_files/pruebatmp.txt"); //(B)
		File f3 = new File(fileURI);
		
		System.out.println(f3.exists());
		System.out.println(f3.createNewFile());
		System.out.println(f3.exists());
		
		File f4 = new File("C:\\CARPETA");
		System.out.println(f4.mkdir());
		
		
		try (InputStream fis = new FileInputStream("My_Data_Example_forReading.txt")){ 
			byte[] buff = new byte[1024]; 
			
			int ii = fis.read(buff);  
			while (ii != -1 ) {		
				System.out.println("1eros 1024 (buff size) bytes: " ); 
				for (int i = 0; i < buff.length; i++)  System.out.print((char) buff[i]);
				System.out.println(" bytes leidos: " + ii ); 
				ii = fis.read(buff);						
			}												
		} catch (FileNotFoundException fnfe) {				
		    fnfe.printStackTrace();							
		}													
	
	
			int cant = 16 * 1024; 
			try (InputStream bis = new BufferedInputStream( new FileInputStream("simpsons_320x240_abraham.gif") , cant) ) { 
				int  i = bis.read();
				while ( i != -1 ) {
					System.out.print((char) i);  
					i = bis.read();				
				}
				
			}catch(FileNotFoundException fnfe) { 
				System.out.println(fnfe.getMessage());
			}
	
	
	
			try (OutputStream out = new FileOutputStream("carlitoswritted.txt")) {
				String strTextoAescribir = " Esta es una fucking prueba ";
				out.write(strTextoAescribir.getBytes());	
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	
			
			
			try (Scanner scanner = new Scanner(new File("My_Data_Example_forReading.txt"));
				    PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
				    while (scanner.hasNext()) {
				    	writer.print(scanner.nextLine());
				    }
				}	
			
			final int BUFFER_SIZE = 1024 * 8; 
			
			try (	InputStream fis = new FileInputStream("simpsons_320x240_abraham.gif")  ;
					OutputStream bos = new BufferedOutputStream(new FileOutputStream("pruebaBOS.gif"), BUFFER_SIZE) 
				) {
					
					byte[] buffer = new byte[BUFFER_SIZE]; 
					int byteRead = fis.read(buffer);
					while (  byteRead  != -1 ) {
						bos.write(byteRead);
						byteRead = fis.read();
					}
				
				 }catch (Exception e) {
					System.out.println(e.getMessage());

				 }	 
		
			System.out.println("\n ----------------------- READER----------------------------------" );
			try( Reader reader = new FileReader("My_Data_Example_forReading.txt") ) {
				 int iData = reader.read();
				 while (iData != -1) {
					 System.out.print((char) iData);
					 iData = reader.read();
				 }
			}catch (FileNotFoundException  e) {
				e.printStackTrace();
			} 
			
			System.out.println("\n ----------------------- WRITER----------------------------------" );
			try( Writer writer = new FileWriter("writeroutputexample.tmp",false) ) { 
				 writer.write("ESTE ES UN TEXTO DE PRUEBA . UNA CADENA DE TEXTO SOLA ,  CORTA Y ESCRITA CON UN WRITER.");
			}catch (FileNotFoundException  e) {
				e.printStackTrace();
			} 

			
			System.out.println("\n ----------------------- BuferredREADER----------------------------------" );
			final int TAM_BUFF = 1024 * 8;
			try( Reader reader = new BufferedReader ( new FileReader("My_Data_Example_forReading.txt") , TAM_BUFF) ) {
				 int iData = reader.read();
				 while (iData != -1) {
					 System.out.print((char) iData);
					 iData = reader.read();
				 }
			}catch(Exception e) {
				e.printStackTrace();
			} 	
			
				
				System.out.println("\n ----------------------- BuferredWRITER----------------------------------" );
				
				try( Writer writer = new BufferedWriter( new FileWriter("writeroutputexample.tmp") , TAM_BUFF) ) {
					writer.write("THIS FILE HAS BEEN BUFFERWRITED XD"); 
				}catch(Exception e) {
					e.printStackTrace();
				} 	
			

					Path path = Paths.get("My_Data_Example_forReading.txt"); 
														

					boolean existe = Files.exists(path, new LinkOption[] {LinkOption.NOFOLLOW_LINKS}  );
					
																		  
					Path pathCarpetaAcrear = Paths.get("c:\\charlynius"); 
					if (!Files.exists(pathCarpetaAcrear, new LinkOption[] {LinkOption.NOFOLLOW_LINKS} )) 
						Files.createDirectories(pathCarpetaAcrear);
				
					
					Path fOrigen = Paths.get("My_Data_Example_forReading.txt");
					Path fDestino= Paths.get("c:\\charlynius\\My_Data_Example_forReadingCOPY.txt"); 
																									
					if(! Files.exists(fDestino, new LinkOption[] {LinkOption.NOFOLLOW_LINKS}) ) Files.copy(fOrigen, fDestino);
				
				
					Path fOrigen2 = Paths.get("copia.txt"); 
					Path fDestino2 = Paths.get("c:\\moved.txt"); 
					
					Files.move(fOrigen2, fDestino2, StandardCopyOption.REPLACE_EXISTING);
				
				
				RandomAccessFile rndFile = new RandomAccessFile("My_Data_Example_forReading.txt", "rw");
				
				FileChannel fChannel = rndFile.getChannel();
				
				long sizeBuf = fChannel.size();
				
				ByteBuffer bytesBuf = ByteBuffer.allocate((int) sizeBuf);
				
				int bytesRead = fChannel.read(bytesBuf);
				
				while (bytesRead != -1) {
					System.out.println("bytes leidos: " + bytesRead);
					bytesBuf.flip();	
					
					while (bytesBuf.hasRemaining()) {
						System.out.println((char) bytesBuf.get());
					}
					
					bytesBuf.clear(); 
					bytesRead = fChannel.read(bytesBuf);
				}
				fChannel.close();
	}


	public void Hilos() throws Exception{  
		Thread t1 = new Thread(); 
		
		for( int i=0 ; i<1000 ; i++ ) {
			System.out.println("THREAD T"); 
		}
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for( int i=0 ; i<1000 ; i++ ) {
					System.out.println("RUNNABLE R"); 
				}	
			}
		};
		
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
		for( int i=0 ; i<1000 ; i++ ) {
			System.out.println("MAIN"); 
		}
										
	    Thread.sleep(1000); 
		Thread t3 = new Thread( new Runnable() { @Override public void run() { for( int i=0 ; i<1000 ; i++ ) {System.out.print(" T3"); }} 	
											   } );
		Thread t4 = new Thread( new Runnable() { @Override public void run() { for( int i=0 ; i<1000 ; i++ ) {System.out.print(" T4"); }} 	
		   } );
		
		
		t3.start(); 
		t3.join();
		
		t4.start();
		t4.join(); 
		
		for( int i=0 ; i<1000 ; i++ ) {System.out.print(" MAIN"); } 
		
	    
		Thread.sleep(1000); System.out.println("\n ------------------- EJ JOIN ALGUNOS SI OTROS NO .... --------------------- "); 
		
		Thread t5 = new Thread( new Runnable() { @Override public void run() { for( int i=0 ; i<1000 ; i++ ) {System.out.print(" T5"); }} 	
		   } );
		Thread t6 = new Thread( new Runnable() { @Override public void run() { for( int i=0 ; i<1000 ; i++ ) {System.out.print(" T6"); }} 	
		} );
		
		
		t5.start(); 
		t5.join();		
		t6.start();		
		for( int i=0 ; i<1000 ; i++ ) {System.out.print(" MAIN"); } 
		
		Thread.sleep(5000);	  
		if ( !t6.isAlive()) { 
			t6.start();		   
							  
		}
		
		
	public void exprsLambdas() throws Exception{	
			
		List<String> lArrStr = new ArrayList(); 
		
		lArrStr.add("Miercoles Tarde");
		lArrStr.add("Lunes");
		lArrStr.add("Miercoles MaÃ±ana");
		
		//	 ----- ----------
		for (Iterator iterator = lArrStr.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		lArrStr.sort(new Comparator<String>() { 
							@Override
							public int compare(String o1, String o2) {
								return o1.compareTo(o2);
							}
						}
					);	
		
		System.out.println();
		
		for (String string : lArrStr) {
			System.out.println(string);
		}
		
		
		lArrStr.sort( (String s1, String s2) ->  s2.compareTo(s1)  ); 
		
		System.out.println();
		
		for (int i = 0; i < lArrStr.size(); i++) {
			System.out.println( lArrStr.get(i) );
		}
		
		lArrStr.sort(new MyFunctionalInterface01() {
									@Override
									public int compare(String s1, String s2) {
										return s1.compareTo(s2);
								}
							}
					);				
		System.out.println();
		
		for (String string : lArrStr) {
			System.out.println(string);
		}
		
		
		MyFunctionalInterface02 myIF02Tmp = new MyFunctionalInterface02() {
			@Override
			public String concatenar(String s1, String s2) {
				return s1 + s2;
			}
		};
		
		String strTmp = myIF02Tmp.concatenar("hola", "mundo");
		System.out.println(strTmp);
		
		myIF02Tmp = (s1,s2) -> s2 + s1;
		System.out.println(myIF02Tmp.concatenar("hola", "mundo"));
		
		
		myIF02Tmp = (s1,s2) -> { String a = s1+"-add1-"; String b = s2+"-add2-"; return a + b; };
		System.out.println(myIF02Tmp.concatenar("hola", "mundo"));
		
		
		MyFunctionalInterface03 myIF03Tmp = () -> "Hola Charly";
		System.out.println(myIF03Tmp.devolverMensaje());
		
	
 	}
	
	public void referencias_a_Metodos() throws Exception{	
		
		Jse0001_varios AppTmpObj = new Jse0001_varios();
		MyFunctionalInterface03 iFuncionalMethodRefPtr = Jse0001_varios::refMetStaticMetEjemplo;
		System.out.println(iFuncionalMethodRefPtr.devolverMensaje());
		

		MyFunctionalInterface03 iFuncionalMethodRefPtr2 = AppTmpObj::refMetInstanciaMetEjemplo;
		System.out.println(iFuncionalMethodRefPtr2.devolverMensaje());		
		
		String[] misNombres = { "carlos", "esteban", "gil" };
		Arrays.sort(misNombres, new Comparator<String>() {	
															@Override
															public int compare(String o1, String o2) {
																return o1.compareTo(o2);
															}
									});
		for (int i = 0; i < misNombres.length; i++) {
			System.out.println(misNombres[i]);
		}
		
		
		Arrays.sort(misNombres, (s1,s2) -> s2.compareTo(s1)); 
		
		for (int i = 0; i < misNombres.length; i++) {
			System.out.println(misNombres[i]);
		}

		Arrays.sort(misNombres, String::compareTo);		
		
		for (int i = 0; i < misNombres.length; i++) {	
			System.out.println(misNombres[i]);
		}
		
			IPersona Ipers01= new IPersona() {	
				
				@Override
				public Persona crear(int id) {
					return new Persona();		
				}
			}; 
		
			Persona persona01= Ipers01.crear(111111);	
											
			IPersona iPers02 = (i) -> { return new Persona(i); } ; 
			Persona persona2 = iPers02.crear(222222);
			

			IPersona iPers03 = Persona::new;
			Persona persona03 = iPers03.crear(3333333);
			
	}
	
	
	public static String refMetStaticMetEjemplo() { return "invoc x ref a met static"; } 
	public String refMetInstanciaMetEjemplo() { return "invoc x ref a met Instancia"; } 
	
	
	public void Java8NewCollectionMethods() { 
		
		List<String> strListMisNombres01 = Arrays.asList("car","est","gil"); 
				List<String> strListMisNombres02 = new ArrayList<String>() {{ 
			            add("noe");
			            add("ali");
			            add("ger");
			            } };	
	

	
			strListMisNombres01.forEach(System.out::println); 
	
			strListMisNombres02.removeIf(strElem -> strElem.compareTo("ali")==0);
			strListMisNombres02.forEach(System.out::println);
						
			
			strListMisNombres01.sort(String::compareToIgnoreCase); 
				
			strListMisNombres01.sort( ( strElemA, strElemB ) -> strElemA.compareToIgnoreCase(strElemB)); // le paso el criterio y 
	} 
	
	
	public void Java8_Streams() {   
		
		String[] strArrayTmp = new String[] {"100","200","300","400","500"};
		List<String> lStr = Arrays.asList(strArrayTmp);
		
	
				List<String> listaStrings;
				List<String> listaNumeros;
				
				listaStrings = new ArrayList<>();
				
				listaStrings.add("Mito");
				listaStrings.add("Code");
				listaStrings.add("Jaime");
				listaStrings.add("MitoCode");
				
				listaNumeros = new ArrayList<>();
				
				listaNumeros.add("1");
				listaNumeros.add("2");
		
				listaStrings.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
				listaStrings.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);
				
				listaNumeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
				
				listaStrings.stream().limit(2).forEach(System.out::println);
				
				long x = listaStrings.stream().count();
				System.out.println(x);
				
				
					Stream<String> streamStrs = lStr.stream(); System.out.println();
					
					streamStrs.forEach(System.out::print);
					
					  	String[] array = {"a", "b", "c", "d", "e"};		
				        Supplier<Stream<String>> streamSupplier = () -> Stream.of(array); 
				        streamSupplier.get().forEach(e -> System.out.println(e));	
				        
				        long count = streamSupplier.get().filter(elem -> "b".equals(elem)).count();
				        System.out.println(count);
				        
				        System.out.println(" ORDENANDO EL STREAM ( a b c d e ) : ");
				        streamSupplier.get().sorted((xelem,yelem)->yelem.compareTo(xelem)).forEach(xelem->System.out.print(xelem));
				        Collections.sort(Arrays.asList(array),String::compareTo);
				        
				        streamSupplier.get().sorted(String::compareTo).forEach(x1->System.out.print(x1));
				        
				        streamSupplier.get().map(String::toUpperCase).forEach(x2->System.out.print(x2));
				        
				        
				        System.out.println("TRANSFORMAR:");
				        streamSupplier.get().map(x7->x7.toUpperCase() ).forEach(x3->System.out.print(x3));
				        streamSupplier.get().map(String::toUpperCase).forEach(x4->System.out.print(x4));
				        
				        Supplier<Stream<String>> streamSupplier2 = () -> Stream.of(strArrayTmp); 
				        streamSupplier2.get().map(x5 -> Integer.parseInt(x5) + 1).forEach(x5->System.out.print(x));
				        
			
				        System.out.println("DELIMITAR:");
				        streamSupplier.get().limit(3).forEach(x6->System.out.print(x6));
		
			
				        System.out.println("CONTAR:");
				        System.out.println( streamSupplier.get().count());
				        
			
	public void Java8_Optional() {   

		Jse0001_varios myAppTmpInst = new Jse0001_varios();
					
				String strOpValue = null;	//																			 ------------
				Optional<String> opStr = Optional.ofNullable(strOpValue);
				strOpValue = opStr.orElse("");
				myAppTmpInst.probarOptional(strOpValue);  
				String str = null;																									// 		y 
				Optional<String> op = Optional.ofNullable(str);
				System.out.println(op.isPresent()); 
				
	}
	
	public void probarOptional(String valor) {
		System.out.println(valor.contains("ola"));
	}
	
	
	
	public void Java8_Streams_Paralelos() {
		
		int[] iArrNums = {1,2,3,4,5}; 

		
		Integer[] what = IntStream.of(iArrNums).boxed().toArray(Integer[]::new); 
		Integer[] ever = Arrays.stream( iArrNums).boxed().toArray( Integer[]::new ); 
		
		List<Integer> you  = Arrays.stream( iArrNums).boxed().collect( Collectors.toList() );
		List<Integer> like = IntStream.of( iArrNums).boxed().collect( Collectors.toList() );
		
		   
		   Supplier<Stream<Integer>> streamSupplierInteger = () -> Stream.of(1,2,3,4,5,6,7,8,9); 
		   Stream<Integer> StreamIntegers =  Stream.of(1,2,3,4,5); 
		   int[] iDataArr = new int[1000];
		   for (int i=0; i < 1000; i++) {
			   iDataArr[i]=i;
		   }
		   
		   List<Integer> lIntegersData = Arrays.stream( iDataArr).boxed().collect( Collectors.toList() );
		   
		   
		   lIntegersData.stream().forEach(System.out::print);
		   
		   System.out.println("------------ Paralel: -----------------");
		   
		   lIntegersData.parallelStream().forEach(System.out::print);		
	}
	

	public void Java8_MAP_Nueva_Funcionalidad() { 
		Map<Integer,String> map = new HashMap<>(); map.put(1, "Charly"); map.put(2, "Guille");map.put(3, "Luis");
		
		
		
			for( Entry<Integer,String> entryIntStr : map.entrySet()) {
				System.out.println("Clave: " + entryIntStr.getKey() + " Valor: " + entryIntStr.getValue());
			}
		
		
			map.forEach((k,v) -> System.out.println("Clave: " + k + " Valor: " + v));
			
			map.entrySet().stream().forEach(System.out::println);  
		
			map.putIfAbsent(4, "dave");
			map.put(4,"paul"); 
			map.computeIfPresent(4, (k,v) -> k+v);      
			System.out.println(map.get(4)); 
		
		
				map.getOrDefault(6, "default name"); 
				map.getOrDefault(2, "default name"); 
	}
	
	
	public void Java8_LOCAL_DATE_TIME_NEW_API() throws Exception {  
		//  old 7-  
		
			Calendar fecha1 = Calendar.getInstance();
			Calendar fecha2 = Calendar.getInstance();
			fecha1.set(1980, 9,7);
			System.out.println(fecha1.after(fecha2));
			
			
		//) NEW: JAVA8+ 
			
			LocalDate fecha01 = LocalDate.of(1980, 9, 7);
			LocalDate fecha02 = LocalDate.now();
			
			System.out.println( fecha01.isAfter(fecha02) +" " + fecha01.isBefore(fecha02) );
			
			
			LocalTime hora01 = LocalTime.of(23, 59);
			LocalTime hora02 = LocalTime.now();
			
			System.out.println( hora01.isAfter(hora02) +" " + hora01.isBefore(hora02) );
			
			
			LocalDateTime fechahora01 = LocalDateTime.of(fecha01, hora01);
			LocalDateTime fechahora02 = LocalDateTime.of(2022,11,04,10,53,00);
			LocalDateTime fechahora03 = LocalDateTime.now();
			
			System.out.println( fechahora01.isAfter(fechahora02) +" " + fechahora02.isBefore(fechahora03) );
		
			
				long ini = System.currentTimeMillis();
				Thread.sleep(1000);
				long fin = System.currentTimeMillis();
				System.out.println(fin - ini);
				
				
				Instant instanteIni = Instant.now();
				Thread.sleep(1000);
				Instant instanteFin = Instant.now();
				System.out.println(Duration.between(instanteIni, instanteFin).toMillis()); 

				// ( old  7- ( calendar.. ) )
				
				Calendar calNacimiento = Calendar.getInstance();
				Calendar calActual = Calendar.getInstance();
				
				calNacimiento.set(1988,0,21);
				calActual.set(2022, 11,4);
				
				int anios = 0;
				
				while(calNacimiento.before(calActual)) {
					calNacimiento.add(Calendar.YEAR, 1);
					if (calNacimiento.before(calActual)) {
						anios++;
					}
				}
				
				System.out.println(anios);
				
			//) NEW: JAVA8+ 
				
				LocalDate ldateNacimiento = LocalDate.of(1998,9, 7);
				LocalDate ldateActual = LocalDate.now();				
				Period periodEntreNac_y_actual = Period.between(ldateNacimiento, ldateActual);
				System.out.println(periodEntreNac_y_actual.getYears()+" "+periodEntreNac_y_actual.getMonths()+" "+periodEntreNac_y_actual.getDays());
				
				
				//a) String a fecha (old - java 7-)
				
				 String fecha = "7/9/1988"; 
				 DateFormat formateadorFecha = new SimpleDateFormat("dd/MM/yyyy");
				 Date fechaConvertida = formateadorFecha.parse(fecha);				
				 System.out.println(fechaConvertida);
				
				 
				 Date fechaActual = Calendar.getInstance().getTime(); 
				 SimpleDateFormat formateadorFecha2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
				 String fechaCadena = formateadorFecha2.format(fechaActual);
				 System.out.println(fechaCadena);
				 
				 
			//) NEW: JAVA8+ 

				 String strFecha = "7/9/1988"; 
				 DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				 LocalDate fechita = LocalDate.parse(strFecha, dtFormatter );
				 System.out.println(fechita);
				 

					 System.out.println(dtFormatter.format(fechita)); 
	}  			
	
	

	private	Function<String,String> convertirMayusculas = x -> x.toUpperCase();
	private	Function<String,String> convertirMinusculas= x -> x.toLowerCase();

	public void Java8_HIGHT_ORDER_FUNCTIONS() throws Exception {  
		
				imprimir(convertirMinusculas,"CARLOS");
				imprimir(convertirMayusculas,"carlitos");
				
				
				saludar("hola ").apply("Calitos:"); 
	}
	
	public void imprimir (Function<String,String> f, String valor) {
		
		System.out.println(f.apply(valor));
													
	}
		   
	public Function<String,String> saludar(String strSaludo) {								
		return x -> strSaludo + x;															
		
	}
	
	public void RX_2_Java() throws Exception{  
			
			List<Integer> lista1_Ints =new ArrayList<>();
			List<Integer> lista2_Ints =new ArrayList<>();
				
				List<String> lista_strs =new ArrayList<>();
				lista_strs.add("Carlos"); lista_strs.add("Esteban"); lista_strs.add("Gil");
				
				System.out.println("----------------------RX Java Async - Ejemplo 2 Observables -----------------------------------------");
				
				Observable<String> obsStr = Observable.fromIterable(lista_strs);
				
				
				obsStr.subscribe(e->System.out.print(e+ " "));   
				System.out.println("\n ----------------------RX Java Async - Ejemplo 2 Observables -----------------------------------------");
						for (int i=0;i<10;i++) { lista1_Ints.add(i); lista2_Ints.add(i);}
				
						
						Observable<Integer> obsLista1Inst = Observable.fromIterable(lista1_Ints);
						Observable<Integer> obsLista2Inst = Observable.fromIterable(lista2_Ints);
				
						
						Observable.merge(obsLista1Inst,obsLista2Inst).subscribe(e->System.out.print(e+ " ")); System.out.println();
				
						Observable.merge(obsLista1Inst,obsLista2Inst).subscribe(e->{if (e==1) System.out.print(e+ " ");});
				
						System.out.println("\n ----------------------RX Java Async - Ejemplo 3 Observables -----------------------------------------");
						
						
						List<String> lListFrutas = new LinkedList<String>( Arrays.asList("pera", "sandÃ­a","manzana", "naranja") );  
						
						
						Observable<String> obsLlistFrutas =  Observable.fromIterable(lListFrutas);
						
						obsLlistFrutas.delay(1000, TimeUnit.MILLISECONDS).subscribe( e -> System.out.print(e +"-") );
						
						System.out.println("Ya realicÃ© el pedido ( el req , la pet..) .. Mi code sigue!!! !.. \n");
						
						for(int i=0;i<20;i++) System.out.print(i); 
																System.out.print("\n");				
						
						Thread.sleep(3000); 
						
						System.out.println("\n ----------------------RX Java Async - Ejemplo 4 TRANSFORMACION DATA OBS -----------------------------------------");
						
						
						List<String> lList_2_Frutas = new LinkedList<String>( Arrays.asList("pera", "sandia","manzana", "naranja") );  
						Observable<String> obsLlist_2_Frutas =  Observable.fromIterable(lList_2_Frutas);
						obsLlist_2_Frutas.map( e->" " + e + " picada").subscribe(System.out::print);
						

						Thread.sleep(3000); 
						
						
						System.out.println("\n ----------------------RX Java Async - Ejemplo 5 Combineta ZIP  -----------------------------------------");
						
						
						List<String> lList_3_Frutas= new LinkedList<String>( Arrays.asList("pera", "sandia","manzana", "naranja","otraMAS!") );  
						List<String> lList_4_Verduras= new LinkedList<String>( Arrays.asList("lechuga", "acelga","apio", "espinaca"));
						
												
						Observable<String> obsLlist3Frutas =  Observable.fromIterable(lList_3_Frutas);
						Observable<String> obsLlist4Verduras =  Observable.fromIterable(lList_4_Verduras);
						
						
						Observable.zip(obsLlist3Frutas,obsLlist4Verduras,(a,b) -> a + "+"+ b + " ").subscribe(System.out::print);
						
						Thread.sleep(3000); 
						
						
						System.out.println("\n ----------------------RX Java Async - Ejemplo 6 Combineta MERGE -----------------------------------------");
						
						Observable.merge(obsLlist3Frutas,obsLlist4Verduras).subscribe(System.out::print);
						
						
						Thread.sleep(3000); 
						
						
						System.out.println("\n ----------------------RX Java Async - Ejemplo 7 Disposable -----------------------------------------");
						
						
						Observable<String> obsCompFrutasYVerduras = Observable.merge(obsLlist3Frutas,obsLlist4Verduras);
						
						Disposable disposableObsFrutVerds =obsCompFrutasYVerduras.subscribe(elemFrutVerdPar -> System.out.print(elemFrutVerdPar));
						
						
				        disposableObsFrutVerds.dispose();
	}	
	
	public void Val_Var_Let_y_Auto_InferencedTypes() {   
		
	
}
	

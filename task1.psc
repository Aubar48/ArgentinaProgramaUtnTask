Algoritmo TaskUtn1
	
	definir nombre Como Caracter
	definir clave Como Entero
	
	definir ejercitacionUTN Como Entero
	
	definir stop1 Como Caracter
	definir stop Como Logico
	stop = Verdadero
	
	Definir ejercitacionUtnLogica Como Entero
	
	definir stop2 Como Caracter
	definir stopA Como Logico
	stopA = Falso
	
	Definir ejercitacionUtnCondicional Como Entero
	
	definir stop3 Como Caracter
	definir stopB Como Logico
	stopB = Falso
	
	escribir "Ingrese su nombre por favor en minuscula: ";leer nombre 
	Escribir "Ingrese su contraseña por favor solo numeros entenderos: "; leer clave
	
	Si (nombre == "nahuel") Y (clave == 1234) O (nombre == "matias") O (nombre == "rodrigo") O (nombre == "sofia") O (nombre == "mariela") Entonces 
		Repetir
			Escribir "UTN EJERCITACION: "
			Escribir "Opción 1: Logica "
			escribir "Opción 2: Condicionales "
			escribir "Opción 3: Salir"
			escribir "Buenos dias " + nombre + " que desea hacer hoy? ";leer ejercitacionUTN
			
			Limpiar Pantalla
			Segun ejercitacionUTN Hacer
				1:
					
					Repetir
						///Ejercicios de logica
						
						Escribir "Opción 1: Logica task 1"
						Escribir "Opción 2: Logica task 2"
						Escribir "Opción 3: Logica task 3"
						Escribir "Opción 4: Logica task 4"
						Escribir "Opción 5: Logica task 5"
						Escribir "Opción 6: Logica task 6"
						Escribir "Opción 7: Logica task 7"
						Escribir "Opción 8: Logica task 8"
						Escribir "Opción 9: Logica task 9"
						Escribir "Opción 10: Logica task 10"
						Escribir "Opción 11: Logica task 11"
						Escribir "Opción 12: Salir "
						escribir "Por favor " + nombre + " seleccione que task de logica desea hacer hoy? "	; Leer ejercitacionUtnLogica
						Limpiar Pantalla
						Segun ejercitacionUtnLogica Hacer
							1:
								///1.scriba un programa que lea dos números enteros y realice el cálculo de la suma, resta, multiplicación y división entre ambos valores. Los resultados deben mostrarse por pantalla.
								Escribir "Opción 1: Logica task 1 Suma, Resta, Multiplicacion, Division, ENTRE DOS VALORES! "
								definir suma, resta, multiplicacion, division, resto Como Real
								Definir num1 Como Real
								Definir num2 Como Real
								escribir "Escriba el primer valor";leer num1
								escribir "Escriba el segundo valor";leer num2
								
								escribir "La suma es: "  (num1 + num2);
								escribir "La resta es: "  (num1 - num2);
								escribir "La multiplicacion es: "  (num1 * num2);
								escribir "La division es: "  (num1 / num2);
								
								Escribir "--------------------------------------------------------------------------------------------"
							2:
								///2.Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por pantalla el área y perímetro del mismo
								///área = base * altura
								///perímetro = 2 * altura + 2 * base.
								Definir radio Como Real
								Escribir "Ingrese el radio: ";Leer radio
								Escribir "El area es: " (Pi * radio ^ 2) " El perimetro es: " (2 * PI * radio)
								
								Escribir "--------------------------------------------------------------------------------------------"
								
							3:
								///3.Escribir un programa que calcule el precio promedio de un producto. El precio promedio se debe calcular a partir del precio del mismo producto en tres establecimientos distintos.
								definir producto, establecimiento1, establecimiento2, establecimiento3 Como Caracter
								definir fruta1, fruta2, fruta3 como Real
								
								escribir "ingrese el nombre del establecimiento 1: "; leer establecimiento1
								escribir "ingrese el nombre del establecimiento 2: "; leer establecimiento2
								escribir "ingrese el nombre del establecimiento 3: "; leer establecimiento3
								escribir "ingrese el nombre del producto "; leer producto
								
								escribir "ingrese el valor del prducto " + producto + " del establecimiento uno: " + establecimiento1; leer fruta1
								escribir "ingrese el valor del prducto " + producto + " del establecimiento dos: " + establecimiento2; leer fruta2
								escribir "ingrese el valor del prducto " + producto + " del establecimiento tres: " + establecimiento3; leer fruta3
								
								definir frutaMedia Como Real
								frutaMedia = (fruta1 + fruta2 + fruta3)/3
								escribir "El valor medio del producto " + producto + " de los establecimiento 1" + establecimiento1 + " establecimiento 2: " + establecimiento2 + " establecimiento 3: " + establecimiento3 + " es: " frutaMedia;
								
								Escribir "--------------------------------------------------------------------------------------------"
							4:
								////4.Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas de tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables y mostrar el resultado final por pantalla.
								///Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del programa deberá mostrar: num1 = 3 y num2 = 9
								///Ayuda: Para intercambiar los valores de dos variables se debe utilizar una variable
								///auxiliar.
								
								Definir num1, num2, aux como numerica
								Escribir "Escriba el primer valor numerico y el segundo valor numerico: "; Leer num1, num2
								aux = num1
								num1 = num2
								num2 = aux
								Escribir " El primer numero es: " num1 " y " " El segundo numero es: " num2
								
								Escribir "--------------------------------------------------------------------------------------------"
							5:
								///5.A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, escriba un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo:
								///1 día = 24 horas = 1440 minutos = 86400 segundos
								
								Definir dias, horas, min, seg como numerico  
								Escribir "Ingrese la cantidad de dias: "; leer dias
								horas = dias * 24
								min = dias * 1440
								seg = dias * 86400
								Escribir "La cantidad de dias ingresados es: " dias " En horas es: " horas " En minutos es: " min " En segundos es: " seg
								
							6:
								///6.Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de edad se debe mostrar un mensaje por pantalla indicándolo.
								Definir edad Como Entero
								Escribir "Escriba la edad del usuario "; Leer edad
								Si edad >= 18 Entonces
									Escribir "El usuario es mayor de edad, su edad es: " edad
								SiNo
									Escribir "El usuario no es mayor de edad, su edad es: " edad
								FinSi
								Escribir "--------------------------------------------------------------------------------------------"
							7:
								///7.Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe mostrar un mensaje por pantalla indicándolo.
								Definir sueldo1, sueldo2 Como Entero
								Escribir "Ingrese el sueldo del usuario e ingrese el sueldo minimo vital movil: "; Leer sueldo1, sueldo2
								Si sueldo1 > sueldo2 Entonces
									Escribir "usted tiene un sueldo por encima del minimo vital movil, su sueldo es de: " sueldo1 " pesos "
								SiNo
									Escribir "usted no tiene un sueldo por encima del minimo vital movil "
								FinSi
								Escribir "--------------------------------------------------------------------------------------------"
							8:
								///8.Realizar un programa que pida un número al usuario. Si el número es mayor que 100 se deberá de imprimir en pantalla "Es Mayor", y en caso contrario se deberá imprimir "Es Menor".
								Definir num Como Entero
								Escribir " Escribir un n°: "; Leer num
								Si num > 100 Entonces
									Escribir "El n° ingresado es: " num " y es mayor a 100"
								SiNo
									Escribir "El n° ingresado es: " num " y es menor a 100"
								FinSi
								Escribir "--------------------------------------------------------------------------------------------"
							9:
								
								///9.Realiza un programa que sólo permita introducir los caracteres ?S? y ?N?. Si el usuario ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".
								Definir palabra Como caracter
								Escribir "Solo se puede escribir S o N: "; Leer palabra
								Si palabra = "S" o palabra = "s" o palabra = "n" o palabra = "N" Entonces
									Escribir "Correcto"
								SiNo
									Escribir "Incorrecto"
								FinSi
								Escribir "--------------------------------------------------------------------------------------------"
							10:
								///10.Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000. Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra, y el monto total que tiene que pagar por el total de la compra.
								Definir llantas, totalLlantas Como Entero
								Escribir "Ingrese la cantidad de llantas que desea comprar el cliente: "; leer llantas
								si llantas < 5 entonces
									totalLlantas = 3000 * llantas
									escribir "El precio es de 3000 por c/llanta" ", el valor final es de: " totalLlantas
								sino 
									si  llantas > 5 y llantas < 10 Entonces
										totalLlantas = 2500 * llantas
										escribir "El precio es de 2500 por c/llanta" ", el valor final es de: " totalLlantas
									SiNo
										si llantas > 10 Entonces
											totalLlantas = 2000 * llantas
											Escribir "El precio es de 2000 pr c/llanta" ", el valor final es de: " totalLlantas
										FinSi
									FinSi
								FinSi	
								Escribir "--------------------------------------------------------------------------------------------"
							11:
								///11.?	Construir un programa que simule un menú de opciones para realizar las cuatro operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores numéricos enteros. El usuario, además, debe especificar la operación con el primer carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M? o ?m? para la multiplicación y ?D? o ?d? para la división.
								Definir opc, num1, num2, resultado Como numerico
								Repetir
									Limpiar Pantalla
									Escribir  "Que operacion aritmetica necesita hoy?: "
									Escribir "1- Sumar "
									Escribir "2- Restar "
									Escribir "3- Multiplicar "
									Escribir "4- Divir "
									Escribir "5- Salir "
									Leer opc
								hasta que (opc >=1 y opc <=5)
								segun opc hacer
									1: escribir "Ingrese el primer y segundo valor numerico: ";Leer num1, num2
										resultado = num1 + num2
										Escribir "El resultado de la suma es: " resultado
										
									2:escribir "Ingrese el primer y segundo valor numerico: ";Leer num1, num2
										resultado = num1 - num2
										Escribir "El resultado de la resta es: " resultado
										
									3: escribir "Ingrese el primer y segundo valor numerico: ";Leer num1, num2
										resultado = num1 * num2
										Escribir "El resultado de la multiplicacion es: " resultado
										
									4: escribir "Ingrese el primer y segundo valor numerico: ";Leer num1, num2
										resultado = num1 / num2
										Escribir "El resultado de la division es: " resultado
										
									5: Escribir "Usded acaba de salir "
								FinSegun
								Escribir "--------------------------------------------------------------------------------------------"
							12:
								///salir 
								Escribir "Desea salir?:  S/N ";leer stop2
								Si (stop2 = "s") O (stop2 = "S") Entonces
									stopA = Verdadero
								SiNo
									stopA = Falso
								Fin Si
							De Otro Modo:
								escribir	"Opcion erronea, vuelva a ingresar los valores numericos y acuerdese que el index va del (1 >= 10) ";
						Fin Segun
					Mientras Que (stopA = Falso)
					Limpiar Pantalla
					
				2:
					Limpiar Pantalla
					Repetir
						///Condicionales
						Escribir "Opción 1: Condicionales task 1 Suma, Resta, Multiplicacion, Division, ENTRE DOS VALORES! "
						Escribir "Opción 2: Condicionales task 2"
						Escribir "Opción 3: Condicionales task 3"
						Escribir "Opción 4: Condicionales task 4"
						Escribir "Opción 5: Condicionales task 5"
						Escribir "Opción 6: Condicionales task 7"
						Escribir "Opción 7: Condicionales task 8"
						Escribir "Opción 8: Condicionales task 9"
						Escribir "Opción 9: Condicionales task 10"
						Escribir "Opción 10: LCondicionales task 11"
						Escribir "Opción 11: Condicionales task 12"
						Escribir "Opción 12: Condicionales task 13"
						Escribir "Opción 13: Condicionales task 14"
						Escribir "Opción 14: Condicionales task 15"
						Escribir "Opción 15: Condicionales task16"
						Escribir "Opción 16: Condicionales task 17"
						Escribir "Opción 17: LCondicionales task 18"
						Escribir "Opción 18: Condicionales task 19"
						Escribir "Opción 19: Salir"
						
						escribir "Por favor " + nombre + " seleccione que task de condicionales desea hacer hoy? "	; Leer ejercitacionUtnCondicional
						
						Segun ejercitacionUtnCondicional Hacer
							1:
								///1.Escribir un programa que lea un número y determine si tiene tres dígitos.
								Definir palabra como caracter
								Escribir "Por favor ingrese una palabra o frase para determinar si tiene tres digitos: "; Leer palabra
								Si Longitud(palabra) = 3 entonces
									Escribir "Es correcto tiene 3 digitos "  
								SiNo 
									Escribir "Es incorrecto no tiene 3 digitos "
								FinSi
								Escribir "--------------------------------------------------------------------------------------------"
							2:
								///2.Escribir un programa que lea un número y determine su signo.
								definir num como numerica
								escribir "Ingrese un valor numerico";leer num
								Si num  > 0 entonces
									Escribir "el numero ingresado es de singo positivo: + "  num
								SiNo 
									Escribir "el numero ingresado es de singo negativo: - "  num
								FinSi
								Escribir "--------------------------------------------------------------------------------------------"
							3:
								///3.Escribir un programa que lea un número y determine la cantidad de dígitos que tiene.
								Definir num,res Como Real
								escribir "Ingrese un numero decimal: ";leer num
								res = trunc(num)
								escribir "El numero entero es: " res
								Escribir "--------------------------------------------------------------------------------------------"
							4:
								///4.Escriba un programa que calcule el mayor de cuatro números.
								definir num, num2, num3, num4 como numerica
								escribir "Ingrese el primer valor numerico ";leer num
								escribir "Ingrese el segundo valor numerico ";leer num2
								escribir "Ingrese el tercer valor numerico ";leer num3
								escribir "Ingrese el cuarto valor numerico ";leer num4
								
								Si num  > num2  Y num > num3 Y num >num4 entonces
									Escribir "El numero " num " es mayor que los demas numeros "
								SiNo 
									Si num2  > num  Y num2 > num3 Y num2 > num4 entonces
										Escribir "El numero " num2 " es mayor que los demas numeros "
									SiNo 
										Si num3  > num  Y num3 > num2 Y num3 > num4 entonces
											Escribir "El numero " num3 " es mayor que los demas numeros "
											
										SiNo
											Escribir "El numero " num4 " es mayor que los demas numeros "
										FinSi
									FinSi								
								FinSi
								Escribir "--------------------------------------------------------------------------------------------"
							5:
								///5.Escriba un programa que pida dos números y muestre cuál es el menor y cuál el mayor o que escriba si son iguales.
								definir num, num2 como numerica
								escribir "Ingrese un valor numerico";leer num
								escribir "Ingrese otro valor numerico";leer num2
								Si num  == num2  entonces
									Escribir "El numero " num " ingresado es igual al numero "  num2 
								SiNo 
									Si num > num2 Entonces
										Escribir "El numero " num " ingresado es mayor al numero "  num2 
									SiNo
										Escribir "El numero " num " ingresado es menor al numero "  num2 
										
										
									FinSi
								FinSi
								Escribir "--------------------------------------------------------------------------------------------"
							6:
								///6.	Escribir un programa que indique si un número es divisible por 7.
								
								Definir num1, num2 como entero
								Escribir "Ingrese un numero entero: ";leer num1
								
								escribir "Ingrese el otro valor numerico entero para saber si el primer numero es divisible por el segundo"; leer num2
								si num1 MOD num2 = 0  entonces 
									Escribir "El numero " num1 " es divisible de " num2
									Para i<-1 Hasta num1  Hacer
										Si num MOD num2 = 0 Entonces
											escribir i
										SiNo
											Escribir "El numero " num2 " No es divisible de " num1
											
										FinSi
									FinPara
								FinSi
								Escribir "--------------------------------------------------------------------------------------------"
							7:
								///7.	Escribir un programa que indique si un número es múltiplo de 11. (investigar funcionamiento de función MOD o "%" pseint)
								Definir num1, num2 como entero
								Escribir "Ingrese un numero entero: ";leer num1
								
								escribir "Ingrese el otro valor numerico entero para saber si el primer numero es multiplo del segundo"; leer num2
								si num1 MOD num2 = 0  entonces 
									Escribir "El numero " num1 " es multiplo de " num2
									Para i<-1 Hasta num1  Hacer
										Si num MOD num2 = 0 Entonces
											escribir i
										SiNo
											Escribir "El numero " num1 " No es multiplo de " num2
											
										FinSi
									FinPara
								FinSi
								Escribir "--------------------------------------------------------------------------------------------"
								
							8:
								///8.	Escribir un programa que indique si un número o dos números es par o impar.
								Definir num1, num2 como entero
								Escribir "Ingrese dos numeros enteros: ";leer num1, num2
								si num1 MOD 2 = 0  Y num2 MOD 2 = 0 entonces 
									Escribir "Ambos numeros son pares"
								SiNo
									si num1 MOD 2 <> 0  Y num2 MOD 2 <> 0 entonces 
										Escribir "Ambos numeros no son pares"
									sino 
										Escribir "Los numeros no son pares, o uno de ellos no es par"
									FinSi
								FinSi
								Escribir "--------------------------------------------------------------------------------------------"
							9:
								///9.	Escribir un programa que indique si dos valores tienen el mismo signo.
								Definir num1, num2 como entero
								Escribir "Ingrese dos numeros enteros: ";leer num1, num2
								si num1 >  0  Y num2 > 0 entonces 
									Escribir "Ambos numeros son de signo positivo"
								SiNo
									si num1 < 0  Y num2 < 0 entonces 
										Escribir "Ambos numeros son de signo negativo"
									SiNo
										Escribir "Uno de los dos numeros debe ser de signo negativo o positivo contrario al otro."			
									FinSi
								FinSi
								Escribir "--------------------------------------------------------------------------------------------"
							10:
								///10.	Escribir un programa que diga si la suma de dos números es positiva, negativa o nula.
								Escribir "--------------------------------------------------------------------------------------------"
								
							11:
								///11.	Escribir un programa que indique si un número es divisible a la vez por 2 y 3. (MOD o "%")
								Definir num1, num2, num3 como entero
								Escribir "Ingrese un numero entero: ";leer num1
								Escribir "Ingrese otros dos numeros enteros para saber si son divisibles: ";leer num1, num2
								
								si (num1 MOD num2 = 0)  Y (num1 MOD num3 = 0) entonces 
									Escribir "Ambos numeros son divisibles por el primer numero"
									Escribir "Numero 1 " num1 " divisibles por numero 2 " num2
									Para i<-1 Hasta num1  Hacer
										Si num1 MOD num2 = 0 Entonces
											escribir i
											
											Escribir "Numero 1 " num1 " divisibles por numero 3 " num3
											
											Para i<-1 Hasta num1  Hacer
												Si num1 MOD num3 = 0 Entonces
													escribir i
												SiNo
													Escribir "Uno de los dos numeros no esta siendo divisble."			
												FinSi
												
											FinPara
										FinSi
									FinPara
								FinSi
								
								Escribir "--------------------------------------------------------------------------------------------"
								
							12:
								///12.	Escribir un programa que indique si una persona tiene sobrepeso calculando su índice de masa corporal (IMC) pidiendo su peso y altura (en cm). (Investigar formula de IMC)
								/// Info: Para calcular el imc de una persona únicamente se debe dividir el peso de ésta -expresado en kilogramos-, 
								/// por su altura elevada al cuadrado -expresada en metros-. 
								/// Por ejemplo una persona con una altura de 1,80 metros y un peso de 80 kg, tendrá un imc de 80 / 1,80^2 = 24,69.
								/// Nota: 
								///		- Peso Normal entre 18.50 - 24.99.
								///		- Sobrepeso entre 25.00 - 29.99.
								///		- Obeso: Tipo I entre 30.00 - 34.99.
								
								Definir peso, altura, imc Como Real;
								
								Escribir "Calcular el IMC de una persona:";
								Escribir "Por favor ingrese un peso de la persona [expresado en kilogramos]: (Ej: 80)";
								Leer peso;
								
								Escribir "Por favor ingrese una altura de la persona [expresada en metros]: (Ej: 1.80)";
								Leer altura;
								
								imc = peso / (altura^2); // hacemos el calculo (imc = al peso dividido con la altura elevado a la 2) y a ese valor lo guardamos en una variable.(formula linea 7).
								
								Si (imc >= 25.00) Y (imc <= 29.99) Entonces // a ese resultado, lo evaluamos si esta entre los valores de sobrepeso(linea 10), si es verdadero, Entonces ->
									Escribir "La persona tiene sobrepeso, con un IMC de ", imc;
								SiNo
									Si (imc < 25.00) Entonces // si es menor que 25.00 Entonces ->
										Escribir "La persona tiene un IMC menor.";
									SiNo
										Si (imc > 29.99) Entonces // si es mayor que 29.99 Entonces ->
											Escribir "La persona tiene un IMC mayor.";
										FinSi
									FinSi		
								FinSi	
								Escribir "--------------------------------------------------------------------------------------------"
							13:
								////13.Escribir un programa que indique el cambio que se le debe entregar a un cliente. Debe ingresar valor de producto a comprar y con cuanto paga el cliente.
								
								Definir valorProducto, pago, vuelto como Real;
								
								Escribir "Ingrese el valor del Producto (Por Ej. 145.70): $";
								Leer valorProducto;
								
								Escribir "Ingrese con cuanto paga el cliente (Por Ej. 500): $";
								Leer pago;
								
								vuelto = pago - valorProducto; // en la variable vuelto, guardamos el resultado de calcular, con cuanta paga el cliente menos(-) el valor del producto. 
								
								Escribir "El cambio que se le debe entregar al cliente es: $", vuelto;
								Escribir "--------------------------------------------------------------------------------------------"	
								
							14:
								///14.	Escribir un programa que pida un ángulo e indique si es agudo, recto u obtuso.
								/// Verificar si el ángulo está en el rango de 0 a 180 grados. Es el rango de los grados que vamos a evaluar.
								/// Si el ángulo está en el rango válido, determinar si es agudo, recto u obtuso. utilizando las siguientes definiciones:
								/// - Un ángulo es agudo si su medida es menor a 90 grados.
								/// - Un ángulo es recto si su medida es igual a 90 grados.
								/// - Un ángulo es obtuso si su medida es mayor a 90 grados y menor a 180 grados.
								
								Definir angulo Como Real;
								
								Escribir "Ingrese un ángulo (en grados): ";
								Leer angulo;
								
								Si (angulo >= 0) Y (angulo <= 180) Entonces // validamos si el angulo ingresado, está entre los valores permitidos, si se cumplen las 2 condiciones como verdadero, Entonces -> 
									
									Si angulo < 90 Entonces // si es menor que 90 (Linea 5) Entonces ->
										Escribir "El ángulo es agudo.";
									SiNo
										Si angulo = 90 Entonces // si es igual a 90 (Linea 6) Entonces ->
											Escribir "El ángulo es recto.";
										SiNo  // sino es menor que 90, ni tampoco es igual a 90, por descarte sabemos que tiene que ser mayor que 90, ya que si el programa llega a esta linea, es porque supero la linea 16. Entonces ->
											Escribir "El ángulo es obtuso.";
										FinSi
									FinSi
								SiNo // si no se cumplen las condiciones (linea 16) ingresa ->
									Escribir "El ángulo ingresado no es válido, para está clasificación.";
								FinSi
								Escribir "--------------------------------------------------------------------------------------------"
							15:
								
								///15.Escribir un programa que almacene una contraseña (previamente cargada), pregunte al usuario por la contraseña y muestre si la contraseña introducida es correcta o no.
								Definir usuario, contrasenia, contraseniaGuardada Como Cadena;
								Definir login Como Logico; // usamos una variable logica para decorar el programa (se prodria hacer sin problemas sin esta variable).
								
								contraseniaGuardada = "UTN_Java"; // almacenamos una contraseña en nuestro programa. en la variable contraseniaGuardada.
								login = Falso; // inicializamos el login en falso, hasta que las credenciales estén correctas.
								
								Escribir "Ingrese su usuario: ";
								Leer usuario; // pedimos un usuario solo para el saludo (linea 25).
								
								Escribir "Ingrese su contraseña: ";
								Leer contrasenia; // pedimos al usuario su contraseña.
								
								Si (contrasenia = contraseniaGuardada) Entonces // comparamos la contraseña ingresada por el usuario con la contraseniaGuardada. Si es verdadero, Entonces ->
									login = Verdadero; // cambiamos de valor la variable de tipo logico(login) a Verdadero.
								SiNo  // sino sigue siendo su valor Falso.
									login = Falso;
								FinSi
								
								Si (login = Verdadero) Entonces // si login es Verdadero se valido la identidad. Linea 19.
									Escribir "¡Bienvenido/a, ", usuario, "! contraseña ingresada con éxito.";
								SiNo // significa que su valor de login es Falso, no se permite el acceso.
									Escribir "Contraseña Incorrecta, Intente nuevamente.";
								FinSi	
								Escribir "--------------------------------------------------------------------------------------------"
							16:
								
								///16.Para pagar un determinado impuesto se debe ser mayor de 18 años y tener unos ingresos iguales o superiores a $80 000 mensuales. Escribir un programa que pregunte al usuario su edad y sus ingresos mensuales y muestre por pantalla si el usuario tiene que tributar o no.
								Definir edad Como Entero;
								Definir ingresosMensuales Como Real;
								
								Escribir "*** [Programa para calcular si paga Impuesto] ***";
								Escribir "Ingrese su edad: ";
								Leer edad;
								
								Escribir "Ingrese sus ingresos mensuales (sin punto, ni coma, Ej. 80000): $";
								Leer ingresosMensuales;
								
								Si (edad > 18) Y (ingresosMensuales >= 80000) Entonces // si (edad es MAYOR que 18) Y (ingresos es MAYOR IGUAL que 80000). (V y V), Entonces ->
									Escribir "El usuario de ", edad, " años y de ingresos mensuales de $", ingresosMensuales, " SI tiene que tributar";
								SiNo  // si alguna condicion da Falso, ingresa aqui ->
									Escribir "El usuario de ", edad, " años y de ingresos mensuales de $", ingresosMensuales, " NO tiene que tributar";
								FinSi	
								Escribir "--------------------------------------------------------------------------------------------"
							17:
								
								///17.El impuesto del programa anterior es el 8% de los ingresos mensuales. Modificarlo de forma tal que cuando se deba tributar muestre el monto que se debe pagar.
								Definir edad Como Entero;
								Definir ingresosMensuales, pagar Como Real;
								
								Escribir "*** [Programa para calcular si paga Impuesto + Monto a pagar] ***";
								Escribir "Ingrese su edad: ";
								Leer edad;
								
								Escribir "Ingrese sus ingresos mensuales (sin punto, ni coma, Ej. 80000): $";
								Leer ingresosMensuales;
								
								pagar = (ingresosMensuales * 0.08); //se calcula el 8%. a ese resultado lo guardamos en la variable pagar.
								
								Si (edad > 18) Y (ingresosMensuales >= 80000) Entonces // si (edad es MAYOR que 18) Y (ingresos es MAYOR IGUAL que 80000). (V y V), Entonces ->
									Escribir "El usuario de ", edad, " años y de ingresos mensuales de $", ingresosMensuales, " SI tiene que tributar";
									Escribir "Le corresponde pagar: $", pagar;
								SiNo  // si alguna condicion da Falso, ingresa aqui ->
									Escribir "El usuario de ", edad, " años y de ingresos mensuales de $", ingresosMensuales, " NO tiene que tributar";
								FinSi	
								Escribir "--------------------------------------------------------------------------------------------"
							18:
								
								///18.Los tramos impositivos para la declaración de la renta en un determinado país son los siguientes. Escribir un programa que pregunte al usuario su ingreso (renta) anual y muestre por pantalla el monto que le corresponde pagar
								///Renta:      
								///Menos de 10000 - 5%
								///Entre 10000 y 20000 - 15%
								///Entre 20000 y 35000 - 20%
								/// ntre 35000 y 60000 - 30%
								///Más de 60000 - 45%
								
								
								Definir ingresoAnual, pagar Como Real;
								Escribir "Indique su Ingreso Anual (sin punto, ni coma, Ej. 10000): $";
								Leer ingresoAnual;
								
								///usamos Si-No anidados para ir validando todas las opciones posibles, de acuerdo al valor de la variable ingresoAnual, se calcula el monto a pagar.
								Si	(ingresoAnual < 10000) Entonces		
									pagar = ingresoAnual * 0.05;
								SiNo
									Si (ingresoAnual >= 10000 Y ingresoAnual < 20000) Entonces
										pagar = ingresoAnual * 0.15;
									SiNo
										Si (ingresoAnual >= 20000 Y ingresoAnual < 35000) Entonces
											pagar = ingresoAnual * 0.20;
										SiNo
											Si (ingresoAnual >= 350000 Y ingresoAnual < 60000) Entonces
												pagar = ingresoAnual * 0.30;
											SiNo
												Si (ingresoAnual >= 60000) Entonces
													pagar = ingresoAnual * 0.45;
												FinSi						
											FinSi
										FinSi
									FinSi
								FinSi	
								
								Escribir "Con un Ingreso Anual de: $", ingresoAnual, " le corresponde pagar: $", pagar;
								Escribir "--------------------------------------------------------------------------------------------"
							19:
								///salir 
								Escribir "Desea salir?:  S/N ";leer stop3
								Si (stop3 = "s") O (stop3 = "S") Entonces
									stopB = VERDADERO
								SiNo
									stopB = Falso
								Fin Si
							De Otro Modo:
								escribir	"Opcion erronea, vuelva a ingresar los valores numericos y acuerdese que el index va del (1 >= 10) ";
						Fin Segun
					Mientras Que (stopB = Falso)
					Limpiar Pantalla
					
					
				3:
					///salir 
					Escribir "Desea salir?:  S/N" ;leer stop1
					Si (stop1 = "s") O (stop1 = "S") Entonces
						stop = Falso
					SiNo
						stop = Verdadero
					FinSi
					
				De Otro Modo:
					escribir	"Opcion erronea, vuelva a ingresar los valores numericos y acuerdese que el index va del (1 >= 3) ";
			Fin Segun
			
		Mientras Que (stop = Verdadero)
		Limpiar Pantalla
		
		///fuera del bucle, por que no ingresaste al condicional.
	SiNo
		Escribir "Los valores ingresados son incorrectos, no tiene derechos para ingresar a esta App"
	Fin Si
	
	Limpiar Pantalla
	
FinAlgoritmo

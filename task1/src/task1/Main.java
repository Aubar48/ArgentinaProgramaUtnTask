package task1;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        Metodos A0 = new Metodos();
        String frase = "";
        String frase2 = "";
        String frase3;
        int elegir;
        int task;
        out.println("Desea ingresar ala app? S/N ");
        A0.setNuma(input.nextLine().toLowerCase());
        if (A0.getNuma().toLowerCase().equals("s")) {
            out.println("Ingrese nombre y clave por favor? ");
            String nombre = input.nextLine().toLowerCase();
            Integer clave = input.nextInt();
            if (nombre.equals("nahuel") && (clave.equals(1234))) {
                do {
                    A0.imprimirTexto0();
                    out.println("Ingrese del index cual tarea desea realizar hoy? ");
                    Integer option = input.nextInt();
                    switch (option) {
                        case 1:
                            do {
                                A0.imprimirTexto1();
                                out.println("Ingrese del index cual tarea desea realizar hoy? ");
                                Integer option1A = input.nextInt();
                                switch (option1A) {
                                    case 1:
                                        out.printf("1. Escriba un programa que lea dos números enteros y " +
                                                "realice el cálculo de la suma, resta, multiplicación y división entre ambos valores.\n" +
                                                "Los resultados deben mostrarse por pantalla.");
                                        out.println("Ingrese el primer valor: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese el segundo valor: ");
                                        A0.setNum2(input.nextInt());
                                        A0.Calculadora();
                                        break;
                                    case 2:
                                        out.printf("2. Solicitar al usuario que ingrese la base y altura de un rectángulo, " +
                                                "y calcular y mostrar por pantalla el área y perímetro del mismo\n" +
                                                "//área = base * altura\n" +
                                                "//perímetro = 2 * altura + 2 * base.");
                                        out.println("Ingrese el valor de la base: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese el valor de la altura: ");
                                        A0.setNum2(input.nextInt());
                                        A0.calcularAreaPerimetro();
                                        break;
                                    case 3:
                                        out.printf("3. Escribir un programa que calcule el precio promedio de un producto. " +
                                                "El precio promedio se debe calcular a partir del precio del mismo producto en tres establecimientos distintos.");
                                        out.println("ingrese el nombre del producto");
                                        A0.setNuma(input.nextLine().toLowerCase());
                                        out.println("ingrese el valor del producto " + A0.getNuma() + " del establecimiento uno");
                                        A0.setNum1(input.nextInt());
                                        out.println("ingrese el valor del producto " + A0.getNuma() + " del establecimiento dos");
                                        A0.setNum2(input.nextInt());
                                        out.println("ingrese el valor del producto " + A0.getNuma() + " del establecimiento tres");
                                        A0.setNum3(input.nextInt());
                                        A0.promedioProducto();
                                        break;
                                    case 4:
                                        out.println("4.Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas de tipo entero. Posteriormente,"
                                                + " el programa debe intercambiar los valores de ambas variables y mostrar el resultado final por pantalla."
                                                + "  Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del programa deberá mostrar: num1 = 3 y num2 = 9"
                                                + "  Ayuda: Para intercambiar los valores de dos variables se debe utilizar una variable auxiliar. ");
                                        out.println("Ingrese el primer valor: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese el segundo valor: ");
                                        A0.setNum2(input.nextInt());
                                        A0.cambiarNumeroDeVariable();
                                        break;
                                    case 5:
                                        out.println("5. partir de una conocida cantidad de días que el usuario ingresa a través del teclado, " +
                                                "escriba un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo:\n" +
                                                "1 día = 24 horas = 1440 minutos = 86400");
                                        out.println("Ingrese la cantidad de dias: ");
                                        A0.setNum1(input.nextInt());
                                        A0.convertidoDeTiempo();
                                        break;
                                    case 6:
                                        out.println("6.Escriba un programa en donde se pida la edad del usuario. " +
                                                "Si el usuario es mayor de edad se debe mostrar un mensaje por pantalla indicándolo.");
                                        out.println("Escriba la edad del usuario: ");
                                        A0.setNum1(input.nextInt());
                                        A0.mayorEdad();
                                        break;
                                    case 7:
                                        out.println("7. Un hombre desea saber si su sueldo es mayor al sueldo mínimo, " +
                                                "el programa le pedirá al usuario su sueldo actual y el sueldo mínimo. " +
                                                "Si el sueldo es mayor al mínimo se debe mostrar un mensaje por pantalla indicándolo.\n");
                                        out.println("Ingrese el sueldo del usuario e ingrese luego el sueldo minimo vital movil: ");
                                        A0.setNum1(input.nextInt());
                                        A0.setNum2(input.nextInt());
                                        A0.sueldoMinimo();
                                        break;
                                    case 8:
                                        out.println("8. Realizar un programa que pida un número al usuario." +
                                                " Si el número es mayor que 100 se deberá de imprimir en pantalla \"Es Mayor\", " +
                                                "y en caso contrario se deberá imprimir \"Es Menor\".");
                                        out.println("Escriba la edad del usuario: ");
                                        A0.setNum1(input.nextInt());
                                        A0.numeroMayorA100();
                                        break;
                                    case 9:
                                        out.println("9. Realiza un programa que sólo permita introducir los caracteres ?S? y ?N?. " +
                                                "Si el usuario ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que diga \"CORRECTO\", " +
                                                "en caso contrario, se deberá imprimir \"INCORRECTO\".");
                                        out.println("ingrese solo con s/n");
                                        A0.setNuma(input.nextLine().toLowerCase());
                                        A0.siONo();
                                        break;
                                    case 10:
                                        out.println("10. Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran entre 5 y 10 el precio es de $2500, " +
                                                "y si se compran más de 10 el precio es $2000. Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra, " +
                                                "y el monto total que tiene que pagar por el total de la compra.\n");
                                        out.println("Ingrese el numero de llantas: ");
                                        A0.setNum1(input.nextInt());
                                        A0.llantasAndTotal();
                                        break;
                                    case 11:
                                        do {
                                            out.println("Task 1 - Switch ");
                                            out.println("1 " + " Suma de num1 + num2 ");
                                            out.println("2 " + " Resta de num1 - num2  ");
                                            out.println("3 " + " Multiplicación de num1 * num2 ");
                                            out.println("4 " + " Division de num1 / num2 ");
                                            out.println("5 " + " Incremento(num1 > num2) con bucle while ");
                                            out.println("6 " + " Decremento(num2 < num1) con bucle for ");
                                            out.println("7 " + " Salir ");
                                            out.println("Ingrese del index cual tarea desea realizar hoy? ");
                                            Integer option1B = input.nextInt();
                                            switch (option1B) {
                                                case 1:
                                                    out.println("1 " + " Suma de num1 + num2 ");
                                                    out.println("Ingrese el primer valor: ");
                                                    A0.setNum1(input.nextInt());
                                                    out.println("Ingrese el segundo valor: ");
                                                    A0.setNum2(input.nextInt());
                                                    out.println("La suma del primer valor ingresado y el segundo es es: " + A0.sumar());
                                                    break;
                                                case 2:
                                                    out.println("2 " + " Resta de num1 - num2  ");
                                                    out.println("Ingrese el primer valor: ");
                                                    A0.setNum1(input.nextInt());
                                                    out.println("Ingrese el segundo valor: ");
                                                    A0.setNum2(input.nextInt());
                                                    out.println("La resta del primer valor ingresado y el segundo es: " + A0.restar());
                                                    break;
                                                case 3:
                                                    out.println("3 " + " Multiplicación de num1 * num2 ");
                                                    out.println("Ingrese el primer valor: ");
                                                    A0.setNum1(input.nextInt());
                                                    out.println("Ingrese el segundo valor: ");
                                                    A0.setNum2(input.nextInt());
                                                    out.println("La multiplicación del primer valor ingresado por el segundo es:" + A0.multiplicar());
                                                    break;
                                                case 4:
                                                    out.println("4 " + " Division de num1 / num2 ");
                                                    out.println("Ingrese el primer valor: ");
                                                    A0.setNum1(input.nextInt());
                                                    out.println("Ingrese el segundo valor: ");
                                                    A0.setNum2(input.nextInt());
                                                    out.println("La division de num1 / num2 es:" + A0.dividir());
                                                    break;
                                                case 5:
                                                    out.println("5 " + " Incremento (num1 > num2) con bucle while ");
                                                    out.println("Ingrese el primer valor: ");
                                                    A0.setNum1(input.nextInt());
                                                    out.println("Ingrese el segundo valor: ");
                                                    A0.setNum2(input.nextInt());
                                                    err.println(A0.imp());
                                                    break;
                                                case 6:
                                                    out.println("6 " + " Decremento(num2 < num1) con bucle for ");
                                                    out.println("Ingrese el primer valor: ");
                                                    A0.setNum1(input.nextInt());
                                                    out.println("Ingrese el segundo valor: ");
                                                    A0.setNum2(input.nextInt());
                                                    err.println(A0.imp2());
                                                    break;
                                                case 7:
                                                    out.println("Desea salir de la app? S/N ");
                                                    input.nextLine(); // agregar esta línea para consumir el carácter de nueva línea anterior
                                                    A0.setNumd(input.nextLine().toLowerCase());
                                                    break;
                                            }
                                        } while (!A0.getNumd().equals("s"));
                                        out.println("Volviendo al menu anterior");
                                        break;
                                    case 12:
                                        out.println("Desea salir de la app? S/N ");
                                        input.nextLine(); // agregar esta línea para consumir el carácter de nueva línea anterior
                                        A0.setNumc(input.nextLine().toLowerCase());
                                        break;
                                }
                            } while (!A0.getNumc().equals("s"));
                            break;
                        case 2:
                            do {
                                A0.imprimirTexto2();
                                out.println("Ingrese del index cual tarea desea realizar hoy? ");
                                Integer option1C = input.nextInt();
                                switch (option1C) {
                                    case 1:
                                        out.println("1. Escribir un programa que lea un número y determine si tiene tres dígitos.");
                                        out.println("Ingrese un valor para determinar si este tiene 3 digitos: ");
                                        A0.setNum1(input.nextInt());
                                        A0.numeroEnDigitos();
                                        break;
                                    case 2:
                                        out.println("2. Escribir un programa que lea un número y determine su signo.");
                                        out.println("Ingrese un valor para determinar su signo: ");
                                        A0.setNum1(input.nextInt());
                                        A0.numeroSigno();
                                        break;
                                    case 3:
                                        out.println("3. Escribir un programa que lea un número y determine la cantidad de dígitos que tiene.");
                                        out.println("Ingrese un valor para determinar sus digitos: ");
                                        A0.setNum1(input.nextInt());
                                        A0.numeroDigitosTotal();
                                        break;
                                    case 4:
                                        out.println("4. Escriba un programa que calcule el mayor de cuatro números.");
                                        out.println("Ingrese el primer valor para determinar cual es mayor: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese el segundo valor para determinar cual es mayor: ");
                                        A0.setNum2(input.nextInt());
                                        out.println("Ingrese el tercer valor para determinar cual es mayor: ");
                                        A0.setNum3(input.nextInt());
                                        out.println("Ingrese el cuarto valor para determinar cual es mayor: ");
                                        A0.setNum4(input.nextInt());
                                        A0.numeroMayoraOtros();
                                        break;
                                    case 5:
                                        out.println("5. Escriba un programa que pida dos números y muestre cuál es el menor y cuál el mayor o que escriba si son iguales.");
                                        out.println("Ingrese el primer valor para determinar cual es mayor: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese el segundo valor para determinar cual es mayor: ");
                                        A0.setNum2(input.nextInt());
                                        A0.numeroMayorMenorIgual();
                                        break;
                                    case 6:
                                        out.println("6. Escribir un programa que indique si un número es divisible por 7.");
                                        out.println("Ingrese un valor para determinar si es divisible por 7: ");
                                        A0.setNum1(input.nextInt());
                                        A0.numeroDivisiblePor7();
                                        break;
                                    case 7:
                                        out.println("7. Escribir un programa que indique si un número es múltiplo de otro.)");
                                        out.println("Ingrese el primer valor: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese el segundo valor: ");
                                        A0.setNum2(input.nextInt());
                                        A0.numeroMultiploDeOtro();
                                        break;
                                    case 8:
                                        out.println("8. Escribir un programa que indique si un número o dos números es par o impar.");
                                        out.println("Ingrese el primer valor: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese el segundo valor: ");
                                        A0.setNum2(input.nextInt());
                                        A0.parImparDosVariables();
                                        break;
                                    case 9:
                                        out.println("9. Escribir un programa que indique si dos valores tienen el mismo signo.");
                                        out.println("Ingrese el primer valor: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese el segundo valor: ");
                                        A0.setNum2(input.nextInt());
                                        A0.numeroMismoSignoConOtroNumero();
                                        break;
                                    case 10:
                                        out.println("10. Escribir un programa que diga si la suma de dos números es positiva, negativa o nula.");
                                        out.println("Ingrese el primer valor: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese el segundo valor: ");
                                        A0.setNum2(input.nextInt());
                                        A0.numeroSumaSumanegativa();
                                        break;
                                    case 11:
                                        out.println("11. Escribir un programa que indique si un número es divisible a la vez por 2 y 3.");
                                        out.println("Ingrese el primer valor: ");
                                        A0.setNum1(input.nextInt());
                                        A0.numeroDivisiblePor2YPor3();
                                        break;
                                    case 12:
                                        out.println("12. Escribir un programa que indique si una persona tiene sobrepeso calculando su índice de masa corporal (IMC)" +
                                                "pidiendo su peso y altura (en cm)." + " (Investigar formula de IMC)\n" +
                                                "Info: Para calcular el imc de una persona únicamente se debe dividir el peso de ésta -expresado en kilogramos-, \n" +
                                                "por su altura elevada al cuadrado -expresada en metros-. \n" +
                                                "Por ejemplo una persona con una altura de 1,80 metros y un peso de 80 kg, tendrá un imc de 80 / 1,80^2 = 24,69.\n" +
                                                "Nota: \n" +
                                                "Peso Normal entre 18.50 - 24.99.\n" +
                                                "Sobrepeso entre 25.00 - 29.99.\n" +
                                                "Obeso: Tipo I entre 30.00 - 34.99.");
                                        out.println("Ingrese el primer valor el peso: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese el segundo valor la altura: ");
                                        A0.setNum2(input.nextInt());
                                        A0.imc();
                                        break;
                                    case 13:
                                        out.println("13. Escribir un programa que indique el cambio que se le debe entregar a un cliente.\n " +
                                                "Debe ingresar valor de producto a comprar y con cuanto paga el cliente.\n");
                                        out.println("Ingrese el valor del Producto $: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese con cuanto paga el cliente $: ");
                                        A0.setNum2(input.nextInt());
                                        A0.cambioACliente();
                                        break;
                                    case 14:
                                        out.println("14. Escribir un programa que pida un ángulo e indique si es agudo, recto u obtuso.\n" +
                                                "Verificar si el ángulo está en el rango de 0 a 180 grados. Es el rango de los grados que vamos a evaluar.\n" +
                                                "Si el ángulo está en el rango válido, determinar si es agudo, recto u obtuso. utilizando las siguientes definiciones:\n" +
                                                "Un ángulo es agudo si su medida es menor a 90 grados.\n" +
                                                "Un ángulo es recto si su medida es igual a 90 grados.\n" +
                                                "Un ángulo es obtuso si su medida es mayor a 90 grados y menor a 180 grados.");
                                        out.println("Ingrese el valor numerico: ");
                                        A0.setNum1(input.nextInt());
                                        A0.angulosNumeros();
                                        break;
                                    case 15:
                                        out.println("15. Escribir un programa que almacene una contraseña (previamente cargada), \n" +
                                                "pregunte al usuario por la contraseña y muestre si la contraseña introducida es correcta o no.\n");
                                        out.println("Ingrese la contraseña nuevamente en valor numerico: ");
                                        A0.setNum1(input.nextInt());
                                        A0.confirmacionDeClave();
                                        break;
                                    case 16:
                                        out.println("16. Para pagar un determinado impuesto se debe ser mayor de 18 años y tener unos ingresos iguales o \n" +
                                                "superiores a $80 000 mensuales. Escribir un programa que pregunte al usuario su edad y sus ingresos mensuales y\n " +
                                                "muestre por pantalla si el usuario tiene que tributar o no.\n" +
                                                "Definir edad Como Entero;\n");
                                        out.println("Ingrese su edad: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese sus ingresos mensuales: ");
                                        A0.setNum2(input.nextInt());
                                        A0.task16();
                                        break;
                                    case 17:
                                        out.println("17. El impuesto del programa anterior es el 8% de los ingresos mensuales. Modificarlo de forma tal que cuando se deba tributar muestre el monto que se debe pagar.\n");
                                        out.println("Ingrese su edad: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese sus ingresos mensuales: ");
                                        A0.setNum2(input.nextInt());
                                        A0.task17();
                                        break;
                                    case 18:
                                        out.println("18. Los tramos impositivos para la declaración de la renta en un determinado país son los siguientes. Escribir un programa que pregunte al usuario su ingreso (renta) anual y muestre por pantalla el monto que le corresponde pagar\n" +
                                                "Renta:\n" +
                                                "Menos de 10000 - 5%\n" +
                                                "Entre 10000 y 20000 - 15%\n" +
                                                "Entre 20000 y 35000 - 20%\n" +
                                                "Entre 35000 y 60000 - 30%\n" +
                                                "Más de 60000 - 45%\n");
                                        out.println("Ingrese su renta anual: ");
                                        A0.setNum1(input.nextInt());
                                        A0.task18();
                                        break;
                                    case 19:
                                        out.println("Desea salir de la app? S/N ");
                                        input.nextLine(); // agregar esta línea para consumir el carácter de nueva línea anterior
                                        A0.setNume(input.nextLine().toLowerCase());
                                        if (A0.getNume().equalsIgnoreCase("s")) {
                                            out.println("Saliendo del bucle...");
                                            break;
                                        } else {
                                            out.println("Continuando el bucle...");
                                            break;
                                        }
                                }
                            } while (!A0.getNume().equals("s"));
                            break;
                        case 3:
                            do {
                                A0.imprimirTexto3();
                                out.println("Ingrese del index cual tarea desea realizar hoy? ");
                                Integer option2A = input.nextInt();
                                switch (option2A) {
                                    case 1:
                                        out.println("1: Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.\n" +
                                                "La variable A, debe terminar con el valor de la variable B.\n");
                                        out.println("Ingrese el primer valor: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese el segundo valor: ");
                                        A0.setNum2(input.nextInt());
                                        A0.cambiarNumeroDeVariable();
                                        break;
                                    case 2:

                                        out.println("2: Crea un procedimiento “EspaciosPalabras”, que reciba como argumento un texto y muestra una cadena con un espacio adicional tras cada letra\n" +
                                                "Por ejemplo, “Hola, tú” devolverá “H o l a , t ú “. Crea un programa principal donde se use dicho procedimiento.\n");
                                        out.println("ingrese una palabra");
                                        A0.setNuma(input.nextLine().toLowerCase());
                                        A0.espacioPalabras();
                                        break;
                                    case 3:
                                        out.println("3: Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno\n" +
                                                "                        \"y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar.\n");
                                        out.println("Ingrese el valor numerico: ");
                                        A0.setNum1(input.nextInt());
                                        A0.escaleraNumerica();
                                        break;
                                    case 4:
                                        out.println("4: Realizar un procedimiento que permita realizar la división entre dos números y muestre el cociente y\n" +
                                                "el resto utilizando el método de restas sucesivas.\n" +
                                                "El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta obtenern\n" +
                                                "un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente. Por ejemplo: 50\n" +
                                                "50 – 13 = 37 una resta realizada\n" +
                                                "37 – 13 = 24 dos restas realizadas\n" +
                                                "24 – 13 = 11 tres restas realizadas\n");
                                        out.println("Ingrese el valor del dividendo: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese el valor del divisor: ");
                                        A0.setNum2(input.nextInt());
                                        A0.divisionEntreDosNumerosYMuestraCociente();
                                        break;
                                    case 5:
                                        out.println("5: Realizar una función que calcule la suma de dos números. En el algoritmo principal le\n" +
                                                "pediremos al usuario los dos números para pasárselos a la función. Después la función calculará la suma y lo devolverá para imprimirlo en el algoritmo.\n");
                                        out.println("Ingrese el primer valor numerico: ");
                                        A0.setNum1(input.nextInt());
                                        out.println("Ingrese el segundo valor numerico: ");
                                        A0.setNum2(input.nextInt());
                                        A0.sumar();
                                        break;
                                    case 6:
                                        out.println("6: Realizar una función que valide si un numero es impar o no. Si es impar la función debe devolver un verdadero, si no es impar debe devolver falso\n" +
                                                "Nota: la función no debe tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo.\n");
                                        out.println("Ingrese el valor numerico: ");
                                        A0.setNum1(input.nextInt());
                                        A0.parImparTrueOrFolse();
                                        break;
                                    case 7:
                                        out.println("7: Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase.\n" +
                                                "La función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la función Subcadena().\n");
                                        break;
                                    case 8:
                                        out.println("8: Realizar una función que calcule la suma de los dígitos de un numero.\n" +
                                                "Ejemplo: 25 = 2 + 5 = 7\n" +
                                                "Nota: Para obtener el último numero de un digito de 2 cifras o más debemos pensar en el resto de una división entre 10.\n" +
                                                "Recordar el uso de la función Mod y Trunc.\n");
                                        break;
                                    case 9:
                                        out.println("9: Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.\n");
                                        break;
                                    case 10:
                                        out.println("10: Dada una secuencia de números ingresados por teclado que finaliza con un –1,\n" +
                                                "por ejemplo: 5,3,0,2,4,4,0,0,2,3,6, 0,…,-1; realizar un programa que calcule el promedio de los números ingresados.\n" +
                                                "Suponemos que el usuario no insertará número negativos.\n");
                                        break;
                                    case 11:
                                        out.println("11: Teniendo en cuenta que la clave es “Contraseña”, escribir un programa que nos pida ingresar una clave.\n" +
                                                "Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá mostrar un mensaje que hemos fallado.\n" +
                                                "Si acertamos la clave se deberá mostrar un mensaje que acertamos.\n");
                                        break;
                                    case 12:
                                        out.println("12: Escribir un programa que lea números enteros hasta teclear 0 (cero).\n" +
                                                "Al finalizar el programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de todos ellos.\n");
                                        break;
                                    case 13:
                                        out.println("13: Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3 comprendidos entre 1 y 100.\n" +
                                                "                        \"Escribir un programa que calcule la suma de los N primeros números naturales. El valor de N se leerá por teclado.\n");
                                        break;
                                    case 14:
                                        out.println("14: Escribir un programa que pida un ángulo e indique si es agudo, recto u obtuso.\n" +
                                                "Verificar si el ángulo está en el rango de 0 a 180 grados. Es el rango de los grados que vamos a evaluar.\n" +
                                                "Si el ángulo está en el rango válido, determinar si es agudo, recto u obtuso. utilizando las siguientes definiciones\n" +
                                                "Un ángulo es agudo si su medida es menor a 90 grados.\n" +
                                                "Un ángulo es recto si su medida es igual a 90 grados.\n" +
                                                "Un ángulo es obtuso si su medida es mayor a 90 grados y menor a 180 grados\n");
                                        break;
                                    case 15:
                                        out.println("15: Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree un cuadrado de asteriscos de ese tamaño.\n" +
                                                "Los asteriscos sólo se verán en el borde del cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:\n" +
                                                "* * * *\n" +
                                                "* ----*\n" +
                                                "* ....*\n" +
                                                "* * * *\n");
                                        break;
                                    case 16:
                                        out.println("Desea salir de la app? S/N ");
                                        input.nextLine(); // agregar esta línea para consumir el carácter de nueva línea anterior
                                        frase = (input.nextLine().toLowerCase());
                                        out.println("frase: " + frase);
                                        break;
                                }
                            } while (!frase.toLowerCase().equals("s"));
                            break;
                        case 4:
                            out.println("Desea salir de la app? S/N  case 4: principal");
                            input.nextLine(); // agregar esta línea para consumir el carácter de nueva línea anterior
                            frase2 = (input.nextLine().toLowerCase());
                            break;
                        default:
                            out.println("Usted ingreso un valor fuera del Index, recuerde que solo se aceptan valores del 1 >= 4");
                    }

                } while (!frase2.toLowerCase().equals("s"));

                err.println("Usted salio del programa del bucle mas grande! ");

            } else {
                for (int i = 0; i < 4; i++) {
                    out.println("Ingrese nombre y clave por favor? ");
                    nombre = input.nextLine().toLowerCase();
                    clave = input.nextInt();
                }
                out.println("Usted agoto la cantidad de cuatro intentos, no tiene permitido ingresar ala app. ");
            }
        }
    }
}








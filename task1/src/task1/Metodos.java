package task1;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Metodos {
    //definir atributos con objeto INTERGER a ocupar.
    private String numa = "", numb = "", numc = "", numd = "", nume = "", auxiliarA, contadorA, acumuladorA;

    private Integer num1, num2, num3, num4, num5, auxiliar1, contador1, acumulador1;

    public Metodos() {
    }

    Scanner input = new Scanner(in);

    public Metodos(String numa, String numb, String numc, String numd, String nume, String auxiliarA, String contadorA, String acumuladorA, Integer num1, Integer num2, Integer num3, Integer num4, Integer num5, Integer auxiliar1, Integer contador1, Integer acumulador1) {
        this.numa = numa;
        this.numb = numb;
        this.numc = numc;
        this.numd = numd;
        this.nume = nume;
        this.auxiliarA = auxiliarA;
        this.contadorA = contadorA;
        this.acumuladorA = acumuladorA;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.auxiliar1 = auxiliar1;
        this.contador1 = contador1;
        this.acumulador1 = acumulador1;
    }

    public String getNuma() {
        return numa;
    }

    public void setNuma(String numa) {
        this.numa = numa;
    }

    public String getNumb() {
        return numb;
    }

    public void setNumb(String numb) {
        this.numb = numb;
    }

    public String getNumc() {
        return numc;
    }

    public void setNumc(String numc) {
        this.numc = numc;
    }

    public String getNumd() {
        return numd;
    }

    public void setNumd(String numd) {
        this.numd = numd;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAuxiliarA() {
        return auxiliarA;
    }

    public void setAuxiliarA(String auxiliarA) {
        this.auxiliarA = auxiliarA;
    }

    public String getContadorA() {
        return contadorA;
    }

    public void setContadorA(String contadorA) {
        this.contadorA = contadorA;
    }

    public String getAcumuladorA() {
        return acumuladorA;
    }

    public void setAcumuladorA(String acumuladorA) {
        this.acumuladorA = acumuladorA;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Integer getNum3() {
        return num3;
    }

    public void setNum3(Integer num3) {
        this.num3 = num3;
    }

    public Integer getNum4() {
        return num4;
    }

    public void setNum4(Integer num4) {
        this.num4 = num4;
    }

    public Integer getNum5() {
        return num5;
    }

    public void setNum5(Integer num5) {
        this.num5 = num5;
    }

    public Integer getAuxiliar1() {
        return auxiliar1;
    }

    public void setAuxiliar1(Integer auxiliar1) {
        this.auxiliar1 = auxiliar1;
    }

    public Integer getContador1() {
        return contador1;
    }

    public void setContador1(Integer contador1) {
        this.contador1 = contador1;
    }

    public Integer getAcumulador1() {
        return acumulador1;
    }

    public void setAcumulador1(Integer acumulador1) {
        this.acumulador1 = acumulador1;
    }

    @Override
    public String toString() {
        return "Metodos{" +
                "numa='" + numa + '\'' +
                ", numb='" + numb + '\'' +
                ", numc='" + numc + '\'' +
                ", numd='" + numd + '\'' +
                ", nume='" + nume + '\'' +
                ", auxiliarA='" + auxiliarA + '\'' +
                ", contadorA='" + contadorA + '\'' +
                ", acumuladorA='" + acumuladorA + '\'' +
                ", num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                ", num5=" + num5 +
                ", auxiliar1=" + auxiliar1 +
                ", contador1=" + contador1 +
                ", acumulador1=" + acumulador1 +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    //LAS FUNCIONES O METODOS DE NUESTRAS TASK COMPAÑEROS
    ///task 1 logica: Escriba un programa que lea dos números enteros y realice el cálculo de la suma, resta, multiplicación y división entre ambos valores.
    /// Los resultados deben mostrarse por pantalla.
    public void Calculadora() {
        for (String s : Arrays.asList("Suma: " + (num1 + num2), "Resta: " + (num1 - num2), "Multiplicación: " + (num1 * num2), "División: " + (num1 / num2))) {
            out.println(s);
        }
    }

    ///2.Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por pantalla el área y perímetro del mismo
    ///área = base * altura
    ///perímetro = 2 * altura + 2 * base.
    public void calcularAreaPerimetro() {
        out.println("El area es: " + (num1 * num2) + " El perimetro es: " + (num1 * 2 + num2 * 2));
    }

    ///3.Escribir un programa que calcule el precio promedio de un producto. El precio promedio se debe calcular a partir del precio del mismo producto en tres establecimientos distintos.
    public void promedioProducto() {
        out.println("la media del producto " + numa + "entre los establecimiento es: " + (num1 + num2 + num3) / 3);
    }


    ////4.Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas de tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables y mostrar el resultado final por pantalla.
    ///Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del programa deberá mostrar: num1 = 3 y num2 = 9
    ///Ayuda: Para intercambiar los valores de dos variables se debe utilizar una variable
    ///auxiliar.
    public void cambiarNumeroDeVariable() {
        auxiliar1 = num1;
        num1 = num2;
        num2 = auxiliar1;
        out.println("El primer valor ingresado ahora es: " + num1 + " El segundo valor ingresado ahora es: " + num2);
    }

    ///5.A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, escriba un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo:
    ///1 día = 24 horas = 1440 minutos = 86400
    public void convertidoDeTiempo() {
        num2 = num1 * 24;
        num3 = num1 * 1440;
        num4 = num1 * 86400;
        out.println("La cantidad de dias ingresados es: " + num1 + " En horas es: " + num2 + " En minutos es: " + num3 + " En segundos es: " + num4);
    }

    ///6.Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de edad se debe mostrar un mensaje por pantalla indicándolo.
    public void mayorEdad() {
        if (num1 >= 18)
            out.println("Usted es mayor de edad");
        else
            out.println("Usted no es mayor de edad");
    }

    ///7.Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe mostrar un mensaje por pantalla indicándolo.
    public void sueldoMinimo() {
        if (num1 > num2)
            out.println("usted tiene un sueldo por encima del minimo vital movil");
        else if (num1 == num2) {
            out.println("Usted tiene un sueldo igual al minimo vital movil");
        } else
            out.println("usted tiene un sueldo por debajo del minimo vital movil");
    }

    ///8.Realizar un programa que pida un número al usuario. Si el número es mayor que 100 se deberá de imprimir en pantalla "Es Mayor", y en caso contrario se deberá imprimir "Es Menor".
    public void numeroMayorA100() {
        if (num1 > 100)
            out.println("El numero" + num1 + "es mayor a 100");
        else
            out.println("El numero" + num1 + "es menor a 100");
    }

    //9.Realiza un programa que sólo permita introducir los caracteres ?S? y ?N?.
// Si el usuario ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que diga "CORRECTO",
// en caso contrario, se deberá imprimir "INCORRECTO".
    public void siONo() {
        if (numa == "s")
            out.println("Correcto Crack");
        else
            out.println("Incorrecto Crack");
    }

    ///10. Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran entre 5 y 10 el precio es de $2500,
// y si se compran más de 10 el precio es $2000. Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra,
// y el monto total que tiene que pagar por el total de la compra.
    public void llantasAndTotal() {
        if (num1 <= 5) {
            num2 = 3000 * num1;
            out.println("El precio es de 3000 por c/llanta\" \", el valor final es de: " + num2);
        } else if ((num1 > 5) || (num1 <= 10)) {
            num2 = 2500 * num1;
            out.println("El precio es de 3000 por c/llanta\" \", el valor final es de: " + num2);
        } else if (num1 > 10) {
            num2 = 2000 * num1;
            out.println("El precio es de 3000 por c/llanta\" \", el valor final es de: " + num2);
        } else
            out.println("No podes tener numeros negativos");
    }
///11. Construir un programa que simule un menú de opciones para realizar las cuatro operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores numéricos enteros. El usuario, además, debe especificar la operación con el primer carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M? o ?m? para la multiplicación y ?D? o ?d? para la división.

    //Método sumar():
    public double sumar() {
        double sumar = num1 + num2;
        return sumar;
    }

    //Método restar():
    public double restar() {
        double restar = num1 - num2;
        return restar;
    }

    //Método multiplicar():
    public double multiplicar() {
        if (num1 != 0 && num2 != 0) {
            out.print("La multiplicacion: ");
            return num1 * num2;
        } else {
            out.print("No se puede multiplicar por cero: ");
            return 0;
        }
    }

    //Método dividir() con if:
    public double dividir() {
        if (num2 != 0) {
            out.print("La division: ");
            return num1 / num2;
        } else {
            out.print("No se puede dividir por cero: ");
            return 0;
        }

    }

    public String imp() {
        while (num1 <= num2) {

            if (num1 == 0) {
                out.println("El valor " + num1 + " ingresado no es par ni impar. ");
            } else if (num1 % 2 == 0) {
                out.println("El valor " + num1 + " ingresado es par. ");
            } else {
                out.println("El valor " + num1 + " ingresado es impar. ");
            }
            num1 = num1 + 1;
        }

        return "Gracias por ocupar el bucle while";
    }

    //Método bucle for() decremento num2 > num1:
    public String imp2() {
        for (int i = num2; i >= num1; i--) {
            if (i == 0) {
                out.println("El valor " + i + " ingresado no es par ni impar. ");
            } else if (i % 2 == 0) {
                out.println("El valor " + i + " ingresado es par. ");
            } else {
                out.println("El valor " + i + " ingresado es impar. ");
            }
        }
        return "Gracias por ocupar el bucle for";
    }

    //12. Escribir un programa que lea un número y determine si tiene tres dígitos.
    public void numeroEnDigitos() {
        if (num1 >= 100 && num1 <= 999) {
            out.println("El número ingresado tiene tres dígitos.");
        } else {
            out.println("El número ingresado no tiene tres dígitos.");
        }
    }

    ///13. Escribir un programa que lea un número y determine su signo.
    public void numeroSigno() {
        if (num1 >= 0)
            out.println("Es un numero positivo: +" + num1);
        else {
            out.println("Es un numero negativo: -" + num1);
        }
    }

    ///3.Escribir un programa que lea un número y determine la cantidad de dígitos que tiene.
    public void numeroDigitosTotal() {
        num2 = 0;
        while (num1 != 0) {
            num2++;
            num1 /= 10;
        }
        out.println("El número tiene " + num2 + " dígitos.");
    }

    ///4. Escriba un programa que calcule el mayor de cuatro números.
    public void numeroMayoraOtros() {
        if (num1 > num2 && num1 > num3 && num1 > num4)
            out.println("El primer numero es mayor que los demas");
        else if (num2 > num1 && num2 > num3 && num2 > num4) {
            out.println("El segundo numero es mayor que los demas");
        } else if (num3 > num1 && num3 > num2 && num3 > num4)
            out.println("El numero tres es mayor que los demas");
        else
            out.println("El numero cuatro es mayor que los demas");
    }

    ///5.Escriba un programa que pida dos números y muestre cuál es el menor y cuál el mayor o que escriba si son iguales.
    public void numeroMayorMenorIgual() {
        if (num1 > num2) {
            out.println("El primer numero ingresado: " + num1 + " es mayor al segundo numero ingresado: " + num2);
        } else if (num1 < num2) {
            out.println("El primer numero ingresado: " + num1 + " es menor al segundo numero ingresado: " + num2);
        } else
            out.println("El primer numero ingresado: " + num1 + " es igual al segundo numero ingresado: " + num2);
    }

    ///6.	Escribir un programa que indique si un número es divisible por 7.
    public void numeroDivisiblePor7() {
        if (num1 % 7 == 0) {
            out.println("El número " + num1 + " ingresado es divisible por 7.");
        } else {
            out.println("El número " + num1 + " ingresado no es divisible por 7.");
        }
    }

    ///7.	Escribir un programa que indique si un número es múltiplo de otro. (investigar funcionamiento de función MOD o "%" pseint)
    public void numeroMultiploDeOtro() {
        if (num1 % num2 == 0) {
            out.println("El primer número " + num1 + " ingresado es múltiplo de: " + num2);
        } else {
            out.println("El primer número " + num1 + " ingresado no es múltiplo de: " + num2);
        }
    }

    ///8.	Escribir un programa que indique si un número o dos números es par o impar.
    public void parImparDosVariables() {
        if (num1 % 2 == 0) {
            out.println("El primer número ingresado es par.");
        } else {
            out.println("El primer número ingresado es impar.");
        }
        if (num2 != 0) {
            if (num2 % 2 == 0) {
                out.println("El segundo número ingresado es par.");
            } else {
                out.println("El segundo número ingresado es impar.");
            }
        }
    }

    ///9.	Escribir un programa que indique si dos valores tienen el mismo signo.
    public void numeroMismoSignoConOtroNumero() {
        if (num1 >= 0 && num2 >= 0 || num1 < 0 && num2 < 0) {
            out.println("Ambos números tienen el mismo signo.");
        } else {
            out.println("Los números tienen signos opuestos.");
        }
    }

    ///10.	Escribir un programa que diga si la suma de dos números es positiva, negativa o nula.
    public void numeroSumaSumanegativa() {
        num3 = num1 + num2;
        // Verificar si la suma es positiva, negativa o nula
        if (num3 > 0) {
            out.println("La suma de los dos números es positiva.");
        } else if (num3 < 0) {
            out.println("La suma de los dos números es negativa.");
        } else {
            out.println("La suma de los dos números es nula.");
        }
    }

    ///11.	Escribir un programa que indique si un número es divisible a la vez por 2 y 3. (MOD o "%")
    public void numeroDivisiblePor2YPor3() {
        if (num1 % 2 == 0 && num1 % 3 == 0) {
            out.println(num1 + " es divisible por 2 y 3.");
        } else {
            out.println(num1 + " no es divisible por 2 y 3 al mismo tiempo.");
        }
    }

    ///12.	Escribir un programa que indique si una persona tiene sobrepeso calculando su índice de masa corporal (IMC) pidiendo su peso y altura (en cm). (Investigar formula de IMC)
    /// Info: Para calcular el imc de una persona únicamente se debe dividir el peso de ésta -expresado en kilogramos-,
    /// por su altura elevada al cuadrado -expresada en metros-.
    /// Por ejemplo una persona con una altura de 1,80 metros y un peso de 80 kg, tendrá un imc de 80 / 1,80^2 = 24,69.
    /// Nota:
    ///		- Peso Normal entre 18.50 - 24.99.
    ///		- Sobrepeso entre 25.00 - 29.99.
    ///		- Obeso: Tipo I entre 30.00 - 34.99.
    public void imc() {
        num3 = num1 / (num2 * num2);
        out.println("Su IMC es: " + num4);
        if (num3 >= 18.5 && num3 <= 24.99) {
            out.println("Usted tiene un peso normal.");
        } else if (num3 >= 25 && num3 <= 29.99) {
            out.println("Usted tiene sobrepeso.");
        } else if (num3 >= 30 && num3 <= 34.99) {
            out.println("Usted es obeso Tipo I.");
        } else {
            out.println("Su IMC no se encuentra en el rango de análisis.");
        }
    }

    ////13.Escribir un programa que indique el cambio que se le debe entregar a un cliente. Debe ingresar valor de producto a comprar y con cuanto paga el cliente.
    public void cambioACliente() {

        double num3 = num2 - num1;
        if (num3 >= 0) {
            out.println("El cambio a entregar es de: " + num3);
        } else {
            out.println("El cliente no ha pagado lo suficiente. Faltan: " + (-num3));
        }
    }

    ///14.	Escribir un programa que pida un ángulo e indique si es agudo, recto u obtuso.
    /// Verificar si el ángulo está en el rango de 0 a 180 grados. Es el rango de los grados que vamos a evaluar.
    /// Si el ángulo está en el rango válido, determinar si es agudo, recto u obtuso. utilizando las siguientes definiciones:
    /// - Un ángulo es agudo si su medida es menor a 90 grados.
    /// - Un ángulo es recto si su medida es igual a 90 grados.
    /// - Un ángulo es obtuso si su medida es mayor a 90 grados y menor a 180 grados.
    public void angulosNumeros() {
        if (num1 >= 0 && num1 <= 180) {
            if (num1 < 90) {
                out.println("El ángulo es agudo.");
            } else if (num1 == 90) {
                out.println("El ángulo es recto.");
            } else {
                out.println("El ángulo es obtuso.");
            }
        } else {
            out.println("El ángulo ingresado no está en el rango válido.");
        }
    }

    //15. Escribir un programa que almacene una contraseña (previamente cargada), pregunte al usuario por la contraseña y muestre si la contraseña introducida es correcta o no.
    public void confirmacionDeClave() {
        if (num1 == 1234)
            out.println("su clave ingresada recientemente y su contraseña previamente cargada es la misma");
        else
            out.println("su clave ingresada recientemente y su contraseña previamente cargada no es la misma");
    }

    //16. Para pagar un determinado impuesto se debe ser mayor de 18 años y tener unos ingresos iguales o superiores a $80 000 mensuales. Escribir un programa que pregunte al usuario su edad y sus ingresos mensuales y muestre por pantalla si el usuario tiene que tributar o no.\n" +
    // "\t\t\t\t\t\t\t\tDefinir edad Como Entero;
    public void task16() {
        if (num1 >= 18 && num2 >= 80000) {
            out.println("Debe tributar.");
        } else {
            out.println("No debe tributar.");
        }
    }

    ///17.El impuesto del programa anterior es el 8% de los ingresos mensuales. Modificarlo de forma tal que cuando se deba tributar muestre el monto que se debe pagar.
    public void task17() {
        double impuesto;
        if (num1 >= 18 && num2 >= 80000) {
            impuesto = (num2 * 0.08);
            out.printf("Debe tributar $%.2f", impuesto);
        } else {
            out.println("No debe tributar.");
        }
    }

    ///18.Los tramos impositivos para la declaración de la renta en un determinado país son los siguientes. Escribir un programa que pregunte al usuario su ingreso (renta) anual y muestre por pantalla el monto que le corresponde pagar\n" +
///" Renta:   " +
///" Menos de 10000 - 5%" +
///" Entre 10000 y 20000 - 15%" +
///" Entre 20000 y 35000 - 20%" +
///" Entre 35000 y 60000 - 30%" +
///" Más de 60000 - 45%"
    public void task18() {
        double impuesto;
        if (num1 < 10000) {
            impuesto = num1 * 0.05;
        } else if (num1 < 20000) {
            impuesto = 500 + (num1 - 10000) * 0.15;
        } else if (num1 < 35000) {
            impuesto = 2000 + (num1 - 20000) * 0.20;
        } else if (num1 < 60000) {
            impuesto = 5500 + (num1 - 35000) * 0.30;
        } else {
            impuesto = 13500 + (num1 - 60000) * 0.45;
        }

        // Mostrar el impuesto correspondiente
        out.printf("El impuesto correspondiente es: $%.2f", impuesto);
    }


//19 reutilizado

//20 : Crea un procedimiento “EspaciosPalabras”, que reciba como argumento un texto y muestra una cadena con un espacio adicional tras cada letra.\n" +
//                        "Por ejemplo, “Hola, tú” devolverá “H o l a , t ú “. Crea un programa principal donde se use dicho procedimiento.\n

    public void espacioPalabras() {
        String textoConEspacios = "";
        for (int i = 0; i < numa.length(); i++) {
            char letra = numa.charAt(i);
            if (letra != ' ') {
                textoConEspacios += letra + " ";
            } else {
                textoConEspacios += letra;
            }
        }
        out.println(textoConEspacios);
    }

    //21: Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno \" +\n" +
    //                                            "                        \"y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:\\n\" +\n" +
    //                                            "                        \"1\\n\" +\n" +
    //                                            "                        \"12\\n\" +\n" +
    //                                            "                        \"123
    public void escaleraNumerica() {
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                out.print(j);
            }
            out.println();
        }
    }
//22 : Realizar un procedimiento que permita realizar la división entre dos números y muestre el cociente y \\n\" +\n" +
//                                            "                        \"el resto utilizando el método de restas sucesivas.\\n\" +\n" +
//                                            "                        \"El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta obtener\\n \" +\n" +
//                                            "                        \"un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:\\n\" +\n" +
//                                            "                        \"50 – 13 = 37 una resta realizada\\n\" +\n" +
//                                            "                        \"37 – 13 = 24 dos restas realizadas\\n\" +\n" +
//                                            "                        \"24 – 13 = 11 tres restas realizadas\\n

    public void divisionEntreDosNumerosYMuestraCociente() {
        num3 = 0;
        num4 = num1;

        while (num4 >= num2) {
            num4 -= num2;
            num3++;
        }

        out.println("Cociente: " + num3);
        out.println("Resto: " + num4);
    }

//23: Realizar una función que calcule la suma de dos números. En el algoritmo principal le\\n \" +\n" +
//"pediremos al usuario los dos números para pasárselos a la función. Después la función calculará la suma y lo devolverá para imprimirlo en el algoritmo.\n


    //24: Realizar una función que valide si un numero es impar o no. Si es impar la función debe devolver un verdadero, si no es impar debe devolver falso.\\n \" +\n" +
    //                                            "                        \"Nota: la función no debe tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo..\\n
    public void parImparTrueOrFolse() {

        if (num1 % 2 != 0) {
            out.println(num1 + " es impar.");
            out.println(num1 % 2 != 0);
        } else {
            out.println(num1 + " no es impar.");
        }
    }


    //25:: Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase.\\n\" +\n" +
    //                                        "                        \" La función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la función Subcadena()..\n

    //26: Realizar una función que calcule la suma de los dígitos de un numero.\n" +
    //                                            "Ejemplo: 25 = 2 + 5 = 7\n" +
    //                                            "Nota: Para obtener el último numero de un digito de 2 cifras o más debemos pensar en el resto de una división entre 10.\n" +
    //                                            "Recordar el uso de la función Mod y Trunc.\n"


    //27: Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

    //28: Dada una secuencia de números ingresados por teclado que finaliza con un –1,\n" +
    //                                            "por ejemplo: 5,3,0,2,4,4,0,0,2,3,6, 0,…,-1; realizar un programa que calcule el promedio de los números ingresados.\n" +
    //                                            "Suponemos que el usuario no insertará número negativos.\n


    //29: Teniendo en cuenta que la clave es “Contraseña”, escribir un programa que nos pida ingresar una clave.\n" +
    //                                            "Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá mostrar un mensaje que hemos fallado.\n" +
    //                                            "Si acertamos la clave se deberá mostrar un mensaje que acertamos.\n

    //30: Escribir un programa que lea números enteros hasta teclear 0 (cero).\n"  +
    //                                            "Al finalizar el programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de todos ellos.\n


    //31: Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3 comprendidos entre 1 y 100.\n" +
    //                                            "                        \"Escribir un programa que calcule la suma de los N primeros números naturales. El valor de N se leerá por teclado.\n

    //32: Escribir un programa que pida un ángulo e indique si es agudo, recto u obtuso.\n" +
    //                                            "Verificar si el ángulo está en el rango de 0 a 180 grados. Es el rango de los grados que vamos a evaluar.\n" +
    //                                            "Si el ángulo está en el rango válido, determinar si es agudo, recto u obtuso. utilizando las siguientes definiciones\n" +
    //                                            "Un ángulo es agudo si su medida es menor a 90 grados.\n" +
    //                                            "Un ángulo es recto si su medida es igual a 90 grados.\n" +
    //                                            "Un ángulo es obtuso si su medida es mayor a 90 grados y menor a 180 grados\n"


    //33: Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree un cuadrado de asteriscos de ese tamaño.\n" +
    //                                            "Los asteriscos sólo se verán en el borde del cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:\n" +
    //                                            "* * * *\n" +
    //                                            "* *\n" +
    //                                            "* *\n" +
    //                                            "* * * *\n"


//INDEXS EN GENERAL DE LOS SWITCH


    public void imprimirTexto0() {

        for (int i = 1; (i <= 4); i++) {
            if (i == 1) {
                out.println(i + ": Dia de Logica");
            } else if (i == 2) {
                out.println(i + ": Dia de Condicionales");
            } else if (i == 3) {
                out.println(i + ": Dia de Bucles ");
            } else if (i == 4) {
                out.println(i + ": Salir");
            }
        }
    }

    public void imprimirTexto1() {
        for (int i = 1; i <= 12; i++) {

            if (i == 1)
                out.println(i + ": programa que lea dos números enteros y realice el cálculo de la suma, resta, multiplicación y división entre ambos valores.");
            else if (i == 2) {
                out.println(i + ": Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por pantalla el área y perímetro del mismo");
            } else if (i == 3) {
                out.println(i + ": Programa que calcule el precio promedio de un producto. El precio promedio se debe calcular a partir del precio del mismo producto en tres establecimientos distintos.");
            } else if (i == 4) {
                out.println(i + ": Programa que permita al usuario ingresar el valor de dos variables numéricas de tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables y mostrar el resultado final por pantalla.");
            } else if (i == 5) {
                out.println(i + ": A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, escriba un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo: 1 día = 24 horas = 1440 minutos = 86400");
            } else if (i == 6) {
                out.println(i + ": Programa en donde se pida la edad del usuario. Si el usuario es mayor de edad se debe mostrar un mensaje por pantalla indicándolo.");
            } else if (i == 7) {
                out.println(i + ": El programa le pedirá al usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe mostrar un mensaje por pantalla indicándolo.");
            } else if (i == 8) {
                out.println(i + ": Programa que pida un número al usuario. Si el número es mayor que 100 se deberá de imprimir en pantalla Es Mayor, y en caso contrario se deberá imprimir Es Menor. ");
            } else if (i == 9) {
                out.println(i + ": Programa que sólo permita introducir los caracteres ?S? y ?N?." +
                        " Si el usuario ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que diga CORRECTO," +
                        " en caso contrario, se deberá imprimir INCORRECTO.");
            } else if (i == 10) {
                out.println(i + ": Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran entre 5 y 10 el precio es de $2500," +
                        " y si se compran más de 10 el precio es $2000. Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra," +
                        " y el monto total que tiene que pagar por el total de la compra.");
            } else if (i == 11) {
                out.println(i + ": Programa que simule un menú de opciones para realizar las cuatro operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores numéricos enteros.");
            } else if (i == 12) {
                out.println(i + ": MalirSal");
            }

        }
    }


    public void imprimirTexto2() {
        for (int i = 1; i <= 19; i++) {

            if (i == 1)
                out.println(i + ": Escribir un programa que lea un número y determine si tiene tres dígitos.");
            else if (i == 2) {
                out.println(i + ": Escribir un programa que lea un número y determine su signo.");
            } else if (i == 3) {
                out.println(i + ": Escribir un programa que lea un número y determine la cantidad de dígitos que tiene");
            } else if (i == 4) {
                out.println(i + ": Escriba un programa que calcule el mayor de cuatro números.");
            } else if (i == 5) {
                out.println(i + ": Escriba un programa que pida dos números y muestre cuál es el menor y cuál el mayor o que escriba si son iguales.");
            } else if (i == 6) {
                out.println(i + ": Escribir un programa que indique si un número es divisible por 7.");
            } else if (i == 7) {
                out.println(i + ": Escribir un programa que indique si un número es múltiplo de otro.");
            } else if (i == 8) {
                out.println(i + ": Escribir un programa que indique si un número o dos números es par o impar.");
            } else if (i == 9) {
                out.println(i + ": Escribir un programa que indique si dos valores tienen el mismo signo.");
            } else if (i == 10) {
                out.println(i + ": Escribir un programa que diga si la suma de dos números es positiva, negativa o nula.");
            } else if (i == 11) {
                out.println(i + ": Escribir un programa que indique si un número es divisible a la vez por 2 y 3.");
            } else if (i == 12) {
                out.println(i + ": Escribir un programa que indique si una persona tiene sobrepeso calculando su índice de masa corporal (IMC)" +
                        "pidiendo su peso y altura (en cm).\n" +
                        "(Investigar formula de IMC)\n" +
                        "Info: Para calcular el imc de una persona únicamente se debe dividir el peso de ésta -expresado en kilogramos-,\n" +
                        "por su altura elevada al cuadrado -expresada en metros-.\n" +
                        "Por ejemplo una persona con una altura de 1,80 metros y un peso de 80 kg, tendrá un imc de 80 / 1,80^2 = 24,69.\n" +
                        "Nota:\n" +
                        "Peso Normal entre 18.50 - 24.99.\n" +
                        "Sobrepeso entre 25.00 - 29.99.\n" +
                        "Obeso: Tipo I entre 30.00 - 34.99.");
            } else if (i == 13) {
                out.println(i + ": Escribir un programa que indique el cambio que se le debe entregar a un cliente. Debe ingresar valor de producto a comprar y con cuanto paga el cliente.");
            } else if (i == 14) {
                out.println(i + ": Escribir un programa que pida un ángulo e indique si es agudo, recto u obtuso.\n" +
                        "Verificar si el ángulo está en el rango de 0 a 180 grados. Es el rango de los grados que vamos a evaluar.\n" +
                        "Si el ángulo está en el rango válido, determinar si es agudo, recto u obtuso. utilizando las siguientes definiciones:\n" +
                        "Un ángulo es agudo si su medida es menor a 90 grados.\n" +
                        "Un ángulo es recto si su medida es igual a 90 grados.\n" +
                        "Un ángulo es obtuso si su medida es mayor a 90 grados y menor a 180 grados");
            } else if (i == 15) {
                out.println(i + "s: Escribir un programa que almacene una contraseña (previamente cargada), " +
                        "pregunte al usuario por la contraseña y muestre si la contraseña introducida es correcta o no.");
            } else if (i == 16) {
                out.println(i + ": Para pagar un determinado impuesto se debe ser mayor de 18 años y tener unos ingresos iguales o superiores a $80 000 mensuales. \n" +
                        "Escribir un programa que pregunte al usuario su edad y sus ingresos mensuales y muestre por pantalla si el usuario tiene que tributar o no.\n" +
                        "Definir edad Como Entero;");
            } else if (i == 17) {
                out.println(i + ": El impuesto del programa anterior es el 8% de los ingresos mensuales. \n" +
                        "Modificarlo de forma tal que cuando se deba tributar muestre el monto que se debe pagar");
            } else if (i == 18) {
                out.println(i + ": Los tramos impositivos para la declaración de la renta en un determinado país son los siguientes. \n" +
                        "Escribir un programa que pregunte al usuario su ingreso (renta) anual y muestre por pantalla el monto que le corresponde pagar\n" +
                        "Renta:\n" +
                        "Menos de 10000 - 5%\n" +
                        "Entre 10000 y 20000 - 15%\n" +
                        "Entre 20000 y 35000 - 20%\n" +
                        "5000 y 60000 - 30%\n" +
                        "Más de 60000 - 45%");
            } else if (i == 19) {
                out.println(i + ": MalirSal");
            }

        }
    }


    public void imprimirTexto3() {
        for (int i = 1; i <= 16; i++) {

            if (i == 1)
                out.println(i + ": Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.\n " +
                        "La variable A, debe terminar con el valor de la variable B..\n");
            else if (i == 2) {
                out.println(i + ": Crea un procedimiento “EspaciosPalabras”, que reciba como argumento un texto y muestra una cadena con un espacio adicional tras cada letra.\n" +
                        "Por ejemplo, “Hola, tú” devolverá “H o l a , t ú “. Crea un programa principal donde se use dicho procedimiento.\n");
            } else if (i == 3) {
                out.println(i + ": Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno " +
                        "y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:\n" +
                        "1\n" +
                        "12\n" +
                        "123");
            } else if (i == 4) {
                out.println(i + ": Realizar un procedimiento que permita realizar la división entre dos números y muestre el cociente y \n" +
                        "el resto utilizando el método de restas sucesivas.\n" +
                        "El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta obtener\n " +
                        "un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:\n" +
                        "50 – 13 = 37 una resta realizada\n" +
                        "37 – 13 = 24 dos restas realizadas\n" +
                        "24 – 13 = 11 tres restas realizadas\n" +
                        "dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.\n");
            } else if (i == 5) {
                out.println(i + ": Realizar una función que calcule la suma de dos números. En el algoritmo principal le\n " +
                        "pediremos al usuario los dos números para pasárselos a la función. Después la función calculará la suma y lo devolverá para imprimirlo en el algoritmo.\n");
            } else if (i == 6) {
                out.println(i + ": Realizar una función que valide si un numero es impar o no. Si es impar la función debe devolver un verdadero, si no es impar debe devolver falso.\n " +
                        "Nota: la función no debe tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo..\n");
            } else if (i == 7) {
                out.println(i + ": Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase.\n" +
                        " La función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la función Subcadena()..\n");
            } else if (i == 8) {
                out.println(i + ":Realizar una función que calcule la suma de los dígitos de un numero.\n" +
                        "Ejemplo: 25 = 2 + 5 = 7\n" +
                        "Nota: Para obtener el último numero de un digito de 2 cifras o más debemos pensar en el resto de una división entre 10.\n" +
                        " Recordar el uso de la función Mod y Trunc.\n");
            } else if (i == 9) {
                out.println(i + ": Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.\n");
            } else if (i == 10) {
                out.println(i + ": Dada una secuencia de números ingresados por teclado que finaliza con un –1,\n " +
                        "por ejemplo: 5,3,0,2,4,4,0,0,2,3,6, 0,…,-1; realizar un programa que calcule el promedio de los números ingresados.\n " +
                        "Suponemos que el usuario no insertará número negativos.\n");
            } else if (i == 11) {
                out.println(i + ": Teniendo en cuenta que la clave es “Contraseña”, escribir un programa que nos pida ingresar una clave. \n" +
                        "Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá mostrar un mensaje que hemos fallado. \n" +
                        "Si acertamos la clave se deberá mostrar un mensaje que acertamos.\n");
            } else if (i == 12) {
                out.println(i + ":Escribir un programa que lea números enteros hasta teclear 0 (cero).\n" +
                        " Al finalizar el programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de todos ellos.\n");
            } else if (i == 13) {
                out.println(i + ": Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3 comprendidos entre 1 y 100.\n" +
                        "Escribir un programa que calcule la suma de los N primeros números naturales. El valor de N se leerá por teclado.\n");
            } else if (i == 14) {
                out.println(i + ": Escribir un programa que pida un ángulo e indique si es agudo, recto u obtuso.\n" +
                        "Verificar si el ángulo está en el rango de 0 a 180 grados. Es el rango de los grados que vamos a evaluar.\n" +
                        "Si el ángulo está en el rango válido, determinar si es agudo, recto u obtuso. utilizando las siguientes definiciones:\n" +
                        "Un ángulo es agudo si su medida es menor a 90 grados.\n" +
                        "Un ángulo es recto si su medida es igual a 90 grados.\n" +
                        "Un ángulo es obtuso si su medida es mayor a 90 grados y menor a 180 grados\n");
            } else if (i == 15) {
                out.println(i + ": Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree un cuadrado de asteriscos de ese tamaño.\n " +
                        "Los asteriscos sólo se verán en el borde del cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:\n" +
                        "* * * *\n" +
                        "* *\n" +
                        "* *\n" +
                        "* * * *\n");
            } else if (i == 16) {
                out.println(i + ": MalirSal");
            }

        }
    }


}



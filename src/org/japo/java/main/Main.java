/* 
 * Copyright 2019 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author alumnoT
 */
public class Main {

    public static final Scanner SCN = new Scanner(System.in, "Windows-1252").useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static final Random RND = new Random();
    public static final Calendar CAL = Calendar.getInstance();
    public static final GregorianCalendar CALL = new GregorianCalendar(Locale.ITALY);

    public static void main(String[] args) {
//        1º EJERCICIOS
//     1 - hola mundo
        System.out.println("Hola Mundo");
        System.out.println("===================================");

//2 - ReglasJefe
        System.out.println("Articulo 1. El jefe tiene la razon");
        System.out.println("Articulo 2. El jefe tiene siempre la razon");
        System.out.println("Articulo 3. En caso de duda se aplicara el articulo 2");
        System.out.println("===================================");

//3 - LegadaLuna
        System.out.println("La llegada a la luna fue en 1969");
        System.out.println("===================================");

//4 - cambio dolar euro
        double EuroDolar = 1;
        System.out.printf("1 euro es igual a %.2f dolares %n", EuroDolar);
        System.out.println("===================================");

//5 - EstadoLluvia
        boolean EstadoLluvia = false;
        System.out.printf("¿Hoy esta lloviendo? : %b%n", EstadoLluvia);
        System.out.println("===================================");

//6 - LetraDNI
        char letra_DNI = 'G';
        System.out.printf("La letra del DNI 49847053 es la letra -> %c%n", letra_DNI);
        System.out.println("===================================");

//7 - FechaInicio
        int dia = 14;
        int mes = 9;
        int anno = 2022;
        System.out.printf("La fecha de inicio de las clases es el %d/%d/%d%n", dia, mes, anno);
        System.out.println("===================================");

//8 - HoraEntrada
        int hora = 8;
        int min = 47;
        System.out.printf("La hora de entrada es a las %d:%d%n", hora, min);
        System.out.println("===================================");

//        2º EJERCICICOS
//1 - HolaMundoConstante
        final String SALUDO_CONSTANTE = "¡Hola Mundo!";
        System.out.println(SALUDO_CONSTANTE);
        System.out.println("===================================");

//2 - LlegadaLunaConstante
        final int ANY_LLEGADDA_LUNA = 1969;
        System.out.printf("El hombre llego a la luna en %d%n", ANY_LLEGADDA_LUNA);
        System.out.println("===================================");

//3 - CambioEuroDolarConstante
        final double CAMBIO_EURO_DOLAR = 0.98;
        System.out.printf("El cambio de hoy es 1 euro por %.2f dolares%n", CAMBIO_EURO_DOLAR);
        System.out.println("===================================");

//4 - HorarioInviernoConstante
        final boolean HORARIO_INVIERNO = true;
        System.out.printf("Horario de invierno %b%n", HORARIO_INVIERNO);
        System.out.println("===================================");

//5 - LetraDNIConstante
        final char LETRA_DNI = 'G';
        System.out.printf("Letra dni : %c%n", LETRA_DNI);
        System.out.println("===================================");

//        3º EJERCICIOS
//1 - TallaZapatoConsola
//int talla;
//        System.out.print("Introduce tu talla de zapato :");
//        talla = SCN.nextInt();
//        System.out.printf("Talla de Zapato introducida : %d%n", talla);
//System.out.println("===================================");
//// 2 - AlturaPersonaConsola
//double altura;
//        System.out.print("Introduce tu altura en metros : ");
//        altura = SCN.nextDouble();
//        System.out.printf(Locale.ENGLISH,"Mi altura es : %.2f%n", altura);
//3 - PermisoCirculacionConsola
//boolean permisoOk;
//        System.out.print("tienes un permiso de conducir ? : ");
//        permisoOk = SCN.nextBoolean();
//        System.out.printf("%s%s%n","Permiso de circulacion...", permisoOk ? "si":"no");
//4 - LetraNIFConsola
// char letraDNI;
//        System.out.printf("introduzca la letra de tu DNI : ");
//        letraDNI = SCN.nextLine().charAt(0);
//        System.out.printf("Letra DNI :%c%n", letraDNI);
////5 - NombrePersonaConsola 
//String nombre;
//        System.out.print("Introduce tu nombre : ");
//        nombre = SCN.nextLine();
//        System.out.printf("nombre introducido : %s%n", nombre);
//        3º EJERCICIOS 
//1 - BalanceCirculacionAleatorio
        int Balance;
        Balance = RND.nextInt();
        System.out.printf("Balance de circulacion : %d%n", Balance);
        System.out.println("===================================");

//2 - AforoLocalAleatorio
        final int MAX_VAL = 100;
        final int MIN_VAL = 1;
        int valor;
        valor = RND.nextInt(MAX_VAL - MIN_VAL + 1) + MIN_VAL;
        System.out.printf(" Aforo actual del local : %d%n", valor);
        System.out.println("===================================");
// 3 - TallaZapatoAleatoria
        final int MAX_TALL = 60;
        final int MIN_TALL = 20;
        int talla;
        talla = RND.nextInt(MAX_TALL - MIN_TALL + 1) + MIN_TALL;
        System.out.printf("Talla de zapato : %d%n", talla);

//4 - AlturaPersonaAleatorio
        final double MAX_ALT = 2.50;
        final double MIN_ALT = 0.50;
        double altura;
        altura = RND.nextDouble(MAX_ALT - MIN_ALT) + MIN_ALT;
        System.out.printf("Altura aleatoria : %.2f%n", altura);
//5 - ResultadoExamenAleatorio
        boolean resultado;
        resultado = RND.nextBoolean();
        System.out.printf("Aptitud satisfactoria : %b%n", resultado);
//6 - LetraInicioAleatorio
        final char MAX_LE = 'z';
        final char MIN_LE = 'a';
        char letraIni;
        letraIni = (char) (RND.nextInt(MAX_LE - MIN_LE + 1) + MIN_LE);
        System.out.printf("Letra inicio examen : %c%n", letraIni);

        //   5º EJERCICIOS
//1 - TiempoUnix
        long tiempo = new Date().getTime();
        System.out.printf("Tiempo Unix : %d%n", tiempo);
////2 - HoraSistema
//GregorianCalendar cal = new GregorianCalendar();
//int hour = cal.get(Calendar.HOUR_OF_DAY);
//int minu = cal.get(Calendar.MINUTE);
//int segun = cal.get(Calendar.SECOND);
//System.out.printf("Hora del sistema %d:%d:%d%n", hour, minu, segun);

//3 - FechaSistema
        GregorianCalendar call = new GregorianCalendar(anno, mes, dia);
        int ano = call.get(Calendar.YEAR);
        int mess = call.get(Calendar.MONTH) + 1;
        int Dia = call.get(Calendar.DAY_OF_MONTH);
        System.out.printf("Fecha del sistema : %d/%d/%d%n", ano, mess, Dia);

//4 - DistanciaHoraConsola
//int horaa;
//int minuto;
//int segundo;
//        System.out.print("Hora inicio : ");
//        horaa = SCN.nextInt();
//        System.out.print("Minuto inicio : ");
//        minuto = SCN.nextInt();
//        System.out.print("Segundo inicio : ");
//        segundo = SCN.nextInt();
//        
//       GregorianCalendar calL= new GregorianCalendar();
//       int Hour = calL.get(Calendar.HOUR_OF_DAY);
//       int minut = calL.get(Calendar.MINUTE);
//       int segon = calL.get(Calendar.SECOND);
//        System.out.printf("Hora Actual : %d:%d:%d%n", Hour, minut, segon);
//        
//        System.out.printf("Hora de inicio  %d:%02d:%02d%n",horaa, minuto, segundo);
//        
//        int segIni = horaa * 60 * 60 + minuto * 60 + segundo;
//        int segAct = Hour * 60 * 60 + minut * 60 + segon;
//        int segFin = segAct - segIni;
//        int Hfin = segFin /3600;
//        int Mfin = (segFin % 3600) / 60;
//        int Sfin = (segFin /3600) % 60;
//        System.out.printf("Tiempo de clase %d:%d:%d%n",Hfin, Mfin, Sfin);
//5 - DistanciaHoraAleatoria
        System.out.println("distanci entre horas");
        System.out.println("======================");
        GregorianCalendar cale = new GregorianCalendar();
        int hAL = cale.get(Calendar.HOUR_OF_DAY);
        int mAL = cale.get(Calendar.MINUTE);
        int sAL = cale.get(Calendar.SECOND);

        System.out.printf("Hora actual : %d:%d:%d%n", hAL, mAL, sAL);

        int HoIn;
        HoIn = RND.nextInt(hAL + 1);
        int MiIn;
        MiIn = RND.nextInt(mAL + 1);
        int SeIn;
        SeIn = RND.nextInt(sAL + 1);
        System.out.printf("Hora inicio : %d:%d:%d%n", HoIn, MiIn, SeIn);
        int segIni = HoIn * 60 * 60 + MiIn * 60 + SeIn;
        int segAct = hAL * 60 * 60 + mAL * 60 + sAL;
        int segFin = segAct - segIni;
        int hFin = segFin / 3600;
        int mFin = (segFin % 3600) / 60;
        int sFin = (segFin % 3600) % 60;
        System.out.printf("Tiempo clase : %02d:%02d:%02d%n ", hFin, mFin, sFin);

//       6º EJERCICIOS
//1 - DadoParchis
        final int TIR_MAX = 6;
        final int TIR_MIN = 1;
        int tirada;
        tirada = RND.nextInt(TIR_MAX - TIR_MIN + 1) + TIR_MIN;
        System.out.printf("Tirada dado : %d%n", tirada);

//2 - NumeroPrimitiva
//int numeroPri;
//        System.out.printf("introduce tu numero favorito : ");
//        numeroPri = SCN.nextInt();
//        System.out.printf("Numero Primitiva : %d%n", numeroPri);
//3 - AreaTriangulo
//        double baTri;
//        double alTri;
//
//        System.out.print("introduce la base del triangulo : ");
//        baTri = SCN.nextDouble();
//        System.out.print("introduce la altura del triangulo : ");
//        alTri = SCN.nextDouble();
//        double areaTri = baTri * alTri / 2;
//        System.out.printf(Locale.ENGLISH, "Area del triangulo : %.2f%n", areaTri);
//4 - CaminoEstudio
//double despDia;
//int dist = 980;
//        System.out.print("Introduce tu desplazamiento diario : ");
//        despDia = SCN.nextInt();
//        double diasClaseCam = dist / despDia;
//        System.out.printf("Dias de clase/camino : %.2f%n",diasClaseCam);
        
//5 - PagoCompartido 

double impCena;
int personas;
        System.out.print("Introduce el precio de la cena :");
        impCena = SCN.nextDouble();
        System.out.print("Introduce cuanta gente ha ido :");
        personas = SCN.nextInt();
      double pagoCena = impCena / personas;
        System.out.printf("Pago por persona : %.2f%n", pagoCena);
      
    }

}

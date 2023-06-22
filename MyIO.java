import java.io.*;
import java.nio.charset.*;

class MyIO {

   private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in, Charset.forName("ISO-8859-1")));
   private static String charset = "ISO-8859-1";

   public static void setCharset(String charset_){
      charset = charset_;
      in = new BufferedReader(new InputStreamReader(System.in, Charset.forName(charset)));
   }

   public static void print(){
   }

   public static void print(int x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }
   
   public static void print(float x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }
   
   public static void print(double x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void print(String x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void print(boolean x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void print(char x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(){
   }

   public static void println(int x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(float x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }
   
   public static void println(double x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(String x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(boolean x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(char x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void printf(String formato, double x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.printf(formato, x);// "%.2f"
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static double readDouble(){
      double d = -1;
      try{
         d = Double.parseDouble(readString().trim().replace(",","."));
      }catch(Exception e){}
      return d;
   }

   public static double readDouble(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readDouble();
   }

   public static float readFloat(){
      return (float) readDouble();
   }

   public static float readFloat(String str){
      return (float) readDouble(str);
   }

   public static int readInt(){
      int i = -1;
      try{
         i = Integer.parseInt(readString().trim());
      }catch(Exception e){}
      return i;
   }

   public static int readInt(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readInt();
   }

   public static String readString(){
      String s = "";
      char tmp;
      try{
         do{
            tmp = (char)in.read();
            if(tmp != '\n' && tmp != ' ' && tmp != 13){
               s += tmp;
            }
         }while(tmp != '\n' && tmp != ' ');
      }catch(IOException ioe){
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readString(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readString();
   }

   public static String readLine(){
      String s = "";
      char tmp;
      try{
         do{
            tmp = (char)in.read();
            if(tmp != '\n' && tmp != 13){
               s += tmp;
            }
         }while(tmp != '\n');
      }catch(IOException ioe){
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readLine(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readLine();
   }

   public static char readChar(){
      char resp = ' ';
      try{
         resp  = (char)in.read();
      }catch(Exception e){}
      return resp;
   }

   public static char readChar(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readChar();
   }

   public static boolean readBoolean(){
      boolean resp = false;
      String str = "";

      try{
         str = readString();
      }catch(Exception e){}

      if(str.equals("true") || str.equals("TRUE") || str.equals("t") || str.equals("1") || 
            str.equals("verdadeiro") || str.equals("VERDADEIRO") || str.equals("V")){
         resp = true;
            }

      return resp;
   }

   public static boolean readBoolean(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readBoolean();
   }

   public static void pause(){
      try{
         in.read();
      }catch(Exception e){}
   }

   public static void pause(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      pause();
   }
}

/*
 ACAMPAMENTO DE FERIAS
 
 import java.util.*;

class Cria{
    public String nome;
    public int valor;
    Cria(String nome, int valor){
        this.nome = nome;
        this.valor = valor;
    }

}


public class AcampamentoFerias {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cria[] c;
        int N = sc.nextInt();
        while(N != 0){
            c = new Cria[N];
            String a = sc.next();
            int b = sc.nextInt();
            c[0] = new Cria(a,b);
            for(int i = N-1; i > 0;i--){
                a = sc.next();
                b = sc.nextInt();
                c[i] = new Cria(a,b);
            }
            
            int quant = N;
            int count = c[0].valor+1;
            int pessoa = 1;
            if(N == 3){

                while(quant != 1){
                    
                    if(c[pessoa] != null){
                        if(count == c[pessoa].valor){
                            if(c[pessoa].valor%2 == 1){
                            count = c[pessoa].valor+1;
                        }else{
                            count = c[pessoa].valor-1;
                        }
                        c[pessoa] = null;
                        quant--;
                    }else if(c[pessoa].valor % 2 == 1){
                        count++;
                    }else{
                        count--;
                    }
                }
                pessoa = ++pessoa%N;
                
            }
            for(int i = 0; i < N;i++){
                if(c[i] != null)
                System.out.println("Vencedor(a): "+ c[i].nome);
            }
        }else if(N == 5){
            System.out.println("Vencedor(a): "+ c[N-1].nome);
        }
        N = sc.nextInt();
        }

    }
}

 
PAO DE QUEIJO

import java.util.*;

class PaodeQueijo{


    public static int retorno(int matriz[][], int linha, int coluna){
        int l = matriz.length-1;
        int c = matriz[linha].length-1;
        int p = 0;
        if(linha > 0 && matriz[linha-1][coluna] == 1) p++;
        if(linha < l && matriz[linha+1][coluna] == 1) p++;
        if(coluna > 0 && matriz[linha][coluna-1] == 1) p++;
        if(coluna < c && matriz[linha][coluna+1] == 1) p++;
        return p;

    }
    public static void main(String args[]){
        Scanner leitura = new Scanner(System.in);
        //String linhacoluna = leitura.nextLine();
        
        
        while(leitura.hasNextLine()){

            int n = leitura.nextInt();
            int m = leitura.nextInt();
            
            int matriz[][] = new int[n][m];
            for(int i = 0; i<n;i++){
                for(int j = 0; j<m;j++){
                    matriz[i][j] = leitura.nextInt();
                    
                }
            }

            for(int i = 0; i<n;i++){
                for(int j = 0; j<m;j++){
                    if(matriz[i][j] == 1){
                        System.out.print("9");
                    }else{
                        System.out.print(retorno(matriz,i,j));
                    }
                    
                }
                System.out.println();
            }
        
        }

    }
}

SUDOKU

import java.util.*;
public class Sudoku {
    public static boolean verificacao(int vet[]){
        boolean Torf = false;
        for(int i = 0; i < vet.length;i++){
            if(vet[i] > 1)
                Torf = true;
        }
        return Torf;
    }

    public static boolean comparalinha(int m[][]){
        int vet[] = new int[9];

        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(m[j][i] == 1){
                    vet[0]++;
                }else if(m[j][i] == 2){
                    vet[1]++;
                }else if(m[j][i] == 3){
                    vet[2]++;
                }else if(m[j][i] == 4){
                    vet[3]++;
                }else if(m[j][i] == 5){
                    vet[4]++;
                }else if(m[j][i] == 6){
                    vet[5]++;
                }else if(m[j][i] == 7){
                    vet[6]++;
                }else if(m[j][i] == 8){
                    vet[7]++;
                }else if(m[j][i] == 9){
                    vet[8]++;
                }   
            }
           
            if(verificacao(vet))
            return false;
            
            for(int k = 0; k < 9;k++)
            vet[k] = 0;
            
        }
        
        int vet2[] = new int[9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(m[i][j] == 1){
                    vet2[0]++;
                }else if(m[i][j] == 2){
                    vet2[1]++;
                }else if(m[i][j] == 3){
                    vet2[2]++;
                }else if(m[i][j] == 4){
                    vet2[3]++;
                }else if(m[i][j] == 5){
                    vet2[4]++;
                }else if(m[i][j] == 6){
                    vet2[5]++;
                }else if(m[i][j] == 7){
                    vet2[6]++;
                }else if(m[i][j] == 8){
                    vet2[7]++;
                }else if(m[i][j] == 9){
                    vet2[8]++;
                }   
            }
            if(verificacao(vet2)){
                return false;
            }
            for(int k = 0; k < 9;k++)
                vet2[k] = 0;
            
        }

        return true;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[9][9];
        int quant = sc.nextInt();
        for(int l = 0; l < quant;l++){

            for(int i = 0; i < 9;i++){
                for(int j = 0; j < 9;j++){
                    matriz[i][j] = sc.nextInt();

                }
            }
            System.out.println("Instancia "+(l+1));
            if(comparalinha(matriz))
                System.out.println("SIM");
            else
                System.out.println("NAO");
            System.out.println();    
        }
    }
}

INFIXAPOSFIXA

import java.util.*;


import javax.swing.event.SwingPropertyChangeSupport;
class infixaposfixa{

    public static String remover(String a){
        String b = "";
        for(int i = 0; i< a.length();i++){
            if(a.charAt(i) != '(' && a.charAt(i) != ')')
                b+=a.charAt(i);
            
        }
        return b;
    }

    public static int quantBarras(String a){
        int resp = 0;
        for(int i = 0; i < a.length();i++){
            if(a.charAt(i) == '/')
                resp++;
        }
        return resp;
    }


    public static String resposta(String a){
        String resposta = "";
        int barras = 0;
        for(int i = 0; i < a.length();i++){
            if(barras > 0 && i == a.length()-1){
                resposta+='/';
            }
            if(i < a.length()-1 && barras > 0 && a.charAt(i+1) == ')'){
                barras--;
                resposta+=a.charAt(i);
                resposta+='/';
            }
            else if(a.charAt(i) == '/'){
                barras++;
            }else if(a.charAt(i) == '*' || a.charAt(i) == '-' || a.charAt(i) == '+'){
                resposta+=a.charAt(i+1);
                resposta+=a.charAt(i);
                i++;
            }else{
                resposta+=a.charAt(i);
            }

            
            
        }
        resposta = remover(respsota);
        return resposta;
    }
        
    public static void main (String args[]){
        Scanner leitura = new Scanner(System.in);
        int N = Integer.parseInt(leitura.nextLine());
        for(int i = 0; i<N;i++){   
            String a = leitura.nextLine();
            System.out.println(resposta(a));
        }
        
    }
}

CULTIVAR

import java.util.Scanner;

class Cultivar{

    static int printar = 0;
    public static int retorno(String[] args){
        int count = 0;
        String a,b;
        for(int i = 0; i < (args.length-1);i++){
            boolean resp = true;
            a = args[i];
            b = args[i+1];
            for(int j = 0; j < b.length();j++){
                if(a.charAt(0) == b.charAt(j) && a.length() < b.length()){
                    for(int k = 1; k < a.length();k++){
                        if((j+k) < b.length() && a.charAt(k) != b.charAt(j+k)){
                            resp = false;
                            k = a.length();
                            j = b.length();
                        }
                    }
                }
            }
            if(resp == true){
                count++;
            }
        }
        return --count;
    }

    public static void main(String[] args){
        int tam = 1;
        Scanner sc = new Scanner(System.in);
        while(tam != 0){
            tam = Integer.parseInt(sc.nextLine());
            String[] vetString = new String[tam];
            for(int i = 0; i < tam; i++){
                vetString[i] = sc.nextLine();
            }
            System.out.println(retorno(vetString));

        }
        sc.close();
        
    }
}

BINGO

import java.util.Scanner;



public class Bingo {
    public static String resposta(String vet[], String vet2[], int K, int quant){
        String resp = "";
        int contador = 0;
        for(int i = 0;i < vet.length;i++){
            for(int j = 0; j < quant;j++){
                if(vet[i].contains(vet2[j]))
                    contador++;
                if(contador == K){
                    resp += (i+1);
                    resp += " ";
                }
            }
            contador = 0;
        }
        return resp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String aux[] = line.split(" ");
        int N = Integer.parseInt(aux[0]);
        int K = Integer.parseInt(aux[1]);
        int U = Integer.parseInt(aux[2]);
        String[] vet = new String[N];
        
        for(int i = 0; i < N; i++)
            vet[i] = sc.nextLine();   
            
        
        String aux2 = sc.nextLine();
        String vet2[] = aux2.split(" ");
        String resp = "";
        int aux3 = K;
        while(resp.length() == 0){
            resp = resposta(vet,vet2,K,aux3++);
            
        }
        System.out.println(resp);

        
        
        
    }
}

FANTASTICO JASPION



import java.util.Scanner;

class Traduzir{
    public String palavra;
    public String traducao;
    Traduzir(String a, String b){
        palavra = a;
        traducao = b;
    }

}
public class FantasticoJaspion {


    public static String getTrad(Traduzir[] a, String b){
        String o = "";
        if(b.indexOf(" ") == -1){
            for(int i = 0; i <a.length;i++){
                if(b.compareTo(a[i].palavra) == 0){
                    o = a[i].traducao;
                    i = a.length;
                }
            }
        
            }else{
                String[] aux = b.split(" ");
                
                for(int k = 0; k < aux.length;k++){
                    for(int j = 0; j < a.length;j++){
                        if(a[j].palavra.compareTo(aux[k]) == 0){
                            o+=a[j].traducao;
                            o+= " ";
                            j = a.length;
                        }

                    }
                }
            }
            return o;
        }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 
        for(int i = 0; i < T;i++){
            int M = sc.nextInt(); 
            int N = sc.nextInt();
            Traduzir[] trad = new Traduzir[M];
            for(int j = 0; j < M; j++){
                String a = sc.next();
                String b = sc.nextLine();
                b = sc.nextLine();
                trad[j] = new Traduzir(a,b);
            }

            for(int j = 0; j < N; j++){
                String a = sc.nextLine();
                
                System.out.println(a);
                String aux = getTrad(trad,a);
                if(aux.charAt(0) == 'o'){
                    System.out.println(aux);
                }else{

                    System.out.println("o " + getTrad(trad,a));
                }
            }
        }

    
    }
}

TRILHOS

import java.util.Scanner;

public class Trilhos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N != 0){
            
            int[] vet = new int[N];
            vet[0] = sc.nextInt();
            if(vet[0] != 0){
                for(int i = 1;i < N;i++){
                    vet[i] = sc.nextInt();
                }
                if(vet[0] == 1){
                    if(vet[N-1] == N){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }else if(vet[0] == N){
                    if(vet[N-1] == 1){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }
            }else{
                System.out.println();
                N = sc.nextInt();
            }
        }
    }
}

HALL ASSASSINO (NAO FUNCONANDO)

import java.util.*;

public class HallAssassin {

    public static String cloneString(String a){
        String b= new String(a);
        return b;
    }

    public static int getKills(String[] a, String b){
        int cont = 0;
        for(int i = 0; i <a.length;i++){
            if(a[i] != null){
                if(a[i].compareTo(b)==0){
                    cont++;
                } 
            }
        }
        return cont;
    }

    public static boolean isPresente(String[] a, String b){
        boolean resp = true;
        for(int i = 0; i < a.length;i++){
            if(a[i] != null){
               if(a[i].compareTo(b) == 0){
                 resp = false;
                 i = 60;
               }
            }
        }
        return resp;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String aux = "";
        String[] vetaux;
        String[] matou  = new String[10];
        String[] morreu = new String[10];
        int u = 0;
        while(u < 6){
            aux = sc.nextLine();
            vetaux = aux.split(" ");
            for(int i = 0; i<10;i++){
                if(matou[i] == null)
                    matou[i] = cloneString(vetaux[0]);
            }
            for(int i = 0; i<10;i++){
                if(morreu[i] == null)
                    morreu[i] = cloneString(vetaux[1]);
            }
            u++;
        }
        System.out.println("HALL OF MURDERES");
        for(int i = 0; i < 10;i++){
            if(isPresente(morreu,matou[i])){
                System.out.println(matou[i]+ " "+ getKills(matou, matou[i]));
            }

        }

    }   
}



 */
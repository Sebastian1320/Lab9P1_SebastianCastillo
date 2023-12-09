/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_SebastianCastillo;//Se intento abrazos

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Asus
 */
public class Gusanito {

    static Random random = new Random();
    private char[][] tablero;
    int ancho;
    int alto;
    int xs = 0;
    int ys = 0;
    int xa = 0;
    int ya = 0;
    int cant=0;
    String op=" ";
    int move=0;
    ArrayList<String>Cadena;
    
    public char[][] tablero() {
        tablero = new char[alto][ancho];
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                    tablero[i][j] = ' ';
            }
            System.out.println();
        }
        if(xs==xa){
            xa=random.nextInt(alto);
        }
        tablero[xs][ys]='S';
        tablero[xa][ya]='O';
        for(int i=0;i<cant;i++){
            int xo=random.nextInt(alto);
            int yo=random.nextInt(ancho);
            if (tablero[xo][yo]!='S'&&tablero[xo][yo]!='O'){
                tablero[xo][yo]='#';
            }
        }
         if(op.substring(1, op.length()).equals("UP")&& tablero[xs][ys]==' '){
            xs-=move;
            tablero[xs][ys]='S';
        }else if(op.substring(1, op.length()).equals("DN")&& tablero[xs][ys]==' '){
            xs+=move;
            tablero[xs][ys]='S';
        }else if(op.substring(1, op.length()).equals("RT")&& tablero[xs][ys]==' '){
            ys-=move;
            tablero[xs][ys]='S';
        }else if(op.substring(1, op.length()).equals("LT")&& tablero[xs][ys]==' '){
            ys+=move;
            tablero[xs][ys]='S';
        }
       return tablero;
    }

    public Gusanito(int ancho, int alto,String Op) {
        this.ancho = ancho;
        this.alto = alto;
        this.xs = random.nextInt(alto);
        this.ys = random.nextInt(ancho);
        this.xa = random.nextInt(alto);
        this.ya = random.nextInt(ancho);
        if(Op!=null){
        this.op=Op;
        this.move=Integer.parseInt(Op.substring(0, Op.length()-2));
        }
        if(alto>ancho){
        this.cant=random.nextInt((alto-ancho)+1)+ancho;
        }else{
            this.cant=random.nextInt((ancho-alto)+1)+alto;
        }

    }

    public String imprimir(char[][] matriz) {
        String Matriz = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Matriz += "[" + matriz[i][j] + "]";
            }
            Matriz = Matriz + "\n";
        }
        return Matriz;
    }
}

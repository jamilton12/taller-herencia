package com.mycompany.taller.herencia.Fichas;

import com.mycompany.taller.herencia.Tablero;

public class Caballo extends Fichas{
    
    public Caballo(Tablero tablero, String nombre, boolean esBlanca, int posX, int posY) {
        super(tablero);
        this.nombre = nombre;
        this.esBlanca = esBlanca;
        this.posX = posX;
        this.posY = posY;
    }
   
    public void moverFicha(int posX, int posY) {
        if ((posY == this.posY + 2 && this.posY + 2 >= 8 )||
            (posY == this.posY - 2 && this.posY - 2 <= 0 )||  
            (posX == this.posX + 1 && this.posX + 1 >= 8 )||
            (posX == this.posX + 1 && this.posX + 1 <= 0 )) {
            System.out.println("Movimiento no posible");
            return; 
        }
        
        if ((posY == this.posY + 2 && posX == this.posX + 1 ) || 
            (posY == this.posY - 2 && posX == this.posX - 1)) {
            System.out.println("movimiento realizado");
            this.posX = posX;
            this.posY = posY;
        }else  {
            System.out.println("Movimiento no posible");
        }
    }
}

package com.mycompany.taller.herencia.Fichas;

import com.mycompany.taller.herencia.Tablero;

public class Alfil extends Fichas{
    
    public Alfil(Tablero tablero, String nombre, boolean esBlanca, int posX, int posY) {
        super(tablero);
        this.esBlanca = esBlanca;
        this.posX = posX;
        this.posY = posY;
        this.nombre = nombre;
    }
    
    public void moverFicha(int posX, int posY) {
        for (int i = 0; i < this.tablero.tablero.length; i++) {
            for (int j = 0; j < this.tablero.tablero[0].length; j++) {
                
            } 
        }
    }
}

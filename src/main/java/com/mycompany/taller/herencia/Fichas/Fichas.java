package com.mycompany.taller.herencia.Fichas;

import com.mycompany.taller.herencia.Tablero;

public class Fichas {
    protected String nombre;
    protected int posX;
    protected int posY;
    protected boolean esBlanca;
    Tablero tablero;
    
    public Fichas(Tablero tablero) {
        this.tablero = tablero;
    }
    
    public void mostrarFicha() {
        System.out.println(nombre);
        System.out.println( "Posicion en X " + posX + ", posicion en Y" + posY);
        System.out.println( esBlanca);
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public boolean isEsBlanca() {
        return esBlanca;
    }

    public void setEsBlanca(boolean esBlanca) {
        this.esBlanca = esBlanca;
    }
    
}

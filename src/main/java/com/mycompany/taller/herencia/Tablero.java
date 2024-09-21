package com.mycompany.taller.herencia;

import com.mycompany.taller.herencia.Fichas.Fichas;
import java.util.ArrayList;

public class Tablero {
    
    public ArrayList<Fichas> fichas;
    public Fichas[][] tablero;
    
    public Tablero() {
        this.tablero = new Fichas[8][8];
    }
    
    public void crearTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                for (Fichas ficha : fichas) {
                    if (ficha.getPosX() == j && ficha.getPosY() == i) {
                        tablero[i][j] = ficha;
                    }
                }
            }
        }
    }

    public ArrayList<Fichas> getFichas() {
        return fichas;
    }

    public void setFichas(ArrayList<Fichas> fichas) {
        this.fichas = fichas;
    }

    public Fichas[][] getTablero() {
        return tablero;
    }

    public void setTablero(Fichas[][] tablero) {
        this.tablero = tablero;
    }
    
}

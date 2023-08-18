package models;

public class Modelo {

    private int numero_uno;
    private int numero_dos;
    private int resultado;

    public int getNumero_uno() {
        return numero_uno;
    }

    public void setNumero_uno(int numero_uno) {
        this.numero_uno = numero_uno;
    }

    public int getNumero_dos() {
        return numero_dos;
    }

    public void setNumero_dos(int numero_dos) {
        this.numero_dos = numero_dos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int sumar() {
        this.resultado = this.numero_uno + this.numero_dos;

        return this.resultado;
    }

    public int restar() {
        this.resultado = this.numero_uno - this.numero_dos;

        return this.resultado;
    }

}

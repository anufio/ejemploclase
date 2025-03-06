package service;
import lombok.Data;

@Data
public class Fecha {
    private int dia;
    private int mes;
    private int anyo;


    @Override
    public String toString() {
        return "Fecha{"+dia+"/"+mes+"/"+anyo+"}";
    }

    public Fecha(int dia, int mes, int anyo) {
        setDia( dia );
        setMes( mes );
        setAnyo( anyo );
    }

    public Fecha() {



    } //sobrecarga de métodos, colocar 2 o mas métodos con el mismo nombre. la diferenica es lo q contienen los parametroa


}

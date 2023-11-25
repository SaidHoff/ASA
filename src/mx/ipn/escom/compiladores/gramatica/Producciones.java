package mx.ipn.escom.compiladores.gramatica;

import mx.ipn.escom.compiladores.NoTerminales;
import mx.ipn.escom.compiladores.TipoToken;

import java.util.ArrayList;

public class Producciones {

    public static Object parteIzquierda(int i){
        switch (i){
            case 0: return NoTerminales.Q;
            case 1,2: return NoTerminales.D;
            case 3,4: return NoTerminales.P;
            case 5,6: return NoTerminales.A;
            case 7 : return NoTerminales.A1;
            case 8,9 : return NoTerminales.A2;
            case 10,11: return NoTerminales.T;
            case 12: return NoTerminales.T1;
            case 13,14: return NoTerminales.T2;
            default:
                System.err.println("Error: No se encontro la gramatica");
                System.exit(1);
        }
        return null;
    }
    public static ArrayList<Object> parteDerecha(int i){
        ArrayList<Object> produccion = new ArrayList<>();

        switch (i){
            case 0:
                produccion.add(NoTerminales.T);
                produccion.add(TipoToken.FROM);
                produccion.add(NoTerminales.D);
                produccion.add(TipoToken.SELECT);
                break;
            case 1:
                produccion.add(NoTerminales.P);
                produccion.add(TipoToken.DISTINCT);
                break;
            case 2:
                produccion.add(NoTerminales.P);
                break;
            case 3:
                produccion.add(TipoToken.ASTERISCO);
                break;
            case 4:
                produccion.add(NoTerminales.A);
                break;
            case 5:
                produccion.add(NoTerminales.A1);
                produccion.add(TipoToken.COMA);
                produccion.add(NoTerminales.A);
                break;
            case 6:
                produccion.add(NoTerminales.A1);
                break;
            case 7:
                produccion.add(NoTerminales.A2);
                produccion.add(TipoToken.IDENTIFICADOR);
                break;
            case 8:
                produccion.add(TipoToken.IDENTIFICADOR);
                produccion.add(TipoToken.PUNTO);
                break;

            case 10:
                produccion.add(NoTerminales.T1);
                produccion.add(TipoToken.COMA);
                produccion.add(NoTerminales.T);
                break;
            case 11:
                produccion.add(NoTerminales.T1);
                break;
            case 12:
                produccion.add(NoTerminales.T2);
                produccion.add(TipoToken.IDENTIFICADOR);
                break;

            case 13:
                produccion.add(TipoToken.IDENTIFICADOR);
                break;

            case 9,14: break;
            default:
                System.err.println("Error: No se enconcontro la gramatica");
                System.exit(1);
                break;
        }
        return produccion;
    }
}
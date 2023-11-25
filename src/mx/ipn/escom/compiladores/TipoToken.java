package mx.ipn.escom.compiladores;

public enum TipoToken {
    // Crear un tipoToken por palabra reservada
    // Crear un tipoToken: identificador, una cadena y numero
    // Crear un tipoToken por cada "Signo del lenguaje" (ver clase Scanner)

    // Palabras clave:
    SELECT, FROM, DISTINCT,

    // identificador, cadena y numero
    IDENTIFICADOR,

    //Simbolos del lenguaje
    ASTERISCO, COMA, PUNTO,

    // Final de cadena
    EOF
}



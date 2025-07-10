package com.alura.LiterAlura.principal;

import com.alura.LiterAlura.model.Autor;
import com.alura.LiterAlura.model.DatosLibro;
import com.alura.LiterAlura.model.DatosResultado;
import com.alura.LiterAlura.model.Libro;
import com.alura.LiterAlura.service.ConsumoAPI;
import com.alura.LiterAlura.service.ConvierteDatos;
import com.alura.LiterAlura.service.ConvierteJson;

import java.util.Optional;

public class Principal {

    private String URL = "https://gutendex.com/books/?search=";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversorDatos = new ConvierteDatos();

    public Principal() {
    }

    public void getLibro() {
        var json = consumoAPI.obtenerDatos(URL + "pride");
        System.out.println(json);

        DatosResultado datosResultado = conversorDatos.obtenerDatos(json,DatosResultado.class);
        if (datosResultado.cuenta() != 0) {
            DatosLibro primerLibro = datosResultado.resultado().get(0);
            Autor autor = new Autor(primerLibro.autor().get(0));
            Libro libro = new Libro(primerLibro);
            System.out.println(datosResultado);
            System.out.println(primerLibro);
            System.out.println(libro);
        } else {
            System.out.println("Libro no encontrado");
        }

    }


}

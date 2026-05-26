package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTest {

    private Categoria categoria;

    @BeforeEach
    public void setUp() {

        categoria = new Categoria(
                1,
                "Poemas",
                "Genero"
        );
    }

    @Test
    public void testCategoriaConstructorAndGetters() {

        assertAll("Pruebas unitarias constructor Categoria",

                () -> assertEquals(1, categoria.getIdCategoria()),
                () -> assertEquals("Poemas", categoria.getNombreCategoria()),
                () -> assertEquals("Genero", categoria.getDescripcion())

        );

        System.out.println(categoria.toString());
    }

    @Test
    public void testCategoriaSetter() {

        categoria.setIdCategoria(2);
        categoria.setNombreCategoria("k-drama");
        categoria.setDescripcion("Libros Romance");

        assertAll("Pruebas unitarias setter Categoria",

                () -> assertEquals(2, categoria.getIdCategoria()),
                () -> assertEquals("k-drama", categoria.getNombreCategoria()),
                () -> assertEquals("Libros Romance", categoria.getDescripcion())

        );

        System.out.println(categoria.toString());
    }

    @Test
    public void testCategoriaToString() {

        String str = categoria.toString();

        assertAll("Pruebas unitarias toString",

                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Poemas")),
                () -> assertTrue(str.contains("Genero"))

        );
    }
}

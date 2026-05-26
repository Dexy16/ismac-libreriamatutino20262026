package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {


    private Autor autor;

    @BeforeEach
    public void setUp() {

        autor = new Autor(
                1,
                "Andres Jacome Nuñez",
                "Lojano"
        );
    }

    @Test
    public void testAutorConstructorAndGetters() {

        assertAll("Pruebas unitarias constructor Autor",

                () -> assertEquals(1, autor.getIdAutor()),
                () -> assertEquals("Andres Jacome Nuñez", autor.getNombre()),
                () -> assertEquals("Lojano", autor.getNacionalidad())

        );

        System.out.println(autor.toString());
    }

    @Test
    public void testAutorSetter() {

        autor.setIdAutor(2);
        autor.setNombre(" Maria Juana Fernandez");
        autor.setNacionalidad("Alemania");

        assertAll("Pruebas unitarias setter Autor",

                () -> assertEquals(2, autor.getIdAutor()),
                () -> assertEquals("Maria Juana Fernandez", autor.getNombre()),
                () -> assertEquals("Alemania", autor.getNacionalidad())

        );

        System.out.println(autor.toString());
    }

    @Test
    public void testAutorToString() {

        String str = autor.toString();

        assertAll("Pruebas unitarias toString",

                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Andres Jacome Nuñez")),
                () -> assertTrue(str.contains("Lojano"))

        );
    }
}



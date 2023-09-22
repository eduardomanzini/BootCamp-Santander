package com.example.aulajunit;

import entidade.Pessoa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {

    @Test
    void validarSeArraysSaoIguais() {

        /* Valida se os arrays são iguais, comparando um a um */
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};
        assertArrayEquals(primeiroLancamento, segundoLancamento);

        /* Utilizando arrays de diferentes tipos, começando por boolean[] */
        boolean[] flags = {true, false, false};
        assertArrayEquals(new boolean[]{true, false, false}, flags);

        /* Utilizando arrays de diferentes tipos, começando por double[] */
        double[] valores = {5.0, 10.5, 50D, 46d};
        assertArrayEquals(new double[]{5.0, 10.5, 50D, 46d}, valores);
    }

    @Test
    void validarSeObjetoEstaNuloOuNao() {

        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {

        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }


}

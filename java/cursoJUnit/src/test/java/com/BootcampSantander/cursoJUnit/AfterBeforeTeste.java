package com.BootcampSantander.cursoJUnit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class AfterBeforeTeste {

  /* Para @BeforeAll e @AfterAll
     Executa sempre antes e depois da execução de todos @Test
  */
  @BeforeAll
  static void configuraConexao() {
    GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
  }

  /* Para @BeforeEach e @AfterEach
     Executa a cada execução de um @Test
   */
  @BeforeEach
  void insereDadosParaTeste() {
    GerenciadorDeConexaoComBancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
  }

  @AfterEach
  void removeDadosDoTeste() {
    GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
  }

  @Test
  void validarDadosDeRetorno() {
    Assertions.assertTrue(true);
  }

  @Test
  void validarDadosDeRetorno2() {
    Assertions.assertNull(null);
  }

  @AfterAll
  static void finalizarConexao() {
    GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
  }
}

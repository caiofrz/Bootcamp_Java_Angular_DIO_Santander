package com.BootcampSantander.cursoJUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTeste {

  @Test
  void validarCenarioDeExcecaoNaTransferencia() {
    Conta contaOrigem = new Conta("123456", 01);
    Conta contaDestino = new Conta("456548", 100);

    TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

//  Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 0));
    Assertions.assertThrows( IllegalArgumentException.class, () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 0));

  }
}

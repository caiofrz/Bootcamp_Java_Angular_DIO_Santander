package com.BootcampSantander.cursoJUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

  @Test
  void validarAlgoSomenteNoUsuarioWillyan() {
    Assumptions.assumeFalse("root".equals(System.getenv("caioferraz27")));
    Assertions.assertEquals(10, 5 + 5);
  }
}

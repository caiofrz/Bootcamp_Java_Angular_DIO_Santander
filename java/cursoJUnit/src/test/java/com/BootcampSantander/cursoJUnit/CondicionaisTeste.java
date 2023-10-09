package com.BootcampSantander.cursoJUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {
  @Test
//  @EnabledOnJre(JAVA_17)
//  @EnabledForJreRange(min = JAVA_11, max = JAVA_17)
//  @EnabledIfEnvironmentVariable(named = "USER", matches = "caioferraz27")
  @EnabledOnOs(OS.WINDOWS)
  void validarAlgoSomenteNoUsuarioWillyan() {
    Assertions.assertEquals(10, 5 + 5);
  }
}

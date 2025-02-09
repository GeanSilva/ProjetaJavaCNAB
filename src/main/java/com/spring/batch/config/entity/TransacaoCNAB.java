package com.spring.batch.config.entity;

import java.math.BigDecimal;

public record TransacaoCNAB(
        Integer tipo,
        String data,
        BigDecimal valor,
        Long cpf,
        String hora,
        String donoDaLoja,
        String nomeDaLoja) {
}

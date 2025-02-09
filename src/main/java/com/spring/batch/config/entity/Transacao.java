package com.spring.batch.config.entity;

import java.math.BigDecimal;
import java.sql.Date;

public record Transacao(
        Integer tipo,
        Date data,
        BigDecimal valor,
        Long cpf,
        String hora,
        String donoDaLoja,
        String nomeDaLoja) {
}

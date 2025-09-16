package br.com.anti.fraude.service.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record Transacao(UUID transacaoId, Long clienteId, BigDecimal valor, LocalDateTime ocorridaEm,Canal canal,Local local) {

    public boolean valorMuitoAlto() {
        return this.valor.compareTo(new BigDecimal("10000")) > 0;
    }
}

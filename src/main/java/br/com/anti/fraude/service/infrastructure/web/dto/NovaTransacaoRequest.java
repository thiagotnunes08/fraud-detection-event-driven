package br.com.anti.fraude.service.infrastructure.web.dto;

import br.com.anti.fraude.service.domain.Canal;
import br.com.anti.fraude.service.domain.Local;

import java.math.BigDecimal;
import java.util.UUID;

public record NovaTransacaoRequest(UUID idTransacao, Long idCliente, BigDecimal valor, Canal canal, Local local) {
}

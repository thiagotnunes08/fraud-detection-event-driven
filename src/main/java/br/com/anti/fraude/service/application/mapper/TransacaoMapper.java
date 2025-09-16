package br.com.anti.fraude.service.application.mapper;

import br.com.anti.fraude.service.domain.Transacao;
import br.com.anti.fraude.service.infrastructure.web.dto.NovaTransacaoRequest;

import java.time.LocalDateTime;

public class TransacaoMapper {

    public static Transacao requestToDomain(NovaTransacaoRequest request) {
        return new Transacao(
                request.idTransacao(),
                request.idCliente(),
                request.valor(),
                LocalDateTime.now(),
                request.canal(),
                request.local()
        );
    }
}

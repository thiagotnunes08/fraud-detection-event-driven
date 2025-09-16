package br.com.anti.fraude.service.application.mapper;

import br.com.anti.fraude.service.domain.Transacao;
import br.com.anti.fraude.service.infrastructure.persistence.TransacaoMongo;

public class TransacaoPersistenceMapper {

    public static TransacaoMongo domainToDocument(Transacao transacao) {
        return new TransacaoMongo(
                transacao.transacaoId().toString(),
                transacao.clienteId(),
                transacao.valor(),
                transacao.ocorridaEm(),
                transacao.canal(),
                transacao.local()
        );
    }
}

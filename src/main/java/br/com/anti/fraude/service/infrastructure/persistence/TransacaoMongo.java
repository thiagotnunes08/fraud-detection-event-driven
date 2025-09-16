package br.com.anti.fraude.service.infrastructure.persistence;

import br.com.anti.fraude.service.domain.Canal;
import br.com.anti.fraude.service.domain.Local;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document(collection = "transacoes")
public class TransacaoMongo {

    private String transacaoId;
    private Long clienteId;
    private BigDecimal valor;
    private LocalDateTime ocorridaEm;
    private Canal canal;
    private Local local;

    public TransacaoMongo(String transacaoId, Long clienteId, BigDecimal valor, LocalDateTime ocorridaEm, Canal canal, Local local) {
        this.transacaoId = transacaoId;
        this.clienteId = clienteId;
        this.valor = valor;
        this.ocorridaEm = ocorridaEm;
        this.canal = canal;
        this.local = local;
    }
}

package br.com.anti.fraude.service.infrastructure.persistence;

import br.com.anti.fraude.service.adpater.out.TransacaoRepository;
import br.com.anti.fraude.service.domain.Transacao;

import static br.com.anti.fraude.service.application.mapper.TransacaoPersistenceMapper.domainToDocument;

public class TransacaoRepositoryMongoAdapter implements TransacaoRepository {

    private final TransacaoRepositoryMongo mongoRepository;

    public TransacaoRepositoryMongoAdapter(TransacaoRepositoryMongo mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @Override
    public void criaTransacao(Transacao transacao) {

        mongoRepository.save(domainToDocument(transacao));
    }
}

package br.com.anti.fraude.service.infrastructure.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransacaoRepositoryMongo extends MongoRepository<TransacaoMongo,String> {
}

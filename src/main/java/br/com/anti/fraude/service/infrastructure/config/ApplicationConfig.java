package br.com.anti.fraude.service.infrastructure.config;

import br.com.anti.fraude.service.adpater.in.TransacaoService;
import br.com.anti.fraude.service.adpater.out.TransacaoRepository;
import br.com.anti.fraude.service.application.service.TransacaoServiceImpl;
import br.com.anti.fraude.service.infrastructure.persistence.TransacaoRepositoryMongo;
import br.com.anti.fraude.service.infrastructure.persistence.TransacaoRepositoryMongoAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TransacaoService transacaoService(TransacaoRepository transacaoRepository) {
        return new TransacaoServiceImpl(transacaoRepository);
    }

    @Bean
    public TransacaoRepositoryMongoAdapter transacaoRepository(TransacaoRepositoryMongo transacaoRepositoryMongo) {
        return new TransacaoRepositoryMongoAdapter(transacaoRepositoryMongo);
    }
}

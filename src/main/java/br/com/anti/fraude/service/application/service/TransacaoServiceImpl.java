package br.com.anti.fraude.service.application.service;

import br.com.anti.fraude.service.adpater.in.TransacaoService;
import br.com.anti.fraude.service.adpater.out.TransacaoRepository;
import br.com.anti.fraude.service.domain.Transacao;
import br.com.anti.fraude.service.domain.exception.ValorMuitoAltoException;

public class TransacaoServiceImpl implements TransacaoService {

    private final TransacaoRepository transacaoRepository;

    public TransacaoServiceImpl(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @Override
    public void criaTransacao(Transacao transacao) {

        if (transacao.valorMuitoAlto()){
            throw new ValorMuitoAltoException("valor alto. Transacao Suspeita!");
        }
        transacaoRepository.criaTransacao(transacao);
    }
}

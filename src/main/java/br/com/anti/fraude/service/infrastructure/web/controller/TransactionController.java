package br.com.anti.fraude.service.infrastructure.web.controller;


import br.com.anti.fraude.service.adpater.in.TransacaoService;
import br.com.anti.fraude.service.infrastructure.web.dto.NovaTransacaoRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static br.com.anti.fraude.service.application.mapper.TransacaoMapper.requestToDomain;

@RestController
@RequestMapping("transacoes")
public class TransactionController {

    private final TransacaoService transacaoService;

    public TransactionController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void efetua(@RequestBody NovaTransacaoRequest request){

        var transacao = requestToDomain(request);

        transacaoService.criaTransacao(transacao);
    }
}

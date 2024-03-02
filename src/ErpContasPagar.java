import java.time.LocalDateTime;

public class ErpContasPagar {
    int id;
    LocalDateTime data_emissao;
    LocalDateTime data_vencimento;
    LocalDateTime data_pgto;
    double valor;
    String status_pagamento;
    String chave_nfe;
    Responsavel responsavel_id;
    ErpLctoHistorico erp_lcto_historico_id;
    ErpDestinacaoRecurso erp_destinacao_recurso_id;
    ErpFormaPagamento erp_forma_pagamento_id;
    int conta_debito;
    ErpPessoaFornecedor erp_pessoa_fornecedor_id;
    String observacao;
    boolean active;
    LocalDateTime datetime;
    String transferido_tesouraria;
}

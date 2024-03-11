import java.time.LocalDateTime;

public class ErpContasPagar {
    private int id;
    private LocalDateTime data_emissao;
    private LocalDateTime data_vencimento;
    private LocalDateTime data_pgto;
    private double valor;
    private String status_pagamento;
    private String chave_nfe;
    private int responsavel_id;
    private ErpLctoHistorico erp_lcto_historico_id;
    private ErpDestinacaoRecurso erp_destinacao_recurso_id;
    private ErpFormaPagamento erp_forma_pagamento_id;
    private int conta_debito;
    private ErpPessoaFornecedor erp_pessoa_fornecedor_id;
    private String observacao;
    private boolean active;
    private LocalDateTime datetime;
    private String transferido_tesouraria;
}

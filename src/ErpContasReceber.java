import java.time.LocalDateTime;

public class ErpContasReceber {
    private int id;
    private LocalDateTime data_emissao;
    private LocalDateTime data_vencimento;
    private LocalDateTime data_recebimento;
    private double valor;
    private String status_pagamento;
    private String chave_nfe;
    private int responsavel_id;
    private ErpLctoHistorico erp_lcto_historico_id;
    private ErpFormaPagamento erp_forma_pagamento_id;
    private int conta_credito;
    private String observacao;
    private boolean active;
    private LocalDateTime datatime;
    private boolean transferido_tesouraria;
}

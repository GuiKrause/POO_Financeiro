import java.time.LocalDateTime;

public class ErpLctoTesouraria {
    private int id;
    private LocalDateTime data_pgto;
    private ErpFormaPagamento erp_forma_pagamento_id;
    private ErpLctoHistorico erp_lcto_historico_id;
    private int conta_debito;
    private int conta_credito;
    private double valor;
    private LocalDateTime datetime;
    private boolean active;
    private int responsavel_id;
    private ErpContasPagar erp_contas_pagar_id;
    private ErpContasReceber erp_contas_receber_id;
}

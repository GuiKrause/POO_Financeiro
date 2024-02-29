import java.time.LocalDateTime;
import java.util.*;
public class ErpCompras {
    private int id;
    private String numero_requisicao;
    private SystemUsers membro_comprador_system_users_id;
    private ErpFormaPagamento erp_forma_pagamento_id;
    private ErpDestinacaoRecurso erp_destinacao_recurso_id;
    private ErpCotacao erp_cotacao_id;
    private double valor_total;
    private LocalDateTime data_compra;
    private ErpStatusCompra erp_status_compra_id;
    private boolean active;
    private LocalDateTime data_lancamento;
}

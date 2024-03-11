import java.time.LocalDateTime;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero_requisicao() {
        return numero_requisicao;
    }

    public void setNumero_requisicao(String numero_requisicao) {
        this.numero_requisicao = numero_requisicao;
    }

    public SystemUsers getMembro_comprador_system_users_id() {
        return membro_comprador_system_users_id;
    }

    public void setMembro_comprador_system_users_id(SystemUsers membro_comprador_system_users_id) {
        this.membro_comprador_system_users_id = membro_comprador_system_users_id;
    }

    public ErpFormaPagamento getErp_forma_pagamento_id() {
        return erp_forma_pagamento_id;
    }

    public void setErp_forma_pagamento_id(ErpFormaPagamento erp_forma_pagamento_id) {
        this.erp_forma_pagamento_id = erp_forma_pagamento_id;
    }

    public ErpDestinacaoRecurso getErp_destinacao_recurso_id() {
        return erp_destinacao_recurso_id;
    }

    public void setErp_destinacao_recurso_id(ErpDestinacaoRecurso erp_destinacao_recurso_id) {
        this.erp_destinacao_recurso_id = erp_destinacao_recurso_id;
    }

    public ErpCotacao getErp_cotacao_id() {
        return erp_cotacao_id;
    }

    public void setErp_cotacao_id(ErpCotacao erp_cotacao_id) {
        this.erp_cotacao_id = erp_cotacao_id;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public LocalDateTime getData_compra() {
        return data_compra;
    }

    public void setData_compra(LocalDateTime data_compra) {
        this.data_compra = data_compra;
    }

    public ErpStatusCompra getErp_status_compra_id() {
        return erp_status_compra_id;
    }

    public void setErp_status_compra_id(ErpStatusCompra erp_status_compra_id) {
        this.erp_status_compra_id = erp_status_compra_id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(LocalDateTime data_lancamento) {
        this.data_lancamento = data_lancamento;
    }
}

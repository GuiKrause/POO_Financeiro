import java.time.LocalDateTime;

public class ErpContasReceberItens {
    private int id;
    private String descricao;
    private double valor;
    private ErpContasReceberItens erp_contas_receber_id;
    private LocalDateTime lancamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ErpContasReceberItens getErp_contas_receber_id() {
        return erp_contas_receber_id;
    }

    public void setErp_contas_receber_id(ErpContasReceberItens erp_contas_receber_id) {
        this.erp_contas_receber_id = erp_contas_receber_id;
    }

    public LocalDateTime getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDateTime lancamento) {
        this.lancamento = lancamento;
    }
}

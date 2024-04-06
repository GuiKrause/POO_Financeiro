import java.time.LocalDateTime;

public class ErpProdutos implements Ativavel{
    private int id;
    private String nome;
    private String descricao;
    private ErpTipoProduto erp_tipo_produto_id;
    private ErpUnidadeMedida erp_unidade_medida_id;
    private boolean active;
    private double valor_medio;
    private LocalDateTime data_lancamento;

    @Override
    public void ativar() {

    }

    @Override
    public void desativar() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ErpTipoProduto getErp_tipo_produto_id() {
        return erp_tipo_produto_id;
    }

    public void setErp_tipo_produto_id(ErpTipoProduto erp_tipo_produto_id) {
        this.erp_tipo_produto_id = erp_tipo_produto_id;
    }

    public ErpUnidadeMedida getErp_unidade_medida_id() {
        return erp_unidade_medida_id;
    }

    public void setErp_unidade_medida_id(ErpUnidadeMedida erp_unidade_medida_id) {
        this.erp_unidade_medida_id = erp_unidade_medida_id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getValor_medio() {
        return valor_medio;
    }

    public void setValor_medio(double valor_medio) {
        this.valor_medio = valor_medio;
    }

    public LocalDateTime getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(LocalDateTime data_lancamento) {
        this.data_lancamento = data_lancamento;
    }
}

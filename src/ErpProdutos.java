import java.time.LocalDateTime;

public class ErpProdutos {
    private int id;
    private String nome;
    private String descricao;
    private ErpTipoProduto erp_tipo_produto_id;
    private ErpUnidadeMedida erp_unidade_medida_id;
    private boolean active;
    private double valor_medio;
    private LocalDateTime data_lancamento;
}

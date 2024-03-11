import java.time.LocalDateTime;

public class ErpCotacao {
    private int id;
    private String finalidade;
    private ErpPessoaFornecedor erp_pessoa_fornecedor_id;
    private LocalDateTime vencimento_proposta;
    private double valor_total;
    private boolean active;
    private LocalDateTime data_lancamento;
}

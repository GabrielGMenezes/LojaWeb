package br.com.lojavirtual.lojinha.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "carrinho_compras")
public class CarrinhoCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente cliente;
    @Column(name = "id_produto")
    private Long idProduto;
    private Long quantidade;
    @Column(name = "data_adicionado")
    private LocalDateTime dataAdicionado;

    public void adicionarItemCarrinho() {
    }

    public void atualizarQuantidade() {
    }

    public void finalizarPedido() {
    }
}
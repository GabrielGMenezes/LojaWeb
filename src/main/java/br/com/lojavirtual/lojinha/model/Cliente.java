package br.com.lojavirtual.lojinha.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private String email;
    @Column(name = "card_credit")
    private String cardCredit;
    private String frete;
    @Column(name = "saldo_conta")
    private BigDecimal saldoConta;
    @OneToMany(mappedBy = "cliente")
    private List<CarrinhoCompras> carrinhoCompras;
    private String senha;
    @Column(name = "status_login")
    private String statusLogin;
    @Column(name = "data_registro")
    private LocalDateTime dataRegistro;

    public void registrar() {
    }

    public boolean login() {
        return false;
    }

    public void atualizarPerfil() {
    }
}
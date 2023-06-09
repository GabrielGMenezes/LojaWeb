package br.com.lojavirtual.lojinha.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    @Column(name = "status_login")
    private String statusLogin;
    @Column(name = "data_registro")
    private LocalDateTime dataRegistro;


    public void atualizarCatalogo() {
    }
}

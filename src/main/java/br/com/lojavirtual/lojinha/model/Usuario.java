package br.com.lojavirtual.lojinha.model;

import java.time.LocalDateTime;

public abstract class Usuario {
    private String numUsuario;
    private String senha;
    private String statusLogin;
    private LocalDateTime dataRegistro;

    public abstract boolean verificarLogin();
}
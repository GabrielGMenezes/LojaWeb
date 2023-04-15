package br.com.lojavirtual.lojinha.model;

public class Administrador extends Usuario {
    private String nomeAdmin;
    private String email;

    public void atualizarCatalogo() {

    }

    @Override
    public boolean verificarLogin() {
        return false;
    }
}

package med.voll.api.atualizar;

import med.voll.api.endereco.DadosEndereco;

public interface AtualizarDadosPessoa {
    String nome();
    String telefone();
    String email();
    DadosEndereco endereco();
}

package med.voll.api.domain.atualizar;

import med.voll.api.domain.endereco.DadosEndereco;

public interface AtualizarDadosPessoa {
    String nome();
    String telefone();
    String email();
    DadosEndereco endereco();
}

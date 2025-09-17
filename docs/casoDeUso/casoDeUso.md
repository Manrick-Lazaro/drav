# Modelo de Casos de Uso

[Voltar a documentação](../documentacao.md)

## 1. Diagrama de Caso de Uso

![diagrama de caso de uso](files/Diagrama_Caso_De_Uso.png "Diagrama de caso de uso")

## 2. Sumário dos casos de uso

- [CDU 01 - Registro e Login](#cdu-01---registro--login)
  - [CDU 01 - Fluxo Principal](#cdu-01---fluxo-principal)
  - [CDU 01 - Fluxo Alternativo](#cdu-01---fluxo-alternativo--autenticação-via-google)
  - [CDU 01 - Regras de negócio](#cdu-01---regras-de-negócio)
- [CDU 02 - Gerenciar Nota](#cdu-02---gerenciar-nota)
  - [CDU 02 - Fluxo Principal](#cdu-02---fluxo-principal)
  - [CDU 02 - Fluxo alternativo 01 - criar nota](#cdu-02---fluxo-alternativo-01---criar-nota)
  - [CDU 02 - Fluxo alternativo 02 – Editar Nota](#cdu-02---fluxo-alternativo-02--editar-nota)
  - [CDU 02 - Fluxo alternativo 03 – Excluir Nota](#cdu-02---fluxo-alternativo-03--excluir-nota)
  - [CDU 02 - Fluxo alternativo 04 – Organizar Notas (Etiquetas/Categorias)](#cdu-02---fluxo-alternativo-04--organizar-notas-etiquetascategorias)
  - [CDU 02 - Fluxo alternativo 05 – Fixar Nota](#cdu-02---fluxo-alternativo-05--fixar-nota)

### CDU 01 - Registro / Login

- **Código:** CDU 01
- **Nome:** Registro / Login
- **Ator:** usuário
- **Resumo:** Esse Caso de uso aborda o cenário em que o usuário realisa o cadastro ou o login no sistema.
- **Pré-condição** O usuário deve ter acesso à aplicação (web ou mobile).
- **Pós-condição** Usuário autenticado e com sessão ativa no sistema.

#### CDU 01 - Fluxo principal

| Usuário                                                                                                            | Sistema                                                                 |
| ------------------------------------------------------------------------------------------------------------------ | ----------------------------------------------------------------------- |
| Acessa a tela inicial do app e escolhe “Entrar” ou “Criar Conta”.                                                  |                                                                         |
|                                                                                                                    | Exibe o formulário correspondente (login ou registro).                  |
| preenche os campos obrigatórios [Login: e-mail e senha.] [Registro: nome, e-mail, senha (e confirmação de senha)]. |                                                                         |
|                                                                                                                    | valida os dados informados.                                             |
|                                                                                                                    | Caso seja um novo registro, o sistema cria o usuário no banco de dados. |
|                                                                                                                    | autentica o usuário e cria uma sessão.                                  |
|                                                                                                                    | redireciona o usuário para a tela principal (lista de tarefas e notas). |

#### CDU 01 - Fluxo Alternativo – Autenticação via Google

| Usuário                                                               | Sistema                                                                                                  |
| --------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| seleciona a opção “Entrar com Google”.                                |                                                                                                          |
|                                                                       | redireciona o usuário para a página de autenticação do Google (OAuth).                                   |
| insere suas credenciais do Google (e-mail/senha) e autoriza o acesso. |                                                                                                          |
|                                                                       | O Google valida os dados e retorna ao sistema um token de autenticação.                                  |
|                                                                       | O sistema valida o token junto ao Google.                                                                |
|                                                                       | Caso seja a primeira vez que o usuário acessa com esse e-mail, o sistema cria automaticamente um perfil. |
|                                                                       | O usuário é autenticado e direcionado à tela principal.                                                  |

#### CDU 01 - Regras de negócio

- **RN01:** A senha deve ter no mínimo 8 caracteres.

- **RN02:** O e-mail deve ser único no sistema.

- **RN03:** Sessões expiram automaticamente após período de inatividade (ex: 30 dias na web).

- **RN04:** Todas as comunicações devem ser feitas via HTTPS.

### CDU 02 - Gerenciar Nota

- **Código:** CDU 02
- **Nome:** Gerenciar Nota
- **Ator:** usuário
- **Pré-condição** O usuário deve estar autenticado no sistema.
- **Pós-condição** As notas ficam armazenadas, atualizadas ou removidas conforme a ação executada.

#### CDU 02 - Fluxo principal

| Usuário                                                      | Sistema                                                |
| ------------------------------------------------------------ | ------------------------------------------------------ |
| acessa a área de Notas.                                      |                                                        |
|                                                              | exibe todas as notas existentes associadas ao usuário. |
| O usuário pode: criar, editar, excluir e visualizar uma nota |                                                        |
|                                                              | executa a operação escolhida e atualiza a interface.   |

#### CDU 02 - Fluxo alternativo 01 - criar nota

| Usuário                              | Sistema                       |
| ------------------------------------ | ----------------------------- |
| seleciona “Nova Nota”.               |                               |
|                                      | exibe um campo de edição.     |
| insere título e/ou conteúdo da nota. |                               |
|                                      | salva a nota automaticamente. |

#### CDU 02 - Fluxo alternativo 02 – Editar Nota

| Usuário                       | Sistema                                     |
| ----------------------------- | ------------------------------------------- |
| seleciona uma nota existente. |                                             |
|                               | exibe o conteúdo da nota em modo de edição. |
| altera o conteúdo.            |                                             |
|                               | salva as alterações.                        |

#### CDU 02 - Fluxo alternativo 03 – Excluir Nota

| Usuário                          | Sistema                           |
| -------------------------------- | --------------------------------- |
| seleciona “Excluir” em uma nota. |                                   |
|                                  | pede confirmação.                 |
| confirma a exclusão.             |                                   |
|                                  | remove a nota e atualiza a lista. |

#### CDU 02 - Fluxo alternativo 04 – Organizar Notas (Etiquetas/Categorias)

| Usuário             | Sistema                                                  |
| ------------------- | -------------------------------------------------------- |
| seleciona uma nota. |                                                          |
|                     | permite adicionar etiquetas ou mover para uma categoria. |
|                     | salva a organização e atualiza a exibição.               |

#### CDU 02 - Fluxo alternativo 05 – Fixar Nota

| Usuário                         | Sistema                               |
| ------------------------------- | ------------------------------------- |
| seleciona a opção “Fixar nota”. |                                       |
|                                 | exibe a nota fixada no topo da lista. |

# Documento de Visão

[Voltar a documentação](../documentacao.md)

## 1. Objetivo do projeto

O Drav é uma solução prática e intuitiva para organizar rotinas e ideias, reunindo funcionalidades de to-do list e bloco de notas em uma única plataforma. Disponível para web e dispositivos móveis, o app permite criar, editar e gerenciar tarefas e anotações de forma rápida e sincronizada, garantindo que suas informações estejam sempre acessíveis, seja no computador ou no smartphone. Com foco na simplicidade e produtividade, o app é ideal para quem busca organizar anotações do dia a dia, projetos pessoais ou profissionais, sem complicações.

## 2. Descrição do problema

Muitas pessoas têm o hábito de fazer anotações rápidas diretamente no celular, seja para registrar ideias, lembretes ou tarefas do dia a dia. No entanto, surge um problema quando essas mesmas pessoas precisam acessar suas anotações em outros dispositivos, especialmente no computador, de forma rápida e sem complicações. Essa dificuldade afeta usuários diversos — desde estudantes e profissionais até pessoas que apenas desejam manter suas atividades organizadas — e pode gerar perda de tempo, desorganização ou até esquecimento de informações importantes.

Para resolver isso, a proposta é criar um aplicativo que unifique to-do list e bloco de notas, oferecendo uma experiência simples e eficiente tanto em dispositivos móveis quanto na web. Assim, o usuário terá suas informações sempre acessíveis, sincronizadas e organizadas, facilitando o gerenciamento de tarefas e anotações em qualquer lugar.

## 3. Descrição do usuário

| Nome           | Descrição                                                                        | Responsabilidade                                                             |
| -------------- | -------------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| Usuário Casual | Pessoa que precisa fazer anotações casuais ou registro de tarefas e compromissos | Registrar tarefas do dia a dia, prazos de entregas e gerenciar notas rápidas |

## 4. Descrição do ambiente do usuário

- Utiliza o app em momentos variados do cotidiano, como no transporte público, em casa ou no trabalho, geralmente pelo celular. Precisa de acesso rápido, prático e sem burocracia às anotações.

## 5. Principais necessidades dos usuários

- Registrar anotações rapidamente, sem processos demorados.

- Gerenciar tarefas do dia a dia de forma simples e organizada.

- Acessar as anotações em diferentes dispositivos (web e mobile).

- Sincronização automática entre plataformas para não perder informações.

- Interface intuitiva e prática, que não exija curva de aprendizado.

- Pesquisar e localizar notas/tarefas facilmente.

- Criar lembretes ou prazos para não esquecer compromissos importantes.

- Organizar informações por categorias ou etiquetas, quando necessário.

- Editar e atualizar notas/tarefas com facilidade.

- Segurança e confiabilidade para não perder dados.

## 6. Requisitos funcionais

| Código | Nome                      | Descrição                                                                                             | Regra de negócio                                                                           |
| ------ | ------------------------- | ----------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ |
| RF01   | Cadastro/Login de Usuário | O sistema deve permitir que o usuário crie uma conta ou faça login para acessar suas notas e tarefas. | O login pode ser feito por e-mail/senha ou integração com contas externas (Google, Apple). |
| RF02   | Criar nota                | O usuário poderá criar uma nota de forma rápida.                                                      | As notas devem ser salvas automaticamente para evitar perda de dados.                      |
| RF03   | Editar/Excluir Nota       | O usuário poderá editar ou excluir qualquer nota existente.                                           | Apenas o dono da nota deve alterá-la ou excluí-la.                                         |
| RF04   | Organizar Notas           | O sistema deve permitir que o usuário categorize ou adicione etiquetas às notas.                      | Etiquetas são livres e ilimitadas.                                                         |
| RF05   | Fixar Nota                | O usuário poderá fixar notas importantes no topo da lista.                                            | Apenas até um número limitado (ex: 5 fixadas) para não comprometer a usabilidade.          |
| RF06   | Criar Tarefa              | O usuário poderá adicionar tarefas à sua lista de afazeres.                                           | A tarefa deve ter, no mínimo, um título.                                                   |
| RF07   | Editar/Excluir Tarefa     | O usuário poderá editar ou excluir qualquer tarefa existente.                                         | Apenas o dono da tarefa pode alterá-la ou excluí-la.                                       |
| RF08   | Concluir Tarefa           | O usuário poderá marcar tarefas como concluídas.                                                      | Tarefas concluídas devem ir para uma seção de histórico                                    |
| RF09   | Definir Prazo em Tarefa   | O usuário poderá definir prazos (data e horário) para tarefas.                                        | Caso tenha prazo, o sistema deve permitir alertas/lembranças.                              |
| RF10   | Notificações de Tarefas   | O sistema deve enviar notificações sobre prazos definidos.                                            | Notificações são opcionais e configuráveis pelo usuário.                                   |
| RF11   | Organização de Tarefas    | O usuário poderá organizar tarefas por listas, categorias ou projetos.                                | Cada tarefa pode pertencer a apenas uma lista, mas pode ter múltiplas etiquetas.           |
| RF12   | Sincronização de Dados    | Todas as notas e tarefas devem ser sincronizadas entre web e mobile.                                  | A sincronização deve ocorrer em tempo real ou no próximo acesso à internet.                |
| RF13   | Pesquisa                  | O usuário poderá pesquisar notas e tarefas por palavra-chave.                                         | A busca deve considerar título e conteúdo.                                                 |
| RF14   | Subtarefas                | O sistema deve permitir que o usuário crie subtarefas dentro de uma tarefa.                           | Subtarefas devem herdar prazo da tarefa principal, se não tiverem um próprio.              |

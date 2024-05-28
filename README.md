Explicação do Código do Sistema de Arquivos

Classe Elemento:
-Representa um nó da árvore binária.
-Contém um valor, ponteiros para o filho à esquerda e o filho à direita.
-Métodos para acessar e modificar o valor e os filhos.

Classe Arvore:
-Implementa a árvore binária de busca.
-Método adicionar(TIPO valor): Adiciona um novo elemento à árvore, mantendo a propriedade da árvore binária de busca.
-Método remover(TIPO valor): Remove um elemento da árvore, ajustando os nós para manter a estrutura correta.
-Método buscar(TIPO valor): Busca um elemento na árvore, retornando true se encontrado e false caso contrário.
-Métodos de travessia (emOrdem, preOrdem, posOrdem): Listam os elementos da árvore em diferentes ordens de travessia.

Classe Arquivo:
-Representa um arquivo ou diretório.
-Contém um nome e uma flag isDiretorio que indica se o elemento é um diretório.
-Método compareTo(Arquivo outro): Compara dois arquivos pelo nome para manter a ordem na árvore.
-Método toString(): Retorna uma representação em string do arquivo ou diretório, indicando se é um diretório ([D]) ou um arquivo ([F]).

Classe ArvoreArquivos:
-Gerencia a árvore de arquivos, encapsulando operações de adição, remoção, busca e listagem de arquivos e diretórios.
-Método adicionarArquivo(String nome, boolean isDiretorio): Adiciona um novo arquivo ou diretório à árvore.
-Método removerArquivo(String nome): Remove um arquivo ou diretório da árvore.
-Método buscarArquivo(String nome): Busca um arquivo ou diretório na árvore.
-Método listarArquivosEmOrdem(): Lista os arquivos e diretórios em ordem.

Classe Main:
-Demonstra o uso do sistema de arquivos com exemplos práticos.
-Adiciona alguns arquivos e diretórios ao sistema.
-Lista os arquivos e diretórios em ordem.
-Remove um arquivo específico e lista novamente.
-Realiza buscas por arquivos específicos, exibindo se foram encontrados ou não.

Conceitos-Chave
-Flag: Indicador booleano usado para sinalizar um estado ou condição. No nosso código, a flag isDiretorio indica se um Arquivo é um diretório.
-Verificação de Diretório: Usamos a flag isDiretorio na classe Arquivo para determinar se um elemento é um diretório ou um arquivo.
-Uso Prático: Demonstrado na classe Main, onde manipulamos a árvore de arquivos, adicionando, removendo, listando e buscando arquivos e diretórios.

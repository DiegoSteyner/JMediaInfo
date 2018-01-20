# JMediaInfo

Projeto elaborado para tradução das informações do Media Info (https://mediaarea.net/en/MediaInfo) em artefatos Java, facilitando e padronizando a coleta de informações de arquivos de vídeo para tratamentos Web e Standalone

# Dependencias

Esse projeto tem depêndencia do projeto JUtil (https://github.com/DiegoSteyner/JUtil) e, por existir diversas necessidades vinculadas a cada projeto ou subprojeto externo a este, não foi criado um parent pom (POM PAI), ficando assim à cargo do analista responsável a melhor forma de injeção de projetos interdependentes.

# Info 01

Em ambientes Linux e Unix, deve-se atentar para a forma de execução das linhas de comando do MediaInfo bem como as dependências do MediaInfo em cada SO, essas configurações são feitas em nível de SO e para os casos onde isso não seja possível, deve-se alterar a classe PrincipalJMediaInfo.java para inclusão no classpath em runtime das dependências do MediaInfo de forma que a execução ocorra sem problemas.

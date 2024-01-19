# Pesquisa NoSQL Redis e Cassandra

## Redis

O Redis é um banco de dados NoSQL de chave-valor, o que significa que cada dado é armazenado como uma chave e um valor. A chave é usada para acessar o valor, que pode ser de qualquer tipo, incluindo strings, números, objetos JSON e até mesmo outros bancos de dados Redis.

O Redis é um banco de dados de memória, o que significa que todos os dados são armazenados na memória do computador. Isso o torna muito rápido para operações de leitura e gravação, o que o torna ideal para cache de aplicações.

O Redis oferece uma variedade de recursos que o tornam um banco de dados versátil e poderoso. Alguns dos recursos mais importantes incluem:

- *Cache*: O Redis é um excelente banco de dados de cache para aplicativos que precisam acessar dados frequentemente. O Redis pode armazenar dados em cache na memória, o que pode melhorar o desempenho do aplicativo em até 100 vezes.
- *Pub/sub*: O Redis oferece um sistema de pub/sub que permite que aplicativos publiquem mensagens e outros aplicativos as recebam. Isso pode ser usado para implementar uma variedade de recursos, como notificações em tempo real e streaming de dados.
- *Temporizadores*: O Redis pode ser usado para criar temporizadores que são executados após um determinado período de tempo. Isso pode ser usado para implementar uma variedade de recursos, como renovação de tokens, notificações de expiração e outros.


## Cassandra

O Cassandra é um banco de dados NoSQL distribuído, o que significa que os dados são armazenados em vários servidores. Isso o torna ideal para aplicativos que precisam lidar com grandes quantidades de dados ou que precisam ser altamente escaláveis.

O Cassandra é um banco de dados colunar, o que significa que os dados são armazenados em colunas, em vez de linhas. Isso o torna mais eficiente para operações de leitura e escrita de grandes conjuntos de dados.

O Cassandra oferece uma variedade de recursos que o tornam um banco de dados poderoso e versátil. Alguns dos recursos mais importantes incluem:

- *Escalabilidade*: O Cassandra é um banco de dados altamente escalável, permitindo que você adicione ou remova facilmente servidores para gerenciar picos de tráfego.
- *Alta disponibilidade*: O Cassandra é projetado para ter alta disponibilidade, o que significa que ele pode lidar com falhas de hardware ou software sem interrupções no serviço.
- *Tolerância a falhas*: O Cassandra é tolerante a falhas, o que significa que ele pode continuar funcionando mesmo se alguns servidores falharem.


### Comparação entre Redis e Cassandra

O Redis e o Cassandra são dois bancos de dados NoSQL populares que oferecem diferentes recursos e benefícios.

O Redis é um banco de dados de memória que é ideal para cache de aplicações. Ele é rápido e eficiente, mas não é tão escalável ou tolerante a falhas quanto o Cassandra.

O Cassandra é um banco de dados distribuído que é ideal para aplicativos que precisam lidar com grandes quantidades de dados ou que precisam ser altamente escaláveis e tolerantes a falhas. Ele é mais lento que o Redis para operações de leitura e gravação, mas é mais escalável e tolerante a falhas.

A escolha do banco de dados certo para sua aplicação dependerá das necessidades específicas de sua aplicação. Se você precisa de um banco de dados extremamente rápido para operações de leitura e gravação em cache, o Redis pode ser a melhor escolha. Se você precisa de alta disponibilidade e tolerância a falhas, o Cassandra pode ser a opção ideal.


###### fonte
https://www.tabnews.com.br/hebertcisco/redis-vs-outros-bancos-de-dados-nosql-pros-e-contras
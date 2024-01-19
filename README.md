# Mongo DB

É um banco de dados open source, de alta desempenho e flexível, sendo considerado o principal banco de dados ``NoSQL``. OS bancos de dados NoSQL apresentam algumas vantagens sobre os outros tipos, principalmente quando precisamos de escalabilidade, flexibilidade, bom desempenho e facilidade para consultas.

O ``MongoDB`` é orientado a documentos, ou seja, os dados são armazenados como documentos. Os documentos podem ser descritos como dados no formato de chave-valor, no caso, utilizando o formato ``JSON``.

- Exemplo JSON de collection

```
{"nome":"Meteor","trila","JS","alunos":[{"nome":"victor","email":"victor@exemplo.com"},{"nome":"bruno","email":"bruno@exemplo.com"}]}
```

- Mongo Compass 

fazer o download [MongoDB Compass](https://www.mongodb.com/try/download/compass)

- MongoDB no Docker

```
docker run --name mongodb_ebac -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=admin -d mongo:latest
```

- comandos basicos no terminal
``docker stop nome ou id conteiner``
``docker start nome ou id conteiner``

- Configurando User no Mongo
````
docker exec -it mongodb_ebac bash

mongo -u admin

show databases

use ebac

db.createUser({user:"teste",pwd:"teste",roles:[{role:"readWrite",db:"ebac"}]});
````
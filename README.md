# API Consulta Dados Câncer de Mama do SUS.
> API para consultar dados da base de câncer de mama do SUS.

[![NPM Version][npm-image]][npm-url]
[![Build Status][travis-image]][travis-url]
[![Downloads Stats][npm-downloads]][npm-url]

## Exemplo de uso
 Nesta API é possível: <br><br>
 #Incidências
 * Consultar uma incidência por ID;
 * Constular todas as incidências;
--------------------
 #Regiões
 * Consultar uma Região por ID;
 * Consultar todas as Regiões; 
--------------------
 #Faixas Etárias
 * Consultar uma Faixa Etária por ID;
 * Consultar todas as Faixas Etárias;
 * Atualizar uma Faixa Etária por ID;
 * Excluir uma Faixa Etária por ID;
 * Incluir uma nova Faixa Etária;
--------------------

## Algumas validações: 
* A API não permite incluir uma Faixa Etária já existente;

## Requisitos de Banco de Dados
Instalar um Banco de dados MySQL e definir uma senha para o schema (ex: 12345)
Criar uma base de dados chamada dbcancerdemama.
Executar os scripts contidos no Raiz deste diretório.

Atentar-se ao arquivo de configuração application.properties do projeto que contém as configurações para conexão. 

## Visualização via Swagger:
![](https://user-images.githubusercontent.com/414878/158073799-07306bf3-2679-46e3-8761-d2f1370bcb2d.png)

## Teste via Postman:

* POST (Salvando)
![](https://user-images.githubusercontent.com/414878/157462025-a46151d8-9b01-405e-b1f5-24a6fbd4242a.png)

* GETALL (Buscando todos)
![](https://user-images.githubusercontent.com/414878/157461921-49dce45c-d3c5-4d83-abfc-8eb059dbaefd.png)

* GETBYID (Buscando por ID)
![](https://user-images.githubusercontent.com/414878/157461977-2f6a2ead-08c8-4c34-be29-707257dd5e54.png)

* PUT (Atualizando por ID)
![](https://user-images.githubusercontent.com/414878/157462103-b4ec815e-3fd9-4c30-b94e-9d50a609872c.png)

* DELETE (Deletando por ID
![](https://user-images.githubusercontent.com/414878/157462046-c49de6d7-6928-49e4-a007-ee03990a4494.png)

## Meta

Edison de Azevedo Filho – [@azevedoedison](https://twitter.com/azevedoedison) – 
[https://www.linkedin.com/in/edison-de-azevedo/](https://www.linkedin.com/in/edison-de-azevedo/)
[https://github.com/azevedoedison/parking_control_api](https://github.com/azevedoedison/)


[npm-image]: https://img.shields.io/npm/v/datadog-metrics.svg?style=flat-square
[npm-url]: https://npmjs.org/package/datadog-metrics
[npm-downloads]: https://img.shields.io/npm/dm/datadog-metrics.svg?style=flat-square
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics
[wiki]: https://github.com/seunome/seuprojeto/wiki


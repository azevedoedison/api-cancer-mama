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

## Teste via Postman na API de Faixa Etária:

* POST (Salvando)

![](https://user-images.githubusercontent.com/414878/158166459-d193f681-2997-4b15-ba3c-8cce4bb80bb6.png)

* POST (Validação caso já exista a faixa etária)

![](https://user-images.githubusercontent.com/414878/158166426-de31ca98-8125-4531-867b-a04296653670.png)

* GETALL (Buscando todos)

![](https://user-images.githubusercontent.com/414878/158166335-7c6a29b6-a0e6-47fb-941c-bd4b450b5d00.png)

* GETONE (Buscando por ID)

![](https://user-images.githubusercontent.com/414878/158166223-3c71eeef-c624-48e3-8106-397ca1583e0d.png)

* PUT (Atualizando por ID)

![](https://user-images.githubusercontent.com/414878/158166496-aca56e2e-f876-481b-b6e9-71b4f9cafc83.png)

* DELETE (Deletando por ID

![](https://user-images.githubusercontent.com/414878/158166393-d8a22d7e-670e-443f-bb9d-ea97287acbb2.png)

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


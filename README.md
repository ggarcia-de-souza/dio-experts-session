# dio-experts-session

***UTILIZAR JAVA SDK 11 OU MENOR PARA EVITAR ERROS DE COMPATIBILIDADE***

Um projeto com arquitetura baseada em microsserviços

Utiliza o docker com uma imagem do elasticsearch.

http://localhost:8080/ é o gateway

http://localhost:8081/ é o product-catalog

http://localhost:8082/ é o shopping-cart

http://localhost:9000 para acessar o eureka

config-server está obtendo suas configurações de um arquivo .yml no repositório https://github.com/oswaldoneto/dio-experts-config.git

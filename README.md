##Docker subir aplicacao 
sudo docker-compose up --build --force-recreate

##Acesso para lista de processos: 
https://dashboard.heroku.com/apps/sigo-back-gestao/api/acessor

##Acesso processo unico: 
https://dashboard.heroku.com/apps/sigo-back-gestao/acessor/{id}

##Salvar, Atualizar e Deletar processo: 
https://dashboard.heroku.com/apps/sigo-back-gestao/acessor

##Acesso para lista de operadores: 
https://dashboard.heroku.com/apps/sigo-back-gestao/api/contrato

##Acesso operador unico: 
https://dashboard.heroku.com/apps/sigo-back-gestao/contrato/{id}

##Salvar, Atualizar e Deletar operador: 
https://dashboard.heroku.com/apps/sigo-back-gestao/contrato

##Recompilar node_modules
rm -rf node_modules package-lock.json && npm install
mvn clean package

##Rodar teste
mvn test

##Gerar build 
mvn spring-boot:run
##sudo service postgresql stop
##sudo docker-compose down

##Subir .jar java
java -Dserver.port=5050 -jar target/pucsigo-0.0.1-SNAPSHOT.jar


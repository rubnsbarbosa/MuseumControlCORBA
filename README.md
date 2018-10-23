## Instituto Federal do Ceará
Engenharia de Computação  
Programação Paralela e Distribuída  
2018.2  
Prof. Cidcley T. de Souza   

### Projeto de CORBA
**Objetivo:** Implementar utilizando SOMENTE CORBA um Sistema de Controle de Museu.  

1) O Sistema de Controle de Museu deve controlar o número de visitantes em um museu. O propósito do sistema é:  

* Registrar o número de visitantes presentes em um museu em um determinado momento;  
* Apresentar de forma atualizada esse número para um guarda durante dia e noite;  
* Tocar um sino para acordar o guarda caso o número de visitantes seja diferente de zero durante o período da noite.  


2) Esse sistema deve ser composto pelos seguintes módulos:  

* Guarda: recebe informações atualizadas dinamicamente da quantidade de pessoas que entra e sai do museu, controlando o número de visitantes em todos os momentos do dia. Pode modificar manualmente o modo do sistema para Dia ou Noite;  
*  Portão: registra e avisa ao guarda quando um visitante entra ou saí do museu;  
* Sino: Toca quando o modo Noite é acionado pelo guarda e o museu não está vazio.  

### Critérios de Avaliação
Interface do Sistema (0-10);  
Interface IDL (0-10);  
Implementação de Funcionalidades (0-10);  

**Trabalho Individual**  
**Data de Entrega:** 17/10 (nota cheia)  
Entrega até 22/10 (-2 pontos)  
Depois disso o trabalho será desconsiderado.  

### Observações:  
1. **TODOS** os trabalhos só serão aceitos se apresentados **pessoalmente** pelo aluno na sala de aula na data final de entrega ou, em casos excecionais, a combinar com o professor.  
2. **TODOS** os trabalhos só serão recebidos através do link até às 12h da data de entrega.  
3. Não serão aceitos trabalhos enviados de qualquer outra forma.  
4. Devem ser entregues **TODOS** os códigos.  
5. Deverá ser entregue, se a linguagem de programação permitir, um código executável (.jar, .exe, etc).  

### Comandos Via Terminal
> **Terminal 1**  
> rubnsbarbosa$ tnameserv -ORBInitialPort 9999  
> **Terminal 2**  
> rubnsbarbosa$ java MuseumGateServer  
> **Terminal 3**  
> rubnsbarbosa$ java MuseumGuardServer  
> **Terminal 4**  
> rubnsbarbosa$ java MuseumBellServer  
> **Exec. Client**  
> Depois que temos o Servidor de Nomes habilitado e os Servirores executando, agora só falta executar o cliente.  

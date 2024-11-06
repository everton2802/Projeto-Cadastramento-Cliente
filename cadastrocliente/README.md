Projeto de Cadastro de Clientes

Este projeto é uma aplicação web para gerenciar o cadastro de clientes, permitindo realizar operações de CRUD (Criar, Ler, Atualizar e Excluir). A aplicação utiliza a integração com a API ViaCEP para preencher automaticamente o endereço do cliente ao fornecer o CEP.

Tecnologias Utilizadas

	•	Java 21
	•	JavaServer Faces (JSF) para a interface do usuário
	•	Java Persistence API (JPA) para persistência de dados
	•	Banco de dados H2 em memória
	•	API ViaCEP para busca de endereço por CEP
	

Funcionalidades Implementadas

	1.	Cadastro de Clientes (Create): Permite adicionar um novo cliente através de um formulário. O usuário preenche dados como nome, email, telefone e CEP. O sistema busca o endereço automaticamente usando a API ViaCEP.
	2.	Listagem de Clientes (Read): Exibe uma lista com todos os clientes cadastrados, permitindo realizar buscas por nome.
	3.	Atualização de Clientes (Update): Permite editar os dados de um cliente existente. Ao acessar a página de edição, os dados atuais do cliente são carregados automaticamente.
	4.	Exclusão de Clientes (Delete): Permite remover clientes da lista de cadastro.
	5.	Integração com a API ViaCEP: Ao inserir o CEP, a aplicação consulta a API ViaCEP e preenche automaticamente os campos de endereço, bairro, cidade e estado.

Como Configurar o Projeto

Pré-requisitos

Certifique-se de ter o seguinte instalado:
	•	Java JDK 8 ou superior
	•	Apache Maven (para gerenciamento de dependências)
	•	Git (Para clonar o repositório)

Passo a Passo de Configuração

	1.	Clone o Repositório (opcional):

git clone https://github.com/seu-usuario/seu-repositorio.git
cd Cadastramento-Clientes


	2.	Compilar e Configurar Dependências:
	•	No diretório do projeto, execute o comando Maven para compilar e baixar as dependências:

mvn clean install


	3.	Configuração do Servidor
	•	Importe o projeto no Eclipse.
	•	Configure um servido no Eclipse
	•	No Project Explorer, clique com o botão direito no projeto, selecione Run As > Run on Server e escolha o servidor configurado.

Detalhes da Integração com ViaCEP

A aplicação utiliza a API pública do ViaCEP para buscar automaticamente os dados de endereço com base no CEP informado pelo usuário. Esse serviço é acionado ao preencher o CEP no formulário de cadastro/edição e clicar no botão “Buscar Endereço”.
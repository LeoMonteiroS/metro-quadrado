# 📐 Metro Quadrado — Sistema de Orçamento

Sistema web completo para cálculo de orçamentos por metro quadrado. Permite cadastrar produtos com preço por m², montar uma lista com múltiplos itens e gerar um PDF com o orçamento final.

---

## ✨ Funcionalidades

- Seleção de produtos cadastrados com valor do m² já definido
- Adição de múltiplos produtos à lista com altura e largura individuais
- Cálculo automático de área e valor total por item
- Valor total geral da lista
- Geração e download de orçamento em PDF
- Painel administrativo protegido por senha para cadastrar e excluir produtos

---

## 🛠️ Tecnologias utilizadas

**Back-end**
- Java 21
- Spring Boot 4
- Spring Data JPA
- Banco de dados H2 (em memória)
- Maven

**Front-end**
- HTML, CSS e JavaScript puro
- jsPDF (geração de PDF no navegador)

---

## 🚀 Como rodar o projeto

### Pré-requisitos

- Java 21 ou superior instalado
- Maven instalado (ou usar o `mvnw` incluso no projeto)
- IntelliJ IDEA (recomendado) ou qualquer IDE Java

### Passo a passo

1. Clone o repositório:
```bash
git clone https://github.com/LeoMonteiroS/metro-quadrado.git
```

2. Abra a pasta do projeto no IntelliJ IDEA

3. Aguarde o Maven baixar as dependências automaticamente

4. Rode a aplicação clicando em **Run** ou pressionando `Shift+F10`

5. Acesse no navegador:
```
http://localhost:8080
```

---

## 📁 Estrutura do projeto

```
src/main/java/leo/metroquadrado/
├── controller/
│   ├── CalculoController.java
│   └── ProdutoController.java
├── dto/
│   ├── CalculoRequest.java
│   └── CalculoResponse.java
├── model/
│   └── Produto.java
├── repository/
│   └── ProdutoRepository.java
├── service/
│   ├── CalculoService.java
│   └── ProdutoService.java
└── MetroQuadradoApplication.java

src/main/resources/
├── static/
│   └── index.html
└── application.properties
```

---

## 🔐 Painel Administrativo

Para cadastrar ou excluir produtos, acesse a **Área administrativa** no rodapé da página e utilize a senha de admin configurada no `ProdutoController.java`.

---

## 📄 Exemplo de orçamento gerado

O sistema gera um PDF com:
- Nome do produto
- Dimensões (altura × largura)
- Área em m²
- Valor por item
- Total geral
- Data do orçamento

---

## Imagem do sistema
<img width="550" height="550" alt="preview" src="https://github.com/user-attachments/assets/fc031eb8-da00-49c7-90b8-f90a3c9d81c9" />

## 📌 Próximas melhorias planejadas

- [ ] Migração para banco de dados MySQL
- [ ] Autenticação com Spring Security
- [ ] Deploy em nuvem (Railway ou Render)
- [ ] Histórico de orçamentos salvos

---

Desenvolvido por [Leonardo Monteiro](https://github.com/LeoMonteiroS)

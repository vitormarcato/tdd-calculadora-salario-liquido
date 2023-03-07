# TDD: Calculadora Salário Líquido

Esta aplicação demostra o valor de salário líquido mensal a partir do salário bruto e dos principais descontos do salário (INSS e IRRF).

<img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/>

## Objetivo
 [x] Desenvolver uma aplicação aplicando TDD e padrões de projeto comportamentais.

 [ ] Strategy: simplificar lógica e reduzir "If-else" no código. Aplicação: Criou-se classes específicas para cada imposto calculado. 

 [ ] Chain of responsability: simplificar a lógica de aplicação da alíquota para cada imposto: utilizar herança para regra de alíquota.

## Como utilizar:

1. Preencha o valor do seu salário bruto na calculadora
2. Informe o número de dependentes
3. Informe, se houver, a existência de outros descontos (Vale-transporte, Assist. Médica, Previdência privada, etc)

## Premissas: 

Deve ser considerado a tabela abaixo para contribuição previdenciária (INSS)

**Tabela INSS**
| Salário | Alíquota     |
| -------------  | --- |
| até 1.212,00  | 7,5%
| de 1.212,01 até 2.427,35  | 9%
| de 2.427,36 até 3.641,03 | 12%
| de 3.641,04 até 7.087,22        | 14%


Também obrigatório, o IRRF é calculado depois que o INSS e um valor legal por dependente (R$189,59 por dependente) são deduzidos do salário bruto.


**Tabela IRRF**
| Base de cálculo | Alíquota     |
| -------------  | --- |
| Até R$1.903,98	  | isento
| De R$1.903,99 até R$2.826,65	  | 7,5%
| De R$2.826,66 até R$3.751,05  | 15%
| De R$3.751,06 até R$4.664,68       | 22,5%
| Acima de R$4.664,68        | 27,5%


### VitrineDev - Alura
---
| :placard: Vitrine.Dev | https://cursos.alura.com.br/vitrinedev/vitormarcato     |
| -------------  | --- |
| :sparkles: Nome        | TDD: Calculadora de salário líquido
| :label: Tecnologias | tdd, java, JUnit, design patterns 
| :rocket: URL         | https://github.com/vitormarcato/tdd-calculadora-salario-liquido
| :fire: Desafio     | https://github.com/vitormarcato/tdd-calculadora-salario-liquido

<img src="https://www.mobills.com.br/blog/wp-content/uploads/2022/06/calculadora-de-salario-liquido-mobills-imagem-em-destaque.png#vitrinedev"  width="400" height="300"/>







# Estacionamento
Esse projeto mostra como podemos aplicar os padrões de projeto para melhorar nosso código.

## Problema: Cálculo do valor do estacionamento
Considere o sistema de um estacionamento que precisa utilizar diversos critérios para calcular o valor que deve ser cobrado de seus clientes. 
- Para um veículo de passeio, o valor deve ser calculado como R$2,00 por hora, porém, caso o tempo seja maior do que 12 horas, será cobrada uma taxa diária, e caso o número de dias for maior que 15 dias, será cobrada uma mensalidade. 
- Existem também regras diferentes para caminhões, que dependem do número de eixos e do valor da carga carregada, 
- e para veículos para muitos passageiros, como ônibus e vans. O código a seguir apresenta um exemplo de como isto estava desenvolvido.

É necessária uma solução que:
- Permita que diferentes algoritmos de calculo possam ser utilizados pela classe.
- O algoritmo possa ser utilizado em diferentes empresas.
- Permita que uma classe inicie a execução com um algoritmo e o mesmo possa ser trocado depois.
- Sem duplicação de código.
- Com fácil entendimento.
- Crescimento controlado de linhas de código.

## Solução

- Uso do padrão Strategy para o calculo do valor do ticket






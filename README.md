# Repositório da implementação do padrão de Projeto Adapter.

Este repositório contém a implementação do padrão de Projeto Adapter, foi desenvolvido em Java.

O padrão Adapter é ideal para utilizar em cenários onde uma determinada classe cliente depende de uma abstração 'x', porém em um determinado momento do desenvolvimento do sistema é constatado uma nova forma de implementação. Para não gerar um acoplamento desnecessário o padrão adapter pode ser utilizado para que através da implementação da mesma abstração já conhecida pelo cliente possa haver uma comunição com a nova implementação, formando assim um adaptador.

Para utilizar o Adapter é necessário implementar a interface já conhecida e internamente a classe ser composta por uma referência a um objeto que implementa a nova interface para assim traduzir as chamadas da interface que ele implementa para a classe que ele encapsula.
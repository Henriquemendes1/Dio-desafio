# [DIO](www.dio.me) - Trilha Java Básico

## Autor
- [Henrique Mendes]

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, a proposta foi modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), elaborei a diagramação das classes e interfaces utilizando uma ferramenta UML. Em seguida, implementei as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 até 00:55

#### Funcionalidades Modeladas
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java.

### Diagrama UML (Mermaid)
```mermaid
classDiagram
direction TB
    class Iphone {
    }

    class AparelhoTelefonico {
	    +ligar(String numero)
	    +atender()
	    +iniciarCorreioVoz()
    }

    class NavegadorInternet {
	    +exibirPagina()
	    +adicionarNovaAba()
	    +atualizarPagina()
    }

    class ReprodutorMusical {
	    +reproduzir()
	    +pausar()
	    +selecionarMusica(String musica)
    }

    class Telefone {
    }

    class NavegadorWeb {
    }

    class Ipod {
    }

	<<Classe>> Iphone
	<<Interface>> AparelhoTelefonico
	<<Interface>> NavegadorInternet
	<<Inteface>> ReprodutorMusical
	<<Classe>> Telefone
	<<Classe>> NavegadorWeb
	<<Classe>> Ipod

    Iphone -- AparelhoTelefonico
    Iphone -- NavegadorInternet
    Iphone -- ReprodutorMusical
    NavegadorInternet -- NavegadorWeb
    AparelhoTelefonico -- Telefone
    ReprodutorMusical -- Ipod

```

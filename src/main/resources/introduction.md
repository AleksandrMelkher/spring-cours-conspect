Введение:
-
- Существуют разные объекты в программе, которые относятся к общему
  классу родителю или к общему интерфейсу.
- Если надо выбрать какой либо объект из одного класса, то это можно сделать
  прямо в коде. Однако если таких объектов будет много, это удобнее делать
  в конфигурационном файле.
- В этом поможет spring framework. В конфиг файле описывается то, что представляют
  собой объекты и уже сам spring создает эти объекты.
- Это называется Inversion Of Control (инверсия управления).
- Spring - это контейнер, в котором создаются объекты и по мере необходимости
  эти объекты вызываются в программе. Контейнер читает конфиг файл и создает их.
- Вызов нужного объекта происходит при обращении к объекту spring.

Основные функции spring container:
-
- IoC - Inversion of Control (означает передачу прав на создание обдъектов и управление ими)
- DI - Dependency Injection (внедрение зависимостей)


Три способа конфигурации spring container:
-
- XML file - устаревший способ
- Annotation + XML file - современный способ
- Java cod



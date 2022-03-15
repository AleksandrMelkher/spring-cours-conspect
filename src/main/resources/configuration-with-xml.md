Файлы конфигурации распологаются в папке "resources" с расшщирением .xml
-

В файле конфигурации прописываются объекты, которые будут в программе, например:


\<bean id = "id_object"  class = "org.example.spring.Dog">\</bean>
- Здесь: id - айди объекта;  class - полное название объекта.
- При вызове ID объекта из контейнера spring, контейнер создаст объект того класса, который указан в бине.
- Spring bean - объект, который создается и управляется Spring Container.

\
Теперь надо создать объект spring (он называется ApplicationContext), это делается в самой программе:
- ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
- ApplicationContext.xml - это файл xml, где прописываются бины.
- Pet pet = context.getBean("myPet", Pet.class); Так создается объект, который прописан в xml файле.

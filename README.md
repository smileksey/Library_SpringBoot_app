# Электронная библиотека
## Учебный проект из курса Наиля Алишева по Spring и Hibernate

Веб-приложение для ведения учета книг и читателей библиотеки, которое позволяет добавлять в базу данных книги и читателей, изменять и удалять их.

**Главная страница:** *http://localhost:8080*

![screen](https://github.com/smileksey/Library_SpringBoot_app/blob/master/screens/index.png?raw=true)

**Страница со списком всех читателей:** *http://localhost:8080/people*

![screen](https://github.com/smileksey/Library_SpringBoot_app/blob/master/screens/readers.png?raw=true)

**Страница со списком всех книг:** *http://localhost:8080/books*

![screen](https://github.com/smileksey/Library_SpringBoot_app/blob/master/screens/books.png?raw=true)

Для удобства просмотра большого списка книг реализована пагинация. Чтобы вывести ограниченное количество книг на странице, запрос следует составить следующим образом: 
*http://localhost:8080/books?page=1&books_per_page=2*, 

где *page* - порядковый номер страницы с книгами, *books_per_page* - количество книнг на одной странице:

![screen](https://github.com/smileksey/Library_SpringBoot_app/blob/master/screens/pagination.png?raw=true)

Также есть функция сортировки книг по году публикации (по возрастанию): *http://localhost:8080/books?sort_by_year=true*

Параметры запроса для пагинации и для сортировки можно использовать совместно.

![screen](https://github.com/smileksey/Library_SpringBoot_app/blob/master/screens/sorted.png?raw=true)

**Страница читателя:** *http://localhost:8080/people/{id}*

Книги, которые взял определенный человек, назначаются ему и числятся за ним до возврата. На странице каждого читателя можно увидеть список таких книг:

![screen](https://github.com/smileksey/Library_SpringBoot_app/blob/master/screens/expired.png?raw=true)

Красным цветом выделяются просроченные книги (в данном случае - не сданные в библиотеку в 10-дневный срок)

**Страница книги:** *http://localhost:8080/books/{id}*

![screen](https://github.com/smileksey/Library_SpringBoot_app/blob/master/screens/vacant_book.png?raw=true)
![screen](https://github.com/smileksey/Library_SpringBoot_app/blob/master/screens/borrowed_book.png?raw=true)

На странице любой книги указано, свободна ли она в данный момент, а если нет - за кем она числится. Ее можно назначить кому-то из читателей, или освободить.

http://localhost:8080/books?sort_by_year=true

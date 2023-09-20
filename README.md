# symbol-frequency
## Тестовое задание

Спроектировать(продумать формат и ограничения входящих/исходящих параметров) и реализовать REST API, вычисляющее частоту встречи символов по заданной строке. Результат должен быть отсортирован по убыванию количества вхождений символа в заданную строку.

Пример входной строки: “aaaaabcccc”
Пример выходного результата: “a”: 5, “c”: 4, “b”: 1

Требования к решению:
Java 8+
Spring boot 2+
Решение должно быть покрыто тестами
У решения должна быть документация по запуску и формату входящих/исходящих параметров
Код решения необходимо разместить в публичном Github репозитории.
___

# Для запуска сервиса необходимо выполнить следующую команду:

### java -jar symbol_frequency.jar

API будет запущен на порту 8080.

# Получение частоты встречи символов в заданной строке URL

#### GET /symbol_frequency

Параметры запроса - input (обязательный) - строка для анализа.

## пример запроса 

GET-запрос:

### http://localhost:8080/symbol_frequency?input=aaaaabcccc 

## ответ 

### [{"character":"a","count":5},{"character":"c","count":4},{"character":"b","count":1}]



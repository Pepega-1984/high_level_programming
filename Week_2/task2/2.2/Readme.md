BankAccount
Класс
BankAccount - Банковский аккаунт со следующими атрибутами:

String accountNumber: Номер счета

double balance: Баланс

Конструктор

 BankAccount(String accountNumber, double balance): инициализирует банковский счёт с переданными параметрами.

 Методы
 
 deposit(double amount): пополняет баланс на amount
 
 withdraw(double amount): если возможно, снимает с баланса amount, иначе выдаёт ошибку 
 геттеры

 Работа программы
 
 В классе Main инициализируется счёт с 2500 на нём. после счёт пополняется на значение первого аргумента,
 а после с него снимается значение второго аргумента, если второй аргумент больше суммы 2500 и первого аргумента, высвечивается ошибка.

 Запуск из дирректории 2.2

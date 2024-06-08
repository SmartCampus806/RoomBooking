# Паспорт проекта: Smart Campus

## Общая информация

**Наименование проекта:** Smart Campus

**Шифр проекта (команды):** SmartCampus

**Заказчик проекта:** Кафедра 806 МАИ

**Руководитель темы от МАИ:** Булакина Мария Борисовна

**Целевая аудитория:** Сотрудники университета

**Образ результата:** IT-продукт

**Длительность проекта (даты начала и окончания):** 16.10.2023 - 31.12.2023

**Дата создания первой версии паспорта проекта:** 31.10.2023

### Краткое описание проекта
Проект "Smart Campus" - это веб-приложение, созданное для упрощения бронирования аудиторий и учета оборудования в университетской среде. Основная задача - сделать процессы более эффективными и прозрачными для сотрудников университета.

Приложение предлагает простой и интуитивно понятный интерфейс, который позволяет быстро и удобно осуществлять бронирование аудиторий. Мы также предусматриваем систему уведомлений для подтверждения бронирования и напоминаний, чтобы обеспечить актуальность информации.

### Цель проекта

Разработать веб-приложение Smart Campus для эффективного бронирования аудиторий и инвентаризации оборудования с целью оптимизации использования учебных ресурсов.

### Результат проекта

Работающее веб-приложение Smart Campus, позволяющее пользователям бронировать аудитории, проводить инвентаризацию оборудования и эффективно управлять ресурсами учебных помещений.

### Ограничения и допущения

- Ограничение по времени выполнения проекта.
- Допущение о наличии стабильного интернет-соединения для использования приложения.

### Необходимые ресурсы для выполнения проекта

- Доступ к серверам для хостинга приложения.
- Ресурсы для тестирования на различных типах устройств.

### Риски проекта

- Задержки в разработке из-за технических проблем.
- Недостаточная пользовательская активность и отклик на приложение.
- Возможные изменения в требованиях заказчика.

### Ссылки на ресурсы проекта:

- [Ссылка на GitHub репозиторий бекенда](https://github.com/hell-lumpen/RoomBooking)
- [Ссылка на GitHub репозиторий фронтенда](https://github.com/hell-lumpen/RoomBookingApp)

### Команда проекта

| ФИО                        | Роль                                        | Компетенция                             | Задача проекта                                                                                                                                                                                                                   |
|----------------------------|---------------------------------------------|-----------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Грубенко Максим Дмитриевич | Fullstack-разработчик, Database-разработчик | Java Spring Boot, ReactJS, PostgreSQL   | Разработать систему авторизации. Реализовать функционал регистрации и входа <br> Реализовать сервисы для уведомлений и других вспомогательных функций <br> Разработать компоненты фронтенда                                      |
| Буловятов Артем Максимович | Fullstack-разработчик          | Java Spring Boot, PostgreSQL     | Создать API для бронирования аудиторий и инвентаризации оборудования <br> Обработать запросы и валидировать данные <br> Участвовать в тестировании приложения                                                                    |
| Воронцов Данила Артемьевич | Fullstack-разработчик, UI/UX - дизайнер     | Java Spring Boot, ReactJS, UI/UX Design | Разработать компоненты для создания и изменения бронирования с интуитивным интерфейсом <br> Панель администратора, учитывая принципы дизайна <br> Обеспечить единообразный и привлекательный дизайн пользовательского интерфейса |


## Технические детали

### 1. Разработка RESTful API с использованием Java Spring Boot

#### 1.1 Описание

Разработать серверную часть приложения с использованием Java Spring Boot для обеспечения функционала бронирования аудиторий и инвентаризации оборудования.

#### 1.2 Реализация

- Создание RESTful API для регистрации, аутентификации и управления пользователями.
- Разработка эндпоинтов для бронирования аудиторий и проведения инвентаризации.
- Обеспечение безопасности API с использованием Spring Security.

### 2. Разработка парсера расписания на Python

#### 2.1 Описание

Интеграция веб-сервиса на Python для автоматического обновления расписания в системе.

#### 2.2 Реализация

- Создание API для взаимодействия между Java Spring Boot и Python.
- Разработка парсера для сбора данных о расписании.
- Регулярный вызов веб-сервиса для получения актуальной информации о расписании.

### 3. Разработка фронтенда на React JS

#### 3.1 Описание

Создание пользовательского интерфейса для взаимодействия с функционалом бронирования аудиторий и инвентаризации оборудования.

#### 3.2 Реализация

- Использование React JS для построения динамического и отзывчивого интерфейса.
- Интеграция с бекендом с использованием RESTful API для обеспечения потоковой работы данных.

### 4. Работа с PostgreSQL

#### 4.1 Описание

Использование PostgreSQL в качестве реляционной базы данных для эффективного хранения информации о бронированиях, пользователях и ресурсах системы.

#### 4.2 Реализация

- Создание и настройка схемы базы данных с учетом требований к хранению данных.
- Интеграция с Java Spring Boot для обеспечения взаимодействия с базой данных.

## Дополнительные функциональности

### 5. Логирование

#### 5.1 Описание

Реализация системы логирования для отслеживания действий пользователей и системных событий.

#### 

5.2 Реализация

- Использование библиотеки Log4j для Java Spring Boot приложения.
- Хранение логов в ClickHouse для удобного мониторинга и анализа.
- Дополнительная информация (IP-адрес, браузер) добавляется с использованием фильтров.

### 6. Административная панель

#### 6.1 Описание

Разграничение доступа и управление правами администраторов и других ролей.

#### 6.2 Реализация

- Роль "администратор" может динамически изменять права доступа для других ролей.
- Введение дополнительного поля в базе данных, определяющего доступные действия для каждой роли.
- Использование аннотаций в Spring Security для обеспечения безопасности.

### 7. Список всех действий

#### 7.1 Описание

Разработка функционала для записи и просмотра всех действий в системе.

#### 7.2 Реализация

- Создание лога для каждого действия с записью в ClickHouse.
- Добавление пользовательского интерфейса для администратора для просмотра логов и отчетов.
- Использование AOP (Aspect-Oriented Programming) для логирования внутри кода.

### 8. Генетический алгоритм для оптимального распределения аудиторий

#### 8.1 Описание

Разработка алгоритма для оптимального распределения аудиторий в зависимости от заявок.

#### 8.2 Реализация

- Использование библиотеки JGAP (Java Genetic Algorithms Package) для реализации генетического алгоритма.
- Учет различных параметров, таких как приоритеты, временные ограничения и объемы использования аудиторий.
- Автоматическая оптимизация в фоновом режиме с учетом статистики использования.

### 9. Модуль уведомлений

#### 9.1 Описание

Настройка сервиса уведомлений для информирования пользователей о событиях.

#### 9.2 Реализация

- Использование JavaMail API для отправки уведомлений по электронной почте.
- Интеграция с Telegram API для отправки уведомлений в чат.
- Конфигурирование уведомлений с учетом предпочтений пользователей.

## Задачи проекта с оценкой временных затрат

| №  | Название задачи                                      | Подзадачи                                                                                          | Время (в часах) |
|----|------------------------------------------------------|----------------------------------------------------------------------------------------------------|-----------------|
| 1  | Настройка проекта в среде разработки                 | Установка и настройка Spring Boot и ReactJS проектов.                                              | 5               |
|    |                                                      | Интеграция с PostgreSQL.                                                                           | 5               |
| 2  | Разработка бекенда на Spring Boot                    | Создание основных классов.                                                                         | 10              |
|    |                                                      | Настройка подключения к PostgreSQL.                                                                | 5               |
|    |                                                      | Настройка REST API.                                                                                | 15              |
| 3  | Разработка системы авторизации пользователей         | Реализация регистрации.                                                                            | 10              |
|    |                                                      | Реализация входа.                                                                                  | 10              |
|    |                                                      | Управление пользователями.                                                                         | 10              |
| 4  | Разработка системы бронирования                      | Создание API для бронирования аудиторий и инвентаризации.                                          | 15              |
|    |                                                      | Обработка запросов.                                                                                | 5               |
|    |                                                      | Валидация данных.                                                                                  | 5               |
| 5  | Разработка вспомогательных сервисов                  | Реализация сервисов для уведомлений и других вспомогательных функций.                              | 20              |
| 6  | Разработка модели данных в PostgreSQL                | Определение схемы базы данных.                                                                     | 5               |
|    |                                                      | Создание таблиц для бронирования аудиторий и инвентаризации оборудования.                          | 7               |
| 7  | Разработка frontend на ReactJS                       | Создание компонентов для:                                                                          | 50              |
|    |                                                      | - Окна авторизации.                                                                                |                 |
|    |                                                      | - Главной страницы.                                                                                |                 |
|    |                                                      | - Создания и изменения бронирования.                                                               |                 |
|    |                                                      | - Панели администратора.                                                                           |                 |
| 8  | Написание стилей                                     | Написание CSS для стилизации компонентов.                                                          | 25              |
|    |                                                      | Обеспечение единообразного дизайна приложения.                                                     |                 |
| 9  | Интеграция бекенда и фронтенда                       | Обеспечение взаимодействия между ReactJS и Spring Boot.                                            | 15              |
|    |                                                      | Тестирование API.                                                                                  | 10              |
| 10 | Разработка системы уведомлений                       | Настройка уведомлений для подтверждения бронирования и напоминаний.                                | 10              |
| 11 | Тестирование приложения и подготовка протокола       | Написание и проведение тестов.                                                                     | 15              |
|    |                                                      | Составление документации.                                                                          | 10              |
|    |                                                      | Подготовка протокола тестирования.                                                                 | 5               |
| 12 | Составление документации по использованию приложения | Написание руководства пользователя.                                                                | 5               |
|    |                                                      | Описание функционала.                                                                              | 5               |
|    |                                                      | Создание презентации.                                                                              | 5               |
| 13 | Развертывание приложения                             | Настройка сервера.                                                                                 | 5               |
|    |                                                      | Размещение бекенда и фронтенда.                                                                    | 5               |
|    |                                                      | Проверка работоспособности.                                                                        | 5               |
| 14 | Разработка RESTful API на Java Spring Boot           | a. Создание эндпоинтов для регистрации и аутентификации пользователей.                             | 15              |
|    |                                                      | b. Эндпоинты для бронирования аудиторий.                                                           | 15              |
|    |                                                      | c. Эндпоинты для проведения инвентаризации оборудования.                                           | 10              |
| 15 | Интеграция парсера расписания на Python              | a. Создание API для взаимодействия с Java Spring Boot.                                             | 10              |
|    |                                                      | b. Разработка парсера для сбора данных о расписании.                                               | 10              |
|    |                                                      | c. Регулярный вызов веб-сервиса для получения актуальной информации о расписании.                  | 5               |
| 16 | Разработка фронтенда на React JS                     | a. Создание интерфейса для бронирования аудиторий.                                                 | 15              |
|    |                                                      | b. Интерфейс для проведения инвентаризации оборудования.                                           | 15              |
|    |                                                      | c. Интеграция с бекендом через RESTful API.                                                        | 5               |
| 17 | Работа с PostgreSQL                                  | a. Создание и настройка схемы базы данных.                                                         | 10              |
|    |                                                      | b. Интеграция с Java Spring Boot.                                                                  | 10              |
| 18 | Логирование                                          | a. Использование библиотеки Log4j для Java Spring Boot приложения.                                 | 10              |
|    |                                                      | b. Хранение логов в ClickHouse.                                                                    | 5               |
|    |                                                      | c. Добавление дополнительной информации (IP-адрес, браузер) с использованием фильтров.             | 5               |
| 19 | Административная панель                              | a. Разграничение доступа и управление правами.                                                     | 15              |
|    |                                                      | b. Динамическое изменение прав доступа для ролей.                                                  | 10              |
|    |                                                      | c. Введение дополнительного поля в базе данных, определяющего доступные действия для каждой роли.  | 5               |
|    |                                                      | d. Использование аннотаций в Spring Security для обеспечения безопасности.                         | 10              |
| 20 | Список всех действий                                 | a. Создание логов для каждого действия.                                                            | 10              |
|    |                                                      | b. Добавление пользовательского интерфейса для просмотра логов и отчетов.                          | 5               |
|    |                                                      | c. Использование AOP (Aspect-Oriented Programming) для логирования внутри кода.                    | 5               |
| 21 | Генетический алгоритм для оптимального распределения | a. Использование библиотеки JGAP (Java Genetic Algorithms Package).                                | 15              |
|    |                                                      | b. Учет различных параметров, таких как приоритеты, временные ограничения, и объемы использования. | 15              |
|    |                                                      | c. Автоматическая оптимизация в фоновом режиме с учетом статистики использования.                  | 10              |
| 22 | Модуль уведомлений                                   | a. Настройка сервиса уведомлений.                                                                  | 10              |
|    |                                                      | b. Использование JavaMail API для отправки уведомлений по электронной почте.                       | 10              |
|    |                                                      | c. Интеграция с Telegram API для отправки уведомлений в чат.                                       | 5               |
|    |                                                      | d. Конфигурирование уведомлений с учетом предпочтений пользователей.                               | 5               |

# Техническое описание проекта веб-приложения по бронированию комнат

## Документация по API

### Получить бронирования в диапазоне времени

#### Запрос

```http
GET /api/bookings
```

**Параметры:**
- `startTime` (обязательно): Дата-время начала диапазона.
- `endTime` (обязательно): Дата-время конца диапазона.

#### Пример

```http
GET /api/bookings?startTime=2023-01-01T00:00:00&endTime=2023-01-10T00:00:00
```

#### Ответ

```json
[
  {
    "roomName": "Переговорка 1",
    "bookings": [
      {
        "id": 1,
        "startTime": "2023-01-05T10:00:00",
        "endTime": "2023-01-05T12:00:00",
        "bookingPurpose": "Совещание"
      },
      {
        "id": 2,
        "startTime": "2023-01-08T14:00:00",
        "endTime": "2023-01-08T16:00:00",
        "bookingPurpose": "Презентация"
      }
    ]
  },
  {
    "roomName": "Конференц-зал A",
    "bookings": [
      {
        "id": 3,
        "startTime": "2023-01-07T09:00:00",
        "endTime": "2023-01-07T11:00:00",
        "bookingPurpose": "Обсуждение проекта"
      }
    ]
  }
]
```

### Получить бронирования по комнате в диапазоне времени

#### Запрос

```http
GET /api/bookings/room/{roomId}
```

**Параметры:**
- `startTime` (обязательно): Дата-время начала диапазона.
- `endTime` (обязательно): Дата-время конца диапазона.

#### Пример

```http
GET /api/bookings/room/1?startTime=2023-01-01T00:00:00&endTime=2023-01-10T00:00:00
```

#### Ответ

```json
[
  {
    "id": 1,
    "startTime": "2023-01-05T10:00:00",
    "endTime": "2023-01-05T12:00:00",
    "bookingPurpose": "Совещание"
  },
  {
    "id": 2,
    "startTime": "2023-01-08T14:00:00",
    "endTime": "2023-01-08T16:00:00",
    "bookingPurpose": "Презентация"
  }
]
```

### Получить бронирования по пользователю в диапазоне времени

#### Запрос

```http
GET /api/bookings/user/{userId}
```

**Параметры:**
- `startTime` (обязательно): Дата-время начала диапазона.
- `endTime` (обязательно): Дата-время конца диапазона.

#### Пример

```http
GET /api/bookings/user/2?startTime=2023-01-01T00:00:00&endTime=2023-01-10T00:00:00
```

#### Ответ

```json
[
  {
    "id": 1,
    "startTime": "2023-01-05T10:00:00",
    "endTime": "2023-01-05T12:00:00",
    "bookingPurpose": "Совещание"
  },
  {
    "id": 3,
    "startTime": "2023-01-07T09:00:00",
    "endTime": "2023-01-07T11:00:00",
    "bookingPurpose": "Обсуждение проекта"
  }
]
```

### Обновить бронирование

#### Запрос

```http
PUT /api/bookings/{bookingId}
```

**Параметры:**
- `isPeriodic` (опционально): Логический флаг, указывающий, нужно ли обновить всю цепочку бронирования.

#### Пример

```http
PUT /api/bookings/3
```

**Тело запроса (JSON):**
```json
{
  "bookingPurpose": "Новая цель бронирования",
  "isPeriodic": false
}
```

#### Ответ

```json
{
  "id": 3,
  "startTime": "2023-01-07T09:00:00",
  "endTime": "2023-01-07T11:00:00",
  "bookingPurpose": "Новая цель бронирования"
}
```

### Удалить бронирование

#### Запрос

```http
DELETE /api/bookings/{bookingId}
```

**Параметры:**
- `isPeriodic` (опционально): Логический флаг, указывающий, нужно ли удалить всю цепочку бронирования.

#### Пример

```http
DELETE /api/bookings/4?isPeriodic=true
```

#### Ответ

```text
Бронирование успешно удалено
```

### Создать бронирование

#### Запрос

```http
POST /api/bookings
```

**Тело запроса (JSON):**
```json
{
  "roomId": 1,
  "userId": 2,
  "startTime": "2023-02-01T10:00:00",
  "endTime": "2023-02-01T12:00:00",
  "bookingPurpose": "Новое бронирование",
  "isPeriodic": true
}
```

#### Ответ

```json
{
  "id": 5,
  "startTime": "2023-02-01T10:00:00",
  "endTime": "2023-02-01T12:00:00",
  "bookingPurpose": "Новое бронирование"
}
```

## Описание схемы базы данных для бронирования комнат (НЕ АКТУАЛЬНО. В БРОНИРОВАНИИ ПОМЕНЯЛОСЬ ПОЛЕ КОНЦА ПОВТОРЯЮЩХСЯ БРОНИРОВАНИЙ)

### Таблица `Users` (Пользователи)

#### Структура таблицы:

```sql
CREATE TABLE IF NOT EXISTS Users (
    user_id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    phone_number VARCHAR(15) UNIQUE NOT NULL,
    fullname VARCHAR(100) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

#### Описание столбцов:

- `user_id`: Идентификатор пользователя (первичный ключ).
- `username`: Имя пользователя.
- `phone_number`: Номер телефона пользователя (уникальный).
- `fullname`: Полное имя пользователя.
- `password_hash`: Хеш пароля пользователя.
- `role`: Роль пользователя (например, начальник, администратор, техник, преподаватель).
- `created_at`: Время создания пользователя (по умолчанию текущее время).

### Таблица `Rooms` (Комнаты)

#### Структура таблицы:

```sql
CREATE TABLE IF NOT EXISTS Rooms (
    room_id SERIAL PRIMARY KEY,
    room_name VARCHAR(50) NOT NULL,
    capacity INT NOT NULL,
    has_computers BOOLEAN NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

#### Описание столбцов:

- `room_id`: Идентификатор комнаты (первичный ключ).
- `room_name`: Название комнаты.
- `capacity`: Вместимость комнаты.
- `has_computers`: Наличие компьютеров в комнате.
- `created_at`: Время создания комнаты (по умолчанию текущее время).

### Таблица `Bookings` (Бронирования)

#### Структура таблицы:

```sql
CREATE TABLE IF NOT EXISTS Bookings (
    booking_id SERIAL PRIMARY KEY,
    room_id INT NOT NULL,
    user_id INT NOT NULL,
    start_time TIMESTAMP NOT NULL,
    end_time TIMESTAMP NOT NULL,
    recurring_interval INT,
    recurring_unit VARCHAR(10),
    recurring_count INT,
    booking_purpose VARCHAR(255),
    CONSTRAINT fk_room FOREIGN KEY (room_id) REFERENCES Rooms(room_id),
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES Users(user_id),
    CHECK (start_time < end_time),
    CHECK (
        (recurring_interval IS NOT NULL AND recurring_unit IS NOT NULL AND recurring_count IS NOT NULL) OR
        (recurring_interval IS NULL AND recurring_unit IS NULL AND recurring_count IS NULL)
    ),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

#### Описание столбцов:

- `booking_id`: Идентификатор бронирования (первичный ключ).
- `room_id`: Идентификатор комнаты (внешний ключ).
- `user_id`: Идентификатор пользователя (внешний ключ).
- `start_time`: Время начала бронирования.
- `end_time`: Время окончания бронирования.
- `recurring_interval`: Интервал повторения периодических бронирований.
- `recurring_unit`: Единица измерения интервала (например, "weeks" для недель).
- `recurring_count`: Количество повторений периодических бронирований.
- `booking_purpose`: Цель бронирования.
- `created_at`: Время создания бронирования (по умолчанию текущее время).

#### Ограничения и проверки:

- `fk_room`: Внешний ключ, связанный с таблицей `Rooms`.
- `fk_user`: Внешний ключ, связанный с таблицей `Users`.
- `CHECK (start_time < end_time)`: Проверка корректности времени начала и окончания бронирования.
- `CHECK (...)`: Проверка наличия значений для интервала, единицы и количества в периодических бронированиях.

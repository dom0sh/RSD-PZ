# Приклади запитів — Заняття 1/1

Бек має бути запущений: `./mvnw spring-boot:run` (порт 8080).

## 1. Список фільмів (картки)

```bash
curl http://localhost:8080/api/movies
```

Очікувана відповідь (скорочено):
```json
[
  { "id": 1, "title": "Тіні забутих предків", "director": "Сергій Параджанов", "price": 150.00, "posterUrl": "/posters/tini-zabutykh-predkiv.jpg" },
  { "id": 2, "title": "Земля", "director": "Олександр Довженко", "price": 120.00, "posterUrl": "/posters/zemlia.jpg" }
]
```

## 2. Один фільм з деталями

```bash
curl http://localhost:8080/api/movies/1
```

Очікувана відповідь:
```json
{
  "id": 1,
  "title": "Тіні забутих предків",
  "director": "Сергій Параджанов",
  "price": 150.00,
  "year": 1965,
  "posterUrl": "/posters/tini-zabutykh-predkiv.jpg",
  "description": "Історія кохання Івана та Марічки на тлі гуцульських традицій.",
  "genre": "Драма"
}
```

## 3. Фільм, якого немає → 404

```bash
curl -i http://localhost:8080/api/movies/999
```

Очікувано: перший рядок `HTTP/1.1 404`.

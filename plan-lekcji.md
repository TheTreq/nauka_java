# Plan lekcji — Java + Spring Boot + JUnit
## dla junior testera automatycznego (wersja zmodyfikowana)

---

## Moduł 1 — Podstawy i środowisko

### Lekcja 1. Czym jest Java i po co testerowi automatycznemu ✅

- czym zajmuje się junior tester automatyczny
- czym różni się test manualny od automatycznego
- czym jest Java, JDK, JVM
- czym jest projekt Maven
- czym jest test API
- czym jest JUnit
- czym jest framework
- omówienie projektu końcowego

### Lekcja 2. Przygotowanie środowiska ✅

- instalacja JDK 21
- instalacja IntelliJ IDEA Community
- instalacja Git
- instalacja Claude Desktop
- omówienie struktury katalogów `src/main/java` i `src/test/java`

### Lekcja 2.5. Konfiguracja Gita i GitHub ✅

- `git config --global user.name`
- `git config --global user.email`
- pierwsze repozytorium lokalne
- pierwszy commit
- plik `.gitignore`
- GitHub: pierwsze repozytorium, push, link dla Przemka
- dlaczego Git od pierwszego dnia

---

## Moduł 2 — Podstawy Javy dla testerów

### Lekcja 3. Pierwszy test w JUnit ✅

- czym jest test automatyczny
- dodanie JUnit 5 do projektu
- pierwszy test z adnotacją `@Test`
- uruchomienie testu z IntelliJ
- uruchomienie testu przez Maven
- pierwszy świadomie nieudany test

### Lekcja 4. Podstawy Javy potrzebne do testów

- zmienne
- typy danych: `String`, `int`, `boolean`, `double`
- proste operacje na danych
- wypisywanie wartości w konsoli
- przykłady praktyczne

### Lekcja 5. Asercje i AssertJ ← POŁĄCZONE

- czym jest asercja
- `assertEquals`, `assertTrue`, `assertFalse` z JUnit
- dlaczego AssertJ jest lepszy od razu
- `assertThat`, `isNotNull`, `isNotEmpty`, `isEqualTo`, `contains`
- przykład: sprawdzenie statusu odpowiedzi
- przykład: sprawdzenie czy tekst nie jest pusty

### Lekcja 6. Warunki w Javie

- `if`, `else`
- porównywanie wartości
- operatory logiczne
- prosta walidacja danych
- przykłady praktyczne

### Lekcja 7. Metody w Javie

- czym jest metoda
- parametry i wartość zwracana
- metoda pomocnicza do walidacji statusu
- pierwsze porządkowanie kodu testowego

### Lekcja 8. Klasy i obiekty

- czym jest klasa i obiekt
- pola klasy, konstruktor
- przykład: klasa `TestResult`
- przykład: klasa `ApiResponseInfo`

### Lekcja 9. Kolekcje w Javie

- `List`, `Map`
- iterowanie po liście
- przykład: lista endpointów do sprawdzenia
- przykład: mapa statusów HTTP

---

## Moduł 3 — Testy API

### Lekcja 10. Pierwszy test publicznego API

- czym jest HTTP, endpoint, metoda `GET`
- czym jest status HTTP
- wykonanie prostego requestu
- sprawdzenie statusu i danych

### Lekcja 11. JSON w testach API

- czym jest JSON
- struktura: obiekt, tablica, pola
- odczyt pól z odpowiedzi
- przykład: `id`, `title`, `userId`

### Lekcja 12. Testy kilku endpointów GET

- test pojedynczego zasobu
- test listy zasobów
- sprawdzenie liczby elementów i wymaganych pól
- przykład: `posts`, `users`, `comments`

### Lekcja 13. Testy negatywne

- czym jest test negatywny
- test dla nieistniejącego ID
- oczekiwany status `404`
- dobre nazwy testów negatywnych

### Lekcja 13.5. Debugowanie ← NOWA

- czym jest debugger
- jak czytać stack trace
- debugger w IntelliJ
- co robić gdy test się wysypie i nie wiesz dlaczego

### Lekcja 14. Testy parametryzowane w JUnit

- `@ParameterizedTest`, `@ValueSource`, `@CsvSource`
- kiedy test parametryzowany pomaga
- kiedy pogarsza czytelność

### Lekcja 15. Maven i zależności projektu

- dokładniejsze omówienie `pom.xml`
- dependency, plugin, wersje bibliotek
- `mvn clean test`
- raporty testów

---

## Moduł 4 — Spring Boot

### Lekcja 16. Spring Boot — minimalne wejście

- po co Spring Boot w projekcie testowym
- czym jest kontekst, bean, dependency injection
- pierwszy test ze Springiem

### Lekcja 17. Konfiguracja przez `application.yml`

- plik `application.yml`
- konfiguracja base URL, timeoutów, profilu `test`
- dlaczego nie trzymać URL-i w kodzie

### Lekcja 18. Klient API jako osobna klasa

- klasa `PostApiClient`
- metody `getPostById`, `getAllPosts`
- podział odpowiedzialności

### Lekcja 19. DTO — mapowanie odpowiedzi

- czym jest DTO
- klasa `PostResponse`
- deserializacja JSON na obiekt Java
- asercje na obiekcie zamiast surowym JSON

---

## Moduł 5 — Zaawansowane testy

### Lekcja 20. Testy POST

- czym jest metoda `POST` i body requestu
- request DTO: `CreatePostRequest`
- sprawdzenie statusu i danych odpowiedzi

### Lekcja 21. Testy PUT i PATCH

- różnica między `PUT` i `PATCH`
- aktualizacja całego i części zasobu
- kiedy testować co

### Lekcja 22. Testy DELETE

- oczekiwane statusy odpowiedzi
- ograniczenia publicznych API

### Lekcja 23. Testy autoryzacji ← PRZESUNIĘTE

- czym jest token i nagłówek `Authorization`
- test poprawnego i błędnego logowania
- test requestu bez tokena
- zmienne środowiskowe zamiast danych w kodzie

### Lekcja 24. Obsługa błędów HTTP

- statusy `400`, `401`, `403`, `404`, `500`
- jak testować błędne dane i brak autoryzacji

---

## Moduł 6 — PostgreSQL

### Lekcja 25. Podstawy PostgreSQL

- baza danych, tabela, rekord, kolumna
- podstawy SQL: `SELECT`, `INSERT`, `UPDATE`, `DELETE`
- instalacja PostgreSQL i pgAdmin

### Lekcja 26. Tabela na wyniki testów

- tabela `test_results` z kolumnami
- ręczne dodanie i odczyt rekordów

### Lekcja 27. Połączenie Spring Boot z PostgreSQL

- zależność PostgreSQL JDBC
- konfiguracja w `application.yml`
- najczęstsze błędy połączenia

### Lekcja 28. Zapis wyniku testu do bazy

- `JdbcTemplate`
- klasa `TestResultRepository`
- pierwszy test który zapisuje wynik do bazy

### Lekcja 29. Pobieranie danych testowych z bazy

- tabela `test_data`
- test wykonany na danych z PostgreSQL

---

## Moduł 7 — Jakość kodu

### Lekcja 30. Porządkowanie testów API

- pakiety: `client`, `dto`, `db`, `api`, `config`
- nazewnictwo klas i metod
- zasada: test czytelny dla osoby znającej biznes

### Lekcja 31. Praca z danymi testowymi

- dane statyczne vs dynamiczne
- unikanie zależności między testami

### Lekcja 32. Logowanie w testach

- SLF4J
- co logować a czego nie (hasła, tokeny)

### Lekcja 33. Raporty testów

- raporty Surefire
- wynik JUnit XML
- powiązanie z tabelą `test_results`

---

## Moduł 8 — Git i CI/CD

### Lekcja 34. Git — powtórka i GitLab

- `git init`, `status`, `add`, `commit`, `log`
- `.gitignore`
- GitLab: push, branch, merge request
- podstawy code review

### Lekcja 35. Prosty GitLab CI

- czym jest pipeline i `.gitlab-ci.yml`
- uruchomienie `mvn test` w GitLabie
- zapis raportów JUnit jako artefaktów

### Lekcja 36. Podział testów na smoke i regression

- `@Tag("smoke")`, `@Tag("regression")`
- uruchomienie wybranej grupy
- podział pipeline

---

## Moduł 9 — Finał

### Lekcja 37. Projekt końcowy

- uporządkowanie całego repozytorium
- testy `GET`, `POST`, negatywne
- DTO, klient API, konfiguracja Spring Boot
- zapis i pobieranie danych z PostgreSQL
- raporty JUnit, projekt w GitLabie, pipeline

### Lekcja 38. Powtórka i rozmowa techniczna

- pytania rekrutacyjne z Javy, JUnit, REST API, SQL, Git, CI
- jak opowiadać o projekcie
- czego nie udawać na rozmowie

---

## Podsumowanie

| Moduł | Lekcje | Temat |
|---|---|---|
| 1 | 1–2.5 | Podstawy i środowisko |
| 2 | 3–9 | Podstawy Javy dla testerów |
| 3 | 10–15 | Testy API |
| 4 | 16–19 | Spring Boot |
| 5 | 20–24 | Zaawansowane testy |
| 6 | 25–29 | PostgreSQL |
| 7 | 30–33 | Jakość kodu |
| 8 | 34–36 | Git i CI/CD |
| 9 | 37–38 | Finał |

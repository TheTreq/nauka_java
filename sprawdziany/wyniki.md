# Dziennik sprawdzianów — Norbert

> Sprawdziany z całości materiału. Minimum 90/100 żeby przejść dalej — bez wyjątków.

---

## Sprawdzian #1 — poprzednia sesja (przed 1 lipca 2026), godzina nieznana

**Materiał:** Terminal (pwd, cd, ls), Git (add/commit/push, .gitignore), Java (JVM, kompilator)

**Wynik: 58/100** ❌

Co nie wyszło:
- Nawigacja: wpisał `cd ~` zamiast `cd ~/nauka_java`
- `.gitignore` — zupełnie zapomniane
- JVM — nie wiedział czym jest

---

## Sprawdzian #2 — poprzednia sesja (przed 1 lipca 2026), godzina nieznana

**Materiał:** jak wyżej (powtórka po wyjaśnieniach)

**Wynik: 76/100** ❌

Co nie wyszło:
- Część pytań o JVM nadal niejasna
- Drobne błędy w Git

Postęp: +18 punktów względem sprawdzianu #1

---

## Sprawdzian #3 — 1 lipca 2026, ok. 20:00

**Materiał:** Lekcja 1 (teoria), Lekcja 2 (środowisko), Lekcja 2.5 (Git/GitHub), Lekcja 3 (JUnit podstawy)

**Wynik: 55/100** ❌

Co nie wyszło:
- Maven — nie wiedział czym jest
- Różnica src/main vs src/test — nie wiedział
- void — mylił z deklaracją zmiennej

---

## Sprawdzian #4 — 1 lipca 2026, ok. 20:30

**Materiał:** jak wyżej (powtórka po wyjaśnieniach)

**Wynik: 97/100** ✅

Co nie wyszło:
- JVM — powiedział "kod" zamiast "bytecode" (drobnostka)

Postęp: +42 punkty względem sprawdzianu #3

---

## Sprawdzian #5 — 2 lipca 2026

**Materiał:** Lekcje 1-3 w całości (teoria, środowisko, Git, JUnit/assertEquals/mvn test)

**Wynik: 60/100** ❌

Co nie wyszło:
- JVM — nazwa i funkcja błędne (pomylone ze "środowiskiem do pisania testów")
- Plugin vs dependency — brak odpowiedzi (temat niedostatecznie wytłumaczony w sesji, do powtórzenia porządnie)
- src/main vs src/test dla klas pomocniczych (np. PostApiClient) — błędna odpowiedź (materiał z przyszłej Lekcji 18, przedwczesne pytanie)
- Składnia komend Git (`git . add` zamiast `git add .`, brak `-m` przy commit)
- Framework vs biblioteka — biblioteka opisana błędnie jako "obudowanie frameworku"

Co wyszło dobrze (100%):
- Mechanizm przerywania wykonania metody przez wyjątek (kod po nieudanej asercji się nie wykonuje)
- `mvn test`
- Skutek braku `@Test`

**Uwaga:** sesja mocno zdominowana przez ok. 90-minutową przerwę na naprawę klawiatury (tylda/keyd) — mogło to wpłynąć na skupienie przy nauce.

---

## Sprawdzian #6 — 2 lipca 2026

**Materiał:** Lekcje 1-3 w całości (zakres poprawiony po sprawdzianie #5 — bez pytań spoza `plan-lekcji.md`)

**Wynik: 59/100** ❌

Co nie wyszło:
- Framework vs biblioteka — sama etykieta ("szkielet") bez zrozumienia mechanizmu kto kogo woła
- Komendy Git (config/add/commit/push) — całkowita blokada, ten sam problem co w sprawdzianie #5
- Elementy dependency w `pom.xml` (groupId/artifactId/version) — zapomniane całkowicie
- Czym jest test API — mylone z ogólnym testowaniem manualnym gotowej aplikacji
- JVM — mechanizm opisany poprawnie, ale bez słowa "bytecode" (ten sam błąd co w sprawdzianie #4)
- `@Test` — koncepcja poprawna, nazwane "komendą" zamiast adnotacją
- Kolejność `mvn test` — podana niepewnie razem z błędnym wariantem "test mvn"

Co wyszło dobrze:
- Manualny vs automatyczny — definicja poprawna (bez części "kiedy się opłaca")
- Maven — "menadżer do wszystkiego"
- `src/main` vs `src/test`
- `.gitignore`
- Analiza kodu: przerwanie metody przez nieudany `assertEquals` — pełne zrozumienie

**Uwaga:** ten sam dzień co sprawdzian #5, po dużej dawce nowych korekt — realistycznie kolejna powtórka, nie skok od razu do 90+.

---

## Podsumowanie

| # | Data | Wynik | Status |
|---|---|---|---|
| 1 | poprzednia sesja | 58/100 | ❌ |
| 2 | poprzednia sesja | 76/100 | ❌ |
| 3 | 1 lipca 2026 | 55/100 | ❌ |
| 4 | 1 lipca 2026 | 97/100 | ✅ |
| 5 | 2 lipca 2026 | 60/100 | ❌ |
| 6 | 2 lipca 2026 | 59/100 | ❌ |

**Trend:** niejednolity — sprawdzian #4 przekroczył próg 90, #5 i #6 poniżej. Słabe punkty się powtarzają (Git, framework/biblioteka) — potrzebują dedykowanej powtórki, nie tylko ponownego tłumaczenia. Sprawdzian #7 zaplanowany przed Lekcją 4.

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

## Egzamin #7 — 3 lipca 2026 (po pełnej powtórce Priorytetu 1)

**Materiał:** Lekcje 1-3 w całości — pytania wyłącznie z zakresu już przerobionego, zgodnie z `plan-lekcji.md`. Poprzedzony pełną powtórką 7 słabych punktów ze Sprawdzianów #5/#6 (JVM/bytecode, plugin vs dependency, framework vs biblioteka, elementy pom.xml, adnotacja @Test, test API, Git).

**Wynik: 82/100** ❌ (pierwszy egzamin pod nową nazwą; próg 90)

Co nie wyszło:
- Framework vs biblioteka zastosowane do konkretnego przykładu JUnita (2/10) — `@Test` błędnie nazwane zachowaniem biblioteki (powinno być frameworka: JUnit sam wywołuje tę metodę). Mimo że ogólny mechanizm testu "kto kogo wywołuje" był tego samego dnia dokładnie przećwiczony i potwierdzony jako solidnie rozumiany (łącznie z odrzuceniem niespójnej analogii Przemka o silniku samochodu)
- JDK — relacja do JVM nieznana, sam skrót podany poprawnie (3/6)
- Maven — 2 z 3 funkcji poprawne (pobieranie, kompilacja), brakuje "uruchamia testy" jako osobnej funkcji (5/8)
- `@Test` vs komenda — dobra treść (poprawnie przypisane do JUnita, nie Mavena), ale brak wprost kontrastu "bierna etykieta vs akcja natychmiastowa" (6/8)
- Przerwanie metody przez nieudany `assertEquals` — poprawna konkluzja, ale mętne uzasadnienie (5/6)

Co wyszło dobrze (pełne punkty):
- JVM/bytecode, manualny vs automatyczny, test API, src/main vs src/test, `.gitignore`, sekwencja komend Gita, groupId/artifactId/version
- Dependency vs plugin — niemal pełne (9/10)

**Postęp:** +22-23 punkty względem Sprawdzianów #5 (60) i #6 (59) — wyraźna poprawa po pełnej powtórce, ale wciąż poniżej progu 90. Przed korektą: dogłębna powtórka punktu o framework vs biblioteka w konkretnym przykładzie JUnita (największa dziura) oraz trzech mniejszych punktów wyżej.

---

## Korekta Egzaminu #7 — 3 lipca 2026 (retest ukierunkowany na 4 słabe punkty)

Zamiast pełnego nowego egzaminu od zera (nowa zasada — patrz [[feedback_teaching_style]] w pamięci Claude: powyżej ~75/100 robimy tylko ukierunkowany retest słabych punktów), Norbert odpowiedział ponownie tylko na pytania odpowiadające 4 słabym punktom z Egzaminu #7. Stare oceny tych punktów podmienione na nowe (przeliczone proporcjonalnie tam, gdzie skala punktowa się różniła), reszta zostaje bez zmian:

| Punkt | Stara ocena | Nowa ocena | Finalna |
|---|---|---|---|
| JDK↔JVM | 3/6 | 8/8 (przeliczone) | 6/6 |
| Maven — 3 funkcje | 5/8 | 8/8 | 8/8 |
| Framework vs biblioteka (JUnit) | 2/10 | 8/12 (przeliczone) | 7/10 |
| `@Test` vs komenda | 6/8 | 5/8 | 5/8 |

Uczciwie odnotowane: punkt `@Test` vs komenda wypadł przy retescie odrobinę słabiej (5/8 zamiast 6/8) — nie podciągnięte sztucznie w górę.

**Wynik po korekcie: 92/100 ✅ — próg 90 przekroczony.**

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
| 7 | 3 lipca 2026 | 82/100 → **92/100 po korekcie** | ✅ |

**Trend:** Egzamin #7 nie zaliczony za pierwszym razem (82), ale po ukierunkowanej powtórce i retescie 4 słabych punktów — skorygowany do 92/100 i zaliczony. Lekcja 4 odblokowana.

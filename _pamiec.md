# Pamięć o Norbercie i naszej współpracy

## Kim jest Norbert

- Email: norbert.ploszaj@gmail.com, GitHub: TheTreq
- Dekada doświadczenia jako grafik 3D w gamedevie (EpicGames org) — rozumie pipeline'y, frameworki, silniki, zależności techniczne
- Nie jest programistą, nigdy nie pracował zawodowo z kodem
- Dopiero zaczyna naukę programowania — kontekst: testy automatyczne w Javie
- Analogie z gamedevu trafiają do niego dobrze i warto ich używać

## Środowisko Norberta

- System: Ubuntu 26.04 LTS na Lenovo Y520-15IKBN
- Zainstalowane: JDK 21, Git, IntelliJ IDEA Community, 1Password, Claude Desktop
- Drugi dysk 1,8 TB (WD) sformatowany z NTFS na ext4, skonfigurowany automount przez fstab
- Git skonfigurowany: user.name=TheTreq, user.email=norbert.ploszaj@gmail.com
- GitHub repo: https://github.com/TheTreq/nauka_java (publiczne, dla Przemka)

## Przemek

- Brat Norberta, tester automatyczny z doświadczeniem
- Stworzył ścieżkę nauki dla Norberta
- Śledzi postępy przez GitHub: https://github.com/TheTreq/nauka_java
- Może zostawiać uwagi przez GitHub Issues

## Co już przerobiliśmy

- Lekcja 1 ✅: teoria — czym jest Java, JDK, JVM, Maven, JUnit, framework, test API
- Lekcja 2 ✅: przygotowanie środowiska (JDK 21, IntelliJ, Git, Claude Desktop)
- Lekcja 2.5 ✅: git config (user.name, user.email), GitHub repo nauka_java, klon lokalny, push plików
- Lekcja 3 (w toku): pierwszy test w JUnit
  - Dodano JUnit 5.11.0 do pom.xml jako dependency, Maven Sync wykonany
  - Stworzono PierwszyTest.java w src/test/java
  - Napisano pierwszy @Test (pusty) — przeszedł ("1 test passed")
  - Omówiono: klasa, metoda, void, @Test, import, pom.xml struktura, groupId/artifactId/version, Maven vs Gradle
  - Lekcja 3 NIE UKOŃCZONA — brakuje: assertEquals, świadomie nieudany test, mvn test

## Dodatkowe rzeczy zrobione w tej sesji (poza planem lekcji)

- Stworzono sciagawka.md — słownik pojęć z głupimi skojarzeniami (JVM="Jezu Włącz Mi", MVN="Menedżer Wszystkiego Nie?")
- Stworzono sprawdziany/wyniki.md — dziennik sprawdzianów z ocenami
- Zainstalowano ntfy na telefonie Norberta, skonfigurowano kanał: norbert-nauka-java
- Stworzono ~/notify_sprawdzian.sh — skrypt do wysyłania powiadomień po sprawdzianie
- .bashrc ma błąd składni (stray '{') — działa ale source wyrzuca warning, do naprawy
- PLAN: yeetrack.xyz jako dashboard sprawdzianów — każdy sprawdzian dostaje stronę, powiadomienie = link

## Co Norbert rozumie po sesji (stan na 1 lipca 2026)

- pom.xml = konfiguracja projektu (nie Java), XML to osobny format
- dependency = biblioteka pobierana przez Maven z internetu
- groupId/artifactId/version = unikalny adres każdej biblioteki/projektu w Maven
- src/main/java = kod aplikacji, src/test/java = testy (standardowa struktura Maven)
- klasa = pojemnik na kod, każdy plik .java = jedna klasa o tej samej nazwie
- @Test = adnotacja JUnit — oznacza metodę jako test do uruchomienia
- adnotacje @ istnieją w całej Javie, nie tylko JUnit
- void = metoda nic nie zwraca (w przeciwieństwie do int, String itd.)
- import = mówi Javie skąd pochodzi użyta klasa/adnotacja
- Maven vs JUnit: Maven = menedżer całości, JUnit = biblioteka którą Maven dostarcza
- biblioteka vs framework: biblioteka = narzędzie które TY wywołujesz, framework = narzuca strukturę
- sprawdzian #4: 97/100 ✅ (próg 90 przekroczony)

## Co sprawiło trudność

- void vs deklaracja zmiennej — poprawione w tej sesji, teraz rozumie
- adnotacje @ — ogólny pomysł jest, potrzeba więcej przykładów przy kolejnych lekcjach
- **KLUCZOWE:** Norbert chce rozumieć PRZED pisaniem kodu, nie po — Claude ma tłumaczyć każdy element zanim każe cokolwiek pisać
- IntelliJ: snap intellij-idea-community = unified distribution — "Start Free Trial" to tylko oferta, działa za darmo
- .bashrc: podczas dodawania funkcji notify wkradł się błąd składni — do naprawy na początku następnej sesji

## Co robimy następnie

**Priorytet 1 — projekt poboczny (yeetrack.xyz):**
- Przejrzeć kod yeetrack.xyz na komputerze Norberta
- Dodać endpoint/stronę dla każdego sprawdzianu
- Powiadomienie ntfy = link do strony ze szczegółami sprawdzianu
- Przemek klika link → widzi pytania, odpowiedzi, ocenę

**Priorytet 2 — Lekcja 3 dokończenie:**
- assertEquals, assertTrue — co to jest i jak działa (tłumaczyć PRZED pisaniem)
- Świadomie nieudany test — jak wygląda fail
- mvn test w terminalu

## Środowisko / pliki do zapamiętania

- ~/notify_sprawdzian.sh — skrypt do powiadomień ntfy
- ~/nauka_java/sciagawka.md — słownik pojęć
- ~/nauka_java/sprawdziany/wyniki.md — dziennik sprawdzianów
- ntfy kanał: norbert-nauka-java
- yeetrack.xyz — domena Norberta, NAS server, kod na tym komputerze (lokalizacja do ustalenia)

## Jak pracujemy razem

- Każda komenda tłumaczona słowo po słowie — co znaczy każde słowo i każda flaga
- Regularne testy wiedzy: pytania, kawałki kodu do analizy, zadania do wyjaśnienia własnymi słowami
- Nie upraszczać za bardzo — Norbert rozumie techniczne zależności
- Używać analogii z gamedevu (silniki, frameworki, pipeline'y, rendery) gdy to pomaga
- Gdy Norbert pokazuje screenshot z terminala lub aplikacji — analizować co widać i reagować konkretnie
- Norbert chce rozumieć DLACZEGO, nie tylko JAK
- Plik `plan-lekcji.md` to nasza wspólna mapa postępów — aktualizować po każdej ukończonej lekcji
- **PRZED każdym przejściem do nowego tematu — zrobić test z CAŁEJ dotychczasowej wiedzy, nie tylko ostatniej lekcji**
- **Co godzinę (lub przy naturalnej przerwie) — krótki test powtórkowy z całości materiału**
- Oceniać obiektywnie i rygorystycznie w skali 0-100, bez taryfy ulgowej
- Po teście: przy każdej złej odpowiedzi dać wyjaśnienie z głupkowatym/śmiesznym przykładem — żeby zostało w pamięci
- Norbert sygnalizował że za szybko szliśmy — lepiej wolniej z pełnym zrozumieniem niż szybko w ciemno
- **MINIMUM 90/100 na sprawdzianie żeby przejść dalej — bez wyjątków. Poniżej 90 = powtarzamy materiał i robimy nowy test.**

## ZASADY DLA CLAUDE — obowiązkowe w każdej sesji

> Te zasady dotyczą Claude'a, nie Norberta. Claude musi ich przestrzegać automatycznie.

1. **Na początku każdej sesji** — przeczytaj oba pliki: `_pamiec.md` i `plan-lekcji.md`, żeby wiedzieć gdzie jesteśmy.

2. **W trakcie sesji** — po każdej ukończonej lekcji lub ważnym kroku Claude natychmiast aktualizuje:
   - `_pamiec.md` → sekcje "Co już przerobiliśmy" i "Co robimy następnie"
   - `plan-lekcji.md` → oznacza lekcję jako ukończoną (dodaje `✅` przy tytule)

3. **Na końcu sesji** — Claude z własnej inicjatywy aktualizuje oba pliki i przypomina Norbertowi żeby zrobił `git add . && git commit -m "opis" && git push` — żeby Przemek widział aktualne postępy.

4. **Format aktualizacji** — w `_pamiec.md` zawsze zapisywać: co zostało zrobione, co Norbert rozumie, co sprawiło trudność, co jest następne. To ma być użyteczny brief dla nowej sesji, nie suchy log.

## Projekt końcowy

- Kurs: Java + Spring Boot + JUnit dla junior testera automatycznego
- Projekt końcowy: testy publicznego API + zapis wyników do PostgreSQL
- Plan lekcji: `plan-lekcji.md` — 38 lekcji, 9 modułów

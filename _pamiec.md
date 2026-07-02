# Pamięć o Norbercie i naszej współpracy

> ⚡ **Zacznij tutaj (stan na 2 lipca 2026, wieczór):** Obsidian **w pełni działa** — sejf `~/nauka_java/sciagawka/` otwarty i potwierdzony jako czytelny (patrz "Sesja 2 lipca 2026, wieczór — Obsidian naprawiony" niżej). Temat zamknięty. Teraz: **powtórka wszystkich słabych punktów ze Sprawdzianów #5/#6** (Git w terminalu na żywo, framework vs biblioteka, pom.xml, bytecode, adnotacja, test API) — dopiero PO pełnej powtórce, formalny **Egzamin #7** (nowa nazwa dla "sprawdzianu" milowego, patrz niżej). ŻADNEGO egzaminu przed ukończeniem powtórki — to twardy warunek od Norberta.

## Kim jest Norbert

- Email: norbert.ploszaj@gmail.com, GitHub: TheTreq
- Dekada doświadczenia jako grafik 3D w gamedevie (EpicGames org) — rozumie pipeline'y, frameworki, silniki, zależności techniczne
- Nie jest programistą, nigdy nie pracował zawodowo z kodem
- Dopiero zaczyna naukę programowania — kontekst: testy automatyczne w Javie
- Analogie z gamedevu trafiają do niego dobrze i warto ich używać

## Środowisko Norberta

- System: Ubuntu 26.04 LTS na Lenovo Y520-15IKBN
- Zainstalowane: JDK 21, Git, IntelliJ IDEA Community, 1Password, Claude Desktop, Obsidian (2 lipca 2026, przez `snap install obsidian --classic` — **potwierdzony jako działający** wieczorem 2 lipca 2026, po ponownym zalogowaniu, patrz sekcja "Sesja 2 lipca 2026, wieczór")
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
- Lekcja 3 ✅ (ukończona 2 lipca 2026): pierwszy test w JUnit
  - Dodano JUnit 5.11.0 do pom.xml jako dependency, Maven Sync wykonany
  - Stworzono PierwszyTest.java w src/test/java
  - assertEquals — test przechodzący i świadomie nieudany, czytanie AssertionFailedError i stack trace (numer linijki = adres wybuchu)
  - Zrozumiane: kod w metodzie wykonuje się od góry do dołu, wyjątek przerywa dalsze wykonanie metody
  - mvn test w terminalu — i realny problem po drodze: pierwsze uruchomienie dało "Tests run: 0" mimo BUILD SUCCESS, bo pom.xml nie miał jawnej wersji maven-surefire-plugin (domyślny 2.17 nie rozpoznaje JUnit 5). Naprawione dodaniem <build><plugins><plugin>maven-surefire-plugin 3.2.5</plugin></plugins></build>. Norbert zrozumiał różnicę: dependency = biblioteka dla TWOJEGO kodu, plugin = narzędzie którego używa Maven; i że IntelliJ ma własny runner testów niezależny od Mavena/surefire
  - Omówiono: klasa, metoda, void, @Test, import (zwykły vs static), pom.xml struktura, groupId/artifactId/version, Maven vs Gradle, plugin vs dependency

## Sesja 2 lipca 2026 — dodatkowe wydarzenia

- **Klawiatura Bluetooth (Silver Monkey SMA258) — fizyczny klawisz tyldy wadliwy od początku (wysyłał `<`/`>` zamiast `` ` ``/`~`), niezależnie od trybu Mac/Win/Android.** Naprawione trwale przez `keyd` (usługa systemowa, przetrwa restart): `/etc/keyd/default.conf` z regułą `102nd = grave`. WARUNEK: klawiatura musi zostać w trybie **Mac** (Fn+A) — w innych trybach (Win/Android) kod klawisza się zmienia i keyd przestanie łapać właściwy klawisz, a dodatkowo Win/Android psuły Enter/Backspace/strzałki na tej klawiaturze. Nie przełączać trybu bez potrzeby.
- Po drodze Claude dwukrotnie zepsuł polskie znaki (AltGr) próbując naprawić tyldę przez podmianę layoutu XKB w GNOME/Wayland — złe podejście, GNOME słabo obsługuje custom XKB layouty na Waylandzie. Oba razy cofnięte do czystego `pl`, żadnych trwałych szkód. Lekcja: do przemapowania pojedynczego klawisza używać `keyd` (poziom evdev/kernel), nie XKB.
- **Naprawiono `.bashrc`** — błędna cyfra "1" na początku linii 1 psuła cały plik (w tym kolory terminala). Norbert naprawił sam.
- **`sciagawka.md` rozbite na folder `sciagawka/`** — jeden plik = jeden rozdział + `index.md` jako spis treści. Powód: linki kotwiczące (`#nagłówek`) do sekcji z myślnikiem `—` w tytule łamały się w podglądzie IntelliJ (Norbert to sam zdiagnozował, testując które linki działają a które nie — dobra, metodyczna robota). Linki między osobnymi plikami nie mają tego problemu, bo nie zależą od parsowania nagłówka na "slug".
- **Zainstalowano Obsidian** (`sudo snap install obsidian --classic`) jako docelowy czytnik ściągawki — ma wyglądać i działać jak "książka", osobno od IntelliJ (Norbert nie chce mieszać materiałów do nauki z oknem w którym koduje). Instalacja potwierdzona przez `snap list`, ale program nie odpalał się z terminala (brak błędu, brak okna) — zasugerowano wylogowanie/zalogowanie się ponownie jako typowy fix dla świeżo zainstalowanego snapa w trybie classic.

## Sesja 2 lipca 2026, wieczór — Obsidian naprawiony

- Po ponownym zalogowaniu Obsidian **faktycznie działa** — potwierdzone przez Norberta, że widzi okno aplikacji. Wcześniejsze podejrzenie o zepsutym launcherze (wrapper scripts snapa, `desktop-init.sh`/`desktop-common.sh`/`desktop-gnome-specific.sh`) okazało się fałszywym tropem — chodziło po prostu o to, że snap w trybie classic wymaga relogu żeby poprawnie się zainicjować, i po nim działa normalnie.
- **W pełni potwierdzone i zamknięte:** Norbert otworzył `~/nauka_java/sciagawka/` jako sejf (vault), pliki i `index.md` renderują się poprawnie z działającymi linkami. Po drodze napotkany i rozwiązany osobny problem: okno Obsidiana nie dało się złapać/przesunąć myszką (znany efekt przeskalowanego interfejsu Norberta na GNOME/Wayland — dotyczy też innych aplikacji, nie tylko Obsidiana). Rozwiązanie: **Super + przeciągnięcie** w dowolnym miejscu okna przesuwa je bez potrzeby chwytania paska tytułu; alternatywnie **Super + Strzałka w górę** maksymalizuje okno. Warto pamiętać ten trik przy innych aplikacjach z tym samym objawem.
- **Wygaszanie/przyciemnianie ekranu** — Norbert zgłosił że ekran ściemnia się za często. Podano dwie opcje (GUI: Ustawienia → Zasilanie; terminal: `gsettings set org.gnome.desktop.session idle-delay 0` + `gsettings set org.gnome.settings-daemon.plugins.power idle-dim false`). Norbert zgłosił że ogarnął to sam — nie wiadomo którą metodą, nieistotne, temat zamknięty.
- Norbert poprosił żeby każda tłumaczona komenda terminala/systemowa trafiała też do ściągawki, nie tylko była wytłumaczona ustnie — nowy stały rozdział `sciagawka/08-system-i-narzedzia.md` (Snap vs APT, `snap install`, `snap list`, `gsettings`).

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

## Co Norbert rozumie — aktualizacja 2 lipca 2026 (po sprawdzianie #6 i długiej sesji powtórkowej)

Po sprawdzianie #6 (59/100) zrobiliśmy długą, powolną sesję "jeden temat na raz" nad najsłabszym punktem — framework vs biblioteka. Efekt: **solidne zrozumienie, nie tylko powtórzenie**:
- Test "kto kogo woła" — biblioteka: TY wołasz JĄ; framework: ONA woła CIEBIE — i potrafi to zastosować, nie tylko wyrecytować
- Różnica deklaracji metody (`void x() { }`) od jej wywołania (`x();`) — wcześniej często mylone, teraz rozróżnia bezbłędnie
- JUnit jako hybryda — `@Test` to zachowanie frameworka (JUnit woła Twoją metodę), `assertEquals(...)` to zachowanie biblioteki (Ty ją wołasz) — sam to zrekonstruował krok po kroku patrząc na własny kod w `PierwszyTest.java`
- Maven to ANI framework, ANI biblioteka — osobna kategoria (nigdy nie wchodzi w relację wołania z kodem). Samodzielnie wypracował analogię: Maven = Steam (pobieranie) + kompilator + automatyczny uruchamiacz testów, w jednym
- Własne, dobrze dobrane analogie (warto ich pilnować i używać dalej): nody w 3ds Maxie/Blenderze/Unity = framework (silnik sam decyduje o kolejności ewaluacji), przeglądarka + rozszerzenia = framework (rozszerzenie nie odpala się samo)
- Klasa `public` musi mieć nazwę identyczną z nazwą pliku — to twardy wymóg kompilatora, nie tylko higiena (wcześniej sądził że to tylko dobra praktyka)

**Ważna obserwacja procesu nauki:** w trakcie tej sesji Norbert w pewnym momencie wyraźnie się sfrustrował i zwątpił w siebie ("czuję się jak debil") po serii pytań testujących pod rząd. Pomogło: (1) nazwanie WPROST czemu akurat to pojęcie jest trudne (dotyczy niewidzialnego przepływu sterowania, inny rodzaj myślenia niż wizualny gamedev), (2) wskazanie konkretnego dowodu że już rozumie (poprawnie rozgryzł mechanizm @Test chwilę wcześniej), (3) przestanie dopytywać i podanie czystej odpowiedzi wprost zamiast dalszego wyciągania z pamięci na siłę. Pełne zapisane jako [[feedback_teaching_style]] w pamięci Claude.

## Co sprawiło trudność

- void vs deklaracja zmiennej — poprawione w tej sesji, teraz rozumie
- adnotacje @ — ogólny pomysł jest, potrzeba więcej przykładów przy kolejnych lekcjach
- **KLUCZOWE:** Norbert chce rozumieć PRZED pisaniem kodu, nie po — Claude ma tłumaczyć każdy element zanim każe cokolwiek pisać
- IntelliJ: snap intellij-idea-community = unified distribution — "Start Free Trial" to tylko oferta, działa za darmo
- .bashrc: podczas dodawania funkcji notify wkradł się błąd składni — do naprawy na początku następnej sesji
- **Sprawdzian #6 (59/100) — słabe punkty powtarzają się z poprzednich sprawdzianów, potrzebują innego podejścia niż samo tłumaczenie:**
  - Komendy Git (`git add .`, `git commit -m`, `git push`) — całkowita blokada, drugi sprawdzian z rzędu. To wygląda na brak wprawy/pamięci mięśniowej, nie brak zrozumienia koncepcji — do przećwiczenia realnym wpisywaniem w terminalu, nie kolejnym tłumaczeniem słowami
  - Framework vs biblioteka — wciąż powierzchowne ("szkielet") bez mechanizmu kto-kogo-woła w momencie sprawdzianu → **ROZWIĄZANE tego samego dnia** długą sesją powtórkową, patrz "Co Norbert rozumie — aktualizacja 2 lipca 2026" wyżej
  - Elementy dependency w pom.xml (groupId/artifactId/version) — kompletnie zapomniane, mimo że są zapisane w sciagawka.md; sam przyznał że nie zerka do niej w trakcie sprawdzianu
  - Wzorzec do zapamiętania: niepewność kolejności składni w terminalu widoczna zarówno w Git jak i w "mvn test" (podał też błędny wariant "test mvn") — to jeden ogólny problem (kolejność: narzędzie → polecenie → argumenty), nie dwa osobne

## Co robimy następnie

**Priorytet 1 — pełna powtórka PRZED Egzaminem #7 (nazwa "sprawdzian" zmieniona na "egzamin" — patrz niżej), WYMAGANY przed Lekcją 4:**
- Sprawdzian #5 (60/100) i #6 (59/100) oba nieudane — zakres Lekcje 1-3, bez pytań spoza `plan-lekcji.md`
- **Norbert wyraźnie zastrzegł 2 lipca 2026 (wieczór): żadnego formalnego egzaminu, dopóki nie przejdziemy i nie powtórzymy WSZYSTKIEGO czego nie wiedział w Sprawdzianach #5 i #6.** To jest twardy warunek, nie sugestia — patrz [[feedback_teaching_style]] w pamięci Claude.
- Lista do przerobienia pojedynczo (jedna po drugiej, na żywo w terminalu gdzie się da): Git (add/commit/push) — realna praktyka wpisywania komend w terminalu, framework vs biblioteka (już raz rozwiązane 2 lipca, tylko zweryfikować że utrwalone), elementy dependency w pom.xml (groupId/artifactId/version), słowo "bytecode" dla JVM, "adnotacja" (nie "komenda") dla @Test, czym jest test API
- Dopiero PO pełnej powtórce — Egzamin #7, próg 90/100 żeby przejść dalej, bez wyjątków

**Nazewnictwo (od 2 lipca 2026, wieczór):** formalny, punktowany test milowy = **"Egzamin"** (nie "sprawdzian" — to słowo zarezerwowane teraz na swobodne, niepunktowane sprawdzanie czegoś w trakcie ćwiczeń, np. output terminala). Historyczne wpisy "Sprawdzian #1-6" w `sprawdziany/wyniki.md` zostają bez zmian, od kolejnego wpisu używać "Egzamin #7".

**Priorytet 2 — Lekcja 4 (po zdanym egzaminie):**
- zmienne, typy danych String/int/boolean/double, proste operacje, wypisywanie w konsoli

**Priorytet 3 — projekt poboczny (yeetrack.xyz), gdy będzie czas:**
- Przejrzeć kod yeetrack.xyz na komputerze Norberta
- Dodać endpoint/stronę dla każdego sprawdzianu
- Powiadomienie ntfy = link do strony ze szczegółami sprawdzianu
- Przemek klika link → widzi pytania, odpowiedzi, ocenę

## Środowisko / pliki do zapamiętania

- ~/notify_sprawdzian.sh — skrypt do powiadomień ntfy
- ~/nauka_java/sciagawka/ — słownik pojęć, teraz jako folder osobnych plików + index.md (spis treści). Norbert czyta to w Obsidianie, nie w IntelliJ.
- ~/nauka_java/sprawdziany/wyniki.md — dziennik sprawdzianów
- ntfy kanał: norbert-nauka-java
- yeetrack.xyz — domena Norberta, NAS server, kod na tym komputerze (lokalizacja do ustalenia)

## Jak pracujemy razem

- Każda komenda tłumaczona słowo po słowie — co znaczy każde słowo i każda flaga
- Regularne, swobodne sprawdzanie wiedzy (nie mylić z formalnym "Egzaminem"): pytania, kawałki kodu do analizy, zadania do wyjaśnienia własnymi słowami
- Nie upraszczać za bardzo — Norbert rozumie techniczne zależności
- Używać analogii z gamedevu (silniki, frameworki, pipeline'y, rendery) gdy to pomaga
- Gdy Norbert pokazuje screenshot z terminala lub aplikacji — analizować co widać i reagować konkretnie
- Norbert chce rozumieć DLACZEGO, nie tylko JAK
- Plik `plan-lekcji.md` to nasza wspólna mapa postępów — aktualizować po każdej ukończonej lekcji
- **Każda komenda terminala/systemowa, którą tłumaczę w rozmowie, ma też trafić do `sciagawka/` w odpowiednim rozdziale** — nie tylko zostać wytłumaczona ustnie i zapomniana. Dotyczy to też rzeczy spoza samej Javy (snap, apt, gsettings itp.), jeśli pojawiają się w trakcie sesji.
- **PRZED każdym przejściem do nowego tematu — zrobić test z CAŁEJ dotychczasowej wiedzy, nie tylko ostatniej lekcji**
- **Co godzinę (lub przy naturalnej przerwie) — krótki test powtórkowy z całości materiału**
- Oceniać obiektywnie i rygorystycznie w skali 0-100, bez taryfy ulgowej
- Po egzaminie: przy każdej złej odpowiedzi dać wyjaśnienie z głupkowatym/śmiesznym przykładem — żeby zostało w pamięci
- Norbert sygnalizował że za szybko szliśmy — lepiej wolniej z pełnym zrozumieniem niż szybko w ciemno
- **MINIMUM 90/100 na Egzaminie żeby przejść dalej — bez wyjątków. Poniżej 90 = powtarzamy materiał i robimy nowy egzamin.**
- **Do Egzaminów wchodzą WYŁĄCZNIE pojęcia już omówione ORAZ obecne w `plan-lekcji.md` dla przerobionych lekcji.** Tematy poboczne (np. naprawa buga w pluginie spoza aktualnej lekcji) można wytłumaczyć, ale nie testować, dopóki nie mają swojej formalnej lekcji.
- **Formalny, punktowany test milowy = "Egzamin" (nie "sprawdzian").** "Sprawdzian" to teraz swobodne określenie na bieżące sprawdzanie czegoś (np. output terminala) w trakcie ćwiczeń — nie mylić tych dwóch.
- **ŻADNEGO Egzaminu, dopóki Norbert nie przejdzie i nie powtórzy WSZYSTKICH konkretnych rzeczy, których nie wiedział w poprzedniej nieudanej próbie.** Twardy warunek wstępny, nie sugestia — patrz "Priorytet 1" niżej po aktualny stan tej powtórki.
- Tłumaczenia: rozbudowane, barwne, kreatywne, ale też techniczne — nowe pojęcia zawsze łączyć z poprzednimi (JVM, JUnit, itd.) w spójną narrację, nie podawać izolowanych faktów
- Analogie mają być spójne z tymi już użytymi (sprawdzić `sciagawka.md` przed wymyśleniem nowej) — lepiej brak analogii niż niespójna/wymuszona
- Ton: miły, sympatyczny, wymagający — jak przyjaciel/nauczyciel, nie sędzia
- NIE pytać Norberta czy chce przerwę / czy ma energię, jeśli sam tego nie zasygnalizuje — on prowadzi tempo
- **Kalibracja (kluczowe):** Norbert nie ma doświadczenia w programowaniu, potrzebuje miesięcy powtórek żeby utrwalić wiedzę. Będzie się mylił nawet w rzeczach na które wcześniej odpowiedział poprawnie — to normalne, nie regres, nie komentować tego jako coś niepokojącego

## ZASADY DLA CLAUDE — obowiązkowe w każdej sesji

> Te zasady dotyczą Claude'a, nie Norberta. Claude musi ich przestrzegać automatycznie.

1. **Na początku każdej sesji** — przeczytaj oba pliki: `_pamiec.md` i `plan-lekcji.md`, żeby wiedzieć gdzie jesteśmy.

2. **W trakcie sesji, na bieżąco — nie czekać na "dogodny moment".** Sesja może się urwać w dowolnej sekundzie, bez ostrzeżenia — nie ma gwarancji że dojdzie do czystego "końca sesji", więc `_pamiec.md` nie może na to czekać.

   **Co dokładnie liczy się jako "znacząca rzecz" (wymaga natychmiastowej aktualizacji `_pamiec.md`, a jeśli dotyczy Javy/systemu — też `sciagawka/`):**
   - Sprawdzian się zakończył (wynik + co poszło źle/dobrze) → `sprawdziany/wyniki.md` I `_pamiec.md`
   - Temat, który wcześniej sprawiał trudność, został **faktycznie zrozumiany** (nie tylko poruszony) → sekcja "Co Norbert rozumie"
   - Norbert poprawia moje podejście LUB wprost potwierdza że coś zadziałało dobrze → nowa zasada w "Jak pracujemy razem" / "ZASADY DLA CLAUDE"
   - Zainstalowane/skonfigurowane narzędzie, zmiana w środowisku (nowy program, przebudowana struktura plików) → "Środowisko Norberta" / "Środowisko — pliki do zapamiętania"
   - Napotkany i naprawiony problem techniczny (bug, zła konfiguracja, coś co nie działało) → sekcja wydarzeń danej sesji
   - Zmienił się plan albo priorytet (co robimy dalej, w jakiej kolejności) → "Co robimy następnie"
   - Formalnie ukończona lekcja z `plan-lekcji.md` → oznaczyć `✅` tam I opisać w "Co już przerobiliśmy"
   - Padła nowa, konkretna komenda terminala/systemowa → `sciagawka/` (patrz zasada 5 niżej), niezależnie od reszty

   **Co NIE wymaga natychmiastowej aktualizacji:**
   - Pytania doprecyzowujące, które niczego nie zmieniają w stanie wiedzy ani w planie
   - Czysto konwersacyjne wymiany (podziękowania, potwierdzenia bez nowej treści)
   - Coś, co już jest zapisane gdzie indziej (unikać duplikowania tej samej informacji)

3. **Na końcu sesji** — Claude z własnej inicjatywy aktualizuje oba pliki i przypomina Norbertowi żeby zrobił `git add . && git commit -m "opis" && git push` — żeby Przemek widział aktualne postępy.

4. **Format aktualizacji** — w `_pamiec.md` zawsze zapisywać: co zostało zrobione, co Norbert rozumie, co sprawiło trudność, co jest następne. To ma być użyteczny brief dla nowej sesji, nie suchy log.

5. **`sciagawka.md` zostało rozbite na folder `sciagawka/`** (2 lipca 2026) — jeden plik = jeden rozdział, `index.md` jest spisem treści z linkami do plików. Norbert czyta to w Obsidianie (osobno od IntelliJ), bo linki wewnątrz jednego pliku z myślnikiem `—` w nagłówku łamały się w podglądzie IntelliJ. Gdy dodajesz nową sekcję: stwórz nowy plik w `sciagawka/`, dodaj do niego link `[← powrót do spisu treści](index.md)` na górze i dole, i dopisz go do listy w `index.md`.

## Projekt końcowy

- Kurs: Java + Spring Boot + JUnit dla junior testera automatycznego
- Projekt końcowy: testy publicznego API + zapis wyników do PostgreSQL
- Plan lekcji: `plan-lekcji.md` — 38 lekcji, 9 modułów

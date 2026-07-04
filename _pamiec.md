# Pamięć o Norbercie i naszej współpracy

> ⚡ **Zacznij tutaj (stan na koniec sesji 3 lipca 2026):** Egzamin #7 — pierwsze podejście 82/100 ❌, po ukierunkowanej powtórce 4 słabych punktów i retescie **skorygowany do 92/100 ✅**. Próg 90 przekroczony, **Lekcja 4 odblokowana i rozpoczęta**. Szczegóły korekty w `sprawdziany/wyniki.md`.
>
> **Najważniejsze na start nowej sesji:** kontynuować **Lekcję 4** (zmienne, typy danych String/int/boolean/double, proste operacje, wypisywanie w konsoli) — patrz `plan-lekcji.md`.
>
> **Nowa zasada formatu egzaminów (3 lipca 2026):** jeśli wynik jest powyżej ~75/100, kolejne podejście po powtórce NIE musi być pełnym nowym egzaminem — wystarczy krótki retest tylko słabych punktów, a Claude sam ocenia czy to wystarcza żeby uznać poprzedni egzamin za skorygowany. Poniżej ~75/100 — pełna powtórka i pełny nowy egzamin jak dotychczas. Patrz [[feedback_teaching_style]] w pamięci Claude.
>
> **Zasada nadrzędna nadal obowiązuje:** Claude pyta o zgodę PRZED każdą zmianą w `_pamiec.md`, `plan-lekcji.md` i kodzie, i nigdy nie łączy opisu problemu z jego naprawą w jednej turze. **Wyjątek: folder `podrecznik/` jest z tego zwolniony** — Claude uzupełnia go na bieżąco, samodzielnie, bez pytania o zgodę. Szczegóły: [[feedback_no_code_writing]] w pamięci Claude.

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
- Norbert poprosił żeby każda tłumaczona komenda terminala/systemowa trafiała też do podręcznika, nie tylko była wytłumaczona ustnie — nowy stały rozdział (obecna ścieżka: `podrecznik/narzedzia/02-system-i-pakiety.md`, Snap vs APT, `snap install`, `snap list`, `gsettings`).
- **Przebudowa struktury podręcznika (2 lipca 2026, wieczór):** Norbert uczy się naraz kilku rzeczy (Java, Linux, Git, narzędzia) i płaska lista rozdziałów przestała się skalować. Nowa struktura z podfolderami: `podrecznik/java/` (6 rozdziałów), `podrecznik/linux/` (nawigacja terminalowa: pwd/ls/cd), `podrecznik/narzedzia/` (Git, system/pakiety — będzie się rozrastać o kolejne narzędzia jak IntelliJ). Cały folder `sciagawka/` przemianowany na `podrecznik/` na wyraźną prośbę Norberta ("to wszystko ma się nazywać podręcznik"). `00-Index.md` zaktualizowany pod nową strukturę.
- **Norbert wprowadził twardą zasadę współpracy tego wieczoru: Claude musi pytać o zgodę PRZED każdą zmianą, nawet w plikach notatek/dokumentacji (nie tylko w kodzie), i nie może łączyć opisu problemu z jego naprawą w jednej turze.** Zapisane szczegółowo w pamięci Claude jako [[feedback_no_code_writing]] — to zasada nadrzędna, obowiązuje też w kolejnych sesjach.

## Sesja 3 lipca 2026 — pełna powtórka Priorytetu 1 i Egzamin #7

- Usunięty pusty plik `podrecznik/Bez nazwy.md` (przypadkowo stworzony przez Obsidiana).
- Przerobiona w całości 7-punktowa lista powtórkowa ze Sprawdzianów #5/#6: JVM/bytecode, plugin vs dependency, framework vs biblioteka, elementy `pom.xml`, adnotacja `@Test` vs komenda, test API, komendy Gita — wszystkie solidnie omówione hands-on (własny `pom.xml`, własny `PierwszyTest.java`, panel External Libraries w IntelliJ).
- **Nowa zasada terminologii:** dla testu "kto kogo woła" (framework vs biblioteka) używać słowa **"wywołuje"**, nie "woła" — brzmi mniej antropomorficznie i to i tak poprawniejszy technicznie termin. Poprawione w `podrecznik/java/04-framework-vs-biblioteka.md` i tytule w `00-Index.md`.
- Sprawdzona i **odrzucona jako niespójna** analogia od Przemka: "silnik samochodu = framework, pedał gazu = biblioteka" — nie przechodzi testu "kto kogo wywołuje" (to Norbert decyduje kiedy naciska pedał, więc to zachowanie biblioteki po obu stronach). Norbert sam to wykazał — dobry dowód samodzielnego stosowania testu, nie tylko powtarzania etykiet.
- Nowy rozdział podręcznika: `podrecznik/java/07-test-api.md` (test API vs test manualny, analogia restauracji), dodany do `00-Index.md`.
- Rozbudowane sekcje: `03-maven.md` (plugin w pom.xml + analogia Steam dla groupId/artifactId/version), `06-skladnia.md` (static import, adnotacja vs komenda).
- **Ustalona nowa zasada współpracy:** folder `podrecznik/` jest zwolniony z reguły "pytaj przed każdą zmianą" — Claude uzupełnia go na bieżąco, samodzielnie. Reguła "pytaj przed zmianą" nadal obowiązuje dla `_pamiec.md`, `plan-lekcji.md` i kodu. Zapisane w pamięci Claude jako rozszerzenie [[feedback_no_code_writing]].
- **Egzamin #7 (pierwszy pod nową nazwą)** — wynik 82/100 ❌ (próg 90). Duży postęp względem Sprawdzianów #5/#6 (60, 59), ale nie zaliczony. Pełne szczegóły w `sprawdziany/wyniki.md`. Największa dziura: framework vs biblioteka zastosowane konkretnie do JUnita (`@Test` błędnie nazwane zachowaniem biblioteki). Inne słabsze punkty: relacja JDK↔JVM (nieznana), trzecia funkcja Mavena (uruchamianie testów, pominięta), kontrast adnotacja/komenda (dobra treść, brak wprost porównania biernej etykiety z akcją).

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

**Priorytet 1 (pierwotny) — ✅ UKOŃCZONY 3 lipca 2026:** pełna powtórka 7 punktów ze Sprawdzianów #5/#6 zrobiona w całości (JVM/bytecode, plugin vs dependency, framework vs biblioteka, elementy pom.xml, adnotacja @Test, test API, Git) — patrz "Sesja 3 lipca 2026" wyżej.

**Priorytet 1 (nowy) — ✅ UKOŃCZONY 3 lipca 2026:** dogłębna powtórka 4 słabych punktów z Egzaminu #7 zrobiona (framework/biblioteka w JUnicie, JDK↔JVM, 3. funkcja Mavena, adnotacja/komenda). Zamiast pełnego Egzaminu #8 — ukierunkowany retest tych 4 punktów (nowa zasada, patrz banner wyżej), wynik Egzaminu #7 skorygowany do **92/100 ✅**. Pełne szczegóły w `sprawdziany/wyniki.md`.

**Nazewnictwo (od 2 lipca 2026, wieczór):** formalny, punktowany test milowy = **"Egzamin"** (nie "sprawdzian" — to słowo zarezerwowane teraz na swobodne, niepunktowane sprawdzanie czegoś w trakcie ćwiczeń, np. output terminala). Historyczne wpisy "Sprawdzian #1-6" w `sprawdziany/wyniki.md` zostają bez zmian, od kolejnego wpisu używać "Egzamin #7".

**Priorytet 2 — Lekcja 4 (rozpoczęta 3 lipca 2026, po zaliczonym Egzaminie #7):**
- zmienne, typy danych String/int/boolean/double, proste operacje, wypisywanie w konsoli

**Priorytet 3 — projekt poboczny (yeetrack.xyz), gdy będzie czas:**
- Przejrzeć kod yeetrack.xyz na komputerze Norberta
- Dodać endpoint/stronę dla każdego sprawdzianu
- Powiadomienie ntfy = link do strony ze szczegółami sprawdzianu
- Przemek klika link → widzi pytania, odpowiedzi, ocenę

## Środowisko / pliki do zapamiętania

- ~/notify_sprawdzian.sh — skrypt do powiadomień ntfy
- ~/nauka_java/podrecznik/ — słownik pojęć, jako sejf Obsidiana z podfolderami `java/`, `linux/`, `narzedzia/` i `00-Index.md` jako głównym spisem treści (dawniej `sciagawka/`, przemianowane 2 lipca 2026 wieczorem). Norbert czyta to w Obsidianie, nie w IntelliJ.
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
- **Każda komenda terminala/systemowa, którą tłumaczę w rozmowie, ma też trafić do `podrecznik/` w odpowiednim rozdziale** — nie tylko zostać wytłumaczona ustnie i zapomniana. Dotyczy to też rzeczy spoza samej Javy (snap, apt, gsettings itp.), jeśli pojawiają się w trakcie sesji. Komendy Linuksa/terminala → `podrecznik/linux/`, konkretne narzędzia (Git, IntelliJ, Snap) → `podrecznik/narzedzia/`, Java → `podrecznik/java/`.
- **Format komend w podręczniku (potwierdzone 2 lipca 2026, wieczór):** jedna komenda = własny blok ```bash, wyjaśnienie flag pod spodem jako lista wypunktowana. NIE upychać kilku komend w jednym bloku z komentarzami `# opis` na końcu linii — Norbert to ocenił jako mało czytelne (łamie się w wąskim panelu Obsidiana).
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
- Analogie mają być spójne z tymi już użytymi (sprawdzić odpowiedni rozdział w `podrecznik/java/` przed wymyśleniem nowej) — lepiej brak analogii niż niespójna/wymuszona
- Ton: miły, sympatyczny, wymagający — jak przyjaciel/nauczyciel, nie sędzia
- NIE pytać Norberta czy chce przerwę / czy ma energię, jeśli sam tego nie zasygnalizuje — on prowadzi tempo
- **Kalibracja (kluczowe):** Norbert nie ma doświadczenia w programowaniu, potrzebuje miesięcy powtórek żeby utrwalić wiedzę. Będzie się mylił nawet w rzeczach na które wcześniej odpowiedział poprawnie — to normalne, nie regres, nie komentować tego jako coś niepokojącego

## ZASADY DLA CLAUDE — obowiązkowe w każdej sesji

> Te zasady dotyczą Claude'a, nie Norberta. Claude musi ich przestrzegać automatycznie.

1. **Na początku każdej sesji** — przeczytaj oba pliki: `_pamiec.md` i `plan-lekcji.md`, żeby wiedzieć gdzie jesteśmy.

2. **W trakcie sesji, na bieżąco — nie czekać na "dogodny moment".** Sesja może się urwać w dowolnej sekundzie, bez ostrzeżenia — nie ma gwarancji że dojdzie do czystego "końca sesji", więc `_pamiec.md` nie może na to czekać.

   **Co dokładnie liczy się jako "znacząca rzecz" (wymaga natychmiastowej aktualizacji `_pamiec.md`, a jeśli dotyczy Javy/systemu — też `podrecznik/`):**
   - Sprawdzian się zakończył (wynik + co poszło źle/dobrze) → `sprawdziany/wyniki.md` I `_pamiec.md`
   - Temat, który wcześniej sprawiał trudność, został **faktycznie zrozumiany** (nie tylko poruszony) → sekcja "Co Norbert rozumie"
   - Norbert poprawia moje podejście LUB wprost potwierdza że coś zadziałało dobrze → nowa zasada w "Jak pracujemy razem" / "ZASADY DLA CLAUDE"
   - Zainstalowane/skonfigurowane narzędzie, zmiana w środowisku (nowy program, przebudowana struktura plików) → "Środowisko Norberta" / "Środowisko — pliki do zapamiętania"
   - Napotkany i naprawiony problem techniczny (bug, zła konfiguracja, coś co nie działało) → sekcja wydarzeń danej sesji
   - Zmienił się plan albo priorytet (co robimy dalej, w jakiej kolejności) → "Co robimy następnie"
   - Formalnie ukończona lekcja z `plan-lekcji.md` → oznaczyć `✅` tam I opisać w "Co już przerobiliśmy"
   - Padła nowa, konkretna komenda terminala/systemowa → `podrecznik/` (patrz zasada 5 niżej), niezależnie od reszty

   **Co NIE wymaga natychmiastowej aktualizacji:**
   - Pytania doprecyzowujące, które niczego nie zmieniają w stanie wiedzy ani w planie
   - Czysto konwersacyjne wymiany (podziękowania, potwierdzenia bez nowej treści)
   - Coś, co już jest zapisane gdzie indziej (unikać duplikowania tej samej informacji)

3. **Na końcu sesji** — Claude z własnej inicjatywy aktualizuje oba pliki i przypomina Norbertowi żeby zrobił `git add . && git commit -m "opis" && git push` — żeby Przemek widział aktualne postępy.

4. **Format aktualizacji** — w `_pamiec.md` zawsze zapisywać: co zostało zrobione, co Norbert rozumie, co sprawiło trudność, co jest następne. To ma być użyteczny brief dla nowej sesji, nie suchy log.

5. **Podręcznik: `sciagawka.md` → folder `sciagawka/` (2 lipca 2026) → `podrecznik/` z podfolderami (2 lipca 2026, wieczór).** Norbert czyta to w Obsidianie (osobno od IntelliJ), bo linki wewnątrz jednego pliku z myślnikiem `—` w nagłówku łamały się w podglądzie IntelliJ — stąd rozbicie na osobne pliki. Aktualna struktura: `podrecznik/00-Index.md` (główny spis treści) + trzy podfoldery `java/`, `linux/`, `narzedzia/`, każdy z własną numeracją rozdziałów. Gdy dodajesz nową sekcję: stwórz nowy plik w odpowiednim podfolderze (Java → `java/`, komendy Linuksa/terminala ogólnie → `linux/`, konkretne narzędzie jak Git/IntelliJ/Snap → `narzedzia/`), dodaj do niego link `[← powrót do spisu treści](../00-Index.md)` na górze i dole (uwaga: `../`, bo plik jest teraz jeden poziom głębiej niż `00-Index.md`), i dopisz go do listy w `00-Index.md` pod właściwym działem.

## Projekt końcowy

- Kurs: Java + Spring Boot + JUnit dla junior testera automatycznego
- Projekt końcowy: testy publicznego API + zapis wyników do PostgreSQL
- Plan lekcji: `plan-lekcji.md` — 38 lekcji, 9 modułów

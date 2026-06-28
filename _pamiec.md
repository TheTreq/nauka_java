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

## Co robimy następnie

- Lekcja 3: pierwszy test w JUnit (dodanie JUnit 5 do projektu Maven, @Test, uruchomienie)

## Jak pracujemy razem

- Każda komenda tłumaczona słowo po słowie — co znaczy każde słowo i każda flaga
- Regularne testy wiedzy: pytania, kawałki kodu do analizy, zadania do wyjaśnienia własnymi słowami
- Nie upraszczać za bardzo — Norbert rozumie techniczne zależności
- Używać analogii z gamedevu (silniki, frameworki, pipeline'y, rendery) gdy to pomaga
- Gdy Norbert pokazuje screenshot z terminala lub aplikacji — analizować co widać i reagować konkretnie
- Norbert chce rozumieć DLACZEGO, nie tylko JAK
- Plik `plan-lekcji.md` to nasza wspólna mapa postępów — aktualizować po każdej ukończonej lekcji

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

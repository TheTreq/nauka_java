[← powrót do spisu treści](../00-Index.md)

# NAWIGACJA W TERMINALU

Terminal to nie osobny program do "pisania komend" — to inny sposób sterowania tym samym systemem plików, który normalnie przeglądasz myszką w menedżerze plików. Te trzy komendy to Twoje oczy i nogi w terminalu.

## `pwd` — gdzie teraz jestem

```bash
pwd
```
`pwd` = "print working directory" — pokazuje pełną ścieżkę folderu, w którym aktualnie stoisz w terminalu. Jak GPS: zanim zrobisz cokolwiek innego, dobrze wiedzieć gdzie się jesteś.

## `ls` — co tu jest

```bash
ls
```
`ls` = "list" — pokazuje pliki i foldery w bieżącym miejscu. Odpowiednik otwarcia folderu w menedżerze plików i spojrzenia co w środku.

## `cd` — przejdź gdzie indziej

```bash
cd ~/nauka_java
```
`cd` = "change directory" — przenosi Cię do innego folderu. Po tym `pwd` pokaże już nową lokalizację.

Częste warianty:
```bash
cd ~
```
`~` (tylda) = skrót do Twojego katalogu domowego (`/home/norbert`). Samo `cd ~` zawsze zabiera Cię "do domu", bez względu na to gdzie aktualnie jesteś.

```bash
cd ..
```
`..` = "folder wyżej" (rodzic bieżącego folderu). Jeden poziom w górę drzewa katalogów.

> **Pułapka, która się już zdarzyła:** `cd ~` i `cd ~/nauka_java` to NIE to samo. Pierwsze zabiera Cię do katalogu domowego, drugie prosto do folderu projektu. Łatwo się pomylić gdy oba "brzmią podobnie" w głowie — czytaj dokładnie co jest po `cd`, nie tylko że to `cd`.

---

[← powrót do spisu treści](../00-Index.md)

[← powrót do spisu treści](../00-Index.md)

# GIT

## `git status`
```bash
git status
```
Pokazuje co się zmieniło od ostatniego commita. Trzy grupy:
- **Zmiany do złożenia** (staged, zielone) — gotowe do commita
- **Zmiany nie przygotowane do złożenia** (unstaged, czerwone) — Git już zna ten plik, ale nowa wersja nie jest jeszcze w stage'u
- **Nieśledzone pliki** (untracked) — Git widzi plik, ale nikt mu nigdy nie kazał go pilnować

## `git add` — dodawanie do stage'a

```bash
git add .
```
Dodaje WSZYSTKO co się zmieniło w bieżącym folderze i podfolderach. `.` = "tu, gdzie jestem".

```bash
git add nazwa-pliku
```
Dodaje tylko jeden konkretny plik lub folder.

```bash
git add -u
```
`-u` = "update" — dodaje zmiany tylko w plikach, które Git **już zna** (zmienione/usunięte). Pomija nowe, nieśledzone pliki — przydatne gdy masz coś nieśledzonego czego jeszcze nie chcesz dodawać.

```bash
git add -A
```
`-A` = "all" — dodaje kompletnie wszystko, łącznie z nowymi plikami. Dobrze rozpoznaje też przeniesienia/zmiany nazw plików (jako "zmieniono nazwę", nie "skasowano + dodano nowy").

## `git restore --staged` — cofanie ze stage'a

```bash
git restore --staged nazwa-pliku
```
Odwrotność `git add` — plik wraca z "gotowe do złożenia" do "zmiany nie przygotowane". Same zmiany w pliku **nie znikają**, tylko przestają być zaznaczone do commita.

## `git commit` — zapisanie punktu w historii

```bash
git commit -m "opis zmian"
```
Zapisuje wszystko co jest aktualnie w stage'u jako nowy punkt w historii projektu. `-m` = "message" — wymaga tekstu zaraz po sobie, w cudzysłowie. Sama flaga `-m` bez wiadomości nic nie znaczy dla Gita (błąd: `switch 'm' wymaga wartości`).

## `git push` — wysyłka na GitHub

```bash
git push
```
Wysyła zapisane lokalnie commity na GitHub. Dopiero po tym Przemek widzi zmiany.

## `git mv` — przenoszenie z zachowaniem historii

```bash
git mv stara-sciezka nowa-sciezka
```
Przenosi/zmienia nazwę pliku i od razu informuje o tym Gita. Historia zmian tego pliku się nie urywa — Git wie że to ten sam plik, tylko gdzie indziej.

## `git log` — historia commitów

```bash
git log --oneline
```
Pokazuje historię commitów, jedna linia na commit (skrócony hash + opis).

---

## Kolejność Git — "wysyłka paczki"

1. `git add` → spakuj zmiany do pudełka (staging)
2. `git commit -m "opis"` → zaklej pudełko i napisz na nim karteczkę co w środku
3. `git push` → wyślij zaklejone pudełko pocztą (na GitHub) — dopiero teraz Przemek je widzi

> Nie da się zakleić pustego pudełka (`commit` bez wcześniejszego `add`) ani wysłać niezaklejonego (`push` bez `commit`). Kolejność to fizyczna konieczność, nie zasada do wykucia na pamięć.

> Ta sama zasada kolejności dotyczy `mvn test` — zawsze narzędzie (`mvn`) najpierw, potem polecenie dla niego (`test`). Terminal czyta się jak zdanie: "Maven, zrób test", nie "Test, zrób mvn".

---

[← powrót do spisu treści](../00-Index.md)

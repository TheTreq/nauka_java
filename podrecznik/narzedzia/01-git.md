[← powrót do spisu treści](../00-Index.md)

# GIT

## Skróty terminala które już znasz

```bash
mvn test          # uruchom wszystkie testy przez Maven
git add .         # dodaj wszystkie zmiany do staging
git commit -m ""  # zapisz zmiany z opisem
git push          # wyślij na GitHub (Przemek zobaczy postępy)
push-progress     # alias = git add + commit + push w jednym
```

## Kolejność Git — "wysyłka paczki"

1. `git add .` → spakuj WSZYSTKO co leży na biurku (zmiany w plikach) do pudełka (staging)
2. `git commit -m "opis"` → zaklej pudełko i napisz na nim karteczkę co w środku
3. `git push` → wyślij zaklejone pudełko pocztą (na GitHub) — dopiero teraz Przemek je widzi

> Nie da się zakleić pustego pudełka (`commit` bez wcześniejszego `add`) ani wysłać niezaklejonego (`push` bez `commit`). Kolejność to fizyczna konieczność, nie zasada do wykucia na pamięć.

> Ta sama zasada kolejności dotyczy `mvn test` — zawsze `mvn` (narzędzie) najpierw, potem `test` (polecenie dla niego). Terminal czyta się jak zdanie: "Maven, zrób test", nie "Test, zrób mvn".

---

[← powrót do spisu treści](../00-Index.md)

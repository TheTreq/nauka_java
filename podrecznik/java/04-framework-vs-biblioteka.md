[← powrót do spisu treści](../00-Index.md)

# FRAMEWORK vs BIBLIOTEKA vs JUNIT — kto kogo woła

## JUnit = "Java Unit testy — Nie Ufam Tobie"
Biblioteka do pisania testów jednostkowych w Javie.
Maven pobiera ją z internetu (wpisujesz ją w pom.xml jako dependency).
> Biblioteka = zbiór gotowych narzędzi które TY wywołujesz kiedy chcesz (nie narzuca struktury)
> ⚠️ UWAGA: JUnit ma w sobie też trochę cech frameworka przez `@Test` — czytaj dalej.

**Test do zapamiętania:** kto wywołuje czyj kod?
- **Biblioteka** → TY wołasz JĄ, kiedy chcesz
- **Framework** → ONA woła CIEBIE, kiedy sama zdecyduje

## Deklaracja metody vs wywołanie metody — nie mylić!

```java
void mojaMetoda() { ... }   // DEKLARACJA — tylko opis "co się stanie GDY ktoś to odpali".
                             // Samo napisanie NIC nie uruchamia.

mojaMetoda();                // WYWOŁANIE — goła nazwa + nawiasy + średnik,
                             // bez `void` przed i bez `{ }` po. TERAZ coś się faktycznie dzieje.
```

## @Test = naklejka "zjedz mnie"
Adnotacja JUnit. Mówi JUnit: "tę metodę poniżej uruchom jako test".
Bez @Test — JUnit zignoruje metodę całkowicie, jakby jej nie było.
> Adnotacje (@) istnieją w całej Javie, nie tylko w JUnit. Np. @Override, @BeforeEach itd.
> Naklejenie karteczki nikogo nie zmusza do zjedzenia torta TERAZ — dopiero później ktoś (JUnit) obchodzi kuchnię i szuka karteczek.

## Analogie które siedzą

| Pojęcie | Analogia | Dlaczego pasuje |
|---|---|---|
| Biblioteka | Plugin do 3ds Maxa | Ty go wywołujesz kiedy chcesz |
| Biblioteka | `Math.max()`, `assertEquals()` | Zwykłe metody, sam je wołasz w kodzie |
| Framework | Unity / Unreal | Silnik woła Twój skrypt co klatkę, nie Ty jego |
| Framework | Przeglądarka + rozszerzenia | Rozszerzenie nie odpala się samo — przeglądarka woła je, gdy uzna że pora (np. załadowana strona, kliknięta ikonka) |
| Framework | Nody w 3ds Maxie / Blenderze / Unity | Silnik sam decyduje w jakiej kolejności ewaluować nody — nie Ty |

## JUnit jest hybrydą — i to normalne

- `@Test` nad metodą → **JUnit sam ją woła** → zachowanie FRAMEWORKA
- `assertEquals(...)` w środku metody → **Ty ją wołasz** → zachowanie BIBLIOTEKI

Jedno narzędzie, dwa różne mechanizmy naraz, zależnie od tego której jego części akurat używasz.

---

[← powrót do spisu treści](../00-Index.md)

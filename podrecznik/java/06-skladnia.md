[← powrót do spisu treści](../00-Index.md)

# JAVA — podstawy składni

## Klasa
```java
public class NazwaKlasy {
    // tu jest kod
}
```
Klasa = pojemnik na kod. Każdy plik .java = jedna klasa o tej samej nazwie.
`public` = widoczna dla wszystkich (na razie traktuj jako obowiązkowe).
> To nie jest tylko higiena — to twardy wymóg kompilatora: plik .java może mieć tylko jedną klasę `public`, i jej nazwa MUSI być identyczna z nazwą pliku (dlatego PierwszyTest.java ↔ public class PierwszyTest).

## Import
```java
import org.junit.jupiter.api.Test;
```
Mówi Javie skąd pochodzi @Test. Bez importu Java nie wie co to jest.
Piszesz go zawsze NA GÓRZE pliku, przed `public class`.

## Import statyczny (static import)
```java
import static org.junit.jupiter.api.Assertions.assertEquals;
```
- Zwykły import wciąga całą klasę (np. `Test`) — odwołujesz się do niej z nazwą (`@Test`).
- Static import wciąga jedną konkretną metodę statyczną Z WNĘTRZA klasy (tu: `assertEquals` z klasy `Assertions`) — możesz ją wołać bez podawania nazwy klasy.
- Bez `static`: `Assertions.assertEquals(4, 2+2);` Z `static`: `assertEquals(4, 2+2);` — to tylko wygoda, nie wymóg.

## Metoda
```java
void nazwaMetody() {
    // tu jest kod metody
}
```
Metoda = blok kodu który coś robi. Jak funkcja w Blueprintach w Unreal.
`void` = metoda nic nie zwraca. Jak wentylator — działa ale nic nie produkuje.
> Jeśli metoda zwraca liczbę: `int`. Tekst: `String`. Nic: `void`.

## Adnotacja vs komenda — nie mylić
```java
@Test
void mojaMetodaTestowa() { ... }
```
- Adnotacja (`@...`) = bierna etykieta w kodzie. Sama w sobie nic nie robi — czeka, aż ktoś (np. JUnit) ją odczyta i zdecyduje co z nią zrobić.
- Komenda (np. `mvn test` w terminalu) = akcja, która wykonuje się od razu w momencie jej wydania.
- Dowód: usuń `@Test` znad metodą, zostaw resztę kodu bez zmian, odpal `mvn test` — metoda zostanie całkowicie zignorowana, mimo że kod w środku jest identyczny. Sama adnotacja nic nie "robi" — działanie bierze się z tego, że coś INNEGO (JUnit) ją odczytuje.

---

[← powrót do spisu treści](../00-Index.md)

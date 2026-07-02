[← powrót do spisu treści](00-Index.md)

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

## Metoda
```java
void nazwaMetody() {
    // tu jest kod metody
}
```
Metoda = blok kodu który coś robi. Jak funkcja w Blueprintach w Unreal.
`void` = metoda nic nie zwraca. Jak wentylator — działa ale nic nie produkuje.
> Jeśli metoda zwraca liczbę: `int`. Tekst: `String`. Nic: `void`.

---

[← powrót do spisu treści](00-Index.md)

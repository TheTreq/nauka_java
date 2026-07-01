# Ściągawka pojęć — Java dla Norberta

> Wersja: głupia ale skuteczna. Każde pojęcie ma skrót/skojarzenie które ma siedzieć w głowie.

---

## JAK DZIAŁA JAVA — przepływ

```
TY piszesz kod w pliku .java
        ↓
JAVAC (kompilator) zamienia .java → .class (bytecode)
        ↓
JVM odpala bytecode na każdym systemie (Mac, Windows, Linux)

MAVEN zarządza tym wszystkim z góry:
  - czyta pom.xml i wie czego projekt potrzebuje
  - pobiera biblioteki (np. JUnit) z internetu
  - odpala JAVAC (kompilację)
  - odpala JVM z testami
```

---

## POJĘCIA — skróty i skojarzenia

### JVM = "Jezu, Włącz Mi (to)"
**Java Virtual Machine**
Odtwarza skompilowany kod (bytecode) na każdym systemie.
Jak VLC odtwarza filmy — nie ważne czy masz Maca czy Windowsa, JVM odpali kod tak samo.
> ⚠️ JVM nie uruchamia pliku .java — uruchamia .class (bytecode po kompilacji przez javac)

---

### JAVAC = "JAVa A Compile"
Kompilator Javy. Zamienia twój kod (.java) na bytecode (.class).
Uruchamiasz raz — potem JVM może odpalać .class wszędzie.

---

### MVN / MAVEN = "Menedżer Wszystkiego, Nie?"
Zarządza projektem — pobiera biblioteki, kompiluje, uruchamia testy.
Jak gdybyś miał jeden plik z listą pluginów do 3ds Maxa/Unity i jedno kliknięcie instaluje wszystko automatycznie.
> Używasz go w terminalu jako: `mvn test`, `mvn clean`, `mvn install`

---

### POM.XML = "Przepis Od Mavena"
Plik konfiguracyjny projektu Maven. Nie jest to Java — to XML (inny format).
Mówi Mavenowi: czego potrzebuje projekt, jaka wersja Javy, jakie biblioteki pobrać.
> Każdy projekt Maven musi mieć pom.xml — jak .uproject w Unrealu.

---

### JUnit = "Java Unit testy — Nie Ufam Tobie"
Biblioteka do pisania testów jednostkowych w Javie.
Maven pobiera ją z internetu (wpisujesz ją w pom.xml jako dependency).
> Biblioteka = zbiór gotowych narzędzi które TY wywołujesz kiedy chcesz (nie narzuca struktury)

---

### @Test = naklejka "zjedz mnie"
Adnotacja JUnit. Mówi JUnit: "tę metodę poniżej uruchom jako test".
Bez @Test — JUnit zignoruje metodę całkowicie, jakby jej nie było.
> Adnotacje (@) istnieją w całej Javie, nie tylko w JUnit. Np. @Override, @BeforeEach itd.

---

## STRUKTURA PROJEKTU

```
testy-api/
├── pom.xml              ← przepis dla Mavena
└── src/
    ├── main/
    │   └── java/        ← KOD PRODUKCYJNY (to co działa w firmie)
    └── test/
        └── java/        ← TESTY (nigdy nie trafiają do produkcji)
```

> main = gotowa gra którą widzi gracz
> test = wewnętrzne narzędzia QA których gracz nigdy nie widzi

---

## JAVA — podstawy składni

### Klasa
```java
public class NazwaKlasy {
    // tu jest kod
}
```
Klasa = pojemnik na kod. Każdy plik .java = jedna klasa o tej samej nazwie.
`public` = widoczna dla wszystkich (na razie traktuj jako obowiązkowe).

### Import
```java
import org.junit.jupiter.api.Test;
```
Mówi Javie skąd pochodzi @Test. Bez importu Java nie wie co to jest.
Piszesz go zawsze NA GÓRZE pliku, przed `public class`.

### Metoda
```java
void nazwaMetody() {
    // tu jest kod metody
}
```
Metoda = blok kodu który coś robi. Jak funkcja w Blueprintach w Unreal.
`void` = metoda nic nie zwraca. Jak wentylator — działa ale nic nie produkuje.
> Jeśli metoda zwraca liczbę: `int`. Tekst: `String`. Nic: `void`.

### Dependency w pom.xml
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.11.0</version>
    <scope>test</scope>
</dependency>
```
- `groupId` = kto to zrobił (np. org.junit.jupiter)
- `artifactId` = nazwa biblioteki (np. junit-jupiter)
- `version` = która wersja
- `scope>test` = dostępne tylko podczas testów, nie trafia do produkcji

---

## RÓŻNICE które warto znać

| Pojęcie | Co to jest | Analogia |
|---|---|---|
| Framework | Narzuca strukturę, kontroluje przepływ | Unity — dajesz mu skrypty, on decyduje kiedy je wywołać |
| Biblioteka | Zbiór narzędzi które TY wywołujesz | Plugin do 3ds Maxa — używasz kiedy chcesz |
| Maven | Menedżer projektu | Menedżer pluginów dla całego teamu |
| JUnit | Biblioteka do testów | Plugin QA który Maven dostarcza |

---

## SKRÓTY TERMINALA które już znasz

```bash
mvn test          # uruchom wszystkie testy przez Maven
git add .         # dodaj wszystkie zmiany do staging
git commit -m ""  # zapisz zmiany z opisem
git push          # wyślij na GitHub (Przemek zobaczy postępy)
push-progress     # alias = git add + commit + push w jednym
```

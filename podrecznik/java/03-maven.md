[← powrót do spisu treści](../00-Index.md)

# MAVEN

## MVN / MAVEN = "Menedżer Wszystkiego, Nie?"
Zarządza projektem — pobiera biblioteki, kompiluje, uruchamia testy.
> Używasz go w terminalu jako: `mvn test`, `mvn clean`, `mvn install`

**Maven = Steam + kompilator + automatyczny uruchamiacz, w jednym.** Robi trzy rzeczy, a Steam robi tylko pierwszą z nich:

1. **Ściąga** biblioteki z internetu na podstawie `pom.xml` (jak Steam pobiera gry z magazynu)
2. **Kompiluje** Twój kod, `.java` → `.class` — czego Steam nie robi ale mógłby gdyby bardzo chciał xD
3. **Uruchamia** testy (odpala JVM z Twoim kodem) — czego Steam też nie robi, ale często potrafi testować twoja cierpliwość

> Maven to NIE framework i NIE biblioteka — osobna kategoria. Nigdy nie wchodzi w relację "kto kogo woła" z Twoim kodem (patrz rozdział [FRAMEWORK vs BIBLIOTEKA vs JUNIT](04-framework-vs-biblioteka.md)) — działa przed i wokół niego, a potem znika, zanim Twój kod w ogóle zacznie działać.

## POM.XML = "Przepis Od Mavena"
Plik konfiguracyjny projektu Maven. Nie jest to Java — to XML (inny format).
Mówi Mavenowi: czego potrzebuje projekt, jaka wersja Javy, jakie biblioteki pobrać.
> Każdy projekt Maven musi mieć pom.xml — jak .uproject w Unrealu.

## Dependency w pom.xml — jak wygląda "pozycja na liście zakupów"
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.11.0</version>
    <scope>test</scope>
</dependency>
```
- `groupId` = kto to zrobił, wydawca (np. org.junit.jupiter) — jak nazwa studia wydającego grę na Steam
- `artifactId` = nazwa biblioteki, konkretny produkt (np. junit-jupiter) — jak tytuł gry
- `version` = która wersja — jak numer wydania/patcha gry
- `scope>test` = dostępne tylko podczas testów, nie trafia do produkcji

## Plugin w pom.xml — narzędzie DLA Mavena, nie DLA Twojego kodu
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.2.5</version>
</plugin>
```
- Plugin też jest pobierany przez Mavena, tym samym mechanizmem co dependency — różnica to nie "czy jest pobierany", tylko **kto go używa**.
- Dependency = biblioteka DLA TWOJEGO KODU — widać ją w `import` (np. `import org.junit.jupiter.api.Test;`).
- Plugin = narzędzie, którego używa **Maven**, żeby coś zrobić z Twoim projektem (skompilować, przetestować, spakować) — nigdy nie pojawia się w żadnym `import`, bo Twój kod się do niego nie odwołuje.
- Przykład z życia: `maven-surefire-plugin` to narzędzie, które Maven odpala w tle podczas `mvn test` — szuka metod z `@Test` w Twoich skompilowanych klasach i je uruchamia. Bez jawnie podanej wersji 3.2.5 domyślna (stara) wersja nie rozpoznawała JUnit 5, stąd efekt "Tests run: 0" mimo BUILD SUCCESS.
- Dowód: plugin nie pojawia się w panelu "External Libraries" w IntelliJ (tam widać tylko dependency, czyli to, do czego Twój kod ma dostęp) — bo Twój kod nigdy go nie potrzebuje.

## Hierarchia — co skąd się bierze

```
Poziom 0 — zainstalowane przez Ciebie ręcznie na systemie:
  JDK, Maven, IntelliJ

              ↓ Maven ściąga na żądanie, na podstawie pom.xml

Poziom 1 — pobrane PRZEZ Mavena:
  JUnit (już), AssertJ i Spring Boot (wkrótce), sterownik PostgreSQL (później)
```

Strzałka pobierania idzie zawsze z góry na dół. Nigdy odwrotnie — JUnit nie potrafi niczego pobrać, sam został pobrany.

---

[← powrót do spisu treści](../00-Index.md)

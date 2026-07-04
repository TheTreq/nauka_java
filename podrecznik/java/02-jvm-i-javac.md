[← powrót do spisu treści](../00-Index.md)

# JVM I JAVAC — silnik i kompilator

## JVM = "Java, Włącz Mi (to)" / Java Uruchom (mi) kod
**Java Virtual Machine**
Odtwarza skompilowany kod (bytecode) na każdym systemie.
Jak VLC odtwarza filmy — nie ważne czy masz Maca czy Windowsa, JVM odpali kod tak samo.
> ⚠️ JVM nie uruchamia pliku .java — uruchamia .class (bytecode po kompilacji przez javac)

---

## JAVAC = "JAVa A Compile"
Kompilator Javy. Zamienia twój kod (.java) na bytecode (.class).
Uruchamiasz raz — potem JVM może odpalać .class wszędzie.

---

## JDK = "Java Development Kit" — pudełko zawierające JVM i JAVAC

JDK to nie coś osobnego od JVM — to **cały pakiet, który instalujesz** (np. "JDK 21"), a w środku ma:
- **JVM** — silnik uruchamiający bytecode
- **javac** — kompilator (.java → .class)
- dodatkowe narzędzia dla developera (debugger, javadoc itp.)

> Jak instalator całego silnika gry (np. Unreal Engine) — w jednym pakiecie dostajesz i sam silnik (JVM, uruchamia rzeczy), i narzędzia do budowania projektu (javac, kompiluje), i dodatki, naraz.

---

[← powrót do spisu treści](../00-Index.md)

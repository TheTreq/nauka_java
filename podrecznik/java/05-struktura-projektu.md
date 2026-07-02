[← powrót do spisu treści](../00-Index.md)

# STRUKTURA PROJEKTU

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

[← powrót do spisu treści](../00-Index.md)
